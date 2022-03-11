/**
 * @File Name  : FindSentences.java
 * @Author	   : Alperen Derin
 * @Created    : 05.03.2020
 **/

public class FindSentence {
    static int total_sentence_count = 0;

    static void findSentences(String[] temp){
        for(int index = 0; index< temp.length; index++){
            if( temp[index].endsWith(".") || temp[index].endsWith("?") || temp[index].endsWith("!")){
            	total_sentence_count++;
            }
        }
    }
}
