public class ClassCastExeption {
    public static void main(String[] args) {
        dz();
    }
    int a;
    private static void dz(){
        try {
            ClassCastExeption error = (ClassCastExeption) a;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}