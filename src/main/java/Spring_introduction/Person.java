package Spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        System.out.println("Создан Bean Person");

    }

    public void setPet(Pet pet){
        System.out.println("Pet внедрен Settor_ом");
        this.pet = pet;
    }
    public Person(Pet pet) {
        System.out.println("Создан Bean Person");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void callYourPet(){

        System.out.println("Иди ко мне мое животное");
        pet.say();
    }
}
