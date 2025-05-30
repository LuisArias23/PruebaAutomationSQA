package co.sqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.sqa.ui.HomePage.*;
import static co.sqa.ui.HomePage.Agregar;
import static co.sqa.ui.HomePage.Cantidad;
import static co.sqa.utils.Utilidades.Cantidad1;
import static co.sqa.utils.Utilidades.TIME_SHORT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class AgregarCarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Agregar));
    }
    public static AgregarCarrito choose() {
        return Tasks.instrumented(AgregarCarrito.class);
    }
}
