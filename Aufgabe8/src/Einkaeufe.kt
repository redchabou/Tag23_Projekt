fun main() {
    val shoppingList: MutableList<String> = mutableListOf(
        "Reis", "Tofu", "Brokkoli", "Nudeln", "Apfelsaft",
        "Zitronen", "Eis", "Erdbeeren", "Torte"
    )
    val listSize = shoppingList.size
    for (i in 0..listSize) {
        var lebensmiettel = shoppingList[i]
// printin("Der hebenswietter: Stabenswietter findet Sie am index ${shoppingList. index0f (hebanswiattar) }")
        println("${shoppingList.indexOf(lebensmiettel) + 1}.$lebensmiettel")
    }
}