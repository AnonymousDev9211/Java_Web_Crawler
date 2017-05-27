package milestone02;

import java.util.ArrayList;


import java.io.Serializable;
import java.util.List;
public class Word implements Serializable {
    static long serialVersionUID = -3696191086353573895L;
    String word;
    int urlID;
    List<Integer> postings = new ArrayList<Integer>();

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Word))
            return false;
        Word c = (Word) obj;
        if(this.word.equals(c.word)){
            return true;
        }
        return false;
    }

    public Word(String word, int urlID){
        this.word = word;
        postings.add(urlID);
        this.urlID = urlID;
    }

    String getWord(){
    	System.out.println("Word: " + this.word);
        return this.word;
    }

    List<Integer> getList(){
        return this.postings;
    }

    int addURLID(int urlID){
        postings.add(urlID);
        return urlID;

    }

    public static void main(String args[]){
        Word a = new Word("a", 1);
        Word b = new Word("a", 1);
        System.out.println(a.equals(b));
    }

}