package co.com.choucair.reto.pruebaraymer.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Complete {
    public static final Target PASSWORD = Target.the("password").
            locatedBy("//input[@id=\"password\"]");
    public static final Target CONFIRMPASSWORD = Target.the("confirm password").
            locatedBy("//input[@id=\"confirmPassword\"]");
    public static final Target CHECKONE = Target.the("check one").
            locatedBy("//span[@class=\"checkmark signup-consent__checkbox error\"]");
    public static final Target CHECKTWO = Target.the("check two").
            locatedBy("//span[@ng-class=\"error: userForm.privacySetting.$error.required\"]");
    public static final Target BUTTONCOMPLETE = Target.the("button complete").
            locatedBy("//a[@class=\"btn btn-blue\"]");
}
