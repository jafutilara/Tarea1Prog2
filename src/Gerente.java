class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, String apellido, String genero, String flota_asignada, int sueldo,
            String departamento) {
        super(nombre, apellido, genero, flota_asignada, sueldo);
        this.departamento = departamento;
    }

    void supervisar(Empleado empleado) {
        if (departamento == "Programación" && empleado instanceof Programador) {
            System.out.println("Supervisando al programador " + empleado.getNombre());
        } else if (departamento == "Diseño" && empleado instanceof Disenador) {
            System.out.println("Supervisando al disenador " + empleado.getNombre());
        } else {
            System.out.println("No tiene permitido supervisar este departamento.");
        }
    }

    void delegarTarea(Empleado empleado) {
        if (departamento == "Programación" && empleado instanceof Programador) {
            System.out.println(
                    "El gerente " + this.getNombre() + " delega tareas al programador " + empleado.getNombre());
        } else if (departamento == "Diseño" && empleado instanceof Disenador) {
            System.out
                    .println("El gerente " + this.getNombre() + " delega tareas al disenador " + empleado.getNombre());
        } else {
            System.out.println("No tiene permitido de delegar tareas a este departamento.");
        }
    }

    public String getDepartamento() {
        return departamento;
    }
}
