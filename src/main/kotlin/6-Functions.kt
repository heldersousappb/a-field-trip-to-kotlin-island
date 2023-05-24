fun main() {

    // Normal function invocation
    shortHandSumFunction(0, 1, 1, 2, 3, 5, 8, 13)

    // Invocation using named arguments
    shortHandSumFunction(h = 13, e = 3, b = 1, a = 0, c = 1, d = 2, f = 5, g = 8)

    // Extension functions allow you to add functions to existing types
    val phrase = "Today is a fine day!"
    println(phrase.caesarSays())

    // Using function with inner function to print fibonacci sequence
    printFibonacciSequenceUsingWithInnerFunction(9)

    // Function as parameter
    val stringAfterApplyingFunction = functionAsParameter("my text", String::reversed)
    println(stringAfterApplyingFunction)

}

fun shortHandSumFunction(a: Long, b: Long, c: Long, d: Long, e: Long, f: Long, g: Long, h: Long) : Long
    = a + b + c + d + e + f + g + h

fun String.caesarSays() : String {
    return "Caesar says: $this"
}

fun functionAsParameter(string: String, function: (input: String) -> String) : String {
    return function.invoke(string)
}

fun printFibonacciSequenceUsingWithInnerFunction(sequenceLength: Long) {

    fun innerFibonacciCalculator(number: Long) : Long {
        
        return if(number == 0L) {
            0
        } else if(number == 1L || number == 2L) {
            1
        } else {
            innerFibonacciCalculator(number - 1) + innerFibonacciCalculator(number - 2)
        }
        
    }
    
    for (i in 0..sequenceLength) {
        println(innerFibonacciCalculator(i))
    }

}