package net.genericapps.architecturecomponents

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {

    lateinit var tvCount: TextView
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCount = findViewById(R.id.tv_count)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        setText()

    }

    private fun setText() {
        tvCount.text = mainViewModel.count.toString()
    }

    fun increment(view: View) {

        mainViewModel.increment()
        setText()

    }


}