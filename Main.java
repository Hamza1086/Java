

public class Main(){

    public static void main(String[] args) {

        Artist art1 = new Artist();

        ArtWork work1 = new ArtWork("Java Art","2004",art1);
        
        ArtWork work2 = new ArtWork("C Art","2010");

	work1.displayInfo();
	work2.displayInfo();

	
    }
}