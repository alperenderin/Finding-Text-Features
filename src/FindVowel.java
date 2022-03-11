/**
 * @File Name  : FindVowel.java
 * @Author	   : Alperen Derin
 * @Created    : 05.03.2020
 **/

public class FindVowel {
    static int vowel_count = 0;

    static void findVowels(char temp){
        switch(temp){
	        case 'A':
	        case 'E':
	        case 'I':
	        case 'İ':
	        case 'O':
	        case 'Ö':
	        case 'U':
	        case 'Ü':
	        case 'a':
	        case 'e':
	        case 'ı':
	        case 'i':
	        case 'o':
	        case 'ö':
	        case 'u':
	        case 'ü':
            vowel_count++;
            break;
        }
    }
}
