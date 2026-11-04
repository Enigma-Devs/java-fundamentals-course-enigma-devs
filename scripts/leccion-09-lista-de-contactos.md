# Lección 9: Lista de contactos (~8 min 30 s)

- **Código de práctica:** [`starter-files/leccion-09-lista-de-contactos`](../starter-files/leccion-09-Lista-de-contactos/Main.java)
- **Ejemplo completo:** [`completed-examples/leccion-09-lista-de-contactos`](../completed-examples/leccion-09-Lista-de-contactos/Main.java)

Cada bloque tiene tres partes: **Pantalla** (qué se graba), **Narración** (voz en off) y **Edición** (lo que se agrega después).

Objetivo: guardar muchos objetos juntos en un array, recorrerlo con `for`, buscar un contacto por su nombre con `equals` y mostrar texto en mayúsculas con `toUpperCase()`. Retoma el `for` (lección 4), la clase y el constructor con `this` (lección 7) y los atributos `private` con getters (lección 8).

### 0:00–0:04 · Carátula

- **Pantalla:** «Lección 9», título «Arrays de objetos» y subtítulo «Lista de contactos».

### 0:04–0:33 · Gancho (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "Abre la agenda de tu celular. Tienes decenas de contactos, uno debajo del otro, y si escribes un nombre aparece el que buscas. ¿Cómo guarda un programa tantos contactos? ¿Creando una variable para cada uno? Imagina tener contacto1, contacto2, contacto3… hasta contacto500. Sería un desastre. Hoy vamos a aprender la herramienta que soluciona todo esto, los arrays, y vamos a construir una lista de contactos con búsqueda."

### 0:33–1:19 · ¿Qué es un array? (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "Un array es una fila de casilleros, todos del mismo tipo, con un solo nombre para toda la fila. Cada casillero tiene un número de posición llamado índice. Atención: el primer casillero es el número cero, no el uno. Si el array tiene tres casilleros, sus posiciones son 0, 1 y 2. Para crear un array escribimos el tipo con corchetes, un nombre y, con new, cuántos casilleros queremos. Por ejemplo, `int[] notas = new int[3];` crea tres casilleros para números enteros. Y todo array sabe cuántos casilleros tiene: lo dice con length."

### 1:19–3:24 · La clase Contacto

- **Pantalla:** en OnlineGDB, escribir `class Contacto {` con `private String nombre;` y `private String telefono;`, el constructor `public Contacto(String nombre, String telefono)` con `this.nombre = nombre;` y `this.telefono = telefono;`, y los getters `getNombre()` y `getTelefono()` con `return`.
- **Narración:** "Cada contacto tiene un nombre y un teléfono, así que necesitamos una clase. Recuerda que los atributos siempre son privados, como en la alcancía de la lección 8: private String nombre. Lo copiamos y lo pegamos para crear el segundo atributo: telefono. Ahora hacemos el constructor: public, el nombre de la clase, Contacto, paréntesis y llaves. Queremos que reciba un nombre y un teléfono, que son los datos que vamos a guardar. Adentro escribimos this.nombre igual a nombre: el nombre que llega se guarda en el atributo de este contacto. Copiamos la línea y cambiamos nombre por telefono. Después agregamos dos getters para poder leer la información: public, el tipo que devuelve, String, y getNombre, con return nombre. Lo copiamos, lo pegamos y lo cambiamos por getTelefono, siempre siguiendo las buenas prácticas de camelCase. Esta clase es el molde: cada vez que escribas new Contacto, saldrá un contacto nuevo."

### 3:24–4:22 · Un array de contactos

- **Pantalla:** en `main`, escribir `Contacto[] contactos = new Contacto[3];` y llenar las posiciones 0, 1 y 2 con `new Contacto("Ana", "999111222")`, `new Contacto("Luis", "988333444")` y `new Contacto("Sofia", "977555666")`.
- **Narración:** "Ahora sí, un array de contactos. El tipo es Contacto con corchetes, y con new Contacto de tres creamos tres casilleros. Pero todavía están vacíos: no hay ningún contacto adentro, solo hay lugar para tres. Para llenarlos escribimos el nombre del array, entre corchetes el índice donde va el dato, y new Contacto con su información. En la posición cero va Ana con su teléfono; en la posición uno, Luis, y en la posición dos, Sofía. Fíjate que este array no guarda texto suelto: guarda objetos completos, cada uno con su nombre y su teléfono."

