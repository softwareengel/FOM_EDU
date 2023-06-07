class C {

}
public class SumOfMultiples {

    public static void main(String[] args) {
        int limit = 1000; // The given number

        int sum = 0;
        for (int i = 1; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println("The sum of multiples of 3 or 5 below " + limit + " is: " + sum);
    }
}
public class Hello {

    public static void main(String[] args) {
        // Ausgabe Hello World!
        System.out.println("Hello World!");
        C c = new C();
    }
}