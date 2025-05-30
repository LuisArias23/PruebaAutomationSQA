package co.sqa.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static final Target Objeto1=Target.the("Primer objeto")
            .located(By.xpath("(//*[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[1]"));
    public static final Target Objeto2=Target.the("Primer objeto")
            .located(By.xpath("(//*[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[4]"));
    public static final Target Cantidad=Target.the("opcion cantidades")
            .located(By.xpath("//*/input[@class='input-text qty text']"));
    public static final Target Bajar=Target.the("opcion cantidades")
            .located(By.xpath("//*[@id='product-21738']/div[2]/div[2]"));
    public static final Target Bajarr=Target.the("opcion cantidades")
            .located(By.xpath("//*[@id='product-9543']/div[2]/div[2]"));
    public static final Target Agregar=Target.the("Agregar al carrito")
            .located(By.xpath("//*/button"));
    public static final Target Texto=Target.the("Agregar al carrito")
            .located(By.xpath("//*/h1"));
    public static final Target Home=Target.the("opcion cantidades")
            .located(By.xpath("//*[@id='sticky-wrapper']/header/div[2]/div"));


}
