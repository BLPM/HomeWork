package com.example.lab7x2xkot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.annotation.SuppressLint
import android.os.AsyncTask
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    private var ed_height: EditText? =  null
    private var ed_weight: EditText? =   null
    private var btn_boy: RadioButton? =  null
    private var tv_weight: TextView? =   null
    private var tv_bmi: TextView? =  null
    private var tv_progress: TextView? =   null
    private var ll_progress: LinearLayout? =  null
    private var progressBar2: ProgressBar? =  null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ed_height =  findViewById(R.id.ed_height)
        ed_weight =  findViewById(R.id.ed_weight)
         btn_boy = findViewById(R.id.btn_boy)
         tv_weight=  findViewById(R.id.tv_weight)
         tv_bmi=  findViewById(R.id.tv_bmi)
        tv_progress =  findViewById(R.id.tv_progress)
        ll_progress= findViewById(R.id.ll_progress)
        progressBar2 = findViewById(R.id.progressBar2)

        findViewById<Button>(R.id.btn_calculate).setOnClickListener(View.OnClickListener {
            if (ed_height!!.length() < 1)
                Toast.makeText(this, "請輸入身高", Toast.LENGTH_SHORT).show()
            else if (ed_height!!.length() < 1)
                Toast.makeText(this, "請輸入身高", Toast.LENGTH_SHORT).show()
            else

                runAsyncTask()
        })

    }


    @SuppressLint("StaticFieldLeak")
    private fun runAsyncTask() {
        object : AsyncTask<Void, Int, Boolean>() {
            override fun onPreExecute() {
                super.onPreExecute()
                tv_weight!!.text = "標準體重\n無"
                tv_bmi!!.text = "標準體重\n無"
                progressBar2!!.progress = 0
                tv_progress!!.text = "0%"
                ll_progress!!.visibility = View.VISIBLE

            }

            override fun doInBackground(vararg voids: Void): Boolean? {

                var progress = 0
                while (progress <= 100) {
                    try {
                        Thread.sleep(50)
                        publishProgress(progress)
                        progress++
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }

                }
                return true
            }

            override fun onProgressUpdate(vararg values: Int?) {
                super.onProgressUpdate(*values)
                if(values[0]!=null) {
                    progressBar2?.setProgress(values[0] as Int)
                    tv_progress?.text = String.format("%d %%", values[0])
                }

            }

            override fun onPostExecute(aBoolean: Boolean?) {
                super.onPostExecute(aBoolean)
                ll_progress!!.visibility = View.GONE
                val h = Integer.valueOf(ed_height!!.text.toString())
                val w = Integer.valueOf(ed_weight!!.text.toString())
                val standWeight: Double
                val bodyFat: Double
                if (btn_boy!!.isChecked) {
                    standWeight = (h - 80) * 0.7
                    bodyFat = (w - 0.88 * standWeight) / w * 100
                } else {
                    standWeight = (h - 70) * 0.6
                    bodyFat = (w - 0.82 * standWeight) / w * 100
                }
                tv_weight!!.text = String.format("標準體重 \n %.2f", standWeight)
                tv_bmi!!.text = String.format("體脂肪 \n%.2f", bodyFat)
            }

        }.execute()
    }




}

