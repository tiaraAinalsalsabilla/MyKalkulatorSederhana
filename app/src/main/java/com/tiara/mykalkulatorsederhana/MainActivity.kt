package com.tiara.mykalkulatorsederhana

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tambah.setOnClickListener {

            if (valid()) // jadi ini maksudnya kalau dia true dia akan mengitung dengan bantuan metod calculate
                calculate("+")
            else TampilkanAlert()
        }

        kurang.setOnClickListener {

            if (valid()) // jadi ini maksudnya kalau dia true dia akan mengitung dengan bantuan metod calculate
                calculate("-")
            else TampilkanAlert()
        }

        kali.setOnClickListener {

            if (valid()) // jadi ini maksudnya kalau dia true dia akan mengitung dengan bantuan metod calculate
                calculate("x")
            else TampilkanAlert()
        }

        bagi.setOnClickListener {

            if (valid()) // jadi ini maksudnya kalau dia true dia akan mengitung dengan bantuan metod calculate
                calculate(":")
            else TampilkanAlert()
        }
    }

    private fun calculate(s :String) {
        val inputOne = angka_pertama.text.toString().toDouble()
        val inputTwo = angka_kedua.text.toString().toDouble()

        when(s){
            "+" -> hasil.text = (inputOne + inputTwo).toString()
            "-" -> hasil.text = (inputOne - inputTwo).toString()
            "x" -> hasil.text = (inputOne * inputTwo).toString()
            ":" -> hasil.text = (inputOne / inputTwo).toString()

        }
    }

    private fun TampilkanAlert() {
        val alert = AlertDialog.Builder(this)
        alert.setTitle("hello")
        alert.setPositiveButton("yes", { _, _ ->

        })
        alert.setNegativeButton("No", { _, _ ->

        })
        alert.setNeutralButton("cancel", { _, _ ->

        })
        alert.show()
    }

    private fun valid(): Boolean {
        if (angka_pertama.text.toString()!= "" || angka_kedua.text.toString()!= ""){
            return true
        } else{
            return false
        }
    }
}
