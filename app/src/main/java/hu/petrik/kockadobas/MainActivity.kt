package hu.petrik.kockadobas

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
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
    lateinit var kockak : Array<Int>

    var kocka1 : Int = 0
    var kocka2 : Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init();

        kocka1Button.setOnClickListener(){
            kocka2Image.visibility = View.GONE
        }

        kocka2Button.setOnClickListener(){
            kocka2Image.visibility = View.VISIBLE
        }

        dobasButton.setOnClickListener(){
            dobas1()
        }

        resetButton.setOnClickListener(){
            reset()
        }
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
        kockak = arrayOf(
            R.drawable.kocka1,
            R.drawable.kocka2,
            R.drawable.kocka3,
            R.drawable.kocka4,
            R.drawable.kocka5,
            R.drawable.kocka6)
    }

    fun dobas1() {
        kocka1 = random.nextInt(6) + 1
        kocka1Image.setImageResource(kockak[kocka1 - 1])
        eredmenyTextView.append("$kocka1\n")
    }

    fun reset() {
        var resetAlert = AlertDialog.Builder(this)
            .setTitle("Reset")
            .setCancelable(false)
            .setMessage("Biztos, hogy törölni szeretné az eddigi dobásokat")
            .setPositiveButton("Igen", DialogInterface.OnClickListener {dialog, id ->
                eredmenyTextView.setText("")
                kocka1Image.setImageResource(R.drawable.kocka1)
                kocka2Image.setImageResource(R.drawable.kocka1)
            })
            .setNegativeButton("Nem", DialogInterface.OnClickListener { dialog, id ->

            }).show()
    }
}