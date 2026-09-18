// // Using Getters And Setters

// class Cylinder {
//     private int radius;
//     private int height;

//     public int getRadius() {
//         return radius;
//     }

//     public void setRadius(int radius) {
//         this.radius = radius;
//     }

//     public int getHeight() {
//         return height;
//     }

//     public void setHeight(int height) {
//         this.height = height;
//     }

//     public double surfacearea() {
//         return 2 * 3.142 * radius * height + 2 * 3.142 * radius * radius;
//     }

//     public double volume() {
//         return 3.142 * radius * radius * height;
//     }
// }

// public class problem2 {

//     public static void main(String[] args) {
//         Cylinder mycylinder = new Cylinder();
//         mycylinder.setHeight(12);
//         System.out.println("Height=" + mycylinder.getHeight());
//         mycylinder.setRadius(9);
//         System.out.println("Radius=" + mycylinder.getRadius());
//         System.out.println("Surface Area is:" + mycylinder.surfacearea());
//         System.out.println("Volume is:" + mycylinder.volume());

//     }
// }

// --------------------------------------------
// Using Constructor

// class Cylinder {
//     private int radius;
//     private int height;

//     public Cylinder(int radius, int height) {
//         this.radius = radius;
//         this.height = height;

//     }

//     public int getRadius() {
//         return radius;
//     }

//     public void setRadius(int radius) {
//         this.radius = radius;
//     }

//     public int getHeight() {
//         return height;
//     }

//     public void setHeight(int height) {
//         this.height = height;
//     }

//     public double surfacearea() {
//         return 2 * 3.142 * radius * height + 2 * 3.142 * radius * radius;
//     }

//     public double volume() {
//         return 3.142 * radius * radius * height;
//     }
// }

// public class problem2 {

//     public static void main(String[] args) {
//         Cylinder mycylinder = new Cylinder(12, 9);
//         // mycylinder.setHeight(12);
//         System.out.println("Height=" + mycylinder.getHeight());
//         // mycylinder.setRadius(9);
//         System.out.println("Radius=" + mycylinder.getRadius());
//         System.out.println("Surface Area is:" + mycylinder.surfacearea());
//         System.out.println("Volume is:" + mycylinder.volume());

//     }
// }
 


// ----------------------------------------------------------
// Overloading Using Constructor definrd and custom parameters

class rectangle{
    private int length;
    private int breadth;

    



public rectangle() {
        this.length = 7;
        this.breadth = 8;
    }

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }


public int getBreadth() {
    return breadth;
}
public int getLength() {
    return length;
}
    
}
public class problem2{
    public static void main(String[] args) {
        rectangle r = new rectangle(67,99);
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
    }
}