# Lección 6: Saludo personalizado

- **Código de práctica:** [`starter-files/leccion-06-saludo-personalizado`](../starter-files/leccion-06-saludo-personalizado/Main.java)
- **Ejemplo completo:** [`completed-examples/leccion-06-saludo-personalizado`](../completed-examples/leccion-06-saludo-personalizado/Main.java)

Cada bloque tiene tres partes: **Pantalla** (qué se graba), **Narración** (voz en off) y **Edición** (lo que se agrega después).

Saludo personalizado (\~6 min 10 s)

Objetivo: leer datos del usuario con `Scanner` (`nextLine` y `nextInt`), calcular la edad con el método `calcularEdad(anio)` y cambiar el mensaje con `if`, `else if` y `else`. Retoma los métodos (lección 5) y el `if-else` (lección 4).

### 0:00–0:04 · Carátula

- **Edición:** «Lección 6», título «Leer datos con Scanner» y subtítulo «Un saludo hecho para cada persona».

### 0:04–0:35 · Gancho (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "Cuando abres una app por primera vez, te pregunta tu nombre y tu fecha de nacimiento, y desde ahí te habla a ti. Hasta ahora, nuestros programas no preguntaban nada: los datos los escribíamos nosotros en el código. Hoy tu programa va a preguntar, va a escuchar la respuesta y va a saludar distinto a cada persona."
- **Edición:** pantalla de registro de una app con los campos «Nombre» y «Año de nacimiento» que se llenan solos; luego tres saludos distintos para tres personas.

### 0:35–1:20 · ¿Qué es Scanner? (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "En la lección 1 vimos que un programa recibe datos, los procesa y muestra un resultado. Hasta ahora solo mostrábamos. Para recibir datos del teclado, Java tiene una herramienta llamada Scanner, que significa «escáner»: lee lo que la persona escribe. Tiene dos métodos que vamos a usar: nextLine, que lee una línea de texto, y nextInt, que lee un número entero."
- **Edición:** ENTRADA → PROCESO → SALIDA de la lección 1 con la ENTRADA resaltada; un teclado conectado a una lupa «Scanner». Dos fichas: `nextLine()` = texto, `nextInt()` = número entero.

### 1:20–2:10 · Preparamos el Scanner

- **Pantalla:** escribir `import java.util.Scanner;` arriba de todo y, en `main`, `Scanner sc = new Scanner(System.in);`.
- **Narración:** "Scanner no viene listo; hay que traerlo. Arriba de todo, antes de la clase, escribimos import java.util.Scanner. Es como sacar una herramienta de la caja. Después, dentro de main, creamos nuestro escáner: Scanner, el nombre sc, igual a new Scanner de System.in. System.in es el teclado. Fíjate que se parece a declarar una variable de la lección 2: tipo, nombre, igual y valor."
- **Edición:** caja de herramientas de la que sale «Scanner» al escribir el `import`; la línea `Scanner sc = new Scanner(System.in);` con tipo, nombre y valor en colores, como `tipo nombre = valor;` de la lección 2. Etiqueta «System.in = teclado».

### 2:10–3:00 · Preguntamos el nombre y el año

- **Pantalla:** escribir `System.out.print("Como te llamas? ");`, `String nombre = sc.nextLine();`, `System.out.print("En que anio naciste? ");` y `int anio = sc.nextInt();`. Run y escribir las respuestas en la consola.
- **Narración:** "Primero preguntamos. Usamos print, sin el ln, para que la respuesta se escriba en la misma línea que la pregunta. Luego guardamos la respuesta: String nombre igual a sc punto nextLine. Hacemos lo mismo con el año, pero como es un número, usamos int y nextInt. Run… el programa se detiene y espera. Escribo un nombre, Enter. Escribo el año, Enter. Ahora esos datos están guardados en variables, y no los escribí en el código."
- **Edición:** cursor parpadeando en la consola con la etiqueta «el programa espera»; flecha de cada respuesta a su caja `nombre` y `anio`. Recuadro sobre `print` vs `println`.

### 3:00–3:45 · El método calcularEdad

- **Pantalla:** fuera de `main`, escribir `public static int calcularEdad(int anio) { return 2026 - anio; }`. En `main`, `int edad = calcularEdad(anio);` y un `println` con el saludo. Run.
- **Narración:** "Ahora calculamos la edad con un método, como en la lección 5. Se llama calcularEdad, recibe el año de nacimiento y devuelve un int: 2026 menos el año. En main lo llamamos y guardamos el resultado en edad. Y saludamos uniendo texto y variables con el más: Hola, nombre, tienes tantos años. Run… La edad puede variar en uno si todavía no cumpliste años este año, pero para nuestro saludo funciona perfecto."
- **Edición:** la máquina del método de la lección 5: entra el año, sale la edad. Recuadros sobre la llamada y sobre el `return`.

### 3:45–4:40 · Un mensaje según la edad

- **Pantalla:** escribir `if (edad < 13) { ... } else if (edad < 18) { ... } else { ... }` con tres mensajes. Run tres veces con años distintos.
- **Narración:** "Y ahora la decisión, como en la lección 4, pero con tres caminos. Si la edad es menor que 13, un mensaje. Else if, que significa «y si no, si…», revisa una segunda pregunta: si es menor que 18, otro mensaje. Y else, para todos los demás. Java revisa las preguntas en orden y entra solo en la primera que da true. Run con tres años distintos… tres saludos distintos."
- **Edición:** camino que se divide en tres con las condiciones en cada cruce; la flecha verde marca el camino que se tomó en cada ejecución.

### 4:40–5:10 · Errores comunes

- **Pantalla:** borrar el `import` y mostrar el error; luego escribir una palabra cuando el programa pide el año y mostrar el error.
- **Narración:** "Dos errores típicos. Uno: olvidar el import. Java no sabe qué es Scanner y marca error. Dos: escribir letras cuando el programa espera un número con nextInt; el programa se detiene con un error. Por eso la pregunta tiene que decir claramente qué dato esperas."
- **Edición:** mensajes de error en rojo con su corrección en verde. Lista: «import arriba · nextLine texto, nextInt números · preguntas claras».

### 5:10–5:35 · ¡Tu turno! (pausa)

- **Narración:** "Pausa el video y haz que tu programa te pregunte tu nombre y tu año de nacimiento y te salude. Reto extra: pregunta también tu comida favorita y menciónala en el saludo. Cuando termines, dale play."
- **Edición:** «¡Tu turno!», ícono de pausa y tarjeta amarilla del reto.

### 5:35–6:10 · Cierre

- **Narración:** "¡Muy bien! Hoy tu programa aprendió a escuchar: lee texto con nextLine, números con nextInt, calcula con un método y decide con if, else if y else. Ahora piensa en tu celular: tiene marca, modelo y batería, y además hace cosas. En la siguiente lección vas a juntar datos y acciones en una sola pieza: un objeto. Vas a convertir tu celular en un objeto de Java."
- **Edición:** resumen con tres íconos (teclado, máquina, cruce de caminos); tarjeta final «Siguiente: clases y objetos, mi celular».

