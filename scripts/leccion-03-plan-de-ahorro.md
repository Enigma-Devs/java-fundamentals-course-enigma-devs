# Lección 3: Plan de ahorro (~5 min 45 s)

Objetivo: hacer cálculos con variables usando `+`, `-`, `*`, `/` y `%`, y actualizar el valor de una variable. Retoma las variables `int` de la lección 2.

- **Código de práctica:** [`starter-files/leccion-03-plan-de-ahorro`](../starter-files/leccion-03-plan-de-ahorro/Main.java)
- **Ejemplo completo:** [`completed-examples/leccion-03-plan-de-ahorro`](../completed-examples/leccion-03-plan-de-ahorro/Main.java)

Cada bloque tiene tres partes: **Pantalla** (qué se graba), **Narración** (voz en off) y **Edición** (lo que se agrega después).

### 0:00–0:04 · Carátula

- **Edición:** «Lección 3», título «Operadores» y subtítulo «Arma tu plan de ahorro en Java».

### 0:04–0:35 · Gancho (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "En la lección anterior te dije que el programa iba a tomar decisiones. Pero para decidir bien, primero tiene que saber hacer cuentas. Imagina que quieres comprarte unos audífonos de 180 soles, y cada semana ahorras 25. ¿Cuántas semanas te faltan? ¿Y cuánto llevas después de dos semanas? Hoy vamos a hacer que Java haga esas cuentas por ti."
- **Edición:** tarjeta de producto de unos audífonos con «S/ 180» y una alcancía que recibe monedas de «S/ 25». Signo de pregunta sobre un calendario de semanas.

### 0:35–1:15 · Los operadores (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "Java hace cuentas como una calculadora. Para sumar usa el signo más, que ya conoces de la lección 2, y para restar, el signo menos. Para multiplicar no usa la equis, sino el asterisco. Para dividir usa la barra. Y tiene un operador nuevo, el porcentaje, que no calcula porcentajes: te da lo que sobra de una división. Lo vamos a ver en un momento."
- **Edición:** cinco teclas de calculadora que se encienden una por una: `+` sumar, `-` restar, `*` multiplicar, `/` dividir, `%` resto. Una «×» tachada junto al asterisco.

### 1:15–2:00 · Las variables del plan

- **Pantalla:** en OnlineGDB escribir `int precio = 180;` y `int ahorroSemanal = 25;`, y un `println` con `ahorroSemanal * 4`. Run.
- **Narración:** "Empezamos con dos variables, como en la lección 2. El precio es un número entero, así que usamos int: precio igual a 180. Y lo que ahorras cada semana: ahorroSemanal igual a 25. Ahora, ¿cuánto juntas en un mes, o sea, en cuatro semanas? Escribimos ahorroSemanal por 4, con el asterisco, dentro del println. Ponemos la cuenta entre paréntesis para que Java la haga primero. Run… 100 soles. Fíjate que no escribimos 100: Java lo calculó."
- **Edición:** cajas precio/180 y ahorroSemanal/25 como en la lección 2; recuadro sobre `ahorroSemanal * 4` y flecha hacia «100» en la consola.

### 2:00–2:50 · Dividir: ¿cuántas semanas?

- **Pantalla:** escribir `int semanas = precio / ahorroSemanal;` y su `println`. Run.
- **Narración:** "Ahora la pregunta importante: ¿cuántas semanas necesitas? Dividimos el precio entre lo que ahorras: precio, barra, ahorroSemanal. Run… dice 7. Pero espera: 180 entre 25 es 7.2. ¿Dónde está el punto 2? Cuando divides dos números int, Java da solo la parte entera y descarta los decimales. Son 7 semanas completas. (pausa) Si quisieras los decimales, usarías double, como el promedio de likes de la lección 2."
- **Edición:** «180 / 25 = 7.2» y el «.2» sale volando con un sonido suave. Etiqueta «int / int = solo la parte entera».

### 2:50–3:40 · El resto con %

- **Pantalla:** escribir `int sobra = precio % ahorroSemanal;` y su `println`. Run.
- **Narración:** "Siete semanas por 25 son 175. Al precio todavía le faltan 5 soles. Ese 5 es el resto de la división, y Java lo calcula con el porcentaje. Imagina que repartes 17 caramelos entre 5 amigos: a cada uno le tocan 3 y sobran 2. Ese 2 es el resto. Aquí, precio porcentaje ahorroSemanal da 5. Run… Entonces, después de 7 semanas te faltan 5 soles, y necesitas una semana más: 8 en total."
- **Edición:** 17 caramelos que se reparten en 5 grupos de 3 y quedan 2 brillando; etiqueta «% = lo que sobra». Barra de progreso de 180 llena hasta 175 con el hueco de 5 resaltado.

### 3:40–4:20 · Actualizar una variable

- **Pantalla:** escribir `int ahorrado = 0;`, dos veces `ahorrado = ahorrado + ahorroSemanal;` y un `println` con `(precio - ahorrado)`. Run.
- **Narración:** "Ahora llevemos la cuenta semana a semana. Creamos ahorrado igual a cero. En la primera semana escribimos: ahorrado igual a ahorrado más ahorroSemanal. Parece raro, pero recuerda que el igual no significa «es igual», sino «guarda»: Java toma lo que había en la caja, le suma 25 y guarda el resultado en la misma caja. Lo repetimos para la segunda semana: ya llevas 50. Y lo que te falta es precio menos ahorrado: 130."
- **Edición:** la caja `ahorrado` pasa de 0 a 25 y de 25 a 50 con una moneda que cae en cada paso; etiqueta «= guarda, no compara».

### 4:20–4:50 · Errores comunes

- **Pantalla:** escribir `"Te faltan: " + precio - ahorrado` sin paréntesis y mostrar el error; luego corregirlo.
- **Narración:** "Dos errores típicos. Uno: olvidar los paréntesis cuando haces una cuenta dentro del println. Sin ellos, Java junta primero el texto con el precio y después no puede restar, así que marca error. Dos: esperar decimales al dividir dos int. Si necesitas el punto 2, usa double."
- **Edición:** línea del error en rojo y la versión con paréntesis en verde. Lista: «paréntesis en las cuentas · int / int sin decimales · * para multiplicar».

### 4:50–5:15 · ¡Tu turno! (pausa)

- **Narración:** "Pausa el video y arma tu propio plan: elige algo que quieras comprar, su precio y cuánto ahorrarías por semana. Calcula las semanas y lo que sobra. Reto extra: calcula cuántos meses son, si un mes tiene 4 semanas. Cuando termines, dale play."
- **Edición:** «¡Tu turno!», ícono de pausa, ideas (zapatillas, videojuego, entrada a un concierto) y tarjeta amarilla del reto.

### 5:15–5:45 · Cierre

- **Narración:** "¡Muy bien! Hoy aprendiste a sumar, restar, multiplicar y dividir con variables, a encontrar lo que sobra con el porcentaje y a actualizar una variable. Pero tu programa todavía no decide nada: no te avisa cuando ya juntaste suficiente. En la siguiente lección vas a hacer que el programa tome decisiones y repita acciones, con un simulador de la batería de tu celular."
- **Edición:** cinco teclas de operadores como resumen; tarjeta final «Siguiente: el programa toma decisiones» con un ícono de batería.