package EjercicioMañana;

public class main {
    public static void main(String[] args) {
        Persona[] lista = new Persona[]{new Persona("javier", 23), new Persona("Victor", 782), new Persona("Carlos", 076), new Persona("Juan", 7)};
        SortUtil.ordenar(lista);
        for (Persona x : lista) {
            System.out.println(x.getDni());
        }
        Celular[] listaCel = new Celular[]{new Celular(42, "javi"), new Celular(123, "Juana"), new Celular(2, "Carlos"), new Celular(35, "Pedro")};
        SortUtil.ordenar(listaCel);
        for (Celular s : listaCel) {
            System.out.println(s.getNumero());
        }
    }
}
