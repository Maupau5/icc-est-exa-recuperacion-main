package Controllers;

import java.util.ArrayList;
import java.util.Arrays;
import Models.Persona;

public class PersonaController {

    private ArrayList<Persona> personas;

    // Constructor para inicializar la lista de personas
    public PersonaController(Persona[] personasArray) {
        this.personas = new ArrayList<>(Arrays.asList(personasArray));
    }

    // Método para ordenar personas por edad en orden descendente (Selección)
    public void ordenarPorEdadDescendente() {
        int n = personas.size();
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (personas.get(j).getEdad() > personas.get(maxIdx).getEdad()) {
                    maxIdx = j;
                }
            }
            // Intercambiar
            Persona temp = personas.get(i);
            personas.set(i, personas.get(maxIdx));
            personas.set(maxIdx, temp);
        }
    }

    // Método para buscar una persona por edad usando búsqueda binaria
    public Persona buscarPorEdad(int edad) {
        int inicio = 0;
        int fin = personas.size() - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            Persona personaActual = personas.get(medio);

            if (personaActual.getEdad() == edad) {
                return personaActual; // Edad encontrada
            } else if (personaActual.getEdad() < edad) {
                fin = medio - 1; // Buscar en la mitad izquierda
            } else {
                inicio = medio + 1; // Buscar en la mitad derecha
            }
        }

        return null; // No encontrada
    }

    // Método para ordenar personas por nombre en orden ascendente (Inserción)
    public void ordenarPorNombreAscendente() {
        int n = personas.size();
        for (int i = 1; i < n; i++) {
            Persona key = personas.get(i);
            int j = i - 1;

            while (j >= 0 && personas.get(j).getNombre().compareToIgnoreCase(key.getNombre()) > 0) {
                personas.set(j + 1, personas.get(j));
                j--;
            }
            personas.set(j + 1, key);
        }
    }

    // Método para buscar una persona por nombre usando búsqueda binaria
    public Persona buscarPorNombre(String nombre) {
        int inicio = 0;
        int fin = personas.size() - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            Persona personaActual = personas.get(medio);

            int comparacion = personaActual.getNombre().compareToIgnoreCase(nombre);

            if (comparacion == 0) {
                return personaActual; // Nombre encontrado
            } else if (comparacion < 0) {
                inicio = medio + 1; // Buscar en la mitad derecha
            } else {
                fin = medio - 1; // Buscar en la mitad izquierda
            }
        }

        return null; // No encontrada
    }

    // Método para imprimir la lista de personas
    public void imprimirPersonas() {
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + ": " + persona.getEdad() + " años");
        }
    }
}