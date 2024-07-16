package reto.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import reto.questions.ValidarDocumento;
import reto.tasks.AbrirPaginaBancolombia;
import reto.tasks.IrSeccionDocumentosDeInteres;
import reto.tasks.IrSeccionInformacionCorporativa;
import reto.tasks.SeleccionarReporte;


public class MyStepdefs {

    @Before
    public void IniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("ingreso a la pagina web de bancolombia")
    public void ingresoALaPaginaWebDeBancolombia() {
        OnStage.theActorCalled("actor").wasAbleTo(
                AbrirPaginaBancolombia.urlBancolombia()
        );
    }

    @Cuando("accedo a la sección informacion corporativa para acceder a documentos de interes")
    public void accedoALaSecciónInformacionCorporativaParaAccederADocumentosDeInteres() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IrSeccionInformacionCorporativa.irSeccionInformacionCorporativa(),
                IrSeccionDocumentosDeInteres.irSeccionDocumentosDeInteres()
        );
    }

    @Y("descargar el reporte")
    public void descargarElReporte() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarReporte.seleccionarReporte()
        );

    }

    @Entonces("Verifico que el documento descargado sea el correcto")
    public void verificoQueElDocumentoDescargadoSeaElCorrecto() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarDocumento.toThe()));

    }
}
