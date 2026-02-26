fun main() {
    val time = 22
    
    if ( time < 10 ) {
        println("Good morning!")
    } else if ( time < 20 ) {
        println("Good day!")
    } else {
        println("Good evening!")
    }

    /*

    In Kotlin, you can also use if..else statements as expressions (assign a value to a variable and return it):

        Example
        val time = 20
        val greeting = if (time < 18) {
        "Good day."
        } else {
        "Good evening."
        }
        println(greeting)

    Note: You can ommit the curly braces {} when if has only one statement:

        Example
        fun main() {
        val time = 20
        val greeting = if (time < 18) "Good day." else "Good evening."
        println(greeting)
        }

     */
}