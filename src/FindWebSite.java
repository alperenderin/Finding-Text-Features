/**
 * @File Name  : FindWebSite.java
 * @Author	   : Alperen Derin
 * @Created    : 05.03.2020
 **/

public class FindWebSite {
    static int total_website_count = 0;

    static void findWebSites(String[] temp){
        for(int a = 0; a< temp.length; a++){
			if(((temp[a].endsWith(".com") || temp[a].endsWith(".edu")) || temp[a].endsWith(".net") || temp[a].endsWith("org") || temp[a].endsWith(".tr")
			  || temp[a].endsWith(".com.tr") || temp[a].endsWith(".edu.tr") || temp[a].endsWith(".net.tr") || temp[a].endsWith(".org.tr")) && !temp[a].contains("@") )
			{
			    total_website_count++;
			}
        }
    }
}