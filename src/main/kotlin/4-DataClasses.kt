// Person data class definition
data class Person(val name: String, val surname: String)

fun main() {

    // Creating John Doe
    // There's no need to use "new" keyword to invoke the constructor method
    val johnDoe = Person("John", "Doe")

    // Data classes properties have setters (only if they're mutable) and getters
    // String concatenation is an easy task thanks to Kotlin's string templating features
    println("He comes from a land I don't know, his name is ${johnDoe.name} and his surname ${johnDoe.surname}!")

    // Data classes have a copy() method that allows the copy of an existing object while changing some of the new instance's attributes
    val johnDoeDaughter = johnDoe.copy(
        name = "Jane"
    )

    // Data classes have a default equals() method that checks two objects for equality
    // == comparison operator calls object's underlying equals method
    println(johnDoe == johnDoe)
    println(johnDoe == johnDoeDaughter)

    // Data classes have a default toString() method that print all properties
    println(johnDoeDaughter.toString())

}