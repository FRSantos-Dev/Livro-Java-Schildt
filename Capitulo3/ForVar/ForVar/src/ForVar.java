
class ForVAr {

    public static void main(String[] args) {

        int sum = 0;
        int fact = 1;

        for (int i = 1; i <= 5; i++) {
            sum += i;
            fact *= i;
        }
        System.out.println("Sum of first five numbers is: " + sum);
        System.out.println("Factorial of first five numbers is: " + fact);
    }
}