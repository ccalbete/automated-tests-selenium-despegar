package data;

public class InformacionBusquedaVuelos {
    private String tramoSeleccionado;
    private String origen;
    private String tramo1Origen;
    private String tramo2Origen;
    private String destino;
    private String tramo1Destino;
    private String tramo2Destino;
    private String fechaIda;
    private String tramo1FechaIda;
    private String tramo2FechaIda;
    private String fechaVuelta;
    private int cantidadPasajerosAdultos;
    private int cantidadPasajerosMenores;
    private String clase;
    private boolean checkTodaviaNoHeDecididoLaFecha;

    //constructor de los datos de busqueda de un vuelo ida y vuelta
    public InformacionBusquedaVuelos(String origen, String destino, String fechaIda, String fechaVuelta) {
        this.tramoSeleccionado = "Ida y vuelta";
        this.origen = origen;
        this.destino = destino;
        this.fechaIda = fechaIda;
        this.fechaVuelta = fechaVuelta;
        this.cantidadPasajerosAdultos=cantidadPasajerosAdultos;
        this.cantidadPasajerosMenores=cantidadPasajerosMenores;
        this.clase = "Economica";
        this.checkTodaviaNoHeDecididoLaFecha = false;
    }

    //constructor de los datos de busqueda de un vuelo solo ida
    public InformacionBusquedaVuelos(String origen, String destino, String fechaIda,
                                     String clase, int cantidadPasajerosAdultos, int cantidadPasajerosMenores) {
        this.tramoSeleccionado = "Solo ida";
        this.origen = origen;
        this.destino = destino;
        this.fechaIda = fechaIda;
        this.fechaVuelta = null;
        this.cantidadPasajerosAdultos=cantidadPasajerosAdultos;
        this.cantidadPasajerosMenores=cantidadPasajerosMenores;
        this.clase = clase;
        this.checkTodaviaNoHeDecididoLaFecha = false;
    }

    //constructor de los datos de busqueda de un multidestino con 2 tramos
    public InformacionBusquedaVuelos(String tramo1Origen, String tramo1Destino, String tramo1FechaIda,
                                     String tramo2Origen, String tramo2Destino, String tramo2FechaIda,
                                     String clase, int cantidadPasajerosAdultos, int cantidadPasajerosMenores) {
        this.tramoSeleccionado = "MultiDestino";
        this.tramo1Origen = tramo1Origen;
        this.tramo1Destino = tramo1Destino;
        this.tramo1FechaIda = tramo1FechaIda;
        this.tramo2Origen = tramo2Origen;
        this.tramo2Destino = tramo2Destino;
        this.tramo2FechaIda = tramo2FechaIda;
        this.clase = clase;
        this.cantidadPasajerosAdultos=cantidadPasajerosAdultos;
        this.cantidadPasajerosMenores=cantidadPasajerosMenores;
        this.checkTodaviaNoHeDecididoLaFecha = false;
    }

    public String getOrigen() {
        return origen;
    }

    public String getTramo1Origen() {
        return tramo1Origen;
    }

    public String getTramo2Origen() {
        return tramo2Origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getTramo1Destino() {
        return tramo1Destino;
    }

    public String getTramo2Destino() {
        return tramo2Destino;
    }

    public String getFechaIda() {
        return fechaIda;
    }

    public String getTramo1FechaIda() {
        return tramo1FechaIda;
    }

    public String getTramo2FechaIda() {
        return tramo2FechaIda;
    }

    public String getFechaVuelta() {
        return fechaVuelta;
    }

    public int getCantidadPasajerosAdultos() {
        return cantidadPasajerosAdultos;
    }

    public int getCantidadPasajerosMenores() {
        return cantidadPasajerosMenores;
    }

    public String getClase() {
        return clase;
    }

    public boolean isCheckTodaviaNoHeDecididoLaFecha() {
        return checkTodaviaNoHeDecididoLaFecha;
    }

    public String getTramoSeleccionado() {
        return tramoSeleccionado;
    }
}
