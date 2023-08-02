package homework02;

public class Task2 {
    public static void main(String[] args) {
    
    int[] intArray = {1, 2, 3, 4, 5, 6, 7};

        try {
            int d = 0;
            double catchedRes1 = intArray[6] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array exception: " + e);
        }   
    }
}
