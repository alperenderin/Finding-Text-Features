/**
 * @File Name  : FindWord.java
 * @Author	   : Alperen Derin
 * @Created    : 05.03.2020
 **/

public class FindWord {
    static int total_word_count = 0;

    static void findWords(String[] temp){
        for(int index = 0; index< temp.length; index++){
            if (temp[index].length()!=1)
            total_word_count++;
        }
    }
}
