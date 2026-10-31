# Lección 4: Batería del celular (~5 min 50 s)

Objetivo: comparar valores, decidir con `if-else` y repetir acciones con `while` y `for`. Cumple la promesa de la lección 2 («el programa toma decisiones») y usa la reasignación de la lección 3.

- **Código de práctica:** [`starter-files/leccion-04-bateria-del-celular`](../starter-files/leccion-04-bateria-del-celular/Main.java)
- **Ejemplo completo:** [`completed-examples/leccion-04-bateria-del-celular`](../completed-examples/leccion-04-bateria-del-celular/Main.java)

Cada bloque tiene tres partes: **Pantalla** (qué se graba), **Narración** (voz en off) y **Edición** (lo que se agrega después).

### 0:00–0:04 · Carátula

- **Edición:** «Lección 4», título «Decisiones y ciclos» y subtítulo «Simula la batería de tu celular».

### 0:04–0:35 · Gancho (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "Tu celular toma decisiones todo el tiempo. Si la batería baja de 20 por ciento, te avisa. Cuando lo conectas, va cargando poco a poco, una y otra vez, hasta llegar al 100. Y si te llegan tres mensajes, te muestra tres notificaciones. Hoy vas a programar las tres cosas: decidir, repetir hasta que se cumpla algo, y repetir un número exacto de veces."
- **Edición:** celular con batería roja y aviso «Batería baja»; luego cable y barra que sube de 10 en 10; luego tres notificaciones que caen. Tres etiquetas: `if`, `while`, `for`.

### 0:35–1:15 · Comparar valores (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "Para decidir, el programa primero compara. Java tiene seis comparaciones: menor que, mayor que, menor o igual, mayor o igual, igual, que se escribe con dos signos igual, y distinto, que se escribe con un signo de exclamación y un igual. Cada comparación responde sí o no. ¿Te acuerdas del tipo boolean de la lección 2? Eso es lo que devuelve: true o false. Por ejemplo, ¿10 es menor que 20? true."
- **Edición:** seis fichas `<` `>` `<=` `>=` `==` `!=` con su significado; la pregunta «10 < 20» se convierte en un interruptor que pasa a `true`. Etiqueta «== compara, = guarda».

### 1:15–2:15 · if-else: ¿batería baja?

- **Pantalla:** escribir `int bateria = 10;` y el `if (bateria < 20) { ... } else { ... }` con dos `println`. Run. Cambiar a 50 y Run otra vez.
- **Narración:** "Creamos la variable bateria con 10. Ahora escribimos if, que significa «si», y entre paréntesis la pregunta: ¿bateria es menor que 20? Entre llaves va lo que pasa si la respuesta es true: avisamos «Batería baja». Después viene else, «si no», con lo que pasa si es false. Run… Batería baja. Ahora cambio la batería a 50. Run… Ahora dice que está bien. El mismo código dio otra respuesta, porque el programa decidió."
- **Edición:** un camino que se divide en dos: la condición en el cruce, flecha verde al bloque `if` y flecha gris al `else`. Recuadros sobre la condición y sobre las llaves.

### 2:15–3:15 · while: cargar hasta 100

- **Pantalla:** volver a `bateria = 10` y escribir `while (bateria < 100) { bateria = bateria + 10; println(...); }`. Run.
- **Narración:** "Ahora conectamos el cargador. While significa «mientras»: mientras la batería sea menor que 100, repite lo que está entre llaves. Adentro sumamos 10, igual que con los ahorros en la lección 3, y mostramos el porcentaje. Run… 20, 30, 40… hasta 100. ¿Por qué paró? Porque cuando llegó a 100, la pregunta ¿100 es menor que 100? dio false, y el ciclo terminó."
- **Edición:** diagrama circular: pregunta → sumar 10 → volver a preguntar, con la salida cuando da false. La barra de batería sube junto con cada línea de la consola.

### 3:15–4:15 · for: tres notificaciones

- **Pantalla:** escribir `for (int i = 1; i <= 3; i++) { println("Notificacion " + i + ...); }`. Run.
- **Narración:** "Cuando sabes exactamente cuántas veces repetir, usas for. Tiene tres partes separadas por punto y coma. Uno: dónde empieza el contador, i igual a 1. Dos: hasta cuándo repetir, mientras i sea menor o igual a 3. Tres: cómo avanza, i más más, que es una forma corta de escribir i igual a i más 1. Run… Notificación 1, 2 y 3. (pausa) Entonces: while, cuando no sabes cuántas vueltas habrá; for, cuando ya lo sabes."
- **Edición:** las tres partes del `for` en tres colores con las etiquetas inicio, condición y paso; contador `i` visible (1, 2, 3) y la notificación correspondiente iluminada. Tarjetas «while = no sé cuántas veces» y «for = sé cuántas veces».

### 4:15–4:50 · Errores comunes

- **Pantalla:** escribir `if (bateria = 20)` y mostrar el error; luego borrar la línea `bateria = bateria + 10;` del while, Run y detenerlo con **Stop**.
- **Narración:** "Dos errores típicos. Uno: comparar con un solo igual. Un igual guarda, dos iguales comparan, y Java te marca error. Dos: olvidar actualizar la variable dentro del while. Si la batería nunca sube, la pregunta siempre es true y el ciclo no termina nunca. Se llama ciclo infinito. Si te pasa, presiona Stop."
- **Edición:** recuadro rojo sobre el `=` y versión verde con `==`; consola que se llena sin parar y onda sobre Stop. Lista: «== para comparar · actualizar en el while · llaves cerradas».

### 4:50–5:15 · ¡Tu turno! (pausa)

- **Narración:** "Pausa el video y simula tu celular: empieza con otra batería, avisa si está baja, cárgalo de 5 en 5 y muestra 5 notificaciones. Reto extra: cuando llegue a 100, muestra «Carga completa». Cuando termines, dale play."
- **Edición:** «¡Tu turno!», ícono de pausa, checklist de los tres pasos y tarjeta amarilla del reto.

### 5:15–5:50 · Cierre

- **Narración:** "¡Muy bien! Hoy aprendiste a comparar, a decidir con if y else, a repetir con while mientras algo se cumpla, y a repetir un número exacto de veces con for. Ahora piensa: si quisieras avisar «batería baja» en diez partes del programa, tendrías que copiar el mismo código diez veces. En la siguiente lección vas a aprender a escribirlo una sola vez y reutilizarlo, con los métodos, construyendo un conversor de unidades."
- **Edición:** tres tarjetas `if`, `while`, `for` con su ícono; tarjeta final «Siguiente: métodos, conversor de unidades».