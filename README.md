

# Sistema de Gestión de Personas

## Descripción

Este proyecto Java implementa un sistema de gestión de personas utilizando el patrón Modelo-Vista-Controlador (MVC), aunque en este caso particular no se incluye una interfaz gráfica de usuario (Vista). El sistema permite ordenar y buscar personas por edad a través de un arreglo de objetos `Persona`.

Actividad de repaso de la unidad 1 en métodos de búsqueda y ordenamiento.

## Estructura del Proyecto

El proyecto está dividido en dos paquetes principales:

- `Models`: Contiene la clase `Persona` que representa la entidad Persona con atributos para el nombre y la edad.
- `Controllers`: Contiene la clase `PersonaController` que maneja la lógica para operar sobre arrays de personas, incluyendo métodos para ordenar y buscar personas por edad.

## Funcionalidades

- **Ordenar Personas por Edad**: Ordena un array de personas en función de su edad.
- **Buscar Persona por Edad**: Busca en el array la primera persona con una edad específica y la devuelve.

## Requisitos

Para ejecutar este proyecto necesitas:

- Java Development Kit (JDK), versión 8 o superior.

## Configuración del Entorno

Asegúrate de tener Java instalado y configurado correctamente en tu sistema. Puedes verificar la versión de Java con el siguiente comando:

```bash
java -version
```

Si Java está instalado correctamente, deberías ver algo similar a:

```
java version "1.8.0_281"
Java(TM) SE Runtime Environment (build 1.8.0_281-b09)
Java HotSpot(TM) 64-Bit Server VM (build 25.281-b09, mixed mode)
```

## Compilación y Ejecución

1. Clona este repositorio o descarga los archivos fuente.
2. Navega al directorio raíz del proyecto.
3. Compila el código usando el siguiente comando:

```bash
javac -d . Models/Persona.java Controllers/PersonaController.java App.java
```

4. Ejecuta la aplicación con:

```bash
java App
```

## Contribuir

Para contribuir a este proyecto, por favor crea un fork y envía un pull request, o simplemente abre un issue con tus comentarios y sugerencias.

## Autores

- [PABLO TORRES] - Desarrollo inicial

### Notas adicionales:

- **Comentarios en el código**: Debes implementar los métodos en `PersonaController`. Actualmente, los métodos lanzan `UnsupportedOperationException` porque están marcados como "no implementados". Asegúrate de reemplazar estos marcadores con implementaciones reales antes de considerar el proyecto completo.

---








































































## Descripción

Este proyecto Java implementa un sistema de gestión de vehículos utilizando el patrón Modelo-Vista-Controlador (MVC), aunque en este caso particular no se incluye una interfaz gráfica de usuario (Vista). El sistema permite ordenar y buscar vehículos por año a través de un arreglo de objetos `Persona`.

Actividad de repaso de la unidad 1 en métodos de búsqueda y ordenamiento.

## Estructura del Proyecto

El proyecto está dividido en dos paquetes principales:

- `Models`: Contiene la clase `Persona` que representa la entidad Persona con atributos para la marca y el año.
- `Controllers`: Contiene la clase `PersonaController` que maneja la lógica para operar sobre arrays de carros, incluyendo métodos para ordenar y buscar vehículos por año.

## Funcionalidades

- **Ordenar Vehículos por Año**: Ordena un array de vehículos en función de su año.
- **Buscar Vehículo por Año**: Busca en el array el primer vehículo con un año específico y lo devuelve.

## Requisitos

Para ejecutar este proyecto necesitas:

- Java Development Kit (JDK), versión 8 o superior.

## Configuración del Entorno

Asegúrate de tener Java instalado y configurado correctamente en tu sistema. Puedes verificar la versión de Java con el siguiente comando:

```bash
java -version
```

Si Java está instalado correctamente, deberías ver algo similar a:

```
java version "1.8.0_281"
Java(TM) SE Runtime Environment (build 1.8.0_281-b09)
Java HotSpot(TM) 64-Bit Server VM (build 25.281-b09, mixed mode)
```

## Compilación y Ejecución

1. Clona este repositorio o descarga los archivos fuente.
2. Navega al directorio raíz del proyecto.
3. Compila el código usando el siguiente comando:

```bash
javac -d . Models/Persona.java Controllers/PersonaController.java App.java
```

4. Ejecuta la aplicación con:

```bash
java App
```

## Contribuir

Para contribuir a este proyecto, por favor crea un fork y envía un pull request, o simplemente abre un issue con tus comentarios y sugerencias.

## Autores

- [PABLO TORRES] - Desarrollo inicial

### Notas adicionales:

- **Comentarios en el código**: Debes implementar los métodos en `PersonaController`. Actualmente, los métodos lanzan `UnsupportedOperationException` porque están marcados como "no implementados". Asegúrate de reemplazar estos marcadores con implementaciones reales antes de considerar el proyecto completo.

---