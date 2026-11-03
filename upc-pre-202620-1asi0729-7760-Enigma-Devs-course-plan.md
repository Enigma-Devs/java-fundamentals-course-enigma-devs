# Fundamentos de Java para Principiantes

## Resumen del curso

Curso introductorio dirigido a estudiantes de secundaria de **12 a 17 años**, sin experiencia previa en programación. A lo largo de nueve lecciones se construye progresivamente una **mascota virtual en consola** (tema provisional): al inicio se declaran sus datos y se comprueba su energía; luego se crean métodos y arreglos; finalmente se implementa una clase `Mascota`, sus objetos y encapsulación.

- **Duración total planificada:** 60 minutos.
- **Formato:** 9 videos cortos de YouTube, publicados como **no listados**.
- **Prerrequisitos:** ninguno.
- **Herramientas del estudiante:** navegador y editor Java en línea, gratuito. **No se requiere instalar programas.**
- **Repositorio del código fuente:** `[PEGAR AQUÍ LA URL REAL DEL REPOSITORIO PÚBLICO]`.
- **Editor de práctica previsto:** elegir y verificar enlaces precargados de OnlineGDB, JDoodle o Replit para cada lección.

> **Importante para el equipo:** los enlaces entre corchetes son pendientes de completar; no deben aparecer como enlaces ficticios en la entrega final. La idea de mascota virtual también puede cambiarse antes de producir el contenido.

## Secuencia de lecciones

### Lección 1. Tarjeta de presentación (6 minutos)

