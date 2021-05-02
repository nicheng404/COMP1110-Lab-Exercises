package comp1110.lab7;

public class Fox extends Animal{
    public String name;
    public String sound;
    public int age;

    public Fox(String name1, String sound1, int age1) {
        super(name1, sound1, age1);
    }


    public Fox(String name, String sound, int age, String name1, String sound1, int age1) {
        super(name, sound, age);
        this.name = name1;
        this.sound = sound1;
        this.age = age1;
    }

    public Fox(String name) {
        super(name);
    }
}
