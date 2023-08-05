package SorteoApp;

public class Talon {
    private int numero;
    private String nombre;
    private static int siguienteNumero = 1;

    public Talon() {
    }

    @Override
    public String toString() {
        return "El Ganador es " + nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = siguienteNumero++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Talon(int numero, String nombre) {
        this.numero = siguienteNumero++;
        this.nombre = nombre;
    }
    
}
