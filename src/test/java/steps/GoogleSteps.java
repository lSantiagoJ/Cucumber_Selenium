package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage GooglePage = new GooglePage();

    @Given("^Como usuario navego al sitio de googmatLinee$")
    public void navegarGoogle(){
        GooglePage.navegarGoogle();
    }
 
    @When("^Como usuario busco la palabra pinguino$")
    public void escribirCriterioBusqueda(){
        //GooglePage.escribirBusqueda(criterio:"Pinguino");
    }

    @And("^Como usuario doy click en el boton buscar$")
    public void clickBotonBusqueda(){
        GooglePage.clickBotonBusqueda();
    }
    
}
