# patronesConstruccion

##Nota:
Mi repositorio es:https://github.com/zmartand/patronesConstruccion.git

##Enunciados:

### Ejercicio 1:
Ejercicio 1

El Servicio de Emergencias Sanitarias de Madrid, antes conocido como 112, está organizado en una jerarquía de bases. Algunas de estas bases realmente disponen de personal y ambulancias (por ejemplo la de Villanueva de la Cañada), mientras que otras son «unidades administrativas» que agrupan un conjunto de bases (por ejemplo Majadahonda, que agrupa la unidad del Hospital Clínico Universitario Puerta de Hierro y la de Alcobendas entre otras).

Para cada base, interesa modelar los siguientes datos:

Nombre de la base.
Número de ambulancias, que en el caso de las bases compuestas es la suma de las ambulancias disponibles en las bases que las componen en ese momento.
Tiempo medio de asistencia, que en el caso de las bases compuestas es la media de los tiempos medios de asistencia registrados en las bases que las componen en ese momento.
Elaborar un diseño que permita modelar adecuadamente esta situación, implentando completamente en Replit las clases que modelan las bases, sean del tipo que sean. Definir los patrones de diseño utilizado

#### Explicación:
Clase Producto (Base):
Esta clase representa la base de emergencias con sus propiedades, como nombre de la base, número de ambulancias y tiempo medio de asistencia.

Abstract Builder (BaseBuilder):
Esta interfaz define los métodos que deben ser implementados por los constructores concretos. Define métodos como setNombre(), addAmbulancia() y addTiempoMedioAsistencia().

Concrete Builder (BaseBuilderImpl):
Esta clase implementa la interfaz BaseBuilder y es responsable de construir la base de emergencias con las propiedades establecidas.

La razón por la que se utiliza el patrón Builder en este caso es para separar la construcción de un objeto complejo (Base) de su representación, permitiendo la creación de diferentes tipos de bases de emergencias sin cambiar la lógica de construcción. 
Esto facilita la adición de nuevas representaciones de bases de emergencias y hace que el código sea más flexible y fácil de mantener.