### 4:22–5:08 · Recorremos la lista con for

- **Pantalla:** escribir `System.out.println("=== Mis contactos ===");` y `for (int i = 0; i < contactos.length; i++)` con un `println` de `getNombre()` y `getTelefono()`. Run.
- **Narración:** "Para mostrar todos los contactos recorremos el array con un for, como en la lección 4. La variable i empieza en cero y avanza mientras sea menor que contactos.length, la cantidad de contactos. En cada vuelta mostramos el nombre y el teléfono. Run… Ahí está la lista completa. Y lo mejor: si mañana el array tiene 100 contactos en vez de 3, este mismo for los muestra todos sin cambiar nada."

### 5:08–6:19 · Buscamos con equals

- **Pantalla:** escribir `String buscado = "Luis";` y `boolean encontrado = false;`, y un `for` con `if (contactos[i].getNombre().equals(buscado))` que muestra el contacto y cambia `encontrado = true;`. Después, `if (!encontrado)` con el mensaje «No se encontro a». Run.
- **Narración:** "Ahora, la búsqueda. Guardamos en una variable el nombre que buscamos: Luis. Creamos otra variable, encontrado, que empieza en false. Recorremos el array y, con un if, preguntamos si el nombre de este contacto es igual al que buscamos. Para comparar textos en Java usamos equals: contactos[i].getNombre().equals(buscado). Devuelve true si los dos textos son idénticos. ¿Por qué no usamos doble igual? Porque con textos no es confiable: el doble igual pregunta si son la misma caja, no si tienen el mismo contenido. Con texto, usa siempre equals. Si lo encontramos, mostramos sus datos y cambiamos encontrado a true. Y si al terminar sigue en false, avisamos que no se encontró. Run… Encontrado: Luis, con su teléfono."

### 6:19–6:59 · Mayúsculas con toUpperCase

- **Pantalla:** recuadro sobre `getNombre().toUpperCase()` en la línea «Encontrado» y sobre el resultado en la consola.
- **Narración:** "¿Por qué Luis aparece en mayúsculas? Porque usamos el método toUpperCase, que significa «a mayúsculas». Todos los textos lo tienen: se agrega con un punto al final, como ves aquí. Así el resultado destaca, y cada vez que corras el programa el nombre encontrado aparecerá en mayúsculas."

### 6:59–7:43 · Errores comunes

- **Pantalla:** pedir una posición que no existe y mostrar el error `ArrayIndexOutOfBoundsException`; luego cambiar `buscado` a `"luis"` con minúscula y Run.
- **Narración:** "Tres errores típicos. Uno: pedir una posición que no existe. Con tres casilleros, las posiciones son 0, 1 y 2; si pides la 3, Java muestra el error ArrayIndexOutOfBoundsException. Dos: olvidar que el índice empieza en cero. Y tres: buscar luis con minúscula y no encontrarlo, porque equals distingue mayúsculas de minúsculas. Lo vemos con un ejemplo: cambiamos Luis por luis, con minúscula, y ejecutamos. Como ves, dice «No se encontró a luis»."

### 7:43–8:09 · ¡Tu turno! (pausa)

- **Narración:** "Pausa el video y crea tu propia lista con cinco contactos de tus personajes favoritos, y busca uno de ellos. Como reto, usa equalsIgnoreCase en lugar de equals, que ignora las mayúsculas y minúsculas, y prueba a buscar luis con minúscula. Pruébalo tú mismo y cuéntanos en los comentarios."

### 8:09–8:30 · Cierre

- **Narración:** "¡Muy bien! Hoy aprendiste a guardar muchos objetos en un array, a recorrerlo con un for, a buscar con equals y a mostrar textos con toUpperCase. Ya tienes todas las piezas para el gran final. En el siguiente video vamos a juntarlo todo y construir un proyecto completo: tu propia playlist de canciones."