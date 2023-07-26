package Homework;

public class Task_3 {
    public static void main(String[] args){
        try {
            int a = 90;
            int b = 3;
            // int b = 0; - Throwable
            System.out.println(a / b);

            printSum(23, 234);
            // printSum(23, 234); - NullPointerException

            int[] abc = {1, 2};
            abc[3] = 9; // - IndexOutOfBoundsException

        } catch (NullPointerException ex) {
            System.err.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.err.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }
}
