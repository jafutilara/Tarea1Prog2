import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Gerente("Juan", "Perez", "Masculino", "809-555-5555", 100000, "Programación"));
        empleados.add(new Gerente("Paola", "Suarez", "Femenino", "809-666-6666", 100000, "Diseño"));
        empleados
                .add(new Programador("Diana", "Marie", "Femenino", "849-777-7777", 75000, new ArrayList<>(Arrays.asList(
                        "HTML", "CSS", "Javascript", "React", "Wordpress", "Bootsrap", "Jquery", "NodeJS", "PHP"))));
        empleados.add(new Disenador("Michael", "Gonzalez", "Masculino", "829-333-3333", 35000, "UI/UX"));

        System.out.println("Bienvenido al sistema de información de empleados de la empresa RJ");
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Escoge un numero:");
            System.out.println("(0) Terminar programa");
            System.out.println("(1) Agrega a un empleado");
            System.out.println("(2) Ver empleados");
            System.out.println("(3) Eliminar a un empleado");

            int comando = Integer.parseInt(s.nextLine());

            if (comando == 1) {

                System.out.println("añade el  nombre  del empleado");
                String info_nombre = s.nextLine();
                System.out.println("añade el  apellido  del empleado");
                String apellido = s.nextLine();
                System.out.println("añade el  genero  del empleado");
                String genero = s.nextLine();
                System.out.println("añade el numero de flota asignada del empleado");
                String flota = s.nextLine();
                System.out.println("añade el sueldo del empleado");
                int sueldo = Integer.parseInt(s.nextLine());

                System.out.println("Que tipo de empleado será " + info_nombre);
                System.out.println("Programador | Diseñador | Gerente");
                String tipo = s.nextLine();

                Empleado empleado = null;

                if (tipo.equals("Programador")) {
                    ArrayList<String> lenguajes = new ArrayList<>();
                    System.out.println("Cuales lenguajes de programacion maneja?");
                    System.out.println("escribir los lenguajes uno a uno y para terminar esciba '.' ");
                    while (true) {
                        String info = s.nextLine();
                        if (info.equals("."))
                            break;
                        lenguajes.add(info);
                    }
                    empleado = new Programador(info_nombre, apellido, genero, flota, sueldo, lenguajes);
                } else if (tipo.equals("Diseñador")) {
                    System.out.println("En que se especializa?");
                    String especialidad = s.nextLine();
                    empleado = new Disenador(info_nombre, apellido, genero, flota, sueldo, especialidad);
                } else if (tipo.equals("Gerente")) {
                    System.out.println("Que departamento dirige?");
                    String departamento = s.nextLine();
                    empleado = new Gerente(info_nombre, apellido, genero, flota, sueldo, departamento);
                }

                empleados.add(empleado);
                System.out.println("El empleado fue agregado exitosamente...");

            } else if (comando == 2) {
                System.out.println("Estos son los empleados:");
                for (int i = 0; i < empleados.size(); i++) {
                    Empleado empleado = empleados.get(i);
                    System.out.println(i + "- " + empleado.getNombre() + " " + empleado.getApellido());
                }
            } else if (comando == 3) {
                System.out.println("Digita la posicion del empleado al borrar");
                empleados.remove(Integer.parseInt(s.nextLine()));
                System.out.println("Empleado borrado exitosamente");
            } else if (comando == 0) {
                System.out.println("Programa finalizado...");
                break;
            } else {
                System.out.println("Ha ocurrido un error, intente nuevamente...");
            }
        }
        s.close();
    }
}