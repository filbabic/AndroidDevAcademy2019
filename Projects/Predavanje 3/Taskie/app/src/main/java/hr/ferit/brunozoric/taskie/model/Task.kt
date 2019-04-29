package hr.ferit.brunozoric.taskie.model

data class Task (
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)