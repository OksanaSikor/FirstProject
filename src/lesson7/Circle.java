package lesson7;

public class Circle implements Figure
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * radius * 3.14;
    }

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
}
