class Person{
    String name;
    int age;
    int height;
    int weight;
    String eyeColour;
    String hairColour;

    public Person(String _name, int _age, int _height, int _weight, String _eyeColour, String _hairColour){
        name = _name;
        age = _age;
        height = _height;
        weight = _weight;
        eyeColour = _eyeColour;
        hairColour = _hairColour;
    }

    public String getName(){return name;}
    public int getAge(){return age;}
    public int getHeight(){return height;}
    public int getWeight(){return weight;}
    public String getEyeColour(){return eyeColour;}
    public String getHairColour(){return hairColour;}

}
