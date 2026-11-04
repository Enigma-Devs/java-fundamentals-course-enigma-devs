# Lección 7: Mi celular como objeto (~6 min 30 s)

- **Código de práctica:** [`starter-files/leccion-07-mi-celular-como-objeto`](../starter-files/leccion-07-mi-celular-como-objeto/Main.java)
- **Ejemplo completo:** [`completed-examples/leccion-07-mi-celular-como-objeto`](../completed-examples/leccion-07-mi-celular-como-objeto/Main.java)

Cada bloque tiene tres partes: **Pantalla** (qué se graba), **Narración** (voz en off) y **Edición** (lo que se agrega después).

Objetivo: crear una clase `Celular` con atributos, un constructor con `this` y métodos (`mostrarInfo()` y `usar(minutos)`), y crear dos objetos distintos con `new`. Retoma las variables (lección 2), los métodos (lección 5) y el aviso de batería baja con `if` (lección 4).

### 0:00–0:04 · Carátula

- **Edición:** «Lección 7», título «Clases y objetos» y subtítulo «Convierte tu celular en un objeto».

### 0:04–0:35 · Gancho (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "Mira tu celular. Tiene datos: una marca, un modelo y un porcentaje de batería. Y también hace cosas: muestra su información y, cuando lo usas, gasta batería. Tu celular y el de tu amigo tienen los mismos tipos de datos, pero con valores distintos. Hoy vas a crear en Java un molde de celular y, con ese molde, fabricar todos los celulares que quieras."
- **Edición:** dos celulares lado a lado con sus fichas (marca, modelo, batería) y valores distintos; debajo, dos botones: «mostrar info» y «usar».

### 0:35–1:20 · Clase y objeto (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "Una clase es un molde. Dice qué datos tiene algo, que se llaman atributos, y qué puede hacer, que son sus métodos. Un objeto es una cosa real hecha con ese molde. Piensa en un molde de galletas: el molde es la clase, y cada galleta es un objeto. Todas tienen la misma forma, pero una puede tener chispas de chocolate y otra no. (pausa) De hecho, ya usaste un objeto: el Scanner de la lección anterior lo creaste con new."
- **Edición:** un molde de galletas «clase» que estampa dos galletas «objeto» con decoraciones distintas; luego el molde se convierte en una ficha «Celular» con atributos arriba y métodos abajo.

### 1:20–2:10 · La clase Celular y sus atributos

- **Pantalla:** encima de `public class Main`, escribir `class Celular {` con `String marca;`, `String modelo;` e `int bateria;`.
- **Narración:** "Escribimos la clase en el mismo archivo, arriba de Main: la palabra class y el nombre Celular, con mayúscula inicial, porque las clases se nombran así. Adentro van los atributos, que son variables como las de la lección 2, pero sin valor todavía: String marca, String modelo e int bateria. El molde solo dice qué datos tendrá cada celular."
- **Edición:** ficha del molde «Celular» que se llena con los tres atributos mientras se escriben; etiqueta «clases con mayúscula inicial».

### 2:10–3:05 · El constructor y this

- **Pantalla:** escribir `public Celular(String marca, String modelo, int bateria) { this.marca = marca; this.modelo = modelo; this.bateria = bateria; }`.
- **Narración:** "Ahora el constructor: el método especial que se ejecuta al fabricar cada celular. Se llama igual que la clase y no devuelve nada. Recibe los tres datos como parámetros, como los métodos de la lección 5, y los guarda en el objeto. Aquí aparece la palabra this, que significa «este celular». this punto marca es el atributo del objeto, y marca, sin this, es el dato que llegó. Entonces this.marca igual a marca quiere decir: guarda en este celular la marca que me dieron."
- **Edición:** flecha del parámetro `marca` al atributo `this.marca`, para cada uno de los tres. Etiqueta «this = este objeto».

### 3:05–3:55 · Los métodos del celular

- **Pantalla:** escribir `public void mostrarInfo()` con un `println` de marca, modelo y batería, y `public void usar(int minutos)` que resta los minutos y avisa con `if (bateria < 20)`.
- **Narración:** "Ahora lo que el celular sabe hacer. mostrarInfo muestra su marca, modelo y batería. Dice void porque no devuelve nada, solo muestra. Y no lleva static, porque cada celular lo hace con sus propios datos. El segundo método es usar: recibe los minutos de uso y le resta esa cantidad a la batería, como hacíamos en la lección 3. Y si la batería queda por debajo de 20, avisa, igual que en la lección 4."
- **Edición:** ficha del molde con sus métodos abajo; etiquetas «void = no devuelve nada» y «sin static: cada objeto usa sus datos». Barra de batería que baja al escribir la resta.

### 3:55–4:50 · Fabricamos dos celulares

- **Pantalla:** en `main`, crear `Celular c1 = new Celular("Astra", "X10", 80);` y `Celular c2 = new Celular("Luna", "Pro 5", 90);`, llamar `mostrarInfo()`, luego `c1.usar(70);` y `c2.usar(30);`, y otra vez `mostrarInfo()`. Run.
- **Narración:** "En main fabricamos los celulares con new, igual que el Scanner. Celular c1 igual a new Celular con su marca, su modelo y 80 de batería. Y c2, con otros datos. Para pedirle algo a un objeto escribimos su nombre, un punto y el método: c1 punto mostrarInfo. Ahora usamos c1 durante 70 minutos y c2 durante 30. Run… c1 bajó a 10 y nos avisó; c2 quedó en 60. Mismo molde, dos objetos con su propia batería."
- **Edición:** el molde estampa dos celulares que aparecen con sus valores; sus barras de batería bajan a 10 (roja) y a 60. Etiqueta «objeto.metodo()» sobre `c1.usar(70)`.

### 4:50–5:25 · Errores comunes

- **Pantalla:** quitar `this` en el constructor y mostrar que la marca sale como `null`; luego llamar `mostrarInfo()` sin el objeto delante y mostrar el error.
- **Narración:** "Dos errores típicos. Uno: olvidar this en el constructor. Java guarda el dato en el parámetro y no en el objeto, y cuando lo muestras sale null, que significa vacío. Dos: llamar al método sin decir de qué objeto. Java no sabe de qué celular hablas; siempre va el objeto, un punto y el método."
- **Edición:** consola con «null» resaltado en rojo y su corrección en verde. Lista: «this.atributo = parámetro · objeto.metodo() · clase con mayúscula».

### 5:25–5:50 · ¡Tu turno! (pausa)

- **Narración:** "Pausa el video y fabrica tu propio celular y el de alguien de tu familia. Úsalos distintos minutos y mira cuál se queda sin batería. Reto extra: agrega un método cargar que sume minutos de carga a la batería. Cuando termines, dale play."
- **Edición:** «¡Tu turno!», ícono de pausa y tarjeta amarilla del reto.

### 5:50–6:30 · Cierre

- **Narración:** "¡Excelente! Hoy creaste tu primera clase: un molde con atributos, un constructor y métodos, y fabricaste dos objetos con new. Pero hay un problema: desde main, cualquiera puede escribir c1 punto bateria igual a menos 50, y Java lo acepta. Una batería negativa no tiene sentido. En la siguiente lección vas a aprender a proteger los datos de tus objetos, construyendo una alcancía digital."
- **Edición:** la línea `c1.bateria = -50;` aparece y la barra de batería se vuelve negativa con un sonido de error; tarjeta final «Siguiente: encapsulación, alcancía digital» con un candado.