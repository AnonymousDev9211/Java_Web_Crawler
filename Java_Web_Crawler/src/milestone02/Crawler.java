package milestone02;

import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Crawler extends Thread{
    
	static int currentID;
    static String domain;
    static int limit;
    static List<Page> parsed;
    static Parser parser;
    public MyQueue toParse;
    static int totalURLs;
    static List<String> visited;
    static List<Word> words;

    public Crawler(String seed, String domain, int limit){
    	 toParse = new MyQueue();
         toParse.add(seed);
         Crawler.domain = domain;
         Crawler.limit = limit;
         parsed = new ArrayList<Page>();
         visited = new ArrayList<String>();
         words = new ArrayList<Word>();
         Crawler.parser = new Parser();
         Crawler.currentID = 1;
         Crawler.totalURLs = 0;
    }

    public void addPagetoList(Page p){
        parsed.add(p);
    }

    public void addToQueue(String url){
        toParse.add(url);
        totalURLs++;
    }

    public void addWordToList(String word, int id){
        words.add(new Word(word, id));
    }

    public void crawl(){
    	Page p = null;
    	Document doc = null;
    	String url = null;
    	while(currentID <= limit && !toParse.isEmpty()){
    		url  = (String) toParse.remove().getData();
    		if(isInDomain(url) && isValidURL(url)){
    			try{
    				doc = parser.getDocument(url);
    				 if (parse(doc, currentID)) {
                         p = new Page(url, currentID);
                         addPagetoList(p);
                         visited.add(url);
                         currentID++;
    				 }
    			}
    			catch(ParseException e){}
    			catch(IOException e){}
    		}	
    	}
    }

    public boolean isInDomain(String url) {
        if (url.contains(domain)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isValidURL(String url) {
        if (url.substring(0, 7).equals("http://")) {
            return true;
        }else if(url.substring(0,8).equals("https://")){
            return true;
        }else{
            return false;
        }
    }

    public boolean parse(Document doc, int id){
        boolean parsed = false;
        Driver d = new Driver();
        return parsed;
    }

    public void parseLinks(Document doc)throws ParseException{
        Parser p = new Parser();
        p.getLinks(doc);
    }

    public void parseText(Document doc, int id)throws ParseException{
        currentID = id;
        Parser p = new Parser();
        p.getBody(doc);
    }

}
