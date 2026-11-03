# Lección 1: Tarjeta de presentación (~6 min 15 s)

Objetivo: entender qué es un programa y qué es Java, y mostrar nombre, edad y pasatiempo con `System.out.println`. Es la primera lección del curso: no requiere conocimientos previos.

- **Código de práctica:** [`starter-files/leccion-01-tarjeta-de-presentacion`](../starter-files/leccion-01-tarjeta-de-presentacion/Main.java)
- **Ejemplo completo:** [`completed-examples/leccion-01-tarjeta-de-presentacion`](../completed-examples/leccion-01-tarjeta-de-presentacion/Main.java)

Cada bloque tiene tres partes: **Pantalla** (qué se graba), **Narración** (voz en off) y **Edición** (lo que se agrega después).

### 0:00–0:04 · Carátula

- **Edición:** «Lección 1», título «¿Qué es programar?» y subtítulo «Tu primera tarjeta de presentación en Java».

### 0:04–0:21 · Los programas están en todas partes (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "Esta mañana, seguramente te despertó una alarma. Después abriste una app y te aparecieron videos que te gustaron. Todo eso tiene algo en común: detrás de cada cosa hay un programa, y ese programa lo escribió una persona. Al terminar este curso, esa persona puede ser tú."
- **Edición:** despertador, celular con videos y escenas que se abren y muestran código por dentro.

### 0:21–0:59 · ¿Qué es un programa? (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "Un programa es una lista de instrucciones que una computadora sigue paso a paso. Veamos la alarma de tu celular. Sus instrucciones son algo así. Uno: revisa la hora. Dos: si son las 6:30, haz sonar la alarma. Tres: si la persona toca «posponer», espera 5 minutos y vuelve al paso dos. Nada más. Casi todos los programas hacen tres cosas: reciben datos, como la hora o el toque en la pantalla; los procesan, es decir, deciden o calculan algo; y muestran un resultado, como el sonido de la alarma. Es decir: entrada, proceso y salida."
- **Edición:** los tres pasos de la alarma como diagrama con una flecha que vuelve del paso 3 al 2; luego ENTRADA → PROCESO → SALIDA con el ejemplo debajo.

### 0:59–1:35 · ¿Por qué un lenguaje de programación? (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "Entonces, ¿por qué no le damos las instrucciones en español? Porque por dentro la computadora solo entiende dos cosas: ¿hay electricidad o no hay? Eso se escribe con unos y ceros, y se llama código binario. Escribir un programa solo con unos y ceros sería casi imposible para una persona. Por eso existen los lenguajes de programación, que están en el medio. Usan palabras que las personas sí podemos leer, casi siempre en inglés, pero con reglas muy estrictas. Y luego, un programa traductor, al que llamamos compilador, convierte lo que escribimos en unos y ceros para la computadora."
- **Edición:** persona con globo en español, computadora con lluvia de 0 y 1, y en medio el puente: código → compilador → 010110.

### 1:35–2:22 · ¿Qué es Java? (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "Hay cientos de lenguajes de programación, y en este curso vamos a usar uno de los más importantes: Java. Java nació en 1995, creado por un equipo de la empresa Sun Microsystems dirigido por James Gosling. Hoy lo mantiene la empresa Oracle. Y el nombre viene de un tipo de café. Por eso su logo es una taza humeante. Java tiene una idea genial: «escríbelo una vez, ejecútalo donde sea». Su compilador no traduce para una sola computadora, sino a un idioma intermedio. Ese idioma lo entiende la Máquina Virtual de Java, un programa que existe para Windows, Mac, Linux y muchos otros equipos. Así, el mismo programa funciona en todos ellos sin cambiar nada."
- **Edición:** línea de tiempo con 1995 y taza de café; un archivo pasa por el compilador y llega a Windows, Mac y Linux, cada uno con su Máquina Virtual.

### 2:22–2:58 · ¿Por qué aprender Java? (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "¿Por qué empezar con Java? Por tres razones. Uno: está en todas partes. Minecraft Java Edition está hecho en Java, muchísimas apps de Android se programaron en Java, y empresas como bancos o plataformas de streaming lo usan en sus servidores. Dos: es ordenado. Java tiene reglas claras y te avisa de muchos errores antes de ejecutar el programa, así que aprendes a programar bien desde el inicio. Tres: te abre puertas. Es uno de los lenguajes más pedidos en el trabajo, y cuando lo sepas, aprender otros lenguajes será muchísimo más fácil."
- **Edición:** tres tarjetas numeradas que entran una por una.

