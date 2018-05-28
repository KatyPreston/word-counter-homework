package com.example.user.wordcounter;

import java.util.ArrayList;

public class WordCounter {


    public int countWords(String text){
        String [] array = text.split(" ");
        return array.length;
    }



}
