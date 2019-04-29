package hr.ferit.brunozoric.taskie.ui.newtask

import android.content.Intent
import android.text.TextUtils.isEmpty
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Toast
import hr.ferit.brunozoric.taskie.R
import hr.ferit.brunozoric.taskie.common.displayToast
import hr.ferit.brunozoric.taskie.model.Priority
import hr.ferit.brunozoric.taskie.model.Task
import hr.ferit.brunozoric.taskie.persistence.Repository
import hr.ferit.brunozoric.taskie.ui.base.BaseActivity
import hr.ferit.brunozoric.taskie.ui.details.DetailsActivity
import kotlinx.android.synthetic.main.activity_new_task.*

class NewTaskActivity : BaseActivity() {

    companion object{
        const val TAG = "Task"
    }

    val repository = Repository

    override fun getLayoutResourceId(): Int = R.layout.activity_new_task

    override fun setUpUi() {

        prioritySelector.adapter = ArrayAdapter<Priority>(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            Priority.values()
        )
        prioritySelector.setSelection(0)

        saveTaskAction.setOnClickListener{ saveTask() }
    }

    private fun saveTask() {

        if (isInputEmpty()){
            displayToast(getString(R.string.emptyFields))
            return
        }

        val title = newTaskTitleInput.text.toString()
        val description = newTaskDescriptionInput.text.toString()
        val priority = prioritySelector.selectedItem as Priority

        val task = Task(title = title, description = description, priority = priority)
        val id = repository.save(task)

        clearUi();

        Log.d(TAG, id.toString())
        displayToast(task.title)

        navigateToDetails(id)
    }

    private fun isInputEmpty(): Boolean = isEmpty(newTaskTitleInput.text) || isEmpty(newTaskDescriptionInput.text)

    private fun clearUi() {
        newTaskTitleInput.text.clear()
        newTaskDescriptionInput.text.clear()
        prioritySelector.setSelection(0)
    }

    private fun navigateToDetails(id: Int) {
        val detailsIntent = Intent(this, DetailsActivity::class.java)
        detailsIntent.putExtra(DetailsActivity.EXTRA_TASK_ID, id)
        startActivity(detailsIntent)
    }
}
