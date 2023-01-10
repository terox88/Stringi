package com.kodilla.stringi;
import java.util.*;

public class Stringi {
    public static void main (String[] args) {


        List<String> list = new ArrayList<>();
        Random theGenerator = new Random();
        for(int i = 0; i < 10; i++) {
            String title = "";
            int randomLenght = theGenerator.nextInt(13) +1;
            for(int n = 0; n < randomLenght; n++) {

                char letter = (char)theGenerator.nextInt(96, 122);
                title += letter;
            }
            list.add(title);
        }
        for(String title : list) {
            System.out.println(title);
        }


    }
}
