fun main() {

    val citizens = listOf(
        Citizen("Riley", "Jennings", Country.UNITED_KINGDOM),
        Citizen("Scott", "Hill", Country.NEW_ZEALAND),
        Citizen("Melissa", "Baldwin", Country.AUSTRALIA),
        Citizen("Archie", "Cross", Country.AUSTRALIA),
        Citizen("Adam", "Martin", Country.USA),
        Citizen("Leon", "Macdonald", Country.SOUTH_AFRICA),
        Citizen("Harriet", "Pratt", Country.UNITED_KINGDOM),
        Citizen("Ellies", "Richards", Country.UNITED_KINGDOM),
        Citizen("Louie", "Smart", Country.USA),
        Citizen("Peter", "Martin", Country.USA),
        Citizen("Theresa", "Martin", Country.AUSTRALIA)
    )

    // Counting UK citizens
    citizens.count { it.country == Country.UNITED_KINGDOM }

    // Filtering citizens with australian citizenship
    citizens.filter { it.country == Country.AUSTRALIA }

    // Grouping citizens by citizenship
    citizens.groupBy { it.country }
    // or
    citizens.groupBy(Citizen::getCountry)


    // Greeting citizens
    citizens.map { c ->
        "Welcome to Kotlin island ${c.name} ${c.surname}"
    }.forEach(System.out::println)

    // or
    citizens.forEach { c ->
        println("Welcome to Kotlin island ${c.name} ${c.surname}")
    }


    // Converting to format "[SURNAME, NAME]"
    val convertedToFormat = citizens.map { "(${it.surname}, ${it.name})" }.map(String::uppercase)
    println(convertedToFormat)
}