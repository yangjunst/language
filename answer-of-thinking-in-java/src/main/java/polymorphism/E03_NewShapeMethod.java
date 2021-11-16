package polymorphism;

import static net.mindview.util.Print.*;
class Shape {
    public void draw() {
    }

    public void erase() {
    }

    public void msg() {
        print("Base class msg()");
    }
}

class Circle extends Shape {
    public void draw() {
        print("Circle.draw()");
    }

    public void erase() {
        print("Circle.erase()");
    }

//    public void msg() {
//        print("Circle.msg()");
//    }
}

class Square extends Shape {
    public void draw() {
        print("Square.draw()");
    }

    public void erase() {
        print("Square.erase()");
    }

    public void msg() {
        print("Square.msg()");
    }
}

class Triangle extends Shape {
    public void draw() {
        print("Triangle.draw()");
    }

    public void erase() {
        print("Triangle.erase()");
    }

    public void msg() {
        print("Triangle.msg()");
    }
}

class Tetrahedron extends Shape {
    public void draw() {
        print("Tetrahedron.draw()");
    }

    public void erase() {
        print("Tetrahedron.erase()");
    }

    public void msg() {
        print("Tetrahedron.msg()");
    }
}

public class E03_NewShapeMethod {
    public static void main(String args[]) {
        Shape[] shapes = {
                new Circle(), new Square(), new Triangle(),new Tetrahedron()
        };
        for (Shape shape : shapes) {
            shape.draw();
            shape.erase();
            shape.msg();
        }
    }
}