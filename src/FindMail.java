/**
 * @File Name  : FindMail.java
 * @Author	   : Alperen Derin
 * @Created    : 05.03.2020
 **/

public class FindMail {
    static int total_main_count = 0;

    static void findMails(String[] temp){
        for(int a = 0; a< temp.length; a++){
            if( (temp[a].endsWith(".com") || temp[a].endsWith(".edu") || temp[a].endsWith(".tr")) && temp[a].contains("@") ){
                total_main_count++;

            }
        }
    }
}