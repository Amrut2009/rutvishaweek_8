package java_week_8;

public class point_16 {
    int x;
    int y;
    public point_16(){

    }
    public point_16(int x,int y){
        this.x =x;
        this .y =y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(){
        this.x=x;
    }
    public void setY(){
        this.y=y;
    }
    public double distance(){
        return distance();
    }
    public double distance (int x,int y){
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }
   public double distance(point_16 secondPoint){
        return distance(secondPoint.x,secondPoint.y);
    }

    public static void main(String[] args) {
        point_16 first =new point_16(6,5);
        point_16 second =new point_16(3,1);
        System.out.println("Distance (0,0) ="+first.distance());
        System.out.println("Distance (second) ="+first.distance(second));
        System.out.println("Distance (2,2)="+first.distance(2,2));
        point_16 point =new point_16();
        System.out.println("Distance() =" +point.distance());
    }
}

