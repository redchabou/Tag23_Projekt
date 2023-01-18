/*
Schreibe hier deine Antwort hin.
Hier wird mithilfe der For-Schleife das Element "Banane" gesucht.
und aus gedruckt falls der in die Liste steht. sonst gebt Erdbeere aus.
ich habe diese Letzte geändert zu "nicht gefunden" um ich das Beispiel besser zu verstehen kann.
 */
fun main() {
    val fruechteListe: MutableList<String> = mutableListOf("Zitrone", "Banane", "Ananas", "Trauben")
    var lieblingsFrucht: String = "nicht gefunden"

    for (i in 3 downTo 0) {
        if (fruechteListe[i] == "Lemon") {
            lieblingsFrucht = "Banane"
        }
    }
    println(lieblingsFrucht)
}