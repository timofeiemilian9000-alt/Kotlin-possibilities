/*

    In Kotlin, there's a faster way of doing this, by using a constructor.
        A constructor is like a special function, and it is defined by using two parantheses () after the class name. Y
        ou can specify the properties inside of the parantheses (like passing parameters into a regular function).
        The constructor will initialize the properties when you create an object of a class. 
        Just remember to specify the type of the property/variable:

*/


fun main() {

    class Smartphone( var brand : String, var model : String, var year : Int )
    
    val s1 = Smartphone( "iPhone", "14_PRO_MAX", 2022 )
    val s2 = Smartphone( "PixelPhone", "10A", 2026 )
    val s3 = Smartphone( "OPPO", "A6 Pro 5G", 2025 )

    println( "${s1.brand} ${s1.model} ${s1.year}" )
    println( "${s2.brand} ${s2.model} ${s2.year}" )
    println( "${s3.brand} ${s3.model} ${s3.year}" )
}