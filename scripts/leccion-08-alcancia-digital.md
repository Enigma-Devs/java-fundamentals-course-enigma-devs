# Lección 8: Alcancía digital (~6 min)

- **Código de práctica:** [`starter-files/leccion-08-alcancia-digital`](../starter-files/leccion-08-alcancia-digital/Main.java)
- **Ejemplo completo:** [`completed-examples/leccion-08-alcancia-digital`](../completed-examples/leccion-08-alcancia-digital/Main.java)

Cada bloque tiene tres partes: **Pantalla** (qué se graba), **Narración** (voz en off) y **Edición** (lo que se agrega después).

Objetivo: proteger los datos de un objeto con `private`, leerlos con un getter (`getSaldo()`) y cambiarlos solo a través de un método que valida (`depositar()` con `if`). Retoma la clase y el constructor (lección 7), el problema de la batería negativa que dejó abierto, y el `if-else` (lección 4).

### 0:00–0:04 · Carátula

- **Edición:** «Lección 8», título «Encapsulación» y subtítulo «Protege tu alcancía digital».

### 0:04–0:35 · Gancho (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "En la lección anterior vimos que cualquiera podía ponerle batería negativa a un celular. Ahora imagina que eso pasa con tu dinero. Una alcancía tiene una ranura para meter monedas, pero no puedes meter la mano y cambiar lo que hay adentro. Hoy vamos a programar una alcancía así: el saldo está protegido, solo se puede mirar, y solo acepta depósitos que tengan sentido."
- **Edición:** el celular con batería «-50 %» de la lección 7 se convierte en una alcancía con «S/ -50» y un signo de alerta; luego una alcancía cerrada con candado, una ranura que acepta monedas y una mano bloqueada.

### 0:35–1:15 · ¿Qué es encapsular? (teoría)

- **Pantalla:** sin grabación; solo animación.
- **Narración:** "Encapsular significa guardar los datos dentro de una cápsula y no dejar que se toquen desde afuera. En Java se hace con dos piezas. La palabra private, que cierra el atributo con candado: solo la propia clase puede usarlo. Y métodos públicos que hacen de ventanilla: uno para mirar el dato, que se llama getter, y otros para cambiarlo, pero siguiendo reglas."
- **Edición:** cápsula con el atributo `saldo` adentro y un candado `private`; dos ventanillas: `getSaldo()` (un ojo, solo mirar) y `depositar()` (una ranura con un guardia que revisa). Etiqueta «encapsulación = private + métodos».

### 1:15–2:05 · La clase Alcancia con private

- **Pantalla:** escribir `class Alcancia {` con `private double saldo;` y el constructor `public Alcancia(double saldoInicial) { saldo = saldoInicial; }`.
- **Narración:** "Escribimos la clase Alcancia, como el celular de la lección 7. Su atributo es el saldo, un double porque puede tener céntimos. Pero esta vez le ponemos private delante. El constructor recibe el saldo inicial y lo guarda. Aquí no hace falta this, porque el parámetro tiene otro nombre: saldoInicial."
- **Edición:** candado que se cierra sobre `private`; etiqueta «solo la clase puede tocar saldo».

### 2:05–2:45 · El getter: mirar sin tocar

- **Pantalla:** escribir `public double getSaldo() { return saldo; }`. En `main`, `Alcancia mia = new Alcancia(20);` y `System.out.println("Saldo: S/ " + mia.getSaldo());`. Run.
- **Narración:** "Como el saldo es privado, necesitamos una forma de mirarlo. Creamos el método getSaldo: get significa «obtener». Devuelve un double con return, como los métodos de la lección 5. En main creamos la alcancía con 20 soles y mostramos el saldo con mia punto getSaldo. Run… 20 soles. Podemos ver el saldo, pero no cambiarlo."
- **Edición:** el ojo de la ventanilla `getSaldo()` mira dentro de la cápsula y el 20 sale por una flecha a la consola. Etiqueta «get = obtener».

### 2:45–3:45 · depositar: cambiar con reglas

- **Pantalla:** escribir `public void depositar(double monto)` con `if (monto > 0) { saldo = saldo + monto; ... } else { println("Monto no valido"); }`. En `main`, `mia.depositar(15);` y `mia.depositar(-50);` y mostrar el saldo. Run.
- **Narración:** "Ahora la ranura: el método depositar. Recibe el monto, y aquí está la regla, con un if como en la lección 4: si el monto es mayor que cero, lo sumamos al saldo. Si no, mostramos «monto no válido» y el saldo no cambia. Probamos: depositamos 15 y luego intentamos depositar menos 50. Run… el primero entró, el segundo fue rechazado, y el saldo quedó en 35. La alcancía se protegió sola."
- **Edición:** guardia en la ranura: la moneda de 15 entra con check verde, la de -50 rebota con una cruz roja y sonido de error. El saldo sube de 20 a 35.

### 3:45–4:25 · Intentamos hacer trampa

- **Pantalla:** escribir `mia.saldo = 1000;` en `main`. Run y mostrar el error.
- **Narración:** "¿Y si intento cambiar el saldo directamente, como hicimos con la batería? mia punto saldo igual a mil. Run… Error: saldo tiene acceso privado. Java no deja tocarlo desde afuera. Esa es la diferencia con el celular de la lección anterior: ahora el dato solo cambia a través de depositar, que revisa que tenga sentido."
- **Edición:** mano que intenta abrir la cápsula y choca con el candado; mensaje del compilador resaltado con la etiqueta «private = no se toca desde afuera».

### 4:25–5:00 · Errores comunes

- **Pantalla:** mostrar `getSaldo` sin `return` y el error; luego un `depositar` sin el `if` que acepta -50.
- **Narración:** "Dos errores típicos. Uno: olvidar el return en el getter; un getter siempre devuelve el dato. Dos: poner private pero escribir un método que acepta cualquier cosa. El candado no sirve si la ventanilla deja pasar un depósito negativo. La regla del if es lo que de verdad protege el dato."
- **Edición:** cada error en rojo con su corrección en verde. Lista: «atributos private · getter con return · validar con if».

### 5:00–5:25 · ¡Tu turno! (pausa)

- **Narración:** "Pausa el video y crea tu propia alcancía con un saldo inicial. Haz varios depósitos, incluido uno negativo, y muestra el saldo. Reto extra: agrega un método retirar que solo deje sacar dinero si hay suficiente saldo. Cuando termines, dale play."
- **Edición:** «¡Tu turno!», ícono de pausa y tarjeta amarilla del reto con la pista `if (monto <= saldo)`.

### 5:25–6:00 · Cierre

- **Narración:** "¡Muy bien! Hoy aprendiste a encapsular: atributos private, un getter para mirar y métodos que cambian los datos solo si se cumplen las reglas. Ya sabes crear un objeto bien protegido. Pero tu celular tiene cientos de contactos, no uno solo. En la siguiente lección vas a guardar muchos objetos juntos en una lista y a buscar uno por su nombre."
- **Edición:** la cápsula con candado y sus dos ventanillas como resumen; tarjeta final «Siguiente: Lección 9, Lista de contactos».
