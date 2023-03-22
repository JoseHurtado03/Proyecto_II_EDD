MetroMendeley: Tablas de Dispersión.

	Se requiere que su equipo de trabajo construya un programa en Java para la administración de artículos científicos. Dicho sistema es concebido como un recurso de apoyo al trabajo de los investigadores, permitiéndoles realizar búsquedas y revisar los resúmenes. El sistema deberá leer un archivo de texto contentivo del resumen de una investigación, registrando la frecuencia con la que aparezcan cada una de las palabras claves registradas en el repositorio del sistema. 
Requerimientos funcionales:

***Agregar resumen*** Un resumen está contenido en un archivo de texto, tal y como se muestra en el anexo 1. Esta funcionalidad consiste en:
     Cargar el archivo en el que se encuentra el resumen y almacenarlo en una tabla de dispersión. Es decir, se debe diseñar una función hash que genere una clave única que permita tanto almacenar como buscar dicho resumen en la tabla con una complejidad lo más cercana a O(1). Dicha clave debe ser generada a partir del título de la investigación.
     Por cada resumen, se guarda: título, autores, cuerpo del resumen y palabras claves.
     El programa deberá validar que no se introduzca dos veces al mismo resumen.
     
***Analizar resumen***  Para la ejecución de esta funcionalidad, la secuencia de pasos es la siguiente:
     El sistema muestra la lista de las investigaciones guardadas, preferiblemente en orden alfabético.
     El usuario selecciona la investigación.
     El sistema analiza el texto correspondiente al resumen y se imprime en pantalla las estadísticas correspondientes, tal y como se describió en el planteamiento del problema. A continuación se muestra en detalle la forma en la que debería aparecer la información:
     Nombre del trabajo.
     Autores:
     palabra clave 1: frecuencia con la cual la palabra clave 1, almacenada en el repositorio del sistema aparece en el resumen
palabra clave 2: frecuencia con la cual frecuencia palabra clave 2, almacenada en el repositorio del sistema aparece en el resumen
…
palabra clave n: frecuencia con la cual la palabra clave n, almacenada en el repositorio del sistema aparece en el resumen

***Buscar Investigaciones por palabra clave***: Dada una palabra clave, ver listado de las investigaciones relacionadas. Esta operación debe ser lo más cercano a O(1). El usuario podrá seleccionar uno de los documentos para ver detalles.

***Buscar Investigaciones por Autor***: El usuario selecciona un nombre de una lista desplegable y el sistema muestra la o las investigaciones en las que él es autor o coautor. El usuario podrá seleccionar uno de los documentos para ver detalles.

***Salir del sistema***: se deben guardar la información de los resúmenes de manera que el usuario pueda acceder a dicha información en una siguiente oportunidad.


Requerimientos Técnicos:
**La solución debe ser implementada con base en la utilización de tablas de dispersión. Puede, sin embargo, utilizar otros TDA auxiliares.
**La aplicación debe ofrecer una interfaz gráfica al usuario.
**Al comenzar el sistema, un conjunto de investigaciones deben ser precargadas.
Consideraciones:

     Los proyectos podrán ser sometidos a defensa, es decir, el facilitador convocará al equipo para una revisión presencial.
     Los equipos de trabajo deberán utilizar GitHub para el control de versiones y facilitar el trabajo en equipo de manera remota. En el registro se deberá reflejar la participación activa y significativa de los integrantes. Los proyectos que no tengan interfaz gráfica, serán calificados con 0 (cero).
     Los proyectos que sean iguales o parecidos, serán calificados con 0 (cero).
     Los programas que “no corran”, serán calificados con 0 (cero).
     Los equipos pueden tener como máximo 3 personas.
     El nombre del archivo del proyecto deberá contener los apellidos de los integrantes del equipo.
     
     
Criterios de evaluación

*Funcionalidad: Capacidad para proporcionar las funcionalidades que satisfacen las necesidades explícitas e implícitas bajo unas ciertas condiciones. (40%)
*Adecuación: El programa ofrece todas funcionalidades que respondan a las necesidades, tanto explícitas (contenidas en el documento descriptivo del proyecto) como implícitas; entendiendo como necesidades implícitas, aquellas que no estando descritas en el documento, surgen como resultado de un concienzudo análisis del problema planteado y que aseguran el correcto funcionamiento del programa.
*Exactitud: El programa genera los resultados o efectos correctos o acordados, con el grado necesario de precisión.
Fiabilidad: Capacidad para mantener un nivel especificado de prestaciones cuando se usa bajo ciertas condiciones.
*Madurez: El programa no presenta fallas originadas por errores de programación, análisis o diseño. (10%)
*Tolerancia a fallos: El programa responde adecuadamente al manejo inadecuado del usuario; es decir, mantiene su correcto funcionamiento aun cuando el usuario introduzca datos erróneos o manipule inadecuadamente las interfaces de usuario. (10%)
*Usabilidad: Capacidad del proyecto para ser entendido, aprendido, usado y al mismo tiempo, ser atractivo para el usuario, cuando se usa bajo condiciones específicas.
*Comprensibilidad: El programa ofrece una interfaz de fácil comprensión, facilitando su aprendizaje y correcta utilización. El programa emite mensajes de alerta cuando se introducen valores erróneos. Existen elementos informativos que indican al usuario como operar el programa. (5%)
*Capacidad de ser atractivo: El diseño de la interfaz de usuario, esto es: disposición de controles, esquema de colores, utilización de cajas de diálogo y demás elementos gráficos; es atractivo para el usuario. (5%)
*Eficiencia: Capacidad para proporcionar prestaciones apropiadas, relativas a la cantidad de recursos usados, bajo condiciones determinadas.
*Estructuras de datos: Utiliza eficientemente las estructuras de datos para la solución del problema. (30%)
