public class Parrot {
 private String name;
 private String color;
 private  int weight;
 private  int age;

 public Parrot() {
 }

 public Parrot(String name, String color, int weight, int age) {
  this.name = name;
  this.color = color;
  this.weight = weight;
  this.age = age;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getColor() {
  return color;
 }

 public void setColor(String color) {
  this.color = color;
 }

 public int getWeight() {
  return weight;
 }

 public void setWeight(int weight) {
  this.weight = weight;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 @Override
 public String toString() {
  return "Parrot:  " +"\n"+
          "name:  " + name + "\n" +
          "color:  " + color + "\n" +
          "weight:  " + weight +"\n"+
          "age:  " + age ;
 }
}
