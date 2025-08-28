# Ejercicio Integrador "Ornitorrincos" 🐦‍⬛
- Institución: Universidad de La Punta (ULP)
- Materia: Laboratorio de Programación I
- Año: 2025
- Integrantes (comisión 1, grupo 11):
  
  - Mauricio Reta
  - Juan Cruz Rodriguez
  - Agustín Mazza
  - Jeremías Hoyo
  - Facundo Lopez Cozzella
  - Jeremías Sirur Flores
  

## Consigna
<p>"El siguiente ejercicio se trata de los <b>ornitorrincos</b>. Este peculiar animal pertenece a la familia de los monotremas, un grupo de mamíferos semiacuáticos, que se distingue por poner huevos en lugar de dar a luz a crías vivas.
<BR>Son animales que heredan de los patos un clásico pico achatado que mide 6.8 centímetros de largo que les sirve para buscar alimento en el agua y detectar presas con la ayuda de receptores eléctricos.</BR></p>

<p>Además, adquieren sus patas que son de 7.5 cm con membranas interdigitales que le permiten nadar con facilidad y moverse en tierra firme. 
<BR>Heredan del castor una cola ancha y plana que le ayuda a guardar grasa y nadar (este método muestra un atributo del castor: "velocidad", de hasta 8 km/hora)</BR></p>

<p>Un dibujito animado/cartoon sobre la familia del ornitorrinco dotará a papaCastor para que pueda tocar la guitarra y a mamaPata para que toque el órgano. Así los hijos son un (1) ornitorrinco verde, y dos (2) azules.
<BR>Solo el verde hereda la habilidad de “tocarOrgano” y también desarrolla la habilidad de “tocarGuitorgan”,  que es un instrumento que combina elementos de la guitarra eléctrica y el órgano electrónico, por lo cual "tocarGuitorgan" debe invocar al método "tocarGuitarra" (de su papaCastor) y llama a su método implementado de la interface mamaPata "tocarOrgano", luego imprime <i>“cuac cuac!”</i></BR>
<BR>Los ornitorrincos azules solo heredan del papaCastor la habilidad de "nadar", pero la sobreescriben. Al nadar toman la velocidad del padre, ms su atributo "propulsión" (ingresada por teclado) de 5 a 10 km/s.</BR></p>

- "tocarGuitarra": toca 3 cuerdas aleatorias. Imprime “toca cuerda + nroRandom de 1 a 6”. Ej: “toca cuerda 3”, “toca cuerda 2”, “toca cuerda 5”.
- "tocarOrgano": imprime “Do-Re-Mi” (use scanner para esperar a que se oprima una tecla) y luego “Fa-Sol-La-Si”.

## Actividades
1. Para el siguiente ejercicio se debe realizar una súper clase para el padre castor (que tiene una longitud de cola y velocidad ingresadas por teclado) y una subclase llamada OrniVerde que implementa la interface de mamaPata la cual tiene pico, patas y su método para tocarGuitarra.
2. OrniVerde y OrniAzul deben heredar del castor sus métodos "nadar" y "tocarGuitarra" y sus atributos "velocidad" y "cola". Pero los OrniAzul sobrescriben "nadar" del castor. OrniVerde no lo hace pero implementa "tocarGuitarra" y "tocarGuitorgan".
3. Luego, en la Main Class crear 3 instancias: 1 de orniVerde y 2 de orniAzul (que podrían llamarse Blue & Blui), haga que cada ornitorrinco ejecute TODAS sus habilidades de nado y musicales. Elijan ustedes un nombre para el orniVerde.
4. Realice un arreglo de tamaño 3 donde tendrán que guardarlos, controlen "ArrayIndexException". Guardar al orniVerde en la posición 1 del arreglo. Asegúrense de incluir un bloque Finally que diga: “Los ornitoHermanos juntos al fin!” 
5. Pasar a un List de nadadores a los 2 mejores nadadores pero solo “si es instancia de”.
6. Ordenar la lista por propulsión de nado de forma ascendente. Muéstrenlo con un Iterator."

<img width="992" height="648" alt="imgParaElREADME1" src="https://github.com/user-attachments/assets/02dc2dd1-a8f3-4031-9e35-25f8f44237e0" />
