package milestone01;

public class Page {
    String url;
    int urlID;
    long serialVersionUID = -1827677255104766839L;

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Page))
            return false;
        Page c = (Page) obj;
        if(this.urlID == c.urlID){
            return true;
        }
        if(this.url.equals(c.url)){
            return true;
        }
        return false;
    }

    public Page(String url, int urlID){
        this.url = url;
        this.urlID = urlID;
    }
    String getURL(){
        return url;
    }

    int getURLID(){
        return urlID;
    }
    public static void main(String args[]){
        Page a = new Page("a", 1);
        Page b = new Page("b", 1);
        System.out.println(a.equals(b));
    }
}
