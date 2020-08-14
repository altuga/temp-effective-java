package com.kodcu.question08.fix;

class Circle extends Figure {
    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public  double calculateArea() {
        return Math.PI * (radius * radius);
    }
}