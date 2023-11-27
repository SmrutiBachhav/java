
package shapes;
import java.util.Scanner;
class Square{
    Square(){
        System.out.println("Welcome!");
    }
    public int l;
    Square(int l){
        this.l=l;
    }
    public void setL(int l){
            this.l=l; 
    }
    public  int getL(){
            return l;
    }

    public void AreaOfSquare(){
        System.out.printf("Area of square wih side %d is %d",l,(l*l));
    }
    public void PerimeterOfSquare(){
        System.out.println("");
        System.out.printf("Perimeter of square wih side %d is %d",l,(4*l));
    }
    
}

class Rectangle extends Square{
    public int b;
    Rectangle(int l,int b){
        super(l);
        this.l=l;
        this.b=b; 
    }
    public void setB(int b){
            this.b=b; 
        }
        public int getB(){
            return b;
        }
    
    public void AreaOfRectangle(){
        System.out.println("");
        System.out.printf("Area of rectangle with length %d and breadth  %d is %d",l,b,(l*b));
    }
    public void PerimeterOfRectangle(){
        System.out.println("");
        System.out.printf("Perimeter of rectangle with length %d and breadth  %d is %d",l,b,(2*(l+b)));
    }


}
class Circle{
    public float  r;
    Circle(){
        System.out.println("");
    }
    Circle(float r){
        this.r=r;
        
    }
    public void setR(float r){
        this.r=r;
    }
    public float getR(){
        return r;
    }
    public void AreaofCircle(){
        System.out.printf("Area of circle with radius %f is %f",r,(Math.PI*r*r));
    }
    public void PerimeterofCircle(){
        System.out.println("");
        System.out.printf("Perimeter of circle with radius %f is %f",r,(2*Math.PI*r));
    }
}
class Cylinder extends Circle{
    public float h;
    Cylinder(float r, float h){
        super(r);
        this.r=r;
        this.h=h;
    }
    public void setH(float h){
        this.h=h;
    }
    public float getH(){
        return h;
    }
    public void AreaofCylinder(){
        System.out.println("");
        System.out.printf("Area of cylinder with radius %f and height %f is %f",r,h,(2*Math.PI*r*r+2*Math.PI*r*h));
    }
    public void VolumeofCylinder(){
        System.out.println("");
        System.out.printf("Volume of cylinder with radius %f and height %f is %f",r,h,(Math.PI*r*r*h));
    }
}
class Sphere extends Circle{
    
    Sphere(float r){
        super(r);
        this.r=r;
        
    }
    public void setR(float r){
        this.r=r;
    }
    public float getR(){
        return r;
    }
    public void AreaofSphere(){
        System.out.println("");
        System.out.printf("Area of sphere with radius %f is %f",r,(4*Math.PI*r*r));
    }
    public void VolumeofSphere(){
        System.out.println("");
        System.out.printf("Volume of sphere with radius %f is %f",r,((4.0/3.0)*Math.PI*r*r*r));
    }
}

public class pq{
    public static void main(String[]args){
        System.out.println("Welcome!");
    //     //Square
    //     Square s=new Square();
    //     s.setL(5);
    //     s.getL();
    //     s.AreaOfSquare();
    //     s.PerimeterOfSquare();

    //     //Rectangle
    //     Rectangle r=new Rectangle(5,6);
    //     r.setB(6);
    //     r.getB();
    //     r.AreaOfRectangle();
    //     r.PerimeterOfRectangle();

    //     //Circle 
    //     Circle c=new Circle();
    //     c.setR(5);
    //     c.getR();
    //     c.AreaofCircle();
    //     c.PerimeterofCircle();
        
    //     //Cylinder
    //     Cylinder cy=new Cylinder(6,7);
    //     cy.setH(7);
    //     cy.getH();
    //     cy.AreaofCylinder();
    //     cy.VolumeofCylinder();

    //     //Sphere
    //     Sphere sp=new Sphere(7);
    //     sp.setR(6);
    //     sp.getR();
    //     sp.AreaofSphere();
    //     sp.VolumeofSphere();

    //BY USING SWITCH CASE
     
Scanner sc =new Scanner(System.in);
System.out.println("1.Area of Square\n2.Perimeter of square\n3.Area of rectangle\n4.Perimeter of rectangle\n5.Area of circle\n6.Perimeter of circle\n7.Area of cylinder\n8.Volume of cylinder\n9.Area of sphere\n10.volume of sphere");
System.out.println("Enter your choice:");
int choice=sc.nextInt();
switch(choice){
    case 1:
        Square s=new Square();
        s.setL(5);
        s.getL();
        s.AreaOfSquare();
        break;
    case 2:
        Square s2=new Square();
        s2.setL(5);
        s2.getL();
        s2.PerimeterOfSquare();
        break;
    case 3:
        Rectangle r=new Rectangle(5,6);
        r.setB(6);
        r.getB();
        r.AreaOfRectangle();
        break;
    case 4:
        Rectangle r2=new Rectangle(5,6);
        r2.setB(6);
        r2.getB();
        r2.PerimeterOfRectangle();
        break;
    case 5:
        Circle c=new Circle();
        c.setR(5);
        c.getR();
        c.AreaofCircle();       
        break;    
    case 6:
        Circle c2=new Circle();
        c2.setR(5);
        c2.getR();     
        c2.PerimeterofCircle();
        break;
    case 7:
        Cylinder cy=new Cylinder(6,7);
        cy.setH(7);
        cy.getH();
        cy.AreaofCylinder();
        break;
    case 8:
        Cylinder cy2=new Cylinder(6,7);
        cy2.setH(7);
        cy2.getH();      
        cy2.VolumeofCylinder();
        break;
    case 9:
        Sphere sp=new Sphere(7);
        sp.setR(6);
        sp.getR();
        sp.AreaofSphere();
        break;
    case 10:
        Sphere sp2=new Sphere(7);
        sp2.setR(6);
        sp2.getR();       
        sp2.VolumeofSphere();
    }
}
}

