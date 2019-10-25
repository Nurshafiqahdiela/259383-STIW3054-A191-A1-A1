/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Asus
 */
public class RegexMatches {

    public boolean isMatch(String pattern, String link) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(link);
        
        
       if(m.find())
           return true;
       else
           return false;
    }
    
    public static void main(String[]args){
        
        String myString = "STIW3054-A191-A1";
        String myLink = "https://github.com/Nurshafiqahdiela/259383-STIW3054-A191-A1";
        Boolean result = new RegexMatches().isMatch(myString , myLink);
        System.out.println(result);
    }
       
    
}
