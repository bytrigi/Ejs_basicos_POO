# Ejercicios de Programación Orientada a Objetos

Todos los ejercicios siguientes siguen el mismo patrón:

- Implementáis la clase que se pide, de la que instanciaremos objetos.
- Implementáis una clase que tenga un método `main`, que será el punto de entrada del programa.
- En el `main`, hacéis alguna operación con los objetos usando sus *getters* y *setters*.
- **Recordad:**
    - **Atributos privados** (variables privadas).
    - **Métodos públicos** (funciones públicas).

> Aunque sepáis hacer todos los ejercicios, el objetivo de estos **no es que supongan un desafío mental**, sino que a través de la práctica os acostumbréis a **usar y manipular objetos**.

---

## Ejercicio 1
Crea una clase llamada `Cancion` con los atributos:
- título
- artista
- duración en segundos

Crea una segunda clase con un método `main` desde la que:
- Se creen dos objetos `Cancion`.
- Se seteen todos sus atributos.
- Se muestren sus datos por pantalla usando los *getters*.
- Se modifique la duración de una de ellas usando el *setter*.
- Se imprima el **título de la canción más larga**.

---

## Ejercicio 2
Crea una clase llamada `Pelicula` con los atributos:
- título
- director
- año de estreno
- duración en minutos

Desde una clase con `main`:
- Crea un objeto `Pelicula`.
- Setea todos sus datos.
- Muestra todos sus datos.
- Modifica el director usando el *setter* para que esté en mayúsculas (`toUpperCase()`).

---

## Ejercicio 3
Crea una clase llamada `Youtuber` con los atributos:
- nombre del canal
- categoría
- número de suscriptores

Desde la clase principal:
- Crea tres objetos `Youtuber`.
- Setéalos.
- Imprime y actualiza el número de suscriptores de uno de ellos.

---

## Ejercicio 4
Crea una clase `JugadorFutbol` con los atributos:
- nombre
- equipo
- dorsal
- posición

Desde la clase con `main`:
- Crea un jugador.
- Muestra sus datos.
- Cambia el equipo y el dorsal.
- Vuelve a mostrar sus datos.

---

## Ejercicio 5
Crea una clase `Skin` con los atributos:
- nombre
- videojuego
- rareza
- precio en monedas

Desde el `main`:
- Crea dos skins.
- Modifica la rareza y el precio de una de ellas.

---

## Ejercicio 6
Crea una clase `Pokemon` con los atributos:
- nombre
- tipo
- nivel
- vida

Desde la clase principal:
- Crea un Pokémon.
- Modifica su nivel y su vida utilizando los *setters*.

---

## Ejercicio 7
Crea una clase `Manga` con los atributos:
- título
- autor
- número de volumen
- boolean que indique si está leído o no

Desde el `main`:
- Crea un manga.
- Muestra su información.
- Márcalo como leído.

---

## Ejercicio 8
Crea una clase `EquipoEsports` con los atributos:
- nombre
- juego
- país
- ranking mundial

Desde la clase principal:
- Crea un equipo.
- Modifica su ranking.

---

## Ejercicio 9

Crea una clase `CancionStats` con los atributos:

* título
* número de reproducciones

Añade un método `reproducir()` que incremente en uno el número de reproducciones.
Desde la clase con `main`:

* Simula varias reproducciones de una canción en un bucle con dicha función.
* Muestra el total usando el getter del objeto.

## Ejercicio 10

Crea una clase `Marcador` con los atributos:

* equipo local
* equipo visitante
* goles del local
* goles del visitante

Añade métodos:

* `golLocal()`: incrementa los goles del local.
* `golVisitante()`: incrementa los goles del visitante.
* `resultado()`: devuelve el resultado en formato "X - Y".

Desde el `main`, simula un partido y muestra el resultado final.

## Ejercicio 11

Crea una clase `BateriaMovil` con el atributo:

* porcentaje

Añade métodos:

* `usar(int minutos)`: reduce el porcentaje de batería (supongamos 1% por minuto para simplificar, o lo que decidas).
* `cargar(int minutos)`: aumenta el porcentaje sin superar el 100.

Desde la clase principal, simula el uso del móvil y después la carga.

## Ejercicio 12

Crea una clase `Personaje` con los atributos:

* nombre
* vida
* ataque

Añade métodos:

* Recibir daño.
* Curarse.
* Comprobar si sigue vivo (boolean).
* **Nota:** La vida no debe bajar de 0 ni superar 100.

Desde el `main`, simula un pequeño combate.

## Ejercicio 13

Crea una clase `Carrito` con el atributo:

* total (dinero acumulado)

Añade métodos:

* Añadir un producto (recibe precio).
* Aplicar un descuento (recibe porcentaje).

Desde la clase principal, añade varios productos y aplica un descuento al total.

## Ejercicio 14

Crea una clase `Post` con los atributos:

* título
* número de likes
* número de dislikes

Añade métodos:

* Dar like.
* Dar dislike.
* Obtener popularidad (likes menos dislikes).

Desde el `main`, simula varias interacciones y muestra la popularidad.

## Ejercicio 15

Crea una clase `SesionJuego` con los atributos:

* nombre del juego
* minutos jugados

Añade métodos:

* `jugar(int minutos)`: acumula tiempo.
* `horasJugadas()`: devuelve las horas jugadas como número decimal (ej: 1.5 horas).

Desde la clase principal, simula varias sesiones.

## Ejercicio 16

Crea una clase `EntradaCine` con los atributos:

* nombre de la película
* precio base
* boolean es estudiante

Añade un método `precioFinal()` que aplique un descuento (ej. 20%) si es estudiante.
Desde el `main`, crea varias entradas y muestra su precio final.
