package pages;

public class TablePage extends BasePage{
    
    String locatorDivTable = "//*[@id=\"root\"]/div";
    String locatorTable = "//*[@id=\"root\"]/div/table"; 
    public TablePage(){
        super(driver);
    }

    public void navegarPaginaWeb(){
        navegateTo("https://1v2njkypo4.csb.app/");
    }

    
    public String obtenerValorCelda(int row, int column){

        row++;
        column ++;
        return getValueFromTable(locatorDivTable, row, column);
    }

    public boolean visualizarTabla(){
        return validateExistElement(locatorTable);
    }
}
