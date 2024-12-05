//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Solicitar el valor del lado del cuadrado
    print("Introduce el valor del lado del cuadrado: ")
    val lado = readLine()!!.toDouble()

    // Calcular el área del cuadrado
    val area = lado * lado

    // Mostrar el resultado
    println("El área del cuadrado es: $area")
}
