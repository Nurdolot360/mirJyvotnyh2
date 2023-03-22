public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("bobik");
        dog.setColor("Bleak");
        dog.setAge(4);
        dog.setWeight(8);
        System.out.println(dog);
        Fesh fesh = new Fesh();
        fesh.setWhereDoesHeLive("aquarium");
        System.out.println(fesh);
        Cat cat = new Cat();
        cat.setName("Cisa");
        cat.setColor("white");
        cat.setAge(3);
        cat.setWeight(2);
        System.out.println(cat);
        Parrot parrot = new Parrot();
        parrot.setName("Golubchik");
        parrot.setColor("blue");
        parrot.setAge(5);
        parrot.setWeight(3);
        System.out.println(parrot);
    }
}