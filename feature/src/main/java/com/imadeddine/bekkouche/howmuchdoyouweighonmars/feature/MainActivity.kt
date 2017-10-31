package com.imadeddine.bekkouche.howmuchdoyouweighonmars.feature

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText.text
        val samta= editText.text.toString()
        editText.addTextChangedListener(TextChangeListener(textView3,samta))

    }
}
class TextChangeListener(private var textView:TextView, private var samta:String):TextWatcher{

    override fun afterTextChanged(s: Editable?) {
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        if (s.toString() != samta)
        textView.text= (s.toString().toInt()*0.38).toString()
        else textView.text=""
    }

}