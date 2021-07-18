package co.com.certificacion.Choucair.tasks;

import co.com.certificacion.Choucair.userinterface.UIIndustrias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Industrias implements Task
{

    public static Industrias inChoucair() {
            return Tasks.instrumented(Industrias.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Click.on(UIIndustrias.CLIC_INDUSTRIAS),
                Click.on(UIIndustrias.CLIC_TELECOMUNICACIONES)
        );

    }
}
