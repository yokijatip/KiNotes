package eastbound.yokijatiperkasa.kinotes.utils

import eastbound.yokijatiperkasa.kinotes.R
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.Random

object CommonUtils {

    fun getCurrentDate(): String {
        val dateFormat = SimpleDateFormat("dd MMMM yyyy", Locale.getDefault())
        val date = Date()

        return dateFormat.format(date)
    }

    fun randomColor(): Int {
        val colorList = listOf(
            R.color.pastel_blue,
            R.color.pastel_green,
            R.color.pastel_blue,
            R.color.pastel_brown,
            R.color.pastel_tosca,
            R.color.pastel_purple,
            R.color.pastel_peach,
            R.color.pastel_red,
            R.color.pastel_pink,
            R.color.pastel_soft_green,
            R.color.pastel_dark_tosca
        )

        val randomIndex = Random().nextInt(colorList.size)
        return colorList[randomIndex]
    }



}