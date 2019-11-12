/**
 * @author Abhishek Jain
 *
 * Interface looks like a class but it is not a class.
 * An interface can have methods and variables just like the class but the methods declared in interface are
 * by default abstract (only method signature, no body), Also, the variables declared in an interface are public,
 * static & final by default.
 *
 * check code implementation for more info.
 */

//Interface declaration: by first user
interface IDrawable{
    void drawMethod();
}
//Implementation: by second user
class Rectangle implements IDrawable{
    public void drawMethod()
    {
        System.out.println("drawing rectangle");
    }
}
class Circle implements IDrawable{
    public void drawMethod()
    {
        System.out.println("drawing circle");
    }
}
//Using interface: by third user
class JavaInterfaceEx{
    public static void main(String args[])
    {
        IDrawable circle = new Circle();//In real scenario, object is provided by method e.g. getDrawable()
        circle.drawMethod();

        IDrawable rectangle = new Rectangle();//In real scenario, object is provided by method e.g. getDrawable()
        rectangle.drawMethod();
    }
}

