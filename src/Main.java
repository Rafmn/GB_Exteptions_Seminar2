import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        
        /* 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа 
        (типа float), и возвращает введенное значение. Ввод текста вместо числа 
        не должно приводить к падению приложения, вместо этого, необходимо повторно 
        запросить у пользователя ввод данных. */
        
        System.out.println("Введите числитель дробного числа: ");
        CheckFloat num = new CheckFloat();
        float a = num.inputNum();        
        System.out.println("Введите знаменатель дробного числа: ");
        float b = num.inputNum();
        System.out.println(a / b);

        /* 2. Если необходимо, исправьте данный код 
        (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit) */

        try {
            int d = 0;
            int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // Добавлено
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
            } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
            }

        /* 3.     Дан следующий код, исправьте его там, где требуется 
        (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit) */

        // public static void main(String[] args) throws Exception {
            
        try {
        int a1 = 90;
        int b1 = 3;
        System.out.println(a1 / b1);
        Main.printSum(23, 234);
        int[] abc = { 1, 2 };
        abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {   // Перенесено в конец
                System.out.println("Что-то пошло не так...");
            } 

        /* 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
        Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = scan.nextLine();
        if (string.isEmpty()) {
            System.out.println("Пустые строки вводить нельзя");
        }
    }

    private static void printSum(int a, int b) {
        System.out.println(a + b);

    }
}