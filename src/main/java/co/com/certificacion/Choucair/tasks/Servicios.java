package co.com.certificacion.Choucair.tasks;

import co.com.certificacion.Choucair.userinterface.UIServicios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class Servicios implements Task
{


    public static Servicios enChoucairTesting()
    {
        return Tasks.instrumented(Servicios.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)

    {
        actor.attemptsTo(
                Click.on(UIServicios.CLIC_SERVICIOS),
                 Click.on(UIServicios.CLIC_PORTAFOLIO_SOLUCIONES),
                Click.on(UIServicios.CLIC_PRUEBAS_MOBILE)
        );
    }
}
