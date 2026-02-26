fun main() {
    val day = 7

    val result = when ( day ) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednsday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Error"
    }

    println(result)
}
// The when expression is similar to the switch statement in Java.