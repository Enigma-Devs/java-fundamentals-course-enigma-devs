# Lección 10: Mi playlist, proyecto final (~9 min)

- **Código de práctica:** [`starter-files/leccion-10-mi-playlist`](../starter-files/leccion-10-mi-playlist/Main.java)
- **Ejemplo completo:** [`completed-examples/leccion-10-mi-playlist`](../completed-examples/leccion-10-mi-playlist/Main.java)

Cada bloque tiene dos partes: **Pantalla** (qué se graba), **Narración** (voz en off) y **Edición** (lo que se agrega después).

Objetivo: integrar lo aprendido en el curso en un programa completo, una playlist con menú que agrega canciones, las lista y calcula la duración total, y cerrar con los errores más comunes y cinco buenas prácticas. Retoma los operadores `/` y `%` (lección 3), `if`, `while` y `for` (lección 4), `Scanner` (lección 6), las clases y el constructor (lección 7), la encapsulación (lección 8) y los arrays de objetos (lección 9).

### 0:00–0:04 · Carátula

- **Pantalla:** «Lección 10», título «Proyecto final» y subtítulo «Crea tu playlist con menú en Java».

### 0:04–0:28 · Gancho (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "Llegamos al final del curso y vamos a cerrar con un proyecto de verdad: una playlist de canciones. Podrás agregar tus canciones favoritas, verlas en una lista y saber cuánto dura toda la playlist, con un menú que se queda funcionando hasta que decidas salir. Y lo mejor: casi todo lo que necesitas ya lo aprendiste. Hoy vamos a juntarlo."

### 0:28–1:03 · El plan: tres partes (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "Antes de escribir código, un buen programador hace un plan. Vamos a tener tres partes. La primera, la clase Cancion: un molde para cada canción, con título, artista y duración. La segunda, la clase Playlist, que guarda un array de canciones y sabe agregarlas, listarlas y sumar su duración. Y la tercera, el programa principal, con un menú hecho con Scanner y un while. Cada parte tiene una sola responsabilidad, y eso hace que el programa sea ordenado y fácil de entender."

### 1:03–1:53 · La clase Cancion

- **Pantalla:** en OnlineGDB, la clase `Cancion` con `private String titulo;`, `private String artista;` y `private int duracion;`, el constructor que recibe los tres datos y los getters `getTitulo()`, `getArtista()` y `getDuracion()`.
- **Narración:** "Empezamos por la clase Cancion, igual que hicimos con Contacto. Tiene tres atributos: el título, el artista y la duración, todos private. La duración la guardamos en segundos, como número entero, porque así es fácil hacer cuentas. Después tenemos el constructor, que recibe los tres datos y los guarda. Y como los atributos son privados, agregamos un getter para cada uno. Eso se llama encapsulación: los datos están protegidos dentro del objeto y solo se leen a través de estos tres pequeños métodos."

### 1:53–2:33 · La clase Playlist: el array y agregar

- **Pantalla:** la clase `Playlist` con `private Cancion[] canciones = new Cancion[10];`, `private int cantidad = 0;` y el método `agregar(Cancion c)` con `if (cantidad < canciones.length)`.
- **Narración:** "Ahora, la playlist. Su atributo principal es un array de 10 canciones, privado. Pero tenemos un problema: el array tiene 10 casilleros, y al principio todos están vacíos. ¿Cuántas canciones hay de verdad? Para eso creamos la variable cantidad, que empieza en cero. El método agregar recibe una canción y, con un if, pregunta si cantidad es menor que el tamaño del array. Si es verdad, guarda la canción en la posición cantidad y le suma uno. Si no, avisa que la playlist está llena. Así evitamos el error de pedir un casillero que no existe."

### 2:33–3:24 · Listar y calcular la duración total

- **Pantalla:** el método `listar()` con `if (cantidad == 0)` y un `for` hasta `cantidad`, y el método `mostrarDuracionTotal()` que suma los segundos y muestra `total / 60` minutos y `total % 60` segundos.
- **Narración:** "El método listar recorre el array con un for. Primero, un if pregunta si cantidad es igual a cero: si la playlist está vacía, no hay nada que listar. Si hay canciones, el for recorre el array y en cada vuelta muestra el número, el título, el artista y la duración. Para la duración total, creamos una variable total que empieza en cero y en cada vuelta le sumamos los segundos de la canción. Al final convertimos los segundos: dividimos entre 60 para los minutos, y usamos el resto con el porcentaje para los segundos que sobran, igual que en la lección 3."

