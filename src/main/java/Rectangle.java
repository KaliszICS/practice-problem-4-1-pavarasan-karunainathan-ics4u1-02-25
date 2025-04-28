class Rectangle{
    double length;
    double width;
    public Rectangle(double length_, double width_){
        length = length_;
        width = width_;
    }
    double getWidth(){return width;}
    double getLength(){return length;}
    double perimeter(){
        if(length > 0 && width > 0){
            return 2*length + 2*width;
        }else{
            return 0;
        }
    }
    double area(){return length*width;}
}
