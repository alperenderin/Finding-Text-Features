/**
 * @File Name  : FileRead.java
 * @Author	   : Alperen Derin
 * @Created    : 05.03.2020
 **/

import java.io.*;

public class FileRead {
    public void readFile() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("icerik.txt"), "UTF-8"));
        String string;

        while ((string = br.readLine()) != null){
            String[] string_array = string.split(" ");

            FindMail.findMails(string_array);
            FindWebSite.findWebSites(string_array);
            FindSentence.findSentences(string_array);
            FindWord.findWords(string_array);

            for (String temp : string_array) {
                for(int b = 0; b< temp.length(); b++)
                    FindVowel.findVowels(temp.charAt(b));  // checking if each letter is a vowel or a consonant
            }
        }
    }
}
