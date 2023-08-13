# Sistema Bancario Part. 2

## Notas del proyecto

1. Este proyecto es la continuación del proyecto de sistema bancario, el cual se puede hayar en el siguiente vinculo: <https://github.com/Ricardo-Vargas-Gonzalez/JOO-With-Bank-System>.

2. En esta parte me centro en el sistema interno y su forma de ingresar, autenticación, personas que tienen accesos diferentes al sistema bancario y demás relacionado con el polimorfismo y la herencia de clases.

3. Es necesario hacer notar que, si bien este proyecto tiene su propia implementación como System Bank 2, este tiene implementaciones de system bank 3 y 4, es decir, se encuentra ligado y con implementaciiones de exceptiones, try catch y errores, así como la compilación en package de java y su vinculación por medio de los imports.

### modificadores de acceso

Es lo que delimita el alcance de un objeto de java, es decir, la visibilidad dentro de un proyecto, siendo cuatro los existentes:

1. public: es el mas permisivo, es el que permite ver o entrar a la clase, sin importar el paquete, es decir es accesible desde cualquier parte.

2. default: también concido como PAKCKAGE PRIVATE que es aquel que existe cuando no tenemos modificador de clase, esta clase, va a ser unicamente visible dentro del mismo paquete.

3. protected: da visibilidad a nivel de paquete (default) y a nivel de herencia, es decir, dentro y fuera del paquete a todas aquellas que sean clases hijas.

4. private: es el mas restrictivo de todos, no puede ser invocado o acceder a este fuera de la clase, solo desde la misma.

### Etiquetas de documentacción

Dentro de java existen algunos modos de documentar los desarrollos y modificaciones hechos a los proyectos, entre ellos tenemos la etiquetas de documentación, tales como:

- @author (usado en la clase o interfaz)

- @version (usado en la clase o interfaz)

- @param (usado en el método y constructor)

- @return (usado solo en el método)

- @exception o @throws (en el método o constructor)

- @see

- @since

- @serial

- @deprecated

- @Override. Esta anotación se considera una configuración, en este caso interpretada por el compilador.

### Clases

en las clases existe una superclase llamada Object que es la clase padre de todos los objects, por lo que no es necesario declararla, pero al hacerlo cualquier objeto hereda las funcionalidades de esta
