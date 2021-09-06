package co.com.choucair.reto.pruebaraymer.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Personal {
    public static final Target FIRSTNAME = Target.the("first name").
            locatedBy("//input[@id=\"firstName\"]");
    public static final Target LASTNAME = Target.the("last name").
            locatedBy("//input[@id=\"lastName\"]");
    public static final Target EMAIL = Target.the("email").
            locatedBy("//input[@id=\"email\"]");
    public static final Target MONTH = Target.the("month").
            locatedBy("//select[@name=\"birthMonth\"]");
    public static final Target DAY = Target.the("day").
            locatedBy("//select[@name=\"birthDay\"]");
    public static final Target YEAR = Target.the("year").
            locatedBy("//select[@name=\"birthYear\"]");
    public static final Target NEXTLOCATION = Target.the("button next").
            locatedBy("//a[@class=\"btn btn-blue\"]");
}
