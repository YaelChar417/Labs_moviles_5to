
fun main() {
    // Importante:
    // val -> declara constantes, inmutables, const, no puede ser re-asignadas
    // var -> declara variables, mutables, que pueden ser re-asignadas
    
    // ------------------VARIABLES NUMERICAS------------------------------------------
    // Variable entera -> -2,147,483,647 a 2,147,483,647
    var numInt: Int = 1
    //Variable entera long -> -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807.
    var numLong: Long = 23740564
    // Variable flotante -> hasta 6 decimales
    var numFloat: Float = 1.93f
    // Variable flotante double -> hasta 14 decimales + memoria
    var numDouble: Double = 7.478492375
    
    println("Variables numericas")
    println("Numero entero: " + numInt)
    println("Numero entero largo: " + numLong)
    println("Numero flotante: " + numFloat)
    println("Numero flotante double: "+ numDouble + "\n")
    
    // ------------------VARIABLES ALFANUMERICAS------------------------------------------
    // Variable char -> entre comillas simples ''
    var varChar: Char = 'y'
    // Variable string -> con comillas dobles ""
    var varString: String = "Test. 12345!·$%&/"
    
    
    println("Variables alfanumericas")
    println("Variable char: " + varChar)
    println("Variable string: " + varString + "\n")
    
    // ------------------VARIABLES BOOLEANAS------------------------------------------
	var varBool1: Boolean = false
    var varBool2: Boolean = true
    
    println("Variables booleanas")
    println("Variable bool false: " + varBool1)
    println("Variable bool true: " + varBool2 + "\n")

    //------------------------------- Operaciones básicas --------------------------------
    var a : Int = 8
    var b : Int = 3

    print("Suma: ")
    println(a + b)

    print("Resta: ")
    println(a - b)

    print("Multiplicación: ")
    println(a * b)

    print("División: ")
    println(a / b)

    print("El módulo (resto): ")
    println(a % b)
    // -------------- FLOAT e INT -----------------------------
    /* Funciona porque se asigna a una variable que Kotlin entiende como flotante
     * sin embargo si la forzaramos a que fuera entera, marcaría error, por ello 
     * podríamos usar la función toInt(), que trunca decimales.
     * O del mismo modo pasar la variable entera a flotante con la funcion toFloat()
     */
    var intVar : Int = 3
    var floatVar : Float = 8.5f
    
    println("\nFloat e int")
    print("Suma: ")
    var resultado : Int = floatVar.toInt() + intVar

   print(resultado)
   println("\nVar flotante con .toInt(): " + floatVar.toInt())
   println("Var entera con .toFloat(): " + intVar.toFloat())

	// ------------------- CONCATENACION -----------------------------------
    // Sintaxis de Java
    val greetings = "Hola, me llamo";
    val name = "Yael";
    println("Sintaxis de Java:");
    println(greetings + " " + name + "\n");
    
    // Sintaxis mas reciente
    /* Se pueden utilizar metodos de funciones desde la misma concatenacion
     * sintax: "$var_name"
     * Para utilizar metodos, operaciones o funciones se debe utilizar {}
     * sintaxis: ${var_name.toDouble()}, ${num1 / num2}
     */
    val saludo = "Hola me llamo";
    val nombre = "Yael";
    println("Sintaxis actual:");
    println("$saludo $nombre");
    
    // Ejemplo de concatenacion más reciente
    val introduction = "El resultado de";
    val plus = "más";
    val firstNumber : Int = 2;
    val secondNumber : Float = 5.0f;
    
    println("\nEjemplo de concatenacion más reciente")
    println("$introduction $firstNumber $plus ${secondNumber.toInt()} es: ${firstNumber + secondNumber.toInt()}")
}