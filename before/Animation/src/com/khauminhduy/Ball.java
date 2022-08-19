package com.khauminhduy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

public class Ball {

    private Color color;
    private Dimension size;
    private Point location;

    public Ball() {
    }

    public Ball(Color color, Dimension size, Point location) {
        this.color = color;
        this.size = size;
        this.location = location;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Dimension getSize() {
        return size;
    }

    public void setSize(Dimension size) {
        this.size = size;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

}
