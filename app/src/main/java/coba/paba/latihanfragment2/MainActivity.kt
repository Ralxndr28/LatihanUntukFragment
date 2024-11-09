package coba.paba.latihanfragment2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentHal : Fragment() {
    private var number: Int = 0 // Initialize the number

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.activity_main, container, false)

        val numberTextView: TextView = view.findViewById(R.id.fragmentContainer)
        val buttonHal1: Button = view.findViewById(R.id.buttonFragment1)
        val buttonHal2: Button = view.findViewById(R.id.buttonFragment2)
        val buttonHal3: Button = view.findViewById(R.id.buttonFragment3)

        // Set up button click listeners
        buttonHal1.setOnClickListener {
            numberTextView.text = number.toString()
        }

        buttonHal2.setOnClickListener {
            number -= 2
            numberTextView.text = number.toString()
        }

        buttonHal3.setOnClickListener {
            number -= 3
            numberTextView.text = number.toString()
        }

        return view
    }
}
