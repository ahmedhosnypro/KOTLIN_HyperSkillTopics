import Country.Companion.isSameCurrency

fun main() {
    val (fstCountryInput, sndCountryInput) = readln().split(" ")

    try {
        val fstCountry = Country.valueOf(fstCountryInput)
        val sndCountry = Country.valueOf(sndCountryInput)
        println(isSameCurrency(fstCountry, sndCountry))
    } catch (e: IllegalArgumentException) {
        println(false)
    }
}

enum class Country(val currency: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar");

    companion object {
        fun isSameCurrency(fst: Country, snd: Country): Boolean = fst.currency == snd.currency
    }
}