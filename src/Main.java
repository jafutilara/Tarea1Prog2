import java.util.ArrayList;
import java.util.Arrays;

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
    }

}