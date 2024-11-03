# 📚 Literalura

### Challenge de gestión de libros - ONE Alura Latam (Back-End)

<h1 align="center">📚 Literalura</h1>
<h3 align="center">Challenge de gestión de libros - ONE Alura Latam (Back-End)</h3>

<p align="center">
  <img src="https://camo.githubusercontent.com/6e973d20a040a6344a4060436cb343bc576a77d05bfd08f324e2919d63e1d848/68747470733a2f2f617072656e64652e676f6f646e65696768626f72732e636c2f77702d636f6e74656e742f75706c6f6164732f323032322f30322f4f4e455f6c6f676f5f7267622d373638783430382e706e67" alt="Banner del Proyecto Literalura">
</p>


## 📖 Descripción
Literalura es una aplicación de **Gestión de Libros** desarrollada en **Java**, pensada para ayudarte a explorar y gestionar información de libros y autores. Permite realizar búsquedas de libros por título, listar autores, y ver estadísticas de la base de datos de libros, interactuando con una API externa para obtener datos y gestionando los registros en una base de datos local.

## ⚙️ Tecnologías Utilizadas
- **Lenguaje de Programación:** Java
- **API de Libros:** Gutendex.com para obtener información sobre libros y autores
- **Spring Framework:** Inyección de dependencias y gestión de base de datos
- **Base de Datos:** Posible uso de H2, MySQL, etc., para almacenamiento de datos
- **Control de Versiones:** Git/GitHub para la colaboración en equipo
- **Entorno de Desarrollo:** IntelliJ IDEA

## 🚀 Funcionalidades

### Clase Principal.java
El punto de entrada de la aplicación, donde se maneja la interacción con el usuario a través de un menú en consola:
- Buscar libros por título
- Listar libros registrados
- Listar autores registrados
- Listar autores vivos en un año específico
- Listar libros por idioma

### Clase ConsumoApi.java
Responsable de realizar consultas a una API externa para obtener datos sobre libros y autores.

### Clase ConvierteDatos.java
Convierte la información obtenida de la API a un formato que puede ser gestionado en la aplicación.

### Repositorio AutorRepository.java
Maneja operaciones relacionadas con autores en la base de datos.


## 📋 Clases Modelo y Mapeo de Entidades
Se utilizan varias clases para representar entidades de dominio como **autores** y **libros**, las cuales están mapeadas a tablas de la base de datos con JPA.

### Clase Autor.java
Representa un autor en la base de datos, incluyendo atributos como nombre, fecha de nacimiento y fallecimiento, y una lista de libros asociados.

### Clase Datos.java y DatosLibro.java
Mapean la estructura JSON de la API externa, representando información clave como título, autores, idiomas, y número de descargas.

### Mapeo de Entidades
- **@Entity**: Marca una clase como una entidad de JPA
- **@Table**: Especifica la tabla de la base de datos
- **@Id**: Define la clave primaria
- **@GeneratedValue**: Estrategia de generación para la clave primaria
- **@Column**: Mapea un campo a una columna en la tabla de la base de datos
- **@OneToMany**: Define una relación uno a muchos


## 🛠️ Instrucciones de Uso
Para ejecutar el proyecto Literalura, asegúrate de tener instalados los siguientes elementos en tu entorno:

Java Development Kit (JDK) 17 o superior
Literalura está desarrollado en Java, por lo que necesitarás el JDK para compilar y ejecutar el código. Puedes descargar la versión más reciente de Java JDK aquí.

IDE para Java (recomendado: IntelliJ IDEA)
Aunque puedes usar cualquier editor de texto o IDE, se recomienda IntelliJ IDEA para una mejor experiencia de desarrollo con Java y Spring. IntelliJ permite ejecutar, depurar y administrar dependencias del proyecto fácilmente.

Base de Datos
La aplicación está diseñada para conectarse a una base de datos relacional (puede ser MySQL, H2, PostgreSQL, entre otras).

H2 Database (opcional): Para pruebas locales rápidas, puedes utilizar la base de datos H2 integrada.
MySQL o cualquier otro gestor de bases de datos compatible: Si planeas usar una base de datos externa, instala y configura tu base de datos antes de ejecutar la aplicación. ( Configura la conexión a la base de datos en el archivo de propiedades)
Git
Es recomendable tener Git instalado para clonar el repositorio y gestionar el control de versiones. Descárgalo desde aquí si aún no lo tienes instalado.



