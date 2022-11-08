package com.example.jk;

public class Switch {
    public static String letterCapitalize(String str){
        StringBuilder result = new StringBuilder();
        String[] toArray = str.split(" ");

        for(int i = 0; i < toArray.length; i++){
            char[] wordString = toArray[i].toCharArray();
            wordString[0] = Character.toUpperCase(wordString[0]);
            result.append(new String(wordString)).append(" ");
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println(letterCapitalize("i ran there"));
    }

}


