package com.bcp.tlc.regex

import android.os.Bundle
import android.text.InputFilter
import android.text.Spanned
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        h()


        var pruebaFilter: InputFilter =
            InputFilter { source, start, end, dest, dstart, dend ->
                //if(source.toString().matches("[0-9a-zA-Z-_ñÑ]+")){
                if (source.toString().matches("[A-Za-z0-9_.@]+".toRegex())) {
                    source
                } else ""
            }

        edtExample.setFilters(
            arrayOf(
                pruebaFilter,
                InputFilter.AllCaps(),
                InputFilter.LengthFilter(200)
            )
        )



    }


    fun h(){
        btnH.setOnClickListener{
            d()
        }
    }



    fun d(){


        //val ext = Regex("^[^@]+@[^@]+\\.[a-zA-Z]{2,}$")

        val exp  = Regex("^([A-Za-zñÑáéíóúÁÉÍÓÚü]{1})([A-Za-z0-9ñÑáéíóúÁÉÍÓÚü]{2,19})$")

        if(edtExample.text.toString().matches(exp)){
            txtHola.text = "si"

        }else{
            txtHola.text = "noo"

        }




        var pruebaFilter: InputFilter =
            InputFilter { source, start, end, dest, dstart, dend ->
                //if(source.toString().matches("[0-9a-zA-Z-_ñÑ]+")){
                if (source.toString().matches("[A-Za-z0-9_.@]+".toRegex())) {
                    //if(source.toString().matches("^([A-Za-zñÑáéíóúÁÉÍÓÚü]{1})([A-Za-z0-9ñÑáéíóúÁÉÍÓÚü]{2,19})$")){
                    source
                } else ""
            }

        edtExample.setFilters(
            arrayOf(
                pruebaFilter,
                InputFilter.AllCaps(),
                InputFilter.LengthFilter(2)
            )
        )

    }






}

