package com.example.lab7

import androidx.appcompat.app.AppCompatActivity

import android.os.AsyncTask
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var rabprogress = 0
    private var turprogress = 0
    private var seekBar1: SeekBar? = null
    private var seekBar2: SeekBar? = null
    private var btn_start: Button? = null


    private val mHandler = Handler(Handler.Callback { msg ->
        when (msg.what) {
            1 -> seekBar1!!.progress = rabprogress
        }
        if (rabprogress >= 100 && turprogress < 100) {
            Toast.makeText(this@MainActivity, "rabbit Win", Toast.LENGTH_SHORT).show()
            btn_start!!.isEnabled = true
        }
        false
    })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        seekBar1 = findViewById(R.id.seekBar)
        seekBar2 = findViewById(R.id.seekBar2)
        btn_start = findViewById(R.id.button)
        btn_start!!.setOnClickListener {
            btn_start!!.isEnabled = false
            rabprogress = 0
            turprogress = 0
            seekBar1!!.progress = 0
            seekBar2!!.progress = 0
            runThread()
            runAsyncRask()
        }
    }

    private fun runThread() {
        Thread(Runnable {
            while (rabprogress <= 100 && turprogress <= 100) {
                try {
                    Thread.sleep(100)
                    rabprogress += (Math.random() * 3).toInt()
                    val msg = Message()
                    msg.what = 1
                    mHandler.sendMessage(msg)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }

            }
        }).start()
    }

    private fun runAsyncRask() {
        object : AsyncTask<Void, Int, Boolean>() {
            override fun doInBackground(vararg voids: Void): Boolean? {
                while (turprogress <= 100 && rabprogress < 100) {
                    try {
                        Thread.sleep(100)
                        turprogress += (Math.random() * 3).toInt()
                        publishProgress(turprogress)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }

                }
                return true
            }


            protected override fun onProgressUpdate(vararg values: Int?) {
                super.onProgressUpdate(*values)
                seekBar2!!.progress = values[0] as Int
            }

            protected fun onPostExcute(aBoolean: Boolean?) {
                super.onPostExecute(aBoolean)
                if (turprogress >= 100 && rabprogress < 100) {
                    Toast.makeText(this@MainActivity, "turtle Win", Toast.LENGTH_SHORT).show()
                    btn_start!!.isEnabled = true
                }
            }

        }.execute()
    }
}
