package empire.stark.firststep.extensions

import java.text.NumberFormat
import java.util.*

/**
 * Created by YENMINH on 12/21/2017 1:36 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 *
 */
class IntExtensions {

}

fun Int.Companion.groupThousandsToString(value: Int): String = NumberFormat.getIntegerInstance(Locale.GERMAN).format(value)

fun Int.Companion.toIp(value: Int): String {
    return "${(value and 0xFF)}.${((value shr 8) and 0xFF)}.${((value shr 16) and 0xFF)}.${((value shr 24) and 0xFF)}"
}

fun Int.Companion.getPrefixIp(value: Int): String {
    return "${(value and 0xFF)}.${((value shr 8) and 0xFF)}.${((value shr 16) and 0xFF)}"
}

fun Int.Companion.toHexColor(value: Int): String {
    return String.format("#%06X", (0xFFFFFF and value))
}