public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Bob", 3);
        Dog dog = new Dog("Bello", 2);
        Cat cat1 = new Cat("Osiris", 5);

        Cat[] catArray = {cat, cat1};
        Dog[] dogArray = {dog};

        Animal[] myPets = {cat,dog,cat1};



    }
}
