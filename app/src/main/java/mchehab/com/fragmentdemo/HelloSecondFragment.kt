package mchehab.com.fragmentdemo

import android.os.Bundle
import android.app.Fragment
import android.app.TimePickerDialog
import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText

class HelloSecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_hello_second, container, false)
        val editTextTime = view.findViewById<EditText>(R.id.editTextTime)
        setupEditTextTime(editTextTime)
        return view
    }

    private fun setupEditTextTime(editTextTime: EditText){
        editTextTime.inputType = InputType.TYPE_NULL
        editTextTime.setOnClickListener {
            TimePickerDialog(activity, TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                editTextTime.setText("$hourOfDay:$minute")
            }, 0, 0, true).show()
        }
    }


    companion object {
        fun newInstance(param1: String, param2: String): HelloFragment {
            return HelloFragment()
        }
    }
}
