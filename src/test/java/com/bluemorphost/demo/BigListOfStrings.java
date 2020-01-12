package com.bluemorphost.demo;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BigListOfStrings {

    public String[] populateArrayOfStrings(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {

            if (!line.equals("") && !String.valueOf(line.charAt(0)).equals("#")){
                lines.add(line);
            }
        }
        bufferedReader.close();
        return lines.toArray(new String[lines.size()]);
    }
}
