package Spring_introduction;

public class Cat implements Pet{
    public Cat() {
        System.out.println("Создан Bean Cat");
    }

    public void say(){
        System.out.println("Мяв-Мяв");
    }
}
