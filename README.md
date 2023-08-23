# Sistema Bancario Part. 2

## Notas del proyecto

1. Este proyecto es la continuación del proyecto de sistema bancario, el cual se puede hayar en el siguiente vinculo: <https://github.com/Ricardo-Vargas-Gonzalez/JOO-With-Bank-System>.

2. En esta parte me centro en el sistema interno y su forma de ingresar, autenticación, personas que tienen accesos diferentes al sistema bancario y demás relacionado con el polimorfismo y la herencia de clases.

3. Es necesario hacer notar que, si bien este proyecto tiene su propia implementación como System Bank 2, este tiene implementaciones de system bank **[3]** y **[4]**, es decir, se encuentra ligado y con implementaciiones de exceptiones, try catch y errores, así como la compilación en package de java y su vinculación por medio de los imports.

## Notas y apuntes

### Composición de el metodo main

- Para recordar la conotación de la composicion de clases

- Public es el modificador de acceso

- static es un modificador de clase

- Void es el tipo de retorno

- Main es el nombre del metodo principal

- String[] args es el parametro de entrada

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

### Listas

El metodo ArrayList es una clase que permite crear un array dinamico es decir, que no tiene un limite de elementos como el array tradicional y que ademas permite agregar elementos de cualquier tipo de dato (int, String, boolean, etc), por otro lado, en ocasiones es mejor usar el metodo linkedList que es similar al ArrayList, pero que tiene mejor rendimiento en ciertas situaciones

#### Caracteristicas del ArrayList

1. Acceso fácil y de rendimiento por el índice.

2. Los elementos deben copiarse cuando no hay más capacidad.

#### Caracteristicas del LinkedList

1. Inserción y eliminación con performance en cualquier posición, también al inicio.

2. Acceso más lento por el índice, es necesario investigar los elementos.

#### Los primitivos y el unboxing en las listas

Las listas no guardan **primitivos como lo es int**, esto se debe a que los primitivos no son objetos, por lo tanto no se pueden guardar en una lista, para solucionar esto se debe usar la clase wrapper o envoltorio, que es una clase que envuelve a los primitivos y los convierte en objetos, por ejemplo, el int se convierte en Integer, el boolean en Boolean, etc. No obstante el integer java señala que no es recomendable usarlo, porque es ineficiente, es decir, que consume muchos recursos, por lo tanto se debe usar el metodo valueOf, que es un metodo estatico que convierte un primitivo en un objeto, por ejemplo, Integer.valueOf(33), esto es lo mismo que new Integer(33), pero es mas eficiente, ya que no crea un nuevo objeto, sino que lo reutiliza, esto se conoce como flyweight o patron de diseño de objetos ligeros, que consiste en reutilizar objetos en vez de crearlos, esto es mas eficiente en terminos de memoria y de rendimiento.

Por otro lado, también existe el **Unboxing** que es el proceso de convertir un objeto en un tipo primitivo, por ejemplo: Integer a int, Double a double, etc. Esto es util cuando se trabaja con arrays dinamicos, ya que estos solo aceptan objetos y no tipos primitivos. lo que hace que el proceso de Unboxing sea automatico, es decir, que no es necesario hacer una conversion explicita.

#### Wrappers

Son clases que contienen funcionalidades y encapsulan la variable de tipo primitivo

Los wrappers son inmutables, es decir, no se pueden modificar, sirven para hacer comparaciones, es decir que si se quiere comparar dos objetos de tipo wrapper, se debe usar el metodo equals, porque si se usa el operador ==, se estará comparando las referencias y no los valores de los objetos.

#### Collections y la manipulación de las listas

Con el metodo collection se pueden ordenar listas, con el metodo sort, el cual recibe una lista y un comparator, es decir, collecions.sort(lista, comparator), pero tambien se puede hacer otros manejos de las listas, por ejemplo:

- Se puede invertir el orden de una lista con el metodo reverse, el cual recibe una lista y la invierte, es decir, collecions.reverse(lista);

- tambien se pueden mezclar todos los elementos de una lista, con el metodo shuffle, el cual recibe una lista y la mezcla, es decir, collecions.shuffle(lista);

- Iterator es una interfaz funcional, porque solo tiene un método abstracto, y se puede usar un lambda para implementarla, sirve para recorrer una lista de objetos y hacer algo con ellos, por ejemplo: lista.forEach( cuenta -> System.out.println(cuenta));
**Un Iterador** es un objeto que tiene al menos dos métodos: **hasNext()** y **next()**. Es decir, puede usarlo para preguntar si hay un próximo elemento y pedir el próximo elemento. La buena noticia es que funciona con TODAS las implementaciones y esa es la gran ventaja.

- Finalmente se pueden rotar los elementos de una lista con el metodo rotate, el cual recibe una lista y la rota, es decir, collecions.rotate(lista, 1);

**Nota:** Ordenar arrays tampoco es difícil, se puede realizar mediante el uso del método de ordenación de la clase Arrays. La clase Arrays es similar a Collections en el sentido de que también une varios métodos de utilidad, Arrays.sort(numeros), por ejemplo

[3]: ttps://github.com/Ricardo-Vargas-Gonzalez/Exceptions-Bank-System
[4]: ttps://github.com/Ricardo-Vargas-Gonzalez/Librerias-Bank-System-
