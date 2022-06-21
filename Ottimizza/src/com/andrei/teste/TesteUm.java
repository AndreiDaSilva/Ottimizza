package com.andrei.teste;
import java.util.zip.DataFormatException;
public class TesteUm {
    public static String converterData(String date) throws DataFormatException {
        try {
            if (date.contains("/")) {
                String[] dataDividida = date.split("/");
                return dataDividida[2] + " " + dataDividida[1];
            } else if (date.contains(" ")) {
                String[] dataDividida = date.split(" ");
                if (dataDividida[0].length() == 4) {
                    return dataDividida[0] + " " + dataDividida[1];
                } else {
                    return dataDividida[2] + " " + dataDividida[1];
                }
            } else {
                String mes = date.substring(2, 4);
                String ano = date.substring(4, 8);
                return ano + " " + mes;
            } 
        } catch (Exception e) {
            throw new DataFormatException("Formato de data invalido. Exemplo de data valido: 01/05/2022 ou 01 05 2022 ou 2022 05 01 ou 01052022");
        }
    }
    public static void main(String[] args) throws DataFormatException {
        System.out.println(converterData("01/05/2022"));
        System.out.println(converterData("01 05 2022"));
        System.out.println(converterData("2022 05 01"));
        System.out.println(converterData("01052022"));
    }
}
