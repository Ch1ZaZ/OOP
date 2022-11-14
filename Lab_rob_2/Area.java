package Lab_rob_2;

public class Area {

    String park;
    int width;
    int length;

    public Area(String park, int width, int length) {
        this.park = park;
        this.width = width;
        this.length = length;
    }



    public void street(){
        System.out.println("Парк в якому гуляє собака " + park);
    }
    public int square(){
        return width * length;
    }


    public Area up(String s, int i){
        Area area = new Area (park+s,length*i,width*i);
        return area;
    }

    public void upgrade(){
        System.out.println("Прекрасне місце для тренувань");
    }
}
