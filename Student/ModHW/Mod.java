package Student.ModHW;

public class Mod {


    public static int mod(int num1, int num2) {
        do {
            num1-=num2;
        } while (num1 > 0);
        num1+=num2;
        return num1;
    }
    public static void main(String[] args) {
        System.out.println(mod(127, 10));
    }
    
}
