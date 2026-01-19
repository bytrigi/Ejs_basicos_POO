package e4;

public class JugadorFutbol {
    private String nombre;
    private String equipo;
    private int dorsal;
    private String posicion;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombreInput) {
        nombre = nombreInput;
    }

    public String getEquipo() {
        return equipo;
    }
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
