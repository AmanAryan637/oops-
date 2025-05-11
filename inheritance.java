package bank;
class Shape
{
    public void area()
    {
        System.out.println("displays area");
    }
}
/// single level inheritance(only this inherit shape)
class Triangle extends Shape
   {
    public void area(int l,int h)
    {
        System.out.println(1.0/2*l*h);
    }
}

/// multiple level inheritance(this inherit from triangle)
class equilateralTriangle extends Triangle
{
    public void area(int l,int h)
    {
        System.out.println((1.0/2)*l*h);
    }
}


/// hierecal level inheritance(this also inherit from shape as triangle)
class circle extends Shape
{
    public void area(int r)
    {
        System.out.println(3.14*r*r);
    }
}
public class inheritance {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area();

        Triangle t = new Triangle();
        t.area(5, 10);

        equilateralTriangle et = new equilateralTriangle();
        et.area(5, 5);

        circle c = new circle();
        c.area(7);
    }
}
