package com.example.abacus;

public abstract class Shape {
    private Integer x;
    private Integer y;
<<<<<<< HEAD

    String colour = "blue";
=======
    private String color = "yellow";

    public Shape(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
>>>>>>> 67ab37d128677e55ce429ac2f458e495f41438ec
}
