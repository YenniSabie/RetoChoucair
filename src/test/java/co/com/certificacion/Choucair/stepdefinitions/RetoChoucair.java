package co.com.certificacion.Choucair.stepdefinitions;

import co.com.certificacion.Choucair.questions.ElPortalSoluciones;
import co.com.certificacion.Choucair.questions.Telecomunicaciones;
import co.com.certificacion.Choucair.tasks.AbrirPagina;
import co.com.certificacion.Choucair.tasks.Servicios;
import co.com.certificacion.Choucair.tasks.Industrias;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static co.com.certificacion.Choucair.util.Constantes.CONSUMER;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RetoChoucair
{

    @Dado("^que el usuario quiere entrar al sitio web de Choucair y presionar clic en la opcion Servicios$")
    public void queElUsuarioQuiereEntrarAlSitioWebDeChoucairYPresionarClicEnLaOpcionServicios()
    {
        theActorCalled(CONSUMER).wasAbleTo(AbrirPagina.ChoucairTesting());

    }


    @Cuando("^el entra al sitio y se dirige a la opcion Servicio$")
    public void elEntraAlSitioYSeDirigeALaOpcionServicio()
    {
        theActorInTheSpotlight().attemptsTo(Servicios.enChoucairTesting());
    }

    @Entonces("^verifica que esta en la seccion (.*)$")
    public void verificaQueEstaEnLaSeccion(String questionv)
    {
        theActorInTheSpotlight().should(seeThat(ElPortalSoluciones.NosLlevaaPruebasMoviles(questionv)));
    }


    @Dado("^que el usuario quiere entrar a la pagina y dirigirse a la opcion de Industrias$")
    public void queElUsuarioQuiereEntrarALaPaginaYDirigirseALaOpcionDeIndustrias()
    {
        theActorCalled(CONSUMER).wasAbleTo(AbrirPagina.ChoucairTesting());
    }


    @Cuando("^el abre el navegador y busca la pagina de Choucair y se dirige a esa opcion de Industrias$")
    public void elAbreElNavegadorYBuscaLaPaginaDeChoucairYSeDirigeAEsaOpcionDeIndustrias()
    {
        theActorInTheSpotlight().attemptsTo(Industrias.inChoucair());
    }

    @Entonces("^el sistema de la pagina me debe mostrar el siguiente mensaje (.*)$")
    public void elSistemaDeLaPaginaMeDebeMostrarElSiguienteMensaje(String questionv)
    {
        theActorInTheSpotlight().should(seeThat(Telecomunicaciones.RetosTransformacion(questionv)));
    }

}
