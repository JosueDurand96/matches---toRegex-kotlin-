package com.bcp.tlc.regex;

import android.text.InputFilter;
import android.text.Spanned;

public class x {

    public static InputFilter pruebaFilter = new InputFilter() {
        @Override
        public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
            //if(source.toString().matches("[0-9a-zA-Z-_ñÑ]+")){
            if (source.toString().matches("[A-Za-z0-9_.@]+")) {
                //if(source.toString().matches("^([A-Za-zñÑáéíóúÁÉÍÓÚü]{1})([A-Za-z0-9ñÑáéíóúÁÉÍÓÚü]{2,19})$")){
                return source;
            }
            return "";
        }
    };


}