### 2:58–3:18 · Lo que vas a construir (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "En este curso vas a aprender paso a paso. Vas a crear tu tarjeta de presentación, el perfil de una red social, un plan de ahorro, un simulador de batería, una alcancía digital y, al final, tu propia playlist de canciones. Y todo desde el navegador, sin instalar nada. ¡Empecemos!"
- **Edición:** mapa del curso con 10 paradas; la 1 brilla.

### 3:18–3:55 · Abrimos el editor y lo ejecutamos

- **Pantalla:** OnlineGDB, elegir Java en *Language* y pulsar **Run** sin tocar nada.
- **Narración:** "Entra a OnlineGDB; el enlace está en la descripción. Es un editor de Java que funciona en el navegador. Arriba a la derecha, donde dice «Language», elige Java. Ya hay un programa escrito; no cambies nada todavía. Solo presiona el botón verde, Run, que significa «ejecutar». Abajo apareció «Hello World»: «hola mundo» en inglés. Esta zona se llama consola. Es la salida de nuestro programa, básicamente, donde la computadora nos responde. Y lo que acaba de pasar es justo lo que vimos: el compilador tradujo el código y la computadora lo ejecutó."
- **Edición:** recuadros sobre *Language* y Run, onda al hacer clic y etiqueta «consola = salida».

### 3:55–4:48 · La instrucción println

- **Pantalla:** zoom a `System.out.println("Hello World");`. Cambiar el texto por un nombre. Run.
- **Narración:** "¿Qué línea escribió ese mensaje? Fue esta: System.out.println. Print line significa «imprime una línea», o sea, muestra una línea de texto en la consola. Lo que está alrededor, es decir, estas llaves, son la estructura que todo programa de Java necesita; por ahora no la tocamos, y la entenderemos en las próximas lecciones. Esta instrucción tiene tres reglas. Uno: el texto que quieres mostrar va entre comillas dobles. Dos: las comillas van dentro de paréntesis. Y tres: la instrucción termina con punto y coma, así como una oración termina con un punto. Ahora cambia «Hello World» por tu nombre. En este caso vamos a poner «Ana». Ahora le das al botón Run y la computadora mostró exactamente lo que escribiste."
- **Edición:** la estructura se oscurece y queda iluminada la línea de println; números 1, 2 y 3 sobre comillas, paréntesis y punto y coma.

### 4:48–5:21 · Armamos la tarjeta

- **Pantalla:** escribir las líneas de nombre, edad y pasatiempo. Run.
- **Narración:** "Una tarjeta de presentación tiene más datos. Cada println muestra una línea, así que para cada dato escribimos una instrucción nueva: una para el nombre, otra para la edad y otra para el pasatiempo. Ahora utilizamos el botón Run. Y mira el orden: la computadora ejecuta las instrucciones de arriba hacia abajo, una por una, igual que la alarma. Eso es un programa."
- **Edición:** flechas que unen cada línea del código con su línea en la consola, en orden.

### 5:21–5:45 · Errores comunes

- **Pantalla:** el programa con un error, Run y el mensaje del compilador.
- **Narración:** "Si al ejecutar aparece un mensaje de error, no pasa nada. El compilador te dice en qué línea está el problema. Los errores más comunes al empezar son olvidar el punto y coma, no cerrar el paréntesis correctamente, o escribir println con mayúscula. Java distingue mayúsculas de minúsculas, por lo que no puedes hacer ese tipo de cosas."
- **Edición:** consola con los errores y la línea marcada; tres tarjetas rojas (; · ) · Println) y cierre «println ✓ / Println ✗».

### 5:45–5:58 · ¡Tu turno! (pausa)

- **Narración:** "Ahora te toca a ti. Pausa el video y escribe tu propia tarjeta: tu nombre, tu edad y tu pasatiempo. Como reto extra, agrega una línea con tu comida favorita. Cuando termines, dale play."
- **Edición:** «¡Tu turno!», ícono de pausa, checklist de los tres datos, tarjeta amarilla del reto y botón de play.

### 5:58–6:17 · Resumen y lo que viene

- **Narración:** "Hoy aprendiste que un programa es una lista de instrucciones en orden, que Java es un lenguaje que funciona en muchos equipos gracias a su Máquina Virtual, y que System.out.println muestra texto en la consola. En la próxima lección vamos a guardar datos en variables para crear el perfil de una red social."
- **Edición:** tres tarjetas de resumen y tarjeta final «Siguiente: Lección 2, Perfil de red social».
