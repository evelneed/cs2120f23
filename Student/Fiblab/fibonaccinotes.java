package Student.Fiblab;

public class fibonaccinotes {
    
//N is the nth fibo nnumber
    public static void Fibo() {
        int current = 1;  
        //r0 = 1 --> 0x60 01 so 0(r)110(icode)(00)(01)
        int previous = 1;
        //r1 = 1 --> 0x60 01 so 0(r)110(icode)(01)(01)
        int counter = 0; //instruction 1 with counter =rA and 0 = rB
        //r2 = 0 --> 0x60 01 so 0(r)110(icode)(10)(01)

        // Iterate till counter is N
        do //r3 = PC --> 0(r)110(icode)() XX
        {
            // Print the number
            System.out.println(current);
            System.out.println(previous);
            // Swap
            current+=previous; // 0(r)(001)(icode)(00)(01)
            previous += current; // 0(r)(000)(icode)(01)(00)
            counter++; //
            // r2 +=1 --> (0)(r)(110)(icode)(11)(01)
        } while (counter < 64); //-> (counter+1 - 64 <= 0) --> instruction 7 with counter = ra (r2 = ra)
    //r5 += -N if r5 <= 0 then PC = r3
    }

    //register 0 = current --> r0 = 0x
    //register 1 = previous
    //register 2 = counter



    public static void main(String[] args) {
        Fibo();
    }
}
