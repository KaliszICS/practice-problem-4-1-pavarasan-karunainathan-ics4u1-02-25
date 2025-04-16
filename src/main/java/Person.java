class Person{
    static String name;
    static int age;
    static int height;
    static int weight;
    static String eyeColour;
    static String hairColour;

    public Person(String _name, int _age, int _height, int _weight, String _eyeColour, String _hairColour){
        name = _name;
        age = _age;
        height = _height;
        weight = _weight;
        eyeColour = _eyeColour;
        hairColour = _hairColour;
    }

    static String getName(){return name;}
    static int getAge(){return age;}
    static int getHeight(){return height;}
    static int getWeight(){return weight;}
    static String getEyeColour(){return eyeColour;}
    static String getHairColour(){return hairColour;}

}