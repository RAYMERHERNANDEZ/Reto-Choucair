package co.com.choucair.reto.pruebaraymer.tasks;

import co.com.choucair.reto.pruebaraymer.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUserUtest implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(Home.REGISTER),
                SendKeys.of("raymer").into(Personal.FIRSTNAME),
                SendKeys.of("hernandez").into(Personal.LASTNAME),
                SendKeys.of("rdht@gmail.com").into(Personal.EMAIL),
                SendKeys.of("September").into(Personal.MONTH),
                SendKeys.of("8").into(Personal.DAY),
                SendKeys.of("1993").into(Personal.YEAR),
                Click.on(Personal.NEXTLOCATION),
                SendKeys.of("Floridablanca").into(Location.CITY),
                Click.on(Location.SELECT_NAME_CITY),
                SendKeys.of("68005").into(Location.ZIP),
                Click.on(Location.COUNTRY),
                Click.on(Location.BUTTONLOCATION),
                Click.on(Devices.SYSTEM),
                Click.on(Devices.WINDOWS),
                Click.on(Devices.VERSION),
                Click.on(Devices.XP),
                Click.on(Devices.LANGUAGE),
                Click.on(Devices.ENGLISH),
                Click.on(Devices.BUTTONLASTFINAL),
                SendKeys.of("Prueba123*").into(Complete.PASSWORD),
                SendKeys.of("Prueba123*").into(Complete.CONFIRMPASSWORD),
                Click.on(Complete.CHECKONE),
                Click.on(Complete.CHECKTWO),
                Click.on(Complete.BUTTONCOMPLETE)


        );
    }
    public static RegisterUserUtest makeinformation(){
        return instrumented(RegisterUserUtest.class);
    }

}
