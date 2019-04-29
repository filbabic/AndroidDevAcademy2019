package hr.ferit.brunozoric.taskie.ui.details

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import hr.ferit.brunozoric.taskie.R
import hr.ferit.brunozoric.taskie.common.displayToast
import hr.ferit.brunozoric.taskie.model.Priority
import hr.ferit.brunozoric.taskie.model.Task
import hr.ferit.brunozoric.taskie.persistence.Repository
import hr.ferit.brunozoric.taskie.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : BaseActivity() {

    private val repository = Repository

    companion object {
        const val EXTRA_TASK_ID = "EXTRA_TASK_ID"
        const val NO_TASK = -1
    }

    override fun getLayoutResourceId(): Int {
        return R.layout.activity_details
    }

    override fun setUpUi() {
        val id = intent.getIntExtra(EXTRA_TASK_ID, NO_TASK)
        tryDisplayTask(id)
    }

    private fun tryDisplayTask(id: Int) {
        try {
            val task = repository.get(id)
            displayTask(task)
        } catch (e: NoSuchElementException){
            displayToast(getString(R.string.noTaskFound))
        }
    }

    private fun displayTask(task: Task) {
        detailsTaskTitle.text = task.title
        detailsTaskDescription.text = task.description
        detailsPriorityView.setBackgroundResource(Priority.getColourResourceId(task.priority))
    }
}
