import enum.Hemisphere

fun main() {

    val myImmutableString = "My immutable string" // Same as "final String myImmutableString" in Java

    val myImmutableList = listOf("Apple", "Orange", "Strawberry", "Apple")

    val myImmutableSet = setOf("Apple", "Orange", "Strawberry")

    val myImmutableMap = mapOf(
        "Apple" to "Green",
        "Orange" to "Orange",
        "Strawberry" to "Red"
    )

    // And if by some reason we need a mutable version just create a mutable version
    val myMutableList = myImmutableList.toMutableList()

    val myMutableSet = myImmutableSet.toMutableSet()

    val myMutableMap = myImmutableMap.toMutableMap()


    // Also, we have human-readable default toString() for collections
    val englishSpeakingCountries = setOf(Country.UNITED_KINGDOM, Country.USA, Country.AUSTRALIA, Country.NEW_ZEALAND, Country.SOUTH_AFRICA)
    println("English speaking countries: $englishSpeakingCountries")


    val countriesByHemisphere = mapOf(
        Hemisphere.NORTHERN to setOf(Country.USA, Country.SPAIN, Country.JAPAN, Country.CANADA, Country.UNITED_KINGDOM, Country.INDIA, Country.PORTUGAL, Country.FRANCE),
        Hemisphere.SOUTHERN to setOf(Country.BRAZIL, Country.AUSTRALIA, Country.ARGENTINA, Country.SOUTH_AFRICA, Country.NEW_ZEALAND)
    )

    println("Countries by Hemisphere: $countriesByHemisphere")


}