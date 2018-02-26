package empire.stark.firststep.extensions

import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*

/**
 * Created by YEN_MINH on 1/16/2018.
 * Code and Life (o ^_^)o
 */
fun Float.Companion.groupThousandsToString(value: Float, automaticDecimal: Boolean = true): String {
    if (automaticDecimal) {
        return if (value % 1 != 0f) {
            val formatter = NumberFormat.getInstance(Locale.GERMAN) as DecimalFormat
            val symbols = formatter.decimalFormatSymbols
            symbols.groupingSeparator = '.'
            formatter.decimalFormatSymbols = symbols
            formatter.format(value)
        } else {
            Int.groupThousandsToString(value.toInt())
        }
    } else {
        val formatter = NumberFormat.getInstance(Locale.GERMAN) as DecimalFormat
        val symbols = formatter.decimalFormatSymbols
        symbols.groupingSeparator = '.'
        formatter.decimalFormatSymbols = symbols
        return formatter.format(value)
    }
}