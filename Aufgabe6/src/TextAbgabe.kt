/*
Schreibe hier deine Antwort hin.
Hier jedes Mal das 'i' ein andere ausgabe gibt, abhängig von welchem index der nehmt.
mithilfe der if-Fonktion. aber was ich interessant finde, dass die Reihenfolge des Elementes werden
genau nach der Reihenfolge der Liste im Konsole ausgedruckt.
 */

fun main() {
    val guests = listOf<String>("Paul", "Keanu", "Michael", "Hans", "Lukas", "Marko")
    for (i in 0..guests.size - 1) {
        if (guests[i] == "Lukas") {
            println("Hey Lukas kommt!")
        }
        if (guests[i] == "Keanu") {
            println("Oh cool, Keanu is auch dabei!")
        }
        if (guests[i] == "Michael") {
            println("Wie es Michael wohl geht?")
        }
    }
}