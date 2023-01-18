/*
Schreibe hier deine Antwort hin.
Hier werden nur die Brands von Stelle 2 und 3 bei der Konsole ausgegeben.
weil variable 'i' fängt in der Schleife ab stelle nummer 2 an.
 */

fun main() {
    val brands: List<String> = listOf("Samsung", "Apple", "PH", "Microsoft")
    for (i in 2..brands.size - 1) {
        println(brands[i])
    }
}