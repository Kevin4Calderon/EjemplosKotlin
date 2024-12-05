//Desarrollar un programa que pida el precio de un artículo, cantidad de artículos adquiridos y mostrar el total de la compra.
fun main() {
    // Solicitar el precio del artículo
    print("Introduce el precio del artículo: ")
    val precio = readLine()!!.toDouble()

    // Solicitar la cantidad de artículos adquiridos
    print("Introduce la cantidad de artículos adquiridos: ")
    val cantidad = readLine()!!.toInt()

    // Calcular el total de la compra
    val totalCompra = precio * cantidad

    // Mostrar el total de la compra
    println("El total de la compra es: $$totalCompra")
}
