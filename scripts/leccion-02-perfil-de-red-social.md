# Lección 2: Perfil de red social (~4 min 05 s)

Objetivo: guardar datos en variables de cuatro tipos (`String`, `int`, `double`, `boolean`) y mostrarlos con `println`. Retoma el `System.out.println` de la lección 1.

- **Código de práctica:** [`starter-files/leccion-02-perfil-de-red-social`](../starter-files/leccion-02-perfil-de-red-social/Main.java)
- **Ejemplo completo:** [`completed-examples/leccion-02-perfil-de-red-social`](../completed-examples/leccion-02-perfil-de-red-social/Main.java)

Cada bloque tiene tres partes: **Pantalla** (qué se graba), **Narración** (voz en off) y **Edición** (lo que se agrega después).

### 0:00–0:04 · Carátula

- **Edición:** «Lección 2», título «Variables» y subtítulo «Crea el perfil de una red social en Java».

### 0:04–0:25 · Gancho (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "Mira este perfil: tiene un nombre de usuario, una cantidad de seguidores, un promedio de likes y un check azul. Cada uno de esos datos es diferente: uno es texto, otro, un número entero, otro, un número con decimales, y otro es sí o no. Hoy vamos a construir este perfil en Java usando variables."
- **Edición:** tarjeta de perfil (@ana, 1250 seguidores, 87.5 de promedio, check azul); cada dato se resalta al nombrarlo y aparece como ficha con su tipo; al final, la tarjeta de código con las 4 declaraciones.

### 0:25–0:46 · ¿Qué es una variable? (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "¿Recuerdas el problema del video anterior? Si cambiaba mi edad, tenía que buscarla dentro del texto. Una variable lo soluciona. Es una caja con un nombre donde guardas un dato. La caja tiene tres cosas: el tipo, que dice qué cabe dentro; el nombre, para poder encontrarla; y el valor, que viene siendo lo que guardas."
- **Edición:** código de la lección 1 con la edad escondida en el texto y una lupa; después la caja int/edad/20 con las etiquetas Tipo, Nombre y Valor, y la línea `int edad = 20;` en colores.

### 0:46–1:02 · String: el nombre de usuario

- **Pantalla:** en OnlineGDB escribir `String usuario = "Ana";`.
- **Narración:** "Empezamos con el nombre de usuario. Es texto, así que usamos el tipo String, con S mayúscula. Igual que en la lección 1, el texto va entre comillas. Le ponemos el nombre: usuario, el signo igual para guardar el valor en la caja y terminamos con punto y coma."
- **Edición:** recuadros sobre la S, el nombre, el =, las comillas y el ;. Caja String/usuario/"Ana" que se arma al mismo tiempo.

### 1:02–1:26 · int: los seguidores

- **Pantalla:** escribir `int seguidores = 1250;`.
- **Narración:** "Los seguidores se cuentan de uno en uno: nadie tiene medio seguidor. Para números enteros usamos int, de integer: «entero» en inglés. ¡Ojo! Los números van sin comillas. Si les pones comillas, Java los trata como texto y ya no puedes hacer cuentas con ellos. Así que ponemos int seguidores igual a 1250."
- **Edición:** personas que se cuentan y un «½» tachado; tarjeta «integer = entero»; comparación 1250 ✓ / "1250" ✗ con `1250 + 1 = 1251` y `"1250" + 1 = "12501"`.

### 1:26–2:03 · double: el promedio de likes

- **Pantalla:** escribir `double promedioLikes = 87.5;`.
- **Narración:** "El promedio de likes sí puede tener decimales. Por ejemplo: 87.5. Para eso usamos double. Muy importante: en Java el decimal se escribe con punto, no con coma. 87.5, 87,5. Fíjate también en el nombre: promedioLikes. Junta dos palabras y la segunda empieza con mayúscula. Esto se llama camelCase, porque parece las jorobas de un camello, y es la forma recomendada de nombrar variables en Java."
- **Edición:** corazón con 87.5; «¡Muy importante!» con 87.5 ✓ punto / 87,5 ✗ coma; recuadro en la L de `promedioLikes` y joroba de camello dibujada.

### 2:03–3:06 · Mostramos el perfil

- **Pantalla:** escribir `boolean verificada = true;` y los cuatro `println` uniendo texto y variables con `+` (tramo de tecleo acelerado a 2x). Run.
- **Narración:** "Ahora mostramos el perfil. Dentro del println unimos el texto fijo con la variable usando el signo +. El texto va entre comillas; la variable, sin comillas, para que Java use lo que hay dentro de la caja. Ahora le damos a Run y ahí está el perfil. Aquí viene la magia: si ganas seguidores, solo cambias el valor de la variable de arriba, y todo el perfil se actualiza solo."
- **Edición:** fórmula «"Usuario: " + usuario» con etiquetas texto fijo / variable; insignia «2x» durante el tecleo; etiqueta «boolean = sí o no (true / false)»; recuadro en la salida. Cierre animado: 1250 cambia a 2000 y el perfil se actualiza solo.

### 3:06–3:29 · Errores comunes

- **Pantalla:** `string` con minúscula y `"seguidores"` entre comillas en el println, con su resultado en la consola.
- **Narración:** "Dos errores típicos. Uno: escribir string con minúscula: Java no lo reconoce. Dos: poner la variable entre comillas en el println. Mira cuando corremos el programa: en vez de 1250, que es el valor de la variable, sale la palabra «seguidores», porque Java creyó que era texto."
- **Edición:** tarjetas rojas numeradas, recuadros en el código y en la línea de la consola; comparación «+ seguidores → 1250 ✓» / «+ "seguidores" → seguidores ✗».

### 3:29–3:42 · ¡Tu turno! (pausa)

- **Narración:** "Ahora pausa el video y crea el perfil de tu personaje, youtuber o futbolista favorito. Como reto extra, agrega una variable int con la cantidad de publicaciones y muéstrala."
- **Edición:** «¡Tu turno!», ícono de pausa, ideas (tu personaje, youtuber, futbolista) y tarjeta amarilla del reto con `int publicaciones = 34;`.

### 3:42–4:05 · Cierre

- **Narración:** "¡Excelente! Hoy aprendiste a guardar datos en variables y conociste 4 tipos: String, para texto; int, para enteros; double, para decimales, y boolean, para verdadero o falso. En la siguiente lección vamos a hacer que el programa tome decisiones por su cuenta. Por ejemplo: mostrar un mensaje especial solo si la cuenta está verificada."
- **Edición:** cuatro tarjetas de tipos con un ejemplo cada una; tarjeta final «Siguiente: el programa toma decisiones» con un adelanto de `if (verificada)`.
