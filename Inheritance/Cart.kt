fun main() {
    val productType = readln()
    val price = readln().toInt()
    val product = Product.buildProduct(productType, price)
    println(Product.totalPrice(product))
}

open class Product(val price: Int) {
    open val productTax = 0.0

    companion object ProductUtils {
        fun buildProduct(type: String, price: Int): Product = when (type) {
            "headphones" -> Headphones(price)
            "smartphone" -> Smartphone(price)
            "tv" -> Tv(price)
            "laptop" -> Laptop(price)
            else -> error("Unknown product type")
        }

        fun totalPrice(product: Product) = product.price + (product.price * product.productTax).toInt()
    }
}

class Laptop(price: Int) : Product(price) {
    override val productTax = 0.19
}

class Tv(price: Int) : Product(price) {
    override val productTax = 0.17
}

class Smartphone(price: Int) : Product(price) {
    override val productTax = 0.15
}

class Headphones(price: Int) : Product(price) {
    override val productTax = 0.11
}
