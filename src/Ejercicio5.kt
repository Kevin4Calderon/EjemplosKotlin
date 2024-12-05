fun main() {
    // Solicitar la cantidad de trabajadores
    print("¿Cuántos trabajadores deseas ingresar? ")
    val numTrabajadores = readLine()!!.toInt()

    // Definir el número máximo de horas extras permitidas
    val maxHorasExtras = 5

    // Procesar la información de cada trabajador
    for (i in 1..numTrabajadores) {
        println("Trabajador $i:")

        // Solicitar los días trabajados
        print("Introduce los días trabajados por el trabajador $i: ")
        val diasTrabajados = readLine()!!.toInt()

        // Solicitar el pago por hora
        print("Introduce el pago por hora del trabajador $i: ")
        val pagoPorHora = readLine()!!.toDouble()

        // Solicitar el pago por hora extra
        print("Introduce el pago por hora extra del trabajador $i: ")
        val pagoPorHoraExtra = readLine()!!.toDouble()

        // Solicitar las horas extras trabajadas
        print("Introduce las horas extras trabajadas por el trabajador $i (máximo $maxHorasExtras horas): ")
        var horasExtras = readLine()!!.toInt()

        // Validar que no se excedan las horas extras permitidas
        if (horasExtras > maxHorasExtras) {
            println("Error: El número máximo de horas extras es de $maxHorasExtras horas. Se asignarán $maxHorasExtras horas extras.")
            horasExtras = maxHorasExtras
        }

        // Calcular el sueldo
        val sueldoNormal = diasTrabajados * 8 * pagoPorHora
        val sueldoExtra = horasExtras * pagoPorHoraExtra
        val sueldoTotal = sueldoNormal + sueldoExtra

        // Mostrar el resultado
        println("Sueldo total del trabajador $i: $$sueldoTotal")
        println()
    }
}
