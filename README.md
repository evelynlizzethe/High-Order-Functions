# High-Order-Functions 

## Función Integración 
La función integración tiene como propósito calcular de manera aproximada la integral definida de una función real en un intervalo [a, b].

**Parámetros**

f: Double => Double
Función matemática que se desea integrar. Recibe un número real y devuelve otro número real.

a: Double
Límite inferior de integración.

b: Double
Límite superior de integración.


**Valor de retorno**

Devuelve un Double, que corresponde al valor aproximado de la integral en el intervalo [a, b].

Por ejemplo:
```
def integracion(f: Double => Double, a: Double, b: Double): Double
```
## Método utilizado: Simpson 1/3

El método de Simpson 1/3 aproxima una integral evaluando la función en tres puntos del intervalo:

  - extremo inferior ```a```

  - punto medio ```(a + b) / 2```

  - extremo superior ```b```

La fórmula aplicada es: 

<img width="350" height="115" alt="image" src="https://github.com/user-attachments/assets/c37853ce-7d82-4352-8501-9e67ef3871c0" />

## Función para calcular el error

Se implementa una función auxiliar para calcular la diferencia absoluta entre el valor obtenido y un valor esperado:
```
def calcular_error(valorEsperado: Double, valorObtenido: Double): Double =
  math.abs(valorEsperado - valorObtenido)
```

## Ejemplos incluidos en el código

Se probaron varias funciones, entre ellas:

- Funciones polinómicas

- Funciones racionales

- Funciones exponenciales
 
- Funciones con raíces

- Funciones trigonométricas inversas

Cada resultado se compara con un valor esperado y se calcula el error.

## Conclusiones

El método de Simpson demostró ser una herramienta eficaz para aproximar integrales de diferentes tipos de funciones. Los errores calculados son pequeños y coherentes con el comportamiento esperado del método numérico.
