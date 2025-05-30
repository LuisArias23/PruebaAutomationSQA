package co.sqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.sqa.ui.HomePage.*;
import static co.sqa.utils.Utilidades.Cantidad1;
import static co.sqa.utils.Utilidades.TIME_SHORT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SeleccionarElementoTasks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(Scroll.to(Objeto1));
        actor.attemptsTo(WaitUntil.the(Objeto1, isEnabled())
                        .forNoMoreThan(TIME_SHORT).seconds()
                , Click.on(Objeto1));
        actor.attemptsTo(Scroll.to(Bajar));
        actor.attemptsTo(WaitUntil.the(Cantidad, isEnabled())
                        .forNoMoreThan(TIME_SHORT).seconds()
                , Click.on(Cantidad));
        actor.attemptsTo(Enter.theValue(Cantidad1).into(Cantidad));
    }

    public static SeleccionarElementoTasks choose() {
        return Tasks.instrumented(SeleccionarElementoTasks.class);
    }


}
