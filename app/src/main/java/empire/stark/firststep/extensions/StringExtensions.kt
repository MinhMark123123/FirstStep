package empire.stark.firststep.extensions

import java.text.Normalizer
import java.util.regex.Pattern


/**
 * Created by YEN_MINH on 1/29/2018.
 * Code and Life (o ^_^)o
 */
fun String.removeAccent(s: String): String {
    val temp = Normalizer.normalize(s, Normalizer.Form.NFD)
    val pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+")
    return pattern.matcher(temp).replaceAll("")
}
fun String.removeAccent():String{
    val temp = Normalizer.normalize(this, Normalizer.Form.NFD)
    val pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+")
    return pattern.matcher(temp).replaceAll("")
}