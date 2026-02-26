fun main() {
    class Car {
        var brand = ""
        var model = ""
        var year = 0
        var color = ""
    }
    /*

        A property is basically a variable that belongs to the class.
        Good to Know: It is considered good practice to start the name of 
        a class with an upper case letter, for better organization.

    */

    // Create a c1 ( car one ) of the Car class
    val c1 = Car()

    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969
    c1.color = "Red"

    println( c1.brand )
    println( c1.model )
    println( c1.year )
    println( c1.color )

    val c2 = Car()

    c2.brand = "Ferrari"
    c2.model = "Roma"
    c2.year = 2019
    c2.color = "Grey"

    println( c2.brand )
    println( c2.model )
    println( c2.year )
    println( c2.color )
}