### 3:24–5:02 · El menú con while y Scanner

- **Pantalla:** en `main`, `Scanner sc = new Scanner(System.in);`, `Playlist playlist = new Playlist();` y `while (opcion != 4)` con las cuatro opciones del menú, `opcion = sc.nextInt();` y `sc.nextLine();`, y la cadena de `if`, `else if` y `else`.
- **Narración:** "Ahora creamos un Scanner para leer lo que escribe el usuario y una nueva Playlist. Iniciamos el menú con un while, que se repite mientras la opción no sea 4. Los números del menú son los que te guían para elegir cada funcionalidad. sc.nextInt captura el número que escribes y lo guarda en opcion, y sc.nextLine salta a la siguiente línea. Con la opción 1 agregamos una canción: el programa pregunta el título, el artista y la duración en segundos, y con esos datos crea una nueva Cancion y la agrega a la playlist con el método agregar. La opción 2 lista la playlist. La opción 3 muestra la duración total de todas las canciones. Y la opción 4 sale del programa con un «¡Hasta luego!». Si escribes cualquier otro número, aparece «Opción no válida» y el menú vuelve a mostrarse desde el inicio."

### 5:02–6:32 · Probamos el programa

- **Pantalla:** Run. Elegir la opción 2 con la playlist vacía; luego la 1 para agregar una canción, otra vez la 2, agregar una segunda canción y elegir la 3.
- **Narración:** "Es hora de probar el sistema. Run… aparece el menú. Primero elegimos la opción 2: nos dice que la playlist está vacía, que es justo el mensaje que esperábamos. Ahora la opción 1, para agregar una canción: escribimos un título, el artista y la duración en segundos, y la canción se agrega. Si volvemos a la opción 2, aparece la primera canción con su duración en minutos y segundos. Agregamos otra canción para probar la duración total, y elegimos la opción 3: ahí está la suma de las dos. Todas las funcionalidades trabajan correctamente, y así vemos cómo las piezas trabajan juntas: las clases, los arrays, los ciclos, las decisiones y la entrada de datos."

### 6:32–7:22 · Errores comunes

- **Pantalla:** recuadros sobre `sc.nextLine();` después de `nextInt()`, sobre el `if` de `agregar`, sobre la condición `i < cantidad` del `for` y sobre la variable `opcion` del `while`.
- **Narración:** "Los errores más comunes en este proyecto. Uno: después de leer un número con nextInt, queda guardado el salto de línea, y la siguiente lectura con nextLine se lo traga. El programa parece saltarse una pregunta; por eso ponemos un nextLine para limpiarlo. Dos: pasarse del tamaño del array sin el if de agregar: la canción número 11 rompe el programa. Tres: recorrer hasta el tamaño del array en vez de hasta cantidad, y encontrarse con casilleros vacíos. Y cuatro: olvidar actualizar la variable del menú, y que el while nunca termine."

### 7:22–8:03 · Cinco buenas prácticas

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "Antes de terminar, cinco consejos para que tu código sea el de un programador profesional. Uno: usa nombres claros, como duracionTotal en lugar de x. Dos: escribe los nombres de variables y métodos en camelCase, y los de las clases con mayúscula inicial. Tres: protege tus datos con private y usa getters. Cuatro: haz que cada clase y cada método hagan una sola cosa. Y cinco: prueba tu programa con casos raros, como una playlist vacía o una opción inválida, no solo con los casos fáciles."

### 8:03–8:22 · ¡Tu turno! (pausa)

- **Narración:** "Pausa el video y arma tu propia playlist: agrega cinco canciones que te gusten y comprueba la duración total. Como reto extra, agrega una quinta opción al menú que muestre cuántas canciones hay, usando la variable cantidad. Cuando termines, dale play."

### 8:22–9:05 · Cierre del curso

- **Narración:** "¡Muy bien, lo lograste! Al principio de este curso solo mostrabas tu nombre en pantalla. Hoy armaste un programa completo, con clases, arrays, menús y cálculos. Aprendiste a usar variables, decisiones, ciclos, métodos, clases y encapsulación, y eso es la base de todo lo que vendrá. Para seguir creciendo, practica con tus propios proyectos: una lista de tareas, un juego de adivinar el número o una tiendita. Y cuando estés listo, sigue con la herencia y las listas dinámicas, que son el siguiente nivel de Java. Gracias por llegar hasta aquí, y sigue programando."