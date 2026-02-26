class Car( var brand : String, var model : String, var yar : Int ) {
    fun drive( ) {
        println( "Wroom!" )
    }

    fun speed( maxSpeed : Int ) {
        println( "Max speed is: $maxSpeed" )
    }
}

// Superclass
open class MyParentClass( ) {
    var x = 6
}

// Subclass
class MyChildClass : MyParentClass( ) {
    fun myFunction( ) {
        println( x ) // x is now inherited from the superclass
    } 
}

/*

    Tip: When a function is declared inside a class, it is known as a class function, or member function.
    Note: When an object of the class is created, it has access to all of the class functions.

*/

fun main( ) {
    val c1 = Car( "Ford", "Mustang", 1969 )

    c1.drive( )
    c1.speed( 200 )

    // Create an object of MyChildClass and call myFunction
    val myObj = MyChildClass( )
    myObj.myFunction( )

    /* 

Example Explained
    Use the open keyword in front of the superclass/parent, t
    o make this the class other classes should inherit properties and functions from.
    To inherit from a class, specify the name of the subclass, followed by a colon :, and 
    then the name of the superclass.
    Why And When To Use "Inheritance"?
    - It is useful for code reusability: reuse properties and functions of an existing 
    class when you create a new class.
    */
}