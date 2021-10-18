package tests;

import data.DataProviderClass;
import data.InformacionBusquedaVuelos;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.Header;
import page.objects.PaginaResultadoBusquedaVuelos;
import page.objects.PestañaBusquedaVuelos;

public class testBuscarVuelo {
    private WebDriver driver;
    private Header elementsHeader;
    private WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.despegar.com.uy/");
        elementsHeader = new Header(driver);
        elementsHeader.cerrarCartelIniciaSesion();
        wait = new WebDriverWait(driver, 10);
    }

    @Test(dataProvider = "busquedaVuelo", dataProviderClass = DataProviderClass.class)
    public void buscarUnVuelo(InformacionBusquedaVuelos infoBusquedaVuelos){
        PestañaBusquedaVuelos elementsPestañaBusquedaVuelos = elementsHeader.entrarASeccionVuelos();
        PaginaResultadoBusquedaVuelos elementsResultadoBusquedaVuelos = elementsPestañaBusquedaVuelos.realizarUnaBusquedaDeUnVuelo
                (infoBusquedaVuelos.getTramoSeleccionado(), infoBusquedaVuelos.getOrigen(), infoBusquedaVuelos.getDestino());
        wait.until(ExpectedConditions.visibilityOf(elementsResultadoBusquedaVuelos.getTextoVuelos()));

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
