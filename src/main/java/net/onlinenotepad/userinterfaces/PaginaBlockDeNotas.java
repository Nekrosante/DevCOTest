package net.onlinenotepad.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.online-notepad.net/es/bloc-de-notas-online")
public class PaginaBlockDeNotas extends PageObject {

    public static final Target NEGRILLA = Target.the("Boton de la negrilla en la nota de texto enriquecido")
            .located(By.xpath("//button[2]"));
    public static final Target CUADRO_TEXTO = Target.the("Cuadro de texto")
            .located(By.xpath("//button[2]"));
    public static final Target TEXTO_ENRIQUECIDO = Target.the("Cuadro de texto")
            .located(By.xpath("//button[2]"));

}
