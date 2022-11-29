import java.util.Objects;

public class Cat implements Animal {

    private String name;
    private int age;


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String makeNoise() {
        return "meow";
    }

    @Override
    public String eat() {
        return "the Cat eats her food";
    }

    @Override
    public String drink() {
        return "the cat drinks her milk";
    }

    @Override
    public String sleep() {
        return "The Cat sleeps in YOUR Bed!";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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


}
