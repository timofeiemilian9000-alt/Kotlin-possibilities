/*

    A function is a block of code which only runs when it is called.

    You can pass data, known as parameters, into a function.    

    Functions are used to perform certain actions, and they are also known as methods.

 */
fun myFunction() {
    println( "Here it is the function that I created!" )
}

fun mySecondFunction( name : String, age : Int ) {
    println( "My name is $name and I'm $age years old!" )
}

fun myThirdFunction( x : Int ) : Int {
    return ( x + 5 )
}

fun myFourthFunction( x : Int, y : Int ) : Int {
    return ( x + y )
}

fun myFifthFunction( x : Int, y : Int ) = x + y

fun main() {
    myFunction()
    myFunction()
    myFunction()

    /*

        Function Parameters
            Information can be passed to functions as parameter.

            Parameters are specified after the function name, inside the parentheses. You can add as 
            many parameters as you want, just separate them with a comma. Just note that you must 
            specify the type of each parameter (Int, String, etc).

            The following example has a function that takes a String called fname as parameter. 
            When the function is called, we pass along a first name, which is used inside the 
            function to print the full name:

     */

    mySecondFunction( "Emilian", 29 ) // Emilian and 29 are arguments

    // Note: When working with multiple parameters, the function call must have the 
    // same number of arguments as there are parameters, and the arguments must be passed in the same order.

    /*

        Return Values
        In the examples above, we used functions to output a value. In the following example, 
        we will use a function to return a value and assign it to a variable.

    */

    var result = myThirdFunction( 3 )
    println( result )

    var newresult = myFourthFunction ( 10, 11 )
    println( newresult )

    /*
    
    Shorter Syntax for Return Values
    There is also a shorter syntax for returning values. 
    You can use the = operator instead of return without specifying the return type. 
    Kotlin is smart enough to automatically find out what it is:
    
    */

    val newestResult = myFifthFunction( 2, 12 )
    println( newestResult )

}