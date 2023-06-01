package net.onlinenotepad.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.onlinenotepad.userinterfaces.PaginaBlockDeNotas;
public class Abrir implements Task{
    private PaginaBlockDeNotas blockDeNotas;
    public static Abrir enElBuscador() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(blockDeNotas));
    }
}
