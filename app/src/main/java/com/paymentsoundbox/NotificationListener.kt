package com.paymentsoundbox

class NotificationListener {

    fun processNotification(text: String) {

        val amountRegex = Regex("₹\\d+")
        val amount = amountRegex.find(text)?.value ?: "Unknown amount"

        val senderRegex = Regex("from\\s+([A-Za-z ]+)")
        val sender =
            senderRegex.find(text)?.groupValues?.get(1)
                ?: "Unknown sender"

        val message =
            "Payment received $amount from $sender"

        println(message)
    }
}