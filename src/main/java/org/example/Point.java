package org.example;

public class Point {
    private int x;
    private int y;

    public  Point (int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return  this.y;
    }
    public  void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public double distance(){
       return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
    }
    public double distance(Point p){
        double firstPart= Math.pow((p.x-this.x),2);
        double secondPart=Math.pow((p.y-this.y),2);
        return Math.sqrt(firstPart+secondPart);

    }
    public  double distance(int a,int b){

        return Math.sqrt((Math.pow(a -this.x,2)) + (Math.pow(b-this.y,2)));
    }

}
