package co.com.choucair.reto.pruebaraymer.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Location {
    public static final Target CITY = Target.the("city").
            locatedBy("//input[@id=\"city\"]");

    public static final Target SELECT_NAME_CITY= Target.the("name city").
            located(By.xpath("//input[constains(text(),'Floridablanca Santander, Colombia')]"));

    public static final Target ZIP = Target.the("zip").
            locatedBy("//input[@id=\"zip\"]");
    public static final Target COUNTRY = Target.the("country").
            locatedBy("//div[@id=\"ui-select-choices-row-2-46\"]");
    public static final Target BUTTONLOCATION = Target.the("button Location").
            locatedBy("//a[@aria-label=\"Next step - select your devices\"]");


}
