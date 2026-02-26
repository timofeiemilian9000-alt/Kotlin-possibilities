fun main() {
    val cars = arrayOf( "Volvo", "Mercedes", "Ferrari", "Lamborghini", "Porche", "Koeningseg", "Bugatti", "Pagani", "Opel" )
    // to access "Ferrari"
    println( cars[2] )
    
    // to access "Bugatti"
    println( cars[6] )
    
    // to change an array element
    cars[2] = "Deleted" // Ferrari becomes deleted
    println( cars[2] )
    
    // to find how many elements are in the array
    println( cars.size ) // using size

    // check if an element exists
    if ( "Bugatti" in cars ) {
        println( "It exists" )
    } else {
        println( "It doesn't exist" )
    }

    // loop through an array
    for ( car in cars ) {
        println( car )
    } // all the cars

    cars[2] = "Ferrari"

    for ( car in cars ) {
        if ( car == "Ferrari" ) {
            println( " I want this one" )
        } else {
            println(car)
        }
    }
}