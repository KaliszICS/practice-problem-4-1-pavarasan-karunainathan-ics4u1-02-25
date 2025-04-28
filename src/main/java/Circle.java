class Circle{
    double radius;
    public Circle(double _radius){
        radius = _radius;
    }

    public double getRadius(){return radius;}
    public double area(){return 3.14*radius*radius;}
    public double circumference(){return 3.14*2*radius;}
}
