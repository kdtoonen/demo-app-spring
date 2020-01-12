package com.bluemorphost.demo;

import org.junit.Test;

import java.io.IOException;

public class TestBigLIstOfStrings {
    @Test
    public void testFileArrayProvider() throws IOException {
        BigListOfStrings bigListOfStrings = new BigListOfStrings();
        String[] lines = bigListOfStrings
                .populateArrayOfStrings("c://dev-projects/java/big-list-of-naughty-strings/blns.txt");
        for (String line : lines) {
                 System.out.println(line);
        }
    }
}
