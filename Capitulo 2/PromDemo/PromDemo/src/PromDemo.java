public class PromDemo {
    public static void main(String[] args){
        byte b;
        int i;

        b = 10;
        i = b * b; // Приведение типов не требуется, так как типы совместимы

        b = 10;
        b = (byte) (b * b); // Приведение типов обязательно, так как типы не совместимы

        System.out.println("i and b: " + i + " " + b);
    }
}
