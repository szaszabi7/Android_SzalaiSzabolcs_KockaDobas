package hu.petrik.kockadobas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var kocka1Image : ImageView
    lateinit var kocka2Image : ImageView
    lateinit var kocka1Button : Button
    lateinit var kocka2Button : Button
    lateinit var dobasButton : Button
    lateinit var resetButton : Button
    lateinit var eredmenyTextView : TextView
    lateinit var random : Random

    var kocka1 : Int = 0
    var kocka2 : Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init();
    }

    fun init() {
        kocka1Image = findViewById(R.id.kocka1)
        kocka2Image = findViewById(R.id.kocka2)
        kocka1Button = findViewById(R.id.kocka1Button)
        kocka2Button = findViewById(R.id.kocka2Button)
        dobasButton = findViewById(R.id.dobasButton)
        resetButton = findViewById(R.id.resetButton)
        eredmenyTextView = findViewById(R.id.eredmenyTextView)
        random = Random
        val kockak = arrayOf(
            R.drawable.kocka1,
            R.drawable.kocka2,
            R.drawable.kocka3,
            R.drawable.kocka4,
            R.drawable.kocka5,
            R.drawable.kocka6)
    }
}