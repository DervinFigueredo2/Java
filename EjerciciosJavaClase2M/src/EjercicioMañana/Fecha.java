package EjercicioMañana;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    private Calendar fecha;

    public Fecha(int año, int mes, int diaDelMes) {
        this.fecha = Calendar.getInstance();
        this.fecha.set(año, Calendar.AUGUST, diaDelMes);

    }

    public Fecha() {
        this.fecha = GregorianCalendar.getInstance();
    }

    @Override
    public String toString() {
        return "";
    }
}