- **Objetivo:** Comprender qué es un programa y qué es Java, y ejecutar un primer programa en el navegador.
- **Conceptos:** Programa, entrada-proceso-salida, lenguaje de programación, compilador, Máquina Virtual de Java, consola y `System.out.println`.
- **Actividad progresiva:** Ejecutar el programa «Hello World» en OnlineGDB y transformarlo en una tarjeta de presentación que muestre un nombre, una edad y un pasatiempo con `System.out.println`.
- **Video en YouTube (no listado):** `[PEGAR URL REAL DEL VIDEO 1]`.
- **Práctica en editor Java en línea (precargada):** [Practica 1](https://onlinegdb.com/jRxEJQi09j).
- **Resultado esperado:** El programa muestra en la consola cada dato de la tarjeta en su propia línea y en orden.
- **Pausa de práctica:** detener el video, completar la actividad y ejecutar el código en el navegador.

### Lección 2. Perfil de red social (4 minutos)

- **Objetivo:** Guardar información en variables y mostrarla en la consola.
- **Conceptos:** Variables (tipo, nombre y valor), `String`, `int`, `double`, `boolean`, camelCase y unión de texto y variables con `+`.
- **Actividad progresiva:** Declarar el nombre de usuario, los seguidores, el promedio de likes y la verificación de una cuenta, y mostrar el perfil completo con `System.out.println`.
- **Video en YouTube (no listado):** `[PEGAR URL REAL DEL VIDEO 2]`.
- **Práctica en editor Java en línea (precargada):** [Practica 2](https://onlinegdb.com/gC5jYal3P).
- **Resultado esperado:** La consola muestra el perfil y se actualiza al cambiar el valor de una variable.
- **Pausa de práctica:** detener el video, completar la actividad y ejecutar el código en el navegador.

### Lección 3. Condicionales: ¿puede jugar la mascota? (7 minutos)

- **Objetivo:** Construir decisiones basadas en condiciones.
- **Conceptos:** `if`, `else`, operadores lógicos y comparaciones.
- **Actividad progresiva:** Usar `if` y `else` para comprobar si la energía alcanza para jugar.
- **Video en YouTube (no listado):** `[PEGAR URL REAL DEL VIDEO 3]`.
- **Práctica en editor Java en línea (precargada):** `[PEGAR URL REAL DE LA PRÁCTICA 3]`.
- **Resultado esperado:** La mascota juega solo si cumple la condición establecida.
- **Pausa de práctica:** detener el video, completar la actividad y ejecutar el código en el navegador.

### Lección 4. Bucles y cadenas de texto (7 minutos)

- **Objetivo:** Repetir acciones y trabajar con texto básico.
- **Conceptos:** `for`, `while`, `String` y recorridos simples.
- **Actividad progresiva:** Simular varias rondas de juego con `for` y un contador; explorar `while` y mostrar el nombre de la mascota.
- **Video en YouTube (no listado):** `[PEGAR URL REAL DEL VIDEO 4]`.
- **Práctica en editor Java en línea (precargada):** `[PEGAR URL REAL DE LA PRÁCTICA 4]`.
- **Resultado esperado:** El programa registra las rondas de juego sin repetición manual de instrucciones.
- **Pausa de práctica:** detener el video, completar la actividad y ejecutar el código en el navegador.

### Lección 5. Conversor de unidades (7 minutos)

- **Objetivo:** Crear métodos reutilizables que reciban parámetros y devuelvan resultados.
- **Conceptos:** Métodos, parámetros, argumentos, valores de retorno y uso de `return`.
- **Actividad progresiva:** Crear métodos para convertir kilómetros a millas y grados Celsius a Fahrenheit. Utilizar un ciclo `for` para realizar varias conversiones.
- **Video en YouTube (no listado):** [Ver lección 5](https://youtu.be/MwVbLCr2oJo?si=9uOs7M4Exig4VAlF).
- **Práctica en editor Java en línea (precargada):** [Practica 5](https://onlinegdb.com/0VVlnQ5hQn).
- **Resultado esperado:** El usuario puede ejecutar métodos que reciben valores, realizan conversiones y devuelven resultados.
- **Pausa de práctica:** detener el video, completar la actividad y ejecutar el código en el navegador.

### Lección 6. Saludo personalizado (6 minutos)

- **Objetivo:** Recibir datos ingresados por el usuario y utilizarlos para generar respuestas personalizadas.
- **Conceptos:** `Scanner`, `nextLine()`, `nextInt()`, métodos, parámetros y estructuras condicionales `if`, `else if` y `else`.
- **Actividad progresiva:** Solicitar el nombre y año de nacimiento del usuario mediante `Scanner`, calcular su edad aproximada y mostrar un saludo personalizado según su grupo de edad.
- **Video en YouTube (no listado):** [Ver lección 6](https://youtu.be/mw--4A3Pfp4?si=QjdL56Xb8icSgwdt).
- **Práctica en editor Java en línea (precargada):** [Practica 6](https://onlinegdb.com/4EqOPuTe8).
- **Resultado esperado:** El usuario puede ingresar información por teclado y obtener una respuesta personalizada mediante métodos y condicionales.
- **Pausa de práctica:** detener el video, completar la actividad y ejecutar el código en el navegador.

### Lección 7. POO: clase, objeto y constructor (8 minutos)

- **Objetivo:** Comprender clases, objetos y la creación de instancias.
- **Conceptos:** `class`, atributos, constructor, `new`, métodos de instancia.
- **Actividad progresiva:** Trasladar los atributos y comportamientos ya practicados a una clase `Mascota` y crear un objeto mediante su constructor.
- **Video en YouTube (no listado):** `[PEGAR URL REAL DEL VIDEO 7]`.
- **Práctica en editor Java en línea (precargada):** `[PEGAR URL REAL DE LA PRÁCTICA 7]`.
- **Resultado esperado:** La aplicación crea al menos una mascota con su propio estado.
- **Pausa de práctica:** detener el video, completar la actividad y ejecutar el código en el navegador.

### Lección 8. Encapsulación y uso de getters/setters (7 minutos)

- **Objetivo:** Proteger atributos y exponer operaciones controladas.
- **Conceptos:** `private`, `public`, getters, setters, validación, instanciación.
- **Actividad progresiva:** Declarar atributos privados en `Mascota`, crear getters/setters con validación y actualizar su energía.
- **Video en YouTube (no listado):** `[PEGAR URL REAL DEL VIDEO 8]`.
- **Práctica en editor Java en línea (precargada):** `[PEGAR URL REAL DE LA PRÁCTICA 8]`.
- **Resultado esperado:** El estado no se modifica directamente desde otra clase.
- **Pausa de práctica:** detener el video, completar la actividad y ejecutar el código en el navegador.

### Lección 9. Proyecto completo, errores comunes y próximos pasos (6 minutos)

- **Objetivo:** Integrar lo aprendido y corregir errores habituales.
- **Conceptos:** Integración de clases, arreglos, métodos, condicionales, bucles y consola.
- **Actividad progresiva:** Completar una mascota virtual con menú de opciones, acciones y consulta de estado; revisar errores de sintaxis y lógica.
- **Video en YouTube (no listado):** `[PEGAR URL REAL DEL VIDEO 9]`.
- **Práctica en editor Java en línea (precargada):** `[PEGAR URL REAL DE LA PRÁCTICA 9]`.
- **Resultado esperado:** El estudiante puede ejecutar e interactuar con un programa completo desde el navegador.
- **Pausa de práctica:** detener el video, completar la actividad y ejecutar el código en el navegador.

## Proyecto final integrador

**Nombre provisional:** Mascota virtual en Java.

Al terminar, el estudiante ejecutará un programa de consola con una clase `Mascota`, atributos encapsulados como `nombre`, `energia` y `hambre`, un constructor y métodos para jugar, alimentar y mostrar el estado. La interacción usará `Scanner`; `if/else` controlará decisiones; `while` mantendrá un menú; y un arreglo contendrá actividades disponibles. Se incluyen validaciones sencillas y mensajes claros.

La experiencia se desarrolla **desde la primera lección**, por lo que el video final integra lo que ya se construyó y no introduce de golpe un proyecto nuevo.

## Recursos adicionales

| Lección | Material | Editor en línea |
|---|---|---|
| 1 | `starter-files/leccion-01-tarjeta-de-presentacion/` y `completed-examples/leccion-01-tarjeta-de-presentacion/` | [OnlineGDB](https://onlinegdb.com/jRxEJQi09j) |
| 2 | `starter-files/leccion-02-perfil-de-red-social/` y `completed-examples/leccion-02-perfil-de-red-social/` | [OnlineGDB](https://onlinegdb.com/gC5jYal3P) |
| 3 | `starter-files/` y `completed-examples/` (pendientes de incorporar) | `[PENDIENTE: ENLACE PRECARGADO 3]` |
| 4 | `starter-files/` y `completed-examples/` (pendientes de incorporar) | `[PENDIENTE: ENLACE PRECARGADO 4]` |
| 5 | `starter-files/leccion-05-conversor-de-unidades/` y `completed-examples/leccion-05-conversor-de-unidades/` | Pendiente de configurar |
| 6 | `starter-files/leccion-06-saludo-personalizado/` y `completed-examples/leccion-06-saludo-personalizado/` | Pendiente de configurar |
| 7 | `starter-files/` y `completed-examples/` (pendientes de incorporar) | `[PENDIENTE: ENLACE PRECARGADO 7]` |
| 8 | `starter-files/` y `completed-examples/` (pendientes de incorporar) | `[PENDIENTE: ENLACE PRECARGADO 8]` |
| 9 | `starter-files/` y `completed-examples/` (pendientes de incorporar) | `[PENDIENTE: ENLACE PRECARGADO 9]` |

- **Repositorio público:** `[PENDIENTE: URL REAL]`.
- **Guiones de las lecciones:** carpeta `scripts/`.
- **Consejos para principiantes:** usar nombres descriptivos, comprobar el punto y coma y las llaves, leer errores de consola, probar cambios pequeños y no copiar código sin entenderlo.

## Elaboración y trabajo colaborativo

- **Universidad:** Universidad Peruana de Ciencias Aplicadas (UPC).
- **Carrera:** Ingeniería de Software.
- **Curso:** 1ASI0729 Desarrollo de Aplicaciones Open Source.
- **Ciclo:** 202620.
- **NRC:** `7760`.
- **Nombre del equipo / startup:** `[REEMPLAZAR POR NOMBRE OFICIAL]`.
- **Líder del equipo:** `[REEMPLAZAR POR NOMBRE COMPLETO]`.
- **Integrantes:** `[AGREGAR NOMBRES COMPLETOS Y USUARIOS GITHUB]`.
- **Fecha de entrega:** `[REEMPLAZAR]`.

### Herramientas y documentación complementaria

- **Repositorio del curso:** [Java Fundamentals Course - Enigma Devs](https://github.com/Enigma-Devs/java-fundamentals-course-enigma-devs).
- **Editor de Java en línea:** [OnlineGDB](https://www.onlinegdb.com/online_java_compiler).
- **Documentación oficial de Java:** [Oracle Java Documentation](https://docs.oracle.com/en/java/).
- **Documentación de la clase Scanner:** [Java Scanner API](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Scanner.html).
- **Práctica adicional:** Se recomienda ejecutar los ejemplos, modificar sus valores y desarrollar las actividades propuestas en cada lección.

### Resumen de contribuciones

| Participante | Responsabilidades y lecciones | Evidencia de aportes |
|---|---|---|
| `[Integrante 1]` | `[Guion / código / video]` | `[Enlace a commits o Pull Request]` |
| `[Integrante 2]` | `[Guion / código / video]` | `[Enlace a commits o Pull Request]` |
| `[Integrante 3]` | `[Guion / código / video]` | `[Enlace a commits o Pull Request]` |

La evidencia principal de la colaboración se conserva en el historial del repositorio GitHub. Los nombres del equipo figuran aquí por solicitud de la documentación académica, **no en los videos ni en los ejemplos de código destinados al estudiante**.

## Verificación previa a la entrega

- [ ] Repositorio público perteneciente a una organización GitHub.
- [ ] Colaboradores agregados con permisos de escritura y commits identificables.
- [ ] Código fuente Java y carpetas `starter-files/`, `completed-examples/` y `scripts/` completos.
- [ ] Nueve lecciones (aproximadamente 60 minutos en total) con avance progresivo.
- [ ] Todos los videos configurados como **no listados**.
- [ ] Enlaces de YouTube y de editores web comprobados (sin marcadores pendientes).
- [ ] Código mostrado únicamente mediante herramientas web gratuitas.
- [ ] Sin branding ni referencias de autores en videos o código fuente.
- [ ] Plan de curso exportado a PDF con la nomenclatura correspondiente.
- [ ] Reporte de participación elaborado en Word y exportado a PDF (archivo distinto de los dos Markdown del repositorio).
