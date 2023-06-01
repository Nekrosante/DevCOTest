package net.onlinenotepad.tasks;

import com.beust.ah.A;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.onlinenotepad.userinterfaces.PaginaBlockDeNotas.*;

public class Selecciona {
    public static Performable laOpcionNotaEnriquecida(){
        return Task.where("{El actor selecciona la opcioon Nota Enriquecida",
                Click.on(TEXTO_ENRIQUECIDO)
        );
    }


    public static Performable laLetraNegrilla() {
        return Task.where("{El actor selecciona la opcioon Nota Enriquecida",
                Click.on(NEGRILLA)
        );
    }
}