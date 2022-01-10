package Spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet{
    public Dog() {
        System.out.println("Создан Bean Dog");
    }

    public void say(){
        System.out.println("Гав-Гав");
    }
}
