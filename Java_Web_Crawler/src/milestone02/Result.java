package milestone02;

public class Result extends Object {
   
	public int score;
    public static long serialVersionUID = -938761094876384658L;
    public String url;
    public int urlID;

    public Result(String url, int urlID){
        this.url = url;
        this.urlID = urlID;
        this.score = 1;
       
    }

    public void updateScore(int score){
        this.score += score;
    }

    public int getScore(){
        return this.score;
    }

    public void incrementScore(){
        this.score++;
    }

    public String getURL(){
        return this.url;
    }

    public int getURLID(){
        return this.urlID;
    }

    public boolean equals(Object obj){
        return false;
    }

    public int compareTo(Result candidate){
        if(this.score > candidate.score){
            return -1;
        }
        else if (this.score < candidate.score){
            return 1;
        }
        else{
            return 0;
        }
    }
}
