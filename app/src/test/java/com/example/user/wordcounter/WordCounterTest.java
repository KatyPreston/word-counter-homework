package com.example.user.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WordCounterTest {
    WordCounter wordCounter;

    @Before
    public void before(){
        wordCounter = new WordCounter();
    }

    @Test
    public void canCountWord(){
    assertEquals(4, wordCounter.countWords("this is a test"));
    }

}
