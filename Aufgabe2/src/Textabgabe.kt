/*
Schreibe hier deine Antwort hin.
i fängt von Stelle '0' ein und gebt der Wert des Element ein. und dan nehmt Stelle 1..2.. usw.
am Ende print die println() Funktion die außerhalb das For Block steht.

 */
fun main() {
    val books: List<String> = listOf("Harry Potter", "Herr der Ringe", "Dune", "Eragon")
    for(i in 0..books.size-1) {
        val book = books[i]
        println("Das Buch an der Stelle $i ist $book.")
    }
    println("Das waren alle Buecher")
}