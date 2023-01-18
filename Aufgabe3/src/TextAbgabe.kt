/*
Schreibe hier deine Antwort hin.
Bei diesem Beispiel wird das For-Schleife mithilfe der if-Funktion geprüft, und gebt Einen von 2 verschiedene
Ergebnisse aus.
 */

fun main() {
    val weekDays: List<String> = listOf(
        "Montag", "Dienstag", "Mittwoch",
        "Donnerstag", "Freitag", "Samstag", "Sonntag"
    )
    for (day in weekDays) {
        if (day == "Samstag" || day == "Sonntag") {
            println("am $day hab ich frei.");
        } else {
            println("am $day muss ich arbeiten.");
        }
    }
}