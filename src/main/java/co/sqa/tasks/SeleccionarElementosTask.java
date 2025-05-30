package co.sqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.sqa.ui.HomePage.*;
import static co.sqa.utils.Utilidades.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SeleccionarElementosTask implements Task {

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
        actor.attemptsTo(Enter.theValue(Cantidad2).into(Cantidad));
        actor.attemptsTo(Click.on(Agregar));
        actor.attemptsTo(WaitUntil.the(Home, isEnabled())
                        .forNoMoreThan(TIME_SHORT).seconds()
                , Click.on(Home));
        actor.attemptsTo(Scroll.to(Objeto2));
        actor.attemptsTo(WaitUntil.the(Objeto2, isEnabled())
                        .forNoMoreThan(TIME_SHORT).seconds()
                , Click.on(Objeto2));
        actor.attemptsTo(Scroll.to(Bajarr));
        actor.attemptsTo(WaitUntil.the(Cantidad, isEnabled())
                        .forNoMoreThan(TIME_SHORT).seconds()
                , Click.on(Cantidad));
        actor.attemptsTo(Enter.theValue(Cantidad2).into(Cantidad));
    }

    public static SeleccionarElementosTask choose() {
        return Tasks.instrumented(SeleccionarElementosTask.class);
    }


}
