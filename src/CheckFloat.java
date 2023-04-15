import java.util.InputMismatchException;
import java.util.Scanner;


public class CheckFloat {

    public int inputNum() {
        Scanner input = new Scanner(System.in);
            int a; 
            try {
                a = input.nextInt();
                // input.close();
                } catch (InputMismatchException e) {
                    System.out.println("Неверный формат ввода. Введите целое число: ");
                    // input.close();
                    return inputNum();
                }
                // input.close();
                return a;
        }        
}

