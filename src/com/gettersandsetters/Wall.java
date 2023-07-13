package com.gettersandsetters;
public class Wall {
    double width;
    double height;

    public Wall() {
    }
    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth( double width){
        if(width < 0){
            this.width =0;
        }else{
            this.width =width;
        }
    }
    public void setHeight(double height){
        if(height < 0){
            this.height =0;
        }else{
            this.height =height;
        }
    }
    public  double getArea(){
        return this.getWidth() * this.getHeight();
    }

    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        System.out.println("area" + wall.getArea());
    }
}
