def integracion (f: Double => Double, a: Double, b: Double): Double = {
  val intermedio = (a+b)/2
  val fa = f(a)
  val fb = f(b)
  val fi = f(intermedio)
  (b-a) * (fa + 4 * fi + fb) / 6
}

def calcular_error(valorEsperado: Double, valorObtenido: Double): Double = math.abs(valorEsperado - valorObtenido)

val f1 = (x: Double) => -(x*x) + 8*x -12
val obtenido1 = integracion(f1, 3, 5)

val f2 = (x: Double) => 3 * (x*x)
val obtenido2 = integracion(f2, 0, 2)

val f3 = (x: Double) => x + 2 * math.pow(x,2) - math.pow(x,3) + 5 * math.pow(x,4)
val obtenido3 = integracion(f3, -1, 1)

val f4 = (x: Double) => (2*x+1) / ((x*x) + x)
val obtenido4 = integracion(f4, 1, 2)

val f5 = (x: Double) => math.exp(x)
val obtenido5 = integracion(f5, 0, 1)

val f6 = (x: Double) => 1 / (math.sqrt(x - 1))
val obtenido6 = integracion(f6, 2, 3)

val f7 = (x: Double) => 1 / (1 + (x*x))
val obtenido7 = integracion(f7, 0, 1)

calcular_error(7.33, obtenido1)
calcular_error(8, obtenido2)
calcular_error(3.333, obtenido3)
calcular_error(1.09861, obtenido4)
calcular_error(1.71828, obtenido5)
calcular_error(0.828427, obtenido6)
calcular_error(0.785398, obtenido7)

