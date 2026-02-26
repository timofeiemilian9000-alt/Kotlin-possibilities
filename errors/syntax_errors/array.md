arrays.kt:2:16: error: unresolved reference 'arrayOF'.
    val cars = arrayOF( "Volvo", "Mercedes", "Ferrari", "Lamborghini", "Porche", "Koeningseg", "Bugatti", "Pagani", "Opel" )
               ^^^^^^^
arrays.kt:24:18: error: method 'iterator()' is ambiguous for this expression. Applicable candidates:
fun <T> Enumeration<T>.iterator(): Iterator<T>
fun <T> Iterator<T>.iterator(): Iterator<T>
fun <K, V> Map<out K, V>.iterator(): Iterator<Map.Entry<K, V>>
fun <K, V> MutableMap<K, V>.iterator(): MutableIterator<MutableMap.MutableEntry<K, V>>
fun CharSequence.iterator(): CharIterator
fun BufferedInputStream.iterator(): ByteIterator
    for ( car in cars ) {
                 ^^^^
arrays.kt:28:18: error: method 'iterator()' is ambiguous for this expression. Applicable candidates:
fun <T> Enumeration<T>.iterator(): Iterator<T>
fun <T> Iterator<T>.iterator(): Iterator<T>
fun <K, V> Map<out K, V>.iterator(): Iterator<Map.Entry<K, V>>
fun <K, V> MutableMap<K, V>.iterator(): MutableIterator<MutableMap.MutableEntry<K, V>>
fun CharSequence.iterator(): CharIterator
fun BufferedInputStream.iterator(): ByteIterator
    for ( car in cars ) {
                 ^^^^

All this resolved just by correcting the OF in Of