public class Event{
    int id;
    String ime;
    String datum;
    static void Event(int id, String ime, String datum){
        this.id=id;
        this.ime=ime;
        this.datum=datum;
    }
    public int getId(){
        ruturn id;
    }
    public String getIme(){
        return ime;
    }
    public String getDatum(){
        return datum;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setIme(String ime){
        this.ime=ime;
    }
    public void setDatum(String datum){
        this.datum=datum;
    }
}