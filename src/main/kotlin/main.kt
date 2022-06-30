fun main () {
    val amount = 100_00
    val minimumAmount = 35_00
    val feePercent = 0.0075
    val fee = if (amount >= minimumAmount) (amount * feePercent).toInt() else "Минимальный перевод - 35 руб."

    print(fee)
}