# Lección 5: Conversor de unidades

- **Código de práctica:** [`starter-files/leccion-05-conversor-de-unidades`](../starter-files/leccion-05-conversor-de-unidades/Main.java)
- **Ejemplo completo:** [`completed-examples/leccion-05-conversor-de-unidades`](../completed-examples/leccion-05-conversor-de-unidades/Main.java)

Cada bloque tiene tres partes: **Pantalla** (qué se graba), **Narración** (voz en off) y **Edición** (lo que se agrega después).

Conversor de unidades (\~6 min 10 s)

Objetivo: escribir métodos que reciben parámetros y devuelven un resultado con `return`, y llamarlos desde `main` y desde un `for`. Retoma `double` y los operadores (lecciones 2 y 3) y el `for` (lección 4).

### 0:00–0:04 · Carátula

- **Edición:** «Lección 5», título «Métodos» y subtítulo «Construye un conversor de unidades».

### 0:04–0:35 · Gancho (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "Al final de la lección anterior vimos un problema: si necesitas el mismo cálculo en muchas partes, copiarlo una y otra vez es un desastre. Imagina una app de viajes: convierte kilómetros a millas y grados Celsius a Fahrenheit cientos de veces. Nadie escribe la fórmula cientos de veces. La escribe una sola vez, le pone un nombre y la llama cuando la necesita. Eso es un método."
- **Edición:** cartel de carretera «5 km» que cambia a «3.1 mi» y termómetro «30 °C» que cambia a «86 °F». Una fórmula copiada diez veces con una cruz roja, y una sola tarjeta con nombre y check verde.

### 0:35–1:20 ¿Qué es un método? (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "Un método es como una máquina. Le das un dato, hace un proceso y te devuelve un resultado. ¿Te suena? Es la entrada, proceso y salida de la lección 1. El dato que entra se llama parámetro, y lo que sale se devuelve con la palabra return. (pausa) Y ya usaste métodos sin saberlo: println es un método que recibe un texto y lo muestra, y main es el método donde empieza todo programa."
- **Edición:** máquina con embudo de entrada «parámetro», engranajes «proceso» y salida «return»; debajo, ENTRADA → PROCESO → SALIDA de la lección 1. Recuadros sobre `println` y `main` en un código de ejemplo.

### 1:20–2:30 · Escribimos kmAMillas

- **Pantalla:** dentro de la clase `Main` pero fuera de `main`, escribir `public static double kmAMillas(double km) { return km * 0.621371; }`.
- **Narración:** "Escribimos el método dentro de la clase, pero fuera de main, debajo de su llave de cierre. Empieza con public static; por ahora siempre lo escribimos así, igual que main. Después va el tipo de lo que devuelve: un número con decimales, así que double. Luego el nombre, en camelCase como en la lección 2: kmAMillas. Entre paréntesis, el parámetro: un double llamado km. Y entre llaves, el proceso: return km por 0.621371, que es cuántas millas tiene un kilómetro."
- **Edición:** cada parte de la primera línea con su color y etiqueta: tipo que devuelve, nombre, parámetro. Recuadro sobre `return` con la etiqueta «devuelve el resultado».

### 2:30–3:10 · Llamamos al método

- **Pantalla:** en `main`, escribir `System.out.println("5 km = " + kmAMillas(5) + " millas");`. Run. Agregar otra línea con `kmAMillas(42)`. Run.
- **Narración:** "Para usarlo, escribimos su nombre y, entre paréntesis, el dato: kmAMillas de 5. Run… 5 kilómetros son 3.1 millas. Ahora la ventaja: ¿y una maratón de 42 kilómetros? No volvemos a escribir la fórmula. Solo llamamos al método con 42. Run."
- **Edición:** el 5 viaja desde la llamada hasta el parámetro `km` y el resultado vuelve por una flecha hasta la consola.

### 3:10–3:50 · Un segundo método: celsiusAFahrenheit

- **Pantalla:** escribir `public static double celsiusAFahrenheit(double c) { return c * 9 / 5 + 32; }` y llamarlo con 30. Run.
- **Narración:** "Hagamos el segundo: celsiusAFahrenheit. Recibe los grados Celsius en c y devuelve c por 9, entre 5, más 32. Java hace primero la multiplicación y la división, y después la suma, como viste con los paréntesis en la lección 3. Lo llamamos con 30. Run… 86 grados Fahrenheit."
- **Edición:** termómetro animado; la fórmula se resuelve paso a paso: 30 × 9 = 270, 270 / 5 = 54, 54 + 32 = 86.

### 3:50–4:40 · Una tabla con for

- **Pantalla:** escribir `for (int i = 1; i <= 10; i++) { System.out.println(i + " km = " + kmAMillas(i) + " millas"); }`. Run.
- **Narración:** "Y ahora juntamos esto con la lección 4. Con un for, i va de 1 a 10, y en cada vuelta llamamos a kmAMillas con i. Run… Una tabla completa de conversión. El método se ejecutó diez veces, y la fórmula está escrita una sola vez. Si alguna fila muestra muchos decimales, no es un error: es la forma en que la computadora guarda algunos números con decimales."
- **Edición:** contador `i` visible de 1 a 10 y cada fila de la consola iluminándose; etiqueta «1 fórmula, 10 llamadas».

### 4:40–5:15 · Errores comunes

- **Pantalla:** quitar el `return` y mostrar el error; luego llamar `kmAMillas("5")` con comillas y mostrar el error.
- **Narración:** "Tres errores típicos. Uno: olvidar el return; Java te dice que falta lo que el método debe devolver. Dos: pasar un dato del tipo equivocado, como un texto entre comillas donde va un número. Tres: escribir el método dentro de main; va fuera de main, pero dentro de la clase."
- **Edición:** mensajes de error en rojo con su corrección en verde. Lista: «return · tipo correcto · fuera de main».

### 5:15–5:40 · ¡Tu turno! (pausa)

- **Narración:** "Pausa el video y crea tu propio método: por ejemplo, kgALibras, que multiplica por 2.2. Llámalo con tu peso favorito de mochila. Reto extra: haz una tabla de temperaturas de 0 a 40 grados, de 10 en 10. Cuando termines, dale play."
- **Edición:** «¡Tu turno!», ícono de pausa y tarjeta amarilla del reto con `i = i + 10` como pista.

### 5:40–6:10 · Cierre

- **Narración:** "¡Excelente! Hoy aprendiste a crear métodos que reciben datos y devuelven un resultado, y a reutilizarlos las veces que quieras. Pero hay algo raro: los datos siempre los escribimos nosotros en el código. En la siguiente lección tu programa le va a preguntar datos a la persona que lo usa, y la va a saludar según su edad."
- **Edición:** la máquina del método como resumen; tarjeta final «Siguiente: Scanner, saludo personalizado» con un teclado.

