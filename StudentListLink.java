/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 *
 * @author Asus
 */
public class StudentListLink {
    private final String githubLink = "https://github.com/STIW3054-A191/Main-Issues/issues/1#issuecomment-529184291_";
    private final String myString = "#issuecomment";
    private Document doc;
    private RegexMatches regexMatches;
    private int total;


public static void main(String[]args){
    new StudentListLink().Main();
}    
    public void Main(){
        regexMatches = new RegexMatches();
        
        try{
            doc = Jsoup.connect(githubLink).get();
            
            //get page title
            String title = doc.title();
            System.out.println("Title : " + title);
            
            //get all links for GitHub Account
            Elements links = doc.select("a[href]");
            for(Element link : links){
                String theLink = link.attr("href");
                if(regexMatches.isMatch(myString, theLink) == true){
                    System.out.println(theLink);
                    total++;
                }
            }
            System.out.print("Total Student : " + total);
        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
    
}
