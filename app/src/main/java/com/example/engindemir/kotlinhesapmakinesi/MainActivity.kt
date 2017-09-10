package com.example.engindemir.kotlinhesapmakinesi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

   fun Islemler(view:View){

       val num1:Double?
       val num2:Double?
       var result:Double?=null

       num1=java.lang.Double.parseDouble(sayi1.text.toString())
       num2=java.lang.Double.parseDouble(sayi2.text.toString())

       if(view.id == R.id.add)

           result = num1 + num2

       if(view.id == R.id.sub)

           result = num1 - num2

       if(view.id == R.id.mult)

           result = num1 * num2

       if(view.id == R.id.div)

           result = num1 / num2


       sonuc.text=result!!.toString()+""



   }
}
