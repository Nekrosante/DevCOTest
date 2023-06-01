package net.onlinenotepad.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.onlinenotepad.asserts.Verifica;
import net.onlinenotepad.tasks.Abrir;
import net.onlinenotepad.tasks.Escribe;
import net.onlinenotepad.tasks.Selecciona;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class stepDefs {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("Luis accede a la pagina del Block de Notas")
    public void accessToThePageOfCOOSALUDProviders() {
        OnStage.theActorCalled("Luis")
                .wasAbleTo(Abrir.enElBuscador());
    }

    @When("el crea una nota con letra negrilla")
    public void elCreaUnaNotaConLetraNegrilla() {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        Selecciona.laOpcionNotaEnriquecida(),
                        Escribe.unTexto("ESto es una prueba"),
                        Selecciona.laLetraNegrilla(),
                        Escribe.unTexto("ESto es una prueba en Negrilla")
                );
    }

    @Then("el verifica que la nota de texto sea creada")
    public void elVerificaQueLaNotaDeTextoSeaCreada() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                        Verifica.elTextoContengaNegrilla()
                )
        );
    }
}
