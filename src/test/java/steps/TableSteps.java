package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.devtools.Message;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TablePage;

public class TableSteps {

    TablePage tablePage = new TablePage();

    @Given("^Navego al sitio web de la tabla statica$")
    public void navegarSitioWeb(){
        tablePage.navegarPaginaWeb();
    }

    @Then("^Como usuario valido el valor de la celda fila 5 columna 2$")
    public void obtenerValorCelda(){
        String valorReal = tablePage.obtenerValorCelda(5,  2);
        assertEquals("r: 5, c: 2", valorReal);

    }

    @Then("^Como usuario valido si la tabla se muestra en la pagina$")
    public void validarSiMuestraLaTabla(){
        boolean valorReal = tablePage.visualizarTabla();
        assertTrue("r: 5, c: 2", valorReal);

    }
    
}
