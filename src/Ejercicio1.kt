//1.Hallar la superficie de un cuadrado solicitando el valor de un lado del mismo.
fun main() {
    // Solicitar el valor del lado del cuadrado
    print("Introduce el valor del lado del cuadrado: ")
    val lado = readLine()!!.toDouble()

    // Calcular el área del cuadrado
    val area = lado * lado

    // Mostrar el resultado
    println("El área del cuadrado es: $area")
}
