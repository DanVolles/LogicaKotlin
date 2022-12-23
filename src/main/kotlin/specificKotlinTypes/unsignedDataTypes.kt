package specificKotlinTypes

fun main(args: Array<String>) {

    //UnsignedDataTypes

    println("UByte MIN: ${UByte.MIN_VALUE}, MAX: ${UByte.MAX_VALUE}")     // BYTE
    println("UShort MIN: ${UShort.MIN_VALUE}, MAX: ${UShort.MAX_VALUE}")  // SHORT
    println("UInt MIN: ${UInt.MIN_VALUE}, MAX: ${UInt.MAX_VALUE}")        // INT
    println("ULong MIN: ${ULong.MIN_VALUE}, MAX: ${ULong.MAX_VALUE}")     // LONG

    // Esse tipo de dados são necessariamente inteiros positivos.
    // O valor mínimo de dados necessariamente vai de zero até outro número maior do que o range "natural"
}