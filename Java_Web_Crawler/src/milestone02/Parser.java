package milestone02;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.MalformedURLException;


public class Parser{
    public Document getDocument(String url) throws IOException, ParseException, MalformedURLException{
        Document d = null;
        if(url == null){
            throw new ParseException("getDocument() failed. String url is null.");
        } else if (url.isEmpty()){
            throw new ParseException("getDocument() failed. String url is empty.");
        }
        try {
            d = Jsoup.connect(url).get();
        } catch (IOException e) {
            throw new ParseException("getDocument() failed. Connection failed.");
        } catch (IllegalArgumentException e) {
            throw new ParseException("getDocument() failed. Connection failed.");
        }
        return d;
    }

    public String getBody(Document d) throws ParseException{
        String content = null;
        if(d == null){
            throw new ParseException("getBody() failed. Document parameter is null.");
        }
        else{
            Element body = d.body();
            content = body.text();
        }
        return content;
    }

    public Elements getLinks(Document d) throws ParseException{
        Elements links = null;
        if(d == null) {
            throw new ParseException("getLinks() failed. Document parameter is null.");
        }
        else {
            links = d.select("a[href]");
        }
        return links;
    }

    public static void main(String args[]){
        Parser p = new Parser();
        Document d = null;
        try{
            d = p.getDocument("https://www.purdue.edu");
        }catch (IOException e){}
        catch (ParseException e){}
        System.out.println();
    }
}
