package milestone02;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class FileUtils extends Object implements Serializable{
    public List<Page> getPageList(String filePath){
    	 if (filePath == null)
             return null;
         try {
             FileInputStream fis = new FileInputStream(new File(filePath));
             ObjectInputStream ois = new ObjectInputStream(fis);
             List<Page> pages = (List<Page>) ois.readObject();
             fis.close();
             ois.close();
             return pages;
         } catch (IOException e) {
             return null;
         } catch (ClassNotFoundException e) {
             return null;
         }
    }

    public boolean savePageTable(List<Page> pageTable, String filePath){
    	FileOutputStream fos = null;
    	ObjectOutputStream oos = null;
    	if(filePath == null || pageTable == null){
    		return false;
    	}
    	try{
    	    fos = new FileOutputStream(filePath);
    	    oos = new ObjectOutputStream(fos);
    	    oos.writeObject(pageTable);
			fos.close();
			oos.close();
    	    return true;
    	}catch(IOException e){
    		return false;
    	}
    }

    public List<Word> getWordList(String filePath) {
    	if(filePath == null){
    		System.out.println("filepath");
    		return null;
    	}
    	try{
    		FileInputStream fis = new FileInputStream(new File(filePath));
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Word> words = (List<Word>) ois.readObject();
            fis.close();
            ois.close();
            return words;
    	}catch(IOException e){
    		System.out.println("IO");
    		return null;
    	}catch(ClassNotFoundException e){
    		System.out.println("CNF");
    		return null;
    	}
    	
    }

    public boolean saveWordTable(List<Word> wordTable, String filePath) {
    	FileOutputStream fos = null;
    	ObjectOutputStream oos = null;
    	if(filePath == null || wordTable == null){
    		return false;
    	}
    	try{
    	    fos = new FileOutputStream(filePath);
    	    oos = new ObjectOutputStream(fos);
    	    oos.writeObject(wordTable);
			fos.close();
			oos.close();
    	    return true;
    	}catch(IOException e){
    		return false;
    	}
    	
    }
    
    
    public static void main(String [] args){
    	FileUtils fu = new FileUtils();
    	List<Word> table = new ArrayList<Word>();
        table.add(new Word("word1", 1));
        table.add(new Word("word2", 2));
        table.add(new Word("word3", 3));
    	System.out.println(table.get(2));
    	String filePath = "C:\\Users\\Omar\\Desktop\\project4-tests\\testWordTable1.txt";
    	List<Word> test = fu.getWordList(filePath);
    	System.out.println(test);
    	
    }
    
}

    
    
    
    
    
    
    
    
    
    
    
    
    

