package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaginaResultadoBusquedaVuelos {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"flights-container\"]/div/div[3]/div/div[1]/div[2]/div/div/div/div/div[3]/div[1]/div[1]/span")
    private WebElement textoVuelos;

    public PaginaResultadoBusquedaVuelos(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getTextoVuelos(){
        return this.textoVuelos;
    }
}
