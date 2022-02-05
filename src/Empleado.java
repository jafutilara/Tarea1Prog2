
public class Empleado {
    private String nombre;
    private String apellido;
    private String genero;
    private String flota_asignada;
    private int sueldo;

    public Empleado(String nombre, String apellido, String genero, String flota_asignada, int sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.flota_asignada = flota_asignada;
        this.sueldo = sueldo;
    }

    public void Almorzar() {
        System.out.println(nombre + " " + apellido + " Almuerza");
    }

    public String getApellido() {
        return apellido;
    }

    public String getFlota_asignada() {
        return flota_asignada;
    }

    public String getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFlota_asignada(String flota_asignada) {
        this.flota_asignada = flota_asignada;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

}
/**
 * » Encapsulación
 * » Se ve con los métodos & atributos privados.
 * 
 * » Herencia
 * » Al crear instancias en base a una clase.
 * 
 * » Abstracción
 * » Al definir métodos y atributos puntuales.
 * 
 * » Polimorfismo
 * » Al crear diferentes instancias de la misma clase.
 * 
 * --------------------------------------------------
 * 
 * Bienvenido al sistema de información de empleados de la empresa X
 * 
 * 1: Agregar empleado
 * 2: Listado de empleados
 * 3: Eliminar empleado
 * 
 * Empleados
 * » Nombre
 * » Apellido
 * » Género
 * » Contacto_Asignado
 * » Sueldo
 * 
 * » TIPOS??
 * - Gerente
 * » Departamento a supervisar
 * 
 * « Supervisa a los empleados del departamento a supervisar
 * « Delegar tareas
 * - Programador
 * » Lenguajes de Progamación que domina
 * 
 * « Buscar una solución estructurada a tareas del gerente
 * « Dar mantenimiento a las herramientas digitales utilizadas en la empresa
 * - Diseñador
 * » area de expertis
 * 
 * « Buscar soluciones graficas a las tareas del gerente
 * « crear identidad gráfica de la empresa
 * 
 * « Almorzar
 */
