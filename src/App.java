import Controllers.PersonaController;
import Models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear arreglo de personas
        Persona[] personas = {
                new Persona("Anais", 25),
                new Persona("Luis", 32),
                new Persona("Carlos", 40),
                new Persona("María", 19),
                new Persona("José", 45),
                new Persona("Laura", 30),
                new Persona("Pedro", 28),
                new Persona("Marta", 35),
                new Persona("Jorge", 50),
                new Persona("Sofía", 22),
                new Persona("Raúl", 18),
                new Persona("Patricia", 29),
                new Persona("Andrés", 41),
                new Persona("Elena", 24),
                new Persona("Manuel", 38),
                new Persona("Isabel", 34),
                new Persona("Gabriel", 42),
                new Persona("Claudia", 26),
                new Persona("Fernando", 31),
                new Persona("Paula", 20),
                new Persona("Diego", 36),
                new Persona("Rosa", 27),
                new Persona("Rubén", 44),
                new Persona("Teresa", 33),
                new Persona("Iván", 17),
                new Persona("Julia", 21),
                new Persona("Adriana", 39),
                new Persona("Sergio", 48),
                new Persona("Lorena", 23),
                new Persona("Miguel", 52)
        };

        // Crear instancia de PersonaController
        PersonaController controlador = new PersonaController(personas);

        // 1. Ordenar por edad descendente
        System.out.println("Ordenando por edad (descendente):");
        controlador.ordenarPorEdadDescendente();
        controlador.imprimirPersonas();

        // 1.2 Buscar por edad
        System.out.println("\nBuscando por edad:");
        int[] edadesABuscar = {25, 70};
        for (int edad : edadesABuscar) {
            Persona encontrada = controlador.buscarPorEdad(edad);
            if (encontrada != null) {
                System.out.println("Encontrada: " + encontrada.getNombre() + " con " + encontrada.getEdad() + " años");
            } else {
                System.out.println("No se encontró una persona con la edad " + edad);
            }
        }

        // 2. Ordenar por nombre ascendente
        System.out.println("\nOrdenando por nombre (ascendente):");
        controlador.ordenarPorNombreAscendente();
        controlador.imprimirPersonas();

        // 2.2 Buscar por nombre
        System.out.println("\nBuscando por nombre:");
        String[] nombresABuscar = {"Anais", "Miguel"};
        for (String nombre : nombresABuscar) {
            Persona encontrada = controlador.buscarPorNombre(nombre);
            if (encontrada != null) {
                System.out.println("Encontrada: " + encontrada.getNombre() + " con " + encontrada.getEdad() + " años");
            } else {
                System.out.println("No se encontró una persona con el nombre " + nombre);
            }
        }
    }
}