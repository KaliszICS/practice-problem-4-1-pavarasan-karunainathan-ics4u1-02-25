class Circle{
    static double radius;
    public Circle(double _radius){
        radius = _radius;
    }

    static double getRadius(){return radius;}
    static double area(){return 3.14*radius*radius;}
    static double circumference(){return 3.14*2*radius;}
}