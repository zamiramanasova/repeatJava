package practiceLambda;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;
import java.util.function.*;
import java.util.stream.Stream;

/**
 * лямбда-выражение — это анонимный блок кода с параметрами,
 * который можно передать как аргумент к методу или сохранить в переменной.
 *
 * Для создания лямбда-выражения применяется лямбда-оператор (стрелка ->).
 * Этот оператор разделяет лямбда-выражение на две части:
 *
 * (параметры) -> действия
 */
public class LessonOne {

    public static void main(String[] args) {
        Predicate<String> value = s -> s.length() > 5;
        System.out.println(value.test("variable"));

        Consumer<String> toUpperCase = s -> System.out.println(s.toUpperCase());
        Consumer<String> print = s -> System.out.println(s.length());

        Consumer<String> combined = toUpperCase.andThen(print);

        combined.accept("hello");

        Function<String, Integer> example = s -> s.length();
        System.out.println(example.apply("test"));

        Supplier<String> time = () -> LocalDateTime.now().toString();

        System.out.println(time.get());

        UnaryOperator<String> a1 = s -> s.toLowerCase();
        System.out.println(a1.apply("RARE"));

    }
}
