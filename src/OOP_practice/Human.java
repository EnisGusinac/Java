package OOP_practice;

/**
 * JavaBeans Pattern - allows inconsistency, mandates mutability
 * in which you call a parameterless constructor to create
 * the object and then call setter methods to set each
 * required parameter and each optional parameter
 * of interest
 */
public class Human {

    String name;
    int age;
    int height;
    int weight;
    String eyeColor;

    public void speak() {
        System.out.println("Hello my name is " + name + ", and my age is" + age);
        System.out.println("I am " + height + "cm in height, and " + weight + "kg in weight.");
        System.out.println("My eye color is " + eyeColor);
    }

    public void walk() {
        System.out.println("I am able to walk!");
    }

    public void talk() {
        System.out.println("And I am able to talk!");
    }


}
