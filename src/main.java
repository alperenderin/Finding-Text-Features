/**
 * @File Name  : Main.java
 * @Description: The program that reads text from a file and finds the numbers of sentences, emails, vowels, words and websites in the text.
 * @Author	   : Alperen Derin
 * @Created    : 05.03.2020
 **/

public class main {
    public static void main(String[] args)throws Exception{
        FileRead file = new FileRead();
        file.readFile();

        System.out.println("Metnin Icerisindeki Sesli Harf Sayisi: " + FindVowel.vowel_count);
        System.out.println("Metnin Icerisindeki Kelime Sayisi    : " + FindWord.total_word_count);
        System.out.println("Metnin Icerisindeki Cumle Sayisi     : " + FindSentence.total_sentence_count);
        System.out.println("Metnin Icerisindeki Mail Sayisi      : " + FindMail.total_main_count);
        System.out.println("Metnin Icerisindeki Web Sitesi Sayisi: " + FindWebSite.total_website_count);
    }
}
