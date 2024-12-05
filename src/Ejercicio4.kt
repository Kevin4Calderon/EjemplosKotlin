//4.Validar la entrada a una aplicación mediante una clave: tesji123 si es correcta puedes ingresar si no que me diga que no puedo ingresar que verifique los datos.
fun main() {
    // Clave correcta
    val claveCorrecta = "tesji123"

    // Solicitar al usuario que ingrese la clave
    print("Introduce la clave para acceder a la aplicación: ")
    val claveIngresada = readLine()

    // Validar la clave
    if (claveIngresada == claveCorrecta) {
        println("¡Acceso permitido! Bienvenido a la aplicación.")
    } else {
        println("Clave incorrecta. Acceso denegado.")
    }
}
