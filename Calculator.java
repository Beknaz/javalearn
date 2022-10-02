import java.util.Scanner;


class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение которое вы хотите вычеслить:");
        String str = in.next();

        Integer result = null;
        String[] numbers;

        if (str.indexOf('+') > 0) {
            numbers = str.split("[+]");
            result = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        } else if (str.indexOf('-') > 0) {
            numbers = str.split("[-]");
            result = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
        } else if (str.indexOf('/') > 0) {
            numbers = str.split("[/]");
            result = Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]);
        } else if (str.indexOf('*') > 0) {
            numbers = str.split("[*]");
            result = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
        }
        System.out.println(result);

    }
}