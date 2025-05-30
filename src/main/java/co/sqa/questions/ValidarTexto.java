package co.sqa.questions;

import groovy.util.logging.Slf4j;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.sqa.ui.HomePage.Texto;
import static co.sqa.utils.Utilidades.Finalizar;

@AllArgsConstructor
@Slf4j
public class ValidarTexto implements Question<Boolean> {
    private String TextElement;
    @Override

    public Boolean answeredBy(Actor actor) {
        Boolean result;
        TextElement  = Texto.resolveFor(actor).getText();
        if(TextElement.equals(Finalizar)){
            System.out.println(TextElement);
            result=true;
        }else{
            result =false;
        }
        return result;
    }

    public static ValidarTexto witchParams(String textElement) {
        return new ValidarTexto(textElement);
    }
}
