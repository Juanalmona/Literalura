# 📚 Literalura
### Challenge de gestión de libros - ONE Alura Latam (Back-End)

<p align="center">
  <img src="https://camo.githubusercontent.com/6e973d20a040a6344a4060436cb343bc576a77d05bfd08f324e2919d63e1d848/68747470733a2f2f617072656e64652e676f6f646e65696768626f72732e636c2f77702d636f6e74656e742f75706c6f6164732f323032322f30322f4f4e455f6c6f676f5f7267622d373638783430382e706e67" alt="Banner del Proyecto Literalura">
</p>

## 📖 Descripción
**Literalura** es una aplicación de **Gestión de Libros** desarrollada en **Java**, pensada para ayudarte a explorar y gestionar información de libros y autores. Permite realizar búsquedas de libros por título, listar autores, y ver estadísticas de la base de datos de libros. Además, interactúa con una **API externa** para obtener datos y gestionar los registros en una base de datos local.

## ⚙️ Tecnologías Utilizadas
- **Lenguaje de Programación:** Java
- **API de Libros:** [Gutendex.com](https://gutendex.com) para obtener información sobre libros y autores
- **Spring Framework:** Para inyección de dependencias y gestión de base de datos
- **Base de Datos:** Uso posible de H2, MySQL, etc., para almacenamiento de datos
- **Control de Versiones:** Git/GitHub para la colaboración en equipo
- **Entorno de Desarrollo:** IntelliJ IDEA

## 🚀 Funcionalidades

### Clase Principal.java
El punto de entrada de la aplicación maneja la interacción con el usuario a través de un menú en consola con las siguientes opciones:
- **Buscar libros por título**
- **Listar libros registrados**
- **Listar autores registrados**
- **Listar autores vivos en un año específico**
- **Listar libros por idioma**

## 🛠️ Instrucciones de Uso
Para ejecutar el proyecto **Literalura**, asegúrate de tener instalados los siguientes elementos en tu entorno:

### Requisitos del Entorno

1. **Java Development Kit (JDK) 17 o superior**
   - Literalura está desarrollado en Java, por lo que necesitarás el JDK para compilar y ejecutar el código. Puedes descargar la versión más reciente de Java [aquí](https://www.oracle.com/java/technologies/javase-downloads.html).

2. **IDE para Java (recomendado: IntelliJ IDEA)**
   - Aunque puedes usar cualquier editor de texto o IDE, se recomienda **IntelliJ IDEA** para una mejor experiencia de desarrollo con Java y Spring. IntelliJ permite ejecutar, depurar y administrar dependencias del proyecto fácilmente.

3. **Base de Datos**
   - La aplicación está diseñada para conectarse a una base de datos PostgreSQL.
   - **MySQL** o cualquier otro gestor de bases de datos compatible: Si planeas usar una base de datos externa, instala y configura tu base de datos antes de ejecutar la aplicación. (Configura la conexión a la base de datos en el archivo de propiedades).

4. **Git**
   - Es recomendable tener **Git** instalado para clonar el repositorio y gestionar el control de versiones. Puedes descargar Git desde [aquí](https://git-scm.com/) si aún no lo tienes instalado.
