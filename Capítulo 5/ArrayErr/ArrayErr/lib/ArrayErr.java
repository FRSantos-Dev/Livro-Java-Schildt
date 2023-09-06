
class ArrayErr{
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;

        // generate an array index out-of-bounds exception
        for(i = 0; i < 100; i = i + 1)
            sample[i] = i;
    }
}