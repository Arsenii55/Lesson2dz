public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        test(new Dog());
    }
    public static void test(Animal animal) {
        animal.dosomething();
    }
}