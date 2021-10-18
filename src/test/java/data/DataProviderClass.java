package data;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
    @DataProvider(name="busquedaVuelo")
    public Object[][] getRegisterData(){
        Object busqueda1 = new InformacionBusquedaVuelos("Montevideo", "Lima", "10/9", "15/9");
        Object busqueda2 = new InformacionBusquedaVuelos("Montevideo", "Miami", "5/9", "8/9");
        return new Object[][]  {
                {busqueda1},
                {busqueda2}
        };
    }
}
