package java_core_1_1_calc;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    //Если делитель равен 0, то выбросим исключение
    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : 0;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    Consumer<Integer> println = System.out::println;
}

@FunctionalInterface
interface Supplier<Calculator> {
    Calculator get();
}
