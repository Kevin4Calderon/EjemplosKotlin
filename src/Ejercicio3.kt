//3.Calcular el índice de masa corporal de una persona IMC= Peso KG/ Estatura^2
fun main() {
    // Solicitar el peso en kilogramos
    print("Introduce tu peso en kilogramos: ")
    val peso = readLine()!!.toDouble()

    // Solicitar la estatura en metros
    print("Introduce tu estatura en metros: ")
    val estatura = readLine()!!.toDouble()

    // Calcular el IMC
    val imc = peso / (estatura * estatura)

    // Mostrar el resultado
    println("Tu índice de masa corporal (IMC) es: $imc")
}
