package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PestañaBusquedaVuelos {

    protected WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[1]/div[3]/div[2]/div/span[1]/label/i")
    private WebElement checkIdaYVuelta;

    @FindBy(xpath = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[1]/div[3]/div[2]/div/span[2]/label/i")
    private WebElement checkSoloIda;

    @FindBy(xpath = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[1]/div[3]/div[2]/div/span[3]/label/i")
    private WebElement checkMultiDestino;

    @FindBy(xpath = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[1]/div[1]/div/div/div/input")
    private WebElement textoOrigen;

    @FindBy(xpath = "/html/body/div[17]/div[2]/div[1]/ul/li[1]/span")
    private WebElement resultadoAutocomplete;

    @FindBy(xpath = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/input")
    private WebElement textoDestino;

    @FindBy(xpath = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[2]/div[2]/div[1]/div[2]/input")
    private WebElement calendarioFechaIda;

    @FindBy(xpath = "/html/body/div[10]/div/div[2]/div[2]")
    private WebElement fechaIdaFlechaSiguienteMes;

    @FindBy(xpath = "/html/body/div[10]/div/div[5]/div[2]/div[4]/span[15]/span[1]")
    private WebElement diaFechaIda;

    @FindBy(xpath = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/input")
    private WebElement calendarioFechaVuelta;

    @FindBy(xpath = "/html/body/div[11]/div/div[5]/div[3]/div[4]/span[18]/span[1]")
    private WebElement diaFechaVuelta;

    @FindBy(xpath = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[3]/div[7]/div/div/div")
    private WebElement desplegablePasajerosYClase;

    @FindBy(xpath = "/html/body/div[9]/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/a[2]")
    private WebElement aumentarCantidadDePasajerosAdultos;

    @FindBy(xpath = "/html/body/div[9]/div/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/div/a[2]")
    private WebElement aumentarCantidadDePasajerosMenores;

    protected Select desplegableClase;

    @FindBy(xpath = "/html/body/div[9]/div/div[2]/a")
    private WebElement botonAplicar;

    @FindBy(xpath = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[4]/div/a/em")
    private WebElement botonBuscar;

    public PestañaBusquedaVuelos(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 60);
        //this.desplegableClase = new Select(driver.findElement(By.xpath("/html/body/div[9]/div/div[1]/div[2]/div/div[1]/div/div[4]/div[2]/div/div/select")));
    }

    public PaginaResultadoBusquedaVuelos realizarUnaBusquedaDeUnVuelo(String tramoSeleccionado, String origen, String destino){
       if(tramoSeleccionado.equals("Solo ida")){
           checkSoloIda.click();
       }
       else if(tramoSeleccionado.equals("MultiDestino")){
           checkMultiDestino.click();
       }
       textoOrigen.sendKeys(origen);
       wait.until(ExpectedConditions.visibilityOf(resultadoAutocomplete));
       resultadoAutocomplete.click();
       textoDestino.sendKeys(destino);
       resultadoAutocomplete.click();
       calendarioFechaIda.click();
       fechaIdaFlechaSiguienteMes.click();
       fechaIdaFlechaSiguienteMes.click();
       diaFechaIda.click();
       diaFechaVuelta.click();
       botonBuscar.click();

       return new PaginaResultadoBusquedaVuelos(this.driver);
    }



}
