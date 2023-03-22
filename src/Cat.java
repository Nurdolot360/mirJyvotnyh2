public class Cat {
    private String name;
    private int age;
    private int weight;
    private String color;

    public Cat() {
    }

    public Cat(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat:  " +"\n"+
                "name:  " + name + "\n" +
                "age:  " + age +"\n"+
                "weight: " + weight +"\n"+
                "color:  " + color + "\n";
    }
}
