package Student.Fiblab;

public class fibonacci {
    
//N is the nth fibo nnumber
    public static void Fibo(int N) {
        int current = 1; 
        int previous = 1;
        int counter = 0;
        // Iterate till counter is N
        while (counter < N) {
            // Print the number
            System.out.println(current + " ");
            // Swap
            int next = current + previous;
            current = previous;
            previous = next;
            counter++;
        } 
    }

    public static void main(String[] args) {
        Fibo(5);
    }
}
