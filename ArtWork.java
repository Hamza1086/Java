
public class ArtWork {

    private String title;
    private int yearCreated;
    private Artist artist;

    ArtWork(String title, int year, Artist art) {
        this.title = title;
        this.yearCreated = year;
        this.artist = art;
    }

    ArtWork(String title, int year) {
        this.title = title;
        this.yearCreated = year;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public String getTitle() {
        return title;
    }

    public void setYear(int y) {
        this.yearCreated = y;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public void setArtist(Artist a) {
        this.artist = a;
    }

    public Artist getArtist() {
        return artist;
    }

    public void displayInfo(){
        System.out.println(title);
        System.out.println(yearCreated);
        System.out.println(artist);

    }

}

class ShallowCopy{

    ShallowCopy(){
        
    }
}

class DeepCopy{

    DeepCopy(){

    }
}
