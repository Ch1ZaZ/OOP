package Lab_Rob_1;

public class Area {
    String park;
    int width;
    int length;

    public Area(String park, int width, int length) {
        this.park = park;
        this.width = width;
        this.length = length;
    }

    void street(){
        System.out.println("Парк в якому гуляє собака " + park);
    }
    int square(){
        return width * length;
    }
}
