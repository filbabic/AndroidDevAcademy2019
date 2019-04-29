package hr.ferit.brunozoric.taskie.persistence

import hr.ferit.brunozoric.taskie.model.Task

object Repository{

    private val tasks = mutableListOf<Task>()
    private var currentId = 0

    public fun save(task: Task): Int {
        val newTask = Task(currentId, task.title, task.description, task.priority)
        tasks.add(newTask)
        currentId++
        return newTask.id
    }

    fun deleteBy(id: Int){
        tasks.removeAll { (it.id) == id }
    }

    fun count(): Int = tasks.count()

    fun get(id: Int): Task {
        return tasks.first { it.id == id }
    }
}