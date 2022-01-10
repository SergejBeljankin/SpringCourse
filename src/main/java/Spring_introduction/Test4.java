package Spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        // можно через запятую перечислять несколько xml файлов
        Dog dog = context.getBean("myPet", Dog.class);
        Dog myDog = context.getBean("myPet", Dog.class);

        System.out.println(dog);
        System.out.println(myDog);
    }
}
