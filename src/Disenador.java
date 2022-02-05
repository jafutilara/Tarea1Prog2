class Disenador extends Empleado {
    private String especialidad;

    public Disenador(String nombre, String apellido, String genero, String flota_asignada, int sueldo,
            String especialidad) {
        super(nombre, apellido, genero, flota_asignada, sueldo);
        this.especialidad = especialidad;
    }

    void solucionGrafica(Gerente empleado) {
        if (empleado.getDepartamento() == "diseñador") {
            System.out.println("Buscando solucion grafica al supervisor " + empleado.getNombre());
        }
    }

    public void identidadGrafica() {
        System.out.println(
                super.getNombre() + " " + super.getApellido() + " esta diseñando la identidad gráfica de la empresa.");
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}

/*
 * - Diseñador
 * » area de expertis
 * 
 * « Buscar soluciones graficas a las tareas del gerente
 * « crear identidad gráfica de la empresa
 */