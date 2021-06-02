package EjercicioMañana;

public class Persona implements Precedable<Persona> {
    private String nombre;
    private int dni;

    public Persona(String n, int d) {
        this.nombre = n;
        this.dni = d;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public int precedeA(Precedable t) {
        Persona a = (Persona) t;
        return this.dni - a.getDni();
    }
}