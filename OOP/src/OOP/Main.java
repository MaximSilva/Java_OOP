package OOP;

import entities.Cat;
import entities.Laptop;
import entities.Phone;
import entities.Triangle;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 5, "White");
        System.out.println(cat1.getName());
        cat1.setName("Luska");
        System.out.println(cat1);

        Phone phone1 = new Phone();
        phone1.setDescription("Technique");
        phone1.setPrice(100);
        phone1.setWeight(3);
        System.out.println(phone1);

        Laptop laptop1 = new Laptop();
        laptop1.setDescription("Technique");
        laptop1.setPrice(20000);
        laptop1.setWeight(10);
        System.out.println(laptop1);

        Triangle triangle1 = new Triangle(3,5,10);
        System.out.println(triangle1);




    }
}
