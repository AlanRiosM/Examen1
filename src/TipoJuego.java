class TipoJuego {
    private String tipoJ;

    public TipoJuego(String tipoJ) {
        this.tipoJ = tipoJ;
    }

    public String getTipoJ() {
        return tipoJ;
    }

    public void setTipoJ(String tipoJ) {
        this.tipoJ = tipoJ;
    }

    public void MostrarInformacion() {
        System.out.println("Tipo de juego: " + tipoJ);
    }
}

class RestriccionJuego extends TipoJuego {
    private int edadRestriccion;

    public RestriccionJuego(String tipoJ, int edadRestriccion) {
        super(tipoJ);
        this.edadRestriccion = edadRestriccion;
    }

    public int getEdadRestriccion() {
        return edadRestriccion;
    }

    public void setEdadRestriccion(int edadRestriccion) {
        this.edadRestriccion = edadRestriccion;
    }

    @Override
    public void MostrarInformacion() {
        super.MostrarInformacion();
        System.out.println("Edad Restricción: " + edadRestriccion);
    }
}

class Juego extends RestriccionJuego {
    private String nombreJ;

    public Juego(String tipoJ, int edadRestriccion, String nombreJ) {
        super(tipoJ, edadRestriccion);
        this.nombreJ = nombreJ;
    }

    public String getNombreJ() {
        return nombreJ;
    }

    public void setNombreJ(String nombreJ) {
        this.nombreJ = nombreJ;
    }

    @Override
    public void MostrarInformacion() {
        super.MostrarInformacion();
        System.out.println("Nombre del juego: " + nombreJ);
    }
}
