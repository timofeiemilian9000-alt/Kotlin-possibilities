fun main() {
    // With the for loop, you can also create ranges of values with ".."
    for ( chars in 'a' .. 'z' ) {
        println( chars )
    } 

    for ( numbs in 0..10 ) {
        println( numbs )
    } // The first and last value is included in the range.

    // check if a value exists
    val brands = arrayOf("Logitech", "Intel", "Windows", "Apple", "Nvidia" ) 

    if ( "Intel" in brands ) {
        println( "Included!" )
    } else {
        println( "Not included!" )
    }

    // You can also use the break and continue keywords in a range/for loop:

    for ( nums in 1 .. 190 ) {
        if ( nums == 19 ) {
            break
        }
        println( nums ) // It breaks without printing the 19 as value
    }

    for ( n in 1 .. 10 ) {
        if ( n == 5 ) {
            continue // this will skip the number 5
        }
        println( n )
    }
}