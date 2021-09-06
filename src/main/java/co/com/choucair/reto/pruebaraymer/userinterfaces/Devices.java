package co.com.choucair.reto.pruebaraymer.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Devices {
    public static final Target SYSTEM = Target.the("system").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[1]");
    public static final Target WINDOWS = Target.the("windows").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[2]");
    public static final Target VERSION = Target.the("version").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]");
    public static final Target XP = Target.the("xp").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[2]");
    public static final Target LANGUAGE = Target.the("language").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]");
    public static final Target ENGLISH = Target.the("english").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[11]");
    public static final Target BUTTONLASTFINAL = Target.the("button last final").
            locatedBy("//a[@aria-label=\"Next - final step\"]");
}
