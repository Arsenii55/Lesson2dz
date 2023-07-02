public class ClassCastExeption {
    public static void main(String[] args) {
        dz();
    }
    String a;
    private static void dz(){
        try {
            Animal dog = new Dog();
            Cat cat= (Cat) dog;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}