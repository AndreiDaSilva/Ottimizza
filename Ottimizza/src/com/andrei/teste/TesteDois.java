package com.andrei.teste;


public class TesteDois {

    public static String concatenaText(String[] text){
        StringBuilder textConcatena = new StringBuilder();

        for(int i = 0; i < text.length; i++){
            textConcatena.append(text[i]);
            textConcatena.append(" ");
        }

        String textConcatenado = textConcatena.toString();

        return textConcatenado;
    }

    public static void main(String[] args) {
        System.out.println(concatenaText(new String[]{"CARLOS","EDUARDO","DA", "COSTA","XAVIER"}));
    }
}
