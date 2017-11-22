package mchehab.com.fragmentdemo

import android.app.AlertDialog
import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class HelloFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_hello, container, false)
        val editText = view.findViewById<EditText>(R.id.editText)
        val button = view.findViewById<Button>(R.id.button)

        button.setOnClickListener {
            AlertDialog.Builder(activity)
                    .setTitle("Button Clicked")
                    .setMessage(editText.text.toString())
                    .setPositiveButton("Dismiss", null)
                    .create()
                    .show()
        }

        return view
    }

    companion object {
        fun newInstance(param1: String, param2: String): HelloFragment {
            return HelloFragment()
        }
    }
}// Required empty public constructor
