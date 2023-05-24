import enum.Season
import java.lang.Error
import java.lang.IllegalArgumentException
import java.lang.RuntimeException

fun main() {

    // If expression
    val firstAndLastName = firstAndLastNameOnly("Esmaralda Elise Stirling Ronald")
    println(firstAndLastNameOnly(firstAndLastName))

    // When expression
    val seasonMood = getSeasonActivity(Season.WINTER)
    println(seasonMood) // Printing to stdout

    // When expression to check type
    println(
        determiningTypeOfThrowable(
            Error("Nothing we can do it about it now")
        )
    )

    println(
        determiningTypeOfThrowable(
            RuntimeException("The fire extinguisher is on fire!")
        )
    )

    println(
        determiningTypeOfThrowable(
            Exception("We knew this could go wrong!")
        )
    )

}

fun firstAndLastNameOnly(fullName: String) : String {

    val allNames = fullName.trim(' ').split(' ')

    // Returning if result
    return if(allNames.size == 2) {
        allNames.joinToString(" ")
    } else if(allNames.size > 2) {
        "${allNames.first()} ${allNames.last()}"
    } else {
        throw IllegalArgumentException("Invalid Name")
    }

}

fun getSeasonActivity(season: Season) : String {

    return when(season) {
        Season.WINTER -> "Let's make a snowman!"
        Season.SPRING -> "Let's chase butterflies!"
        Season.SUMMER -> "Let's go the beach!"
        Season.AUTUMN -> "Let's collect some leaves!"
    }

}

fun determiningTypeOfThrowable(t: Throwable) : String {

    return when(t) {
        is Error -> "Error: ${t.message}"
        is RuntimeException -> "Runtime Exception: ${t.message}"
        is Exception -> "Checked Exception: ${t.message}"
        else -> "${t.javaClass.name}: ${t.message}"
    }

}