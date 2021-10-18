package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
    private WebDriver driver;

    @FindBy(partialLinkText="Vuelos")
    private WebElement pestañaVuelos;

    @FindBy(css = "#incentive-login > i.tooltip-close.dreck-3-icon-close.incentive-close")
    private WebElement botonCerrarCartelIniciaSesion;

    public Header(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void cerrarCartelIniciaSesion(){
        botonCerrarCartelIniciaSesion.click();
    }

    public PestañaBusquedaVuelos entrarASeccionVuelos(){
        pestañaVuelos.click();
        return new PestañaBusquedaVuelos(this.driver);
    }

}
