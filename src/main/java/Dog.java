import java.util.Objects;

public class Dog implements Animal {

    private String name;
    private int age;


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String bark(){
        return "bark bark";
    }

    @Override
    public String makeNoise() {
        return "bark bark";
    }

    public String eat(){
        return "The Dog eats his Food!";
    }

    public String drink(){
        return "The Dog drinks his water";
    }

    @Override
    public String sleep() {
        return "the dog sleeps in your Bed!";
    }


    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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
}
