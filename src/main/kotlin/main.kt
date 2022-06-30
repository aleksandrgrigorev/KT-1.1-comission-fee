fun main () {
    val amount = 100_00
    val minimumAmount = 35_00
    val feePercent = 0.0075
    val fee = (amount * feePercent).toInt()

    if (amount >= minimumAmount) {
        println(fee)
    } else {
        println("Минимальный перевод - 35 руб.")
    }
}