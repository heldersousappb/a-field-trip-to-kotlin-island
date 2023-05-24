import java.lang.IllegalArgumentException

data class Customer(val name: String, val surname: String) {

    companion object {

        fun fromString(fullName: String) : Customer {

            val allNames = fullName.trim(' ').split(' ')

            // Returning if result
            return if(allNames.size == 2) {
                Customer(allNames[0], allNames[1])
            } else if(allNames.size > 2) {
                Customer(allNames.first(), allNames.last())
            } else {
                throw IllegalArgumentException("Invalid name!")
            }
        }

        fun fromPair(pair: Pair<String, String>) : Customer {
            return Customer(pair.first, pair.second)
        }

    }

    fun toPair() : Pair<String, String> {
        return Pair(this.name, this.surname)
    }

    override fun toString(): String {
        return "$name $surname"
    }

}

fun main() {

    val customerFromString = Customer.fromString("Esmaralda Elise Stirling Ronald")
    println(customerFromString)

    val customerFromPair = Customer.fromPair(Pair("Esmaralda", "Ronald"))
    println(customerFromPair)

}