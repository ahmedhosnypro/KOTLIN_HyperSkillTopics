class CustomerInfo(
    /** Unique user id */
    val uid: String,
    /** Operation system: Windows, Linux, macOS, iOS */
    val operationSystem: String,
    /** In GB */
    val ram: Int,
    /** In GHz */
    val coreSpeed: Double,
    val timeStamp: Long
) {

    override fun toString(): String = """
                Id: $uid; Operation System: $operationSystem; RAM: $ram; Core Speed: $coreSpeed; Timestamp: $timeStamp
        """.trimIndent()
}

fun sendCustomerInfoToServer(customer: CustomerInfo) {
    Server.send(customer.toString())
}