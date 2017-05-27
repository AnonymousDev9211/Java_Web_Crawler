package milestone02;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by mcaito on 3/30/17.
 */

public class Search {
    static List<Page> pageList;
    private String pageListFile;
    static List<Result> resultSet;
    static List<Word> wordList;
    private String wordListfile;

    public Search(String wordListFile, String pageListFile) throws FileNotFoundException, ClassNotFoundException, IOException{
        wordList = (new FileUtils()).getWordList(wordListFile);
        pageList = (new FileUtils()).getPageList(pageListFile);
        resultSet = Collections.synchronizedList(new ArrayList<Result>());
        setup(wordListFile, pageListFile);
    }

    public void setup(String wordListfile, String pageListFile) throws FileNotFoundException, ClassNotFoundException, IOException{
        FileUtils fu = new FileUtils();
        pageList = fu.getPageList(pageListFile);
        wordList = fu.getWordList(wordListfile);
    }

	public List<Result> executeQuery(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void nullCheck(){
		
	}
	
	public void sort(){
		
	}
    
    
}
