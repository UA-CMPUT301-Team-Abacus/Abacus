package com.example.abacus;

public class Rectangle extends Shape{
    private Integer width;
    private Integer height;

    public Rectangle(Integer x, Integer y, Integer width, Integer height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public String getMeasurements() {
        return "Width: " + width + " Height: " + height;
    }

    public void setMeasurements(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public Integer getArea() {
        return width * height;
    }
}
