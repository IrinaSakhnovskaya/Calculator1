import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = null;
        try {
            result = calc(input);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(result);
        }

    public static String calc (String input) throws Exception {
        String[] array = input.split(" ");
        if (array.length != 3) {
                throw new Exception("Неверный формат ввода. Введите два числа");
        }
       String operator = array [1];
        int num1;
        int num2;
        boolean isRoman = false;

        if (array[0].matches("[A-Z]+")&&array[2].matches("[A-Z]+")) {
            isRoman = true;
          num1=RomanToNumber.romanToArabic(array[0]);
          num2=RomanToNumber.romanToArabic(array[2]);
        } else if (array[0].matches("[0-9]+")&&array[2].matches("[0-9]+")) {
            num1=Integer.parseInt(array[0]);
            num2=Integer.parseInt(array[2]);
        }
        else {
            throw new Exception ("Числа должны быть либо оба арабскими, либо оба римскими");
        }
        if (num1>10||num1<1||num2>10||num2<1){
            throw new Exception("Числа должны быть в диапазоне от 1 до 10");
        }
        int result = 0;
        switch (operator) {
            case "+": result = num1+num2; break;
            case "-": result = num1-num2; break;
            case "*": result = num1*num2; break;
            case "/": result = num1/num2; break;
            default:
                System.out.println("Неверный оператор");
        }
        if (isRoman) {
           if (result<1) {
               throw new Exception("В римской системе нет отрицательных чисел или нуля");
           }
           return NumberToRoman.numberToRoman (result);
        }
        else {
            return String.valueOf(result);
        }
    }

}
