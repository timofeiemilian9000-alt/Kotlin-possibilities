fun main() {
    
    var h = 0
    // when the while reaches 25 the while loop breaks
    // The break statement is used to jump out of a loop
    while ( h < 51 ) {
        
        println(h)
        h++

        if ( h == 25 ) {
            break
        }
    }

    var g = 0
    // The continue statement breaks one 
    // iteration (in the loop), if a specified condition occurs, 
    // and continues with the next iteration in the loop
    while ( g < 51 ) {
        
        if ( g == 25 ) {

            g++
            println( "\n there you are \n " )
            // instead of printing 25 it prints "there you are"
            continue
            
        }

        println( g ) 
        g++
    }
}