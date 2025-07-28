package org.example;

public class Wall {
    private double width;
    private double height;

    // Constructor
    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    // Method to get
    public double getWidth() {
        return width;
    }


    public double getHeight() {
        return height;
    }

    // Method to set the width
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // Method to set the height
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //calculate the area
    public double getArea() {
        return width * height;
    }

    //testing for all
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}