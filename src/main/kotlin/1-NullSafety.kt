fun main() {

    println(function("String"))

    println(functionWithNullableParameter(null))

    println(functionWithNullableResult("string"))

    println(functionWithNullableParameterAndNullableResult(null))

}

fun function(string: String) : String {
    return string
}

fun functionWithNullableParameter(string: String?) : String {
    return string ?: "default value"
}

fun functionWithNullableResult(string: String) : String? {
    return null
}

fun functionWithNullableParameterAndNullableResult(string: String?) : String? {
    return string
}