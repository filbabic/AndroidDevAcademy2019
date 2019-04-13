class Bar(val receipts: List<Receipt>)

class Receipt(
    val id: String,
    val items: List<Item>
)

class Item(
    val price: Float,
    val name: String
)

val bar = Bar(
    listOf(
        Receipt(
            "kawldaw",
            listOf(
                Item(12f, "Beer"),
                Item(6f, "Coffee"),
                Item(100f, "Jack")
            )
        ),
        Receipt(
            "ldawldwap",
            listOf(
                Item(12f, "Beer"),
                Item(17f, "Grimbergen")
            )
        ),
        Receipt(
            "aw[ldawpo",
            listOf(
                Item(12f, "Beer"),
                Item(17f, "Grimbergen")
            )
        )
    )
)

fun main(args: Array<String>) {
    // izracunati total zaradu //map, flatMap, sum

    println("Ukupna zarada: ${
    bar.receipts
        .flatMap { it.items }
        .sumByDouble { it.price.toDouble() }
    }")

    // grupirati proizvode po tipu [proizvod -> brojProdaja] //pair/mapa

    println(bar.receipts
        .flatMap { it.items }
        .groupBy { it.name }
        .mapValues { it.value.count() }
    )

    // koliko proizvoda koji kostaju vise od 15f se prodalo

    println(bar.receipts
        .flatMap { it.items }
        .count { it.price > 15f }
//        .filter { it.price > 15f }
//        .map { it.name }
//        .size
    )
}