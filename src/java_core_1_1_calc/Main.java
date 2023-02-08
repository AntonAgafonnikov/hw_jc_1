package java_core_1_1_calc;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2); // a = 3
        int b = calc.minus.apply(1,1); // b = 0
        int c = calc.devide.apply(a, b);     // c - ОШИБКА! Деление на 0 запрещено.
                                             // Необходимо реализовать проверку, что делитель не равен 0

        calc.println.accept(c);
    }
}
