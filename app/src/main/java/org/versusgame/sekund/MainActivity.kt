package org.versusgame.sekund

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

lateinit var timer: CountDownTimer
var vaqt: Long = 55000
var pau: Long = 55000
var son=0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        time(vaqt)
    }

    fun time(aa: Long) {
        timer = object : CountDownTimer(vaqt, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                pau -= 1000
                sekund.text = pau.toString()
            }

            override fun onFinish() {
            }
        }
        timer.start()
    }

var m= "-marta"
    override fun onPause() {
        timer.cancel()
        vaqt = pau
        son++
        pus.text ="${son.toString() + m }"
        super.onPause()
    }

    override fun onResume() {
        timer.start()
        super.onResume()
    }

}