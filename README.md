
# SIGPACO
En la siguiente información se muestra el diagrama de clases del proyecto **SIGPACO**  (Sistema Integral de Gestións de Pagos y Asistencia de Cursos Online), el proyecto es desarrollado en Java por cuestiones académicas, se integra en Java Web.

## Tecnología necesarias

- Draw.io – Diseño de Diagrama de clases -- [Descarga](http://https://app.diagrams.net/ "Descarga")
- JDK Oracle 17 -- [Descargar](https://www.oracle.com/java/technologies/javase/jdk17-0-13-later-archive-downloads.html "Descargar")
- Netbeans 17 -- [Descargar](https://netbeans.apache.org/front/main/download/nb17/ "Descargar")
- Tomcat 9 --  [Descargar](https://tomcat.apache.org/download-90.cgi "Descargar") 

La instalación debe ser en el orden establecido, primero JDK quien permite el desarrollo y compilación de aplicaciones Java.
Realizar la instalación de Netbeans 17

## Diagrama de clases actualizado
Los **diagramas de clase** son herramientas utilizadas actualmente y desde hace algunas décadas para el diseño de software una vez que los posibles requerimientos han sido analizados en las etapas anteriores como la obtención de requerimientos.

Mediante el diagrama de clases es la forma principal de integrar el diseño de software orientado a objetos, en nuestro proyecto no sería una excepcion, ya que permite visualizar las relaciones entre las entidades que conformaran el proyecto.

![](https://github.com/MundoDevp/sigpacoweb/blob/master/capturas/diagrama_clase_sigpaco.jpg?raw=true)

## Estructura del proyecto Version 2 Web
En la siguiente imagen se puestra la estructura basica de la integración del codigo fuente con apoyo del diagrama de clase desarrollado .
![](https://github.com/MundoDevp/sigpacoweb/blob/master/capturas/estructura_proyecto.png?raw=true)

Se integra la nueva estructura en ambiente web, todo dividido en diferentes capas siguiendo arquitectura de n-capas para el desarrollo y mejor gestión del proyecto. 

En la siguiente imagen se muestra la implementaciónde las librerias, java.io, lombok, JPA con sus respectivas anotaciones.
Se muestra utilizando la entidad persona la cual es heredada por Administrador, Instructor y Estudiante, todo lo mencionado se encuentra dentro de proyecto.

![](https://github.com/MundoDevp/sigpacoweb/blob/master/capturas/ejemplo_persistencia_jpa.jpg?raw=true)


Miguel Angel Zavaleta Esquivel
