package hr.ferit.brunozoric.taskie.model

import hr.ferit.brunozoric.taskie.R

enum class Priority {
    LOW,
    MEDIUM,
    HIGH;

    companion object{
        fun getColourResourceId(priority: Priority): Int{
            return when(priority){
                Priority.LOW -> R.color.colorLow
                Priority.MEDIUM -> R.color.colorMedium
                Priority.HIGH -> R.color.colorHigh
            }
        }
    }
}

