import java.security.Key;

public class Keyboard {
    private String type;
    private int numberKeys;
    private String language;

    public Keyboard(String type,int numberKeys,String language){
        this.type = type;
        this.numberKeys = numberKeys;
        this.language = language;
    }
    @Override
    public String toString(){
        return(getType()+","+getNumberKeys()+","+getLanguage());
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberKeys() {
        return numberKeys;
    }

    public void setNumberKeys(int numberKeys) {
        this.numberKeys = numberKeys;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
