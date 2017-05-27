package milestone02;
import java.util.List;

/**
 * Created by mcaito on 3/31/17.
 */
public class SearchThread implements Runnable{
    int finish;
    int start;
    String[] terms;

    public SearchThread(int start, int finish, String[] terms){
        this.start = start;
        this.finish = finish;
        this.terms = terms;
    }

    public Word findTerm(String term){
        FileUtils fu = new FileUtils();
        List<Word> wordList = fu.getWordList(term);
        Word w = wordList.get(start);
        return w;
    }

    public void run(){
    	for(int i = start; i <= finish; i++){
    		
    	}
    	
    	
    	
    }
}
