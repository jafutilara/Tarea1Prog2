import java.util.ArrayList;

class Programador extends Empleado {
    public ArrayList<String> lenguajes;

    public Programador(String nombre, String apellido, String genero, String flota_asignada, int sueldo,
            ArrayList<String> lenguajes) {
        super(nombre, apellido, genero, flota_asignada, sueldo);
        this.lenguajes = lenguajes;
    }

    void buscandoSolucion(Gerente empleado) {
        if (empleado.getDepartamento() == "programador") {
            System.out.println("Buscando solucion al supervisor " + empleado.getNombre());
        }
    }

    void darMantenimiento() {
        System.out.println("Dando mantenimiento...");
    }
}
