package com.paymentsoundbox

class NotificationListener {

    fun onPaymentNotification(
        amount: String,
        sender: String,
        time: String
    ) {

        val message =
            "Payment received. $amount rupees from $sender at $time"

        println(message)
    }
}