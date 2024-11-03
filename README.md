<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestor de Libros - Proyecto Literalura</title>
</head>
<body style="font-family: Arial, sans-serif; line-height: 1.6; color: #333; max-width: 800px; margin: 0 auto; padding: 20px;">

    <h1 style="text-align: center; color: #2c3e50;">📚 Literalura</h1>
    <h3 style="text-align: center; color: #7f8c8d;">Challenge de gestión de libros - ONE Alura Latam (Back-End)</h3>

    <img src="ruta/a/tu/imagen.jpg" alt="Banner del Proyecto Literalura" style="width: 100%; margin-top: 20px; border-radius: 8px;"/>

    <section style="margin-top: 30px;">
        <h2>📖 Descripción</h2>
        <p>Literalura es una aplicación de <strong>Gestión de Libros</strong> desarrollada en <strong>Java</strong>, pensada para ayudarte a explorar y gestionar información de libros y autores. Permite realizar búsquedas de libros por título, listar autores, y ver estadísticas de la base de datos de libros, interactuando con una API externa para obtener datos y gestionando los registros en una base de datos local.</p>
    </section>

    <section style="margin-top: 30px;">
        <h2>⚙️ Tecnologías Utilizadas</h2>
        <ul>
            <li><strong>Lenguaje de Programación:</strong> Java</li>
            <li><strong>API de Libros:</strong> Gutendex.com para obtener información sobre libros y autores</li>
            <li><strong>Spring Framework:</strong> Inyección de dependencias y gestión de base de datos</li>
            <li><strong>Base de Datos:</strong> Posible uso de H2, MySQL, etc., para almacenamiento de datos</li>
            <li><strong>Control de Versiones:</strong> Git/GitHub para la colaboración en equipo</li>
            <li><strong>Entorno de Desarrollo:</strong> IntelliJ IDEA</li>
        </ul>
    </section>

    <section style="margin-top: 30px;">
        <h2>🚀 Funcionalidades</h2>
        <h3>Clase Principal.java</h3>
        <p>El punto de entrada de la aplicación, donde se maneja la interacción con el usuario a través de un menú en consola:</p>
        <ul>
            <li>Buscar libros por título</li>
            <li>Listar libros registrados</li>
            <li>Listar autores registrados</li>
            <li>Listar autores vivos en un año específico</li>
            <li>Listar libros por idioma</li>
        </ul>

        <h3>Clase ConsumoApi.java</h3>
        <p>Responsable de realizar consultas a una API externa para obtener datos sobre libros y autores.</p>

        <h3>Clase ConvierteDatos.java</h3>
        <p>Convierte la información obtenida de la API a un formato que puede ser gestionado en la aplicación.</p>

        <h3>Repositorio AutorRepository.java</h3>
        <p>Maneja operaciones relacionadas con autores en la base de datos.</p>

        <img src="ruta/a/imagen_funcionalidades.jpg" alt="Funcionalidades de la Aplicación" style="width: 100%; margin-top: 10px; border-radius: 8px;"/>
    </section>

    <section style="margin-top: 30px;">
        <h2>📋 Clases Modelo y Mapeo de Entidades</h2>
        <p>Se utilizan varias clases para representar entidades de dominio como <strong>autores</strong> y <strong>libros</strong>, las cuales están mapeadas a tablas de la base de datos con JPA.</p>

        <h3>Clase Autor.java</h3>
        <p>Representa un autor en la base de datos, incluyendo atributos como nombre, fecha de nacimiento y fallecimiento, y una lista de libros asociados.</p>

        <h3>Clase Datos.java y DatosLibro.java</h3>
        <p>Mapean la estructura JSON de la API externa, representando información clave como título, autores, idiomas, y número de descargas.</p>

        <h3>Mapeo de Entidades</h3>
        <ul>
            <li><strong>@Entity</strong>: Marca una clase como una entidad de JPA</li>
            <li><strong>@Table</strong>: Especifica la tabla de la base de datos</li>
            <li><strong>@Id</strong>: Define la clave primaria</li>
            <li><strong>@GeneratedValue</strong>: Estrategia de generación para la clave primaria</li>
            <li><strong>@Column</strong>: Mapea un campo a una columna en la tabla de la base de datos</li>
            <li><strong>@OneToMany</strong>: Define una relación uno a muchos</li>
        </ul>

        <img src="ruta/a/imagen_mapeo_entidades.jpg" alt="Mapa de Entidades" style="width: 100%; margin-top: 10px; border-radius: 8px;"/>
    </section>

    <section style="margin-top: 30px;">
        <h2>🛠️ Instrucciones de Uso</h2>
        <ol>
            <li>Clona este repositorio en tu máquina local</li>
            <li>Abre el proyecto en <strong>IntelliJ IDEA</strong> o tu IDE preferido</li>
            <li>Configura la conexión a la base de datos en el archivo de propiedades</li>
            <li>Ejecuta la clase <strong>Principal.java</strong> para iniciar el programa</li>
            <li>Sigue las instrucciones en pantalla para buscar libros y autores y obtener estadísticas</li>
        </ol>
        <p>¡Disfruta gestionando tu biblioteca digital de libros! 📚</p>
    </section>

</body>
</html>

