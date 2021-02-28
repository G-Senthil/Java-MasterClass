package Senthil.Java;

public class Point {

    private int x;
    private int y;
    public Point(){

    }
    public Point(int x, int y){
        this.x=x;
        this.y=y;

    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x=x;

    }
    public void setY(int y){
        this.y=y;
    }
    public double distance( ){
      return Math.sqrt((0.00-this.getX())*(0.00-this.getX())+(0.00-this.getY( ))*(0.00-this.getY()));
    }
    public double distance(int x, int y ){
        return Math.sqrt((x-this.getX())*(x-this.getX())+(y-this.getY( ))*(y-this.getY()));
    }
    public double distance(Point z ){
        return Math.sqrt((z.getX()-this.getX())*(z.getX()-this.getX())+(z.getY()-this.getY( ))*(z.getY()-this.getY()));
    }
}
