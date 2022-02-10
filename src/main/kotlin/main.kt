fun main() {
    val masterCard = "MasterCard"
    val maestro = "Maestro"
    val mir = "Мир"
    val visaCard = "Visa"
    val vkPay = "Vk pay"

    val amount = 2_000_000
    val recentPayments = 8_000_000

    println("Комиссия равна: " + result(mir, amount, recentPayments))
    println("Комиссия равна: " + result(masterCard, amount, recentPayments))
    println("Комиссия равна: " + result(vkPay, amount, recentPayments))
}


fun result(cardType: String, amount: Int = 0, recentPayments: Int = 0):Int {
    when (cardType) {
        "MasterCard" ->return masterCardMaestro(amount, recentPayments)
        "Maestro" ->return masterCardMaestro(amount, recentPayments)
        "Mir" -> return visaMir(amount)
        "Visa" -> return visaMir(amount)
        "VkPay" -> return vkPay()
    }
    return 0
}

fun visaMir(amount: Int): Int {
    val commissionInPercent = amount / 100 * 0.75
    val commissionСalculation = if (commissionInPercent < 3_500) amount - 3_500 else amount - commissionInPercent
    return amount - commissionСalculation.toInt()
}

fun masterCardMaestro(amount: Int, recentPayments: Int):Int {
    return if (amount + recentPayments < 7_500_000) {
        0
    } else {
        ((amount / 100) * 0.6 + 20).toInt()
    }
}

fun vkPay():Int{
    return 0
}