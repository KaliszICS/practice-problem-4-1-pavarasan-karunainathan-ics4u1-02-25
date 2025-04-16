class Rectangle{
    static double length;
    static double width;
    public Rectangle(double length_, double width_){
        length = length_;
        width = width_;
    }
    static double getWidth(){return width;}
    static double getLength(){return length;}
    double perimeter(){return 2*length + 2*width;}
    double area(){return length*width;}
}