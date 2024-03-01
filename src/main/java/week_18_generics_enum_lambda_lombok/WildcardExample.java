package week_18_generics_enum_lambda_lombok;

import java.util.Arrays;
import java.util.List;

public class WildcardExample {

    public static void main(String[] args) {
        List<Number> list = Arrays.asList(1,23,44,22);
        test(list);

        List<Integer> list2 = Arrays.asList(1,23,44,22);
//        test(list2);
        test1(list2);
        test2(list2);
        test3(list2);

        List<String> stringList = Arrays.asList("a", "b");
//        test1(stringList);

    }


    static void test(List<Number> numberList){
        for (Number number : numberList) {
            System.out.print(number + " ");
        }
    }

    static <T extends Number> void test1(List<T> numberList){
        for (T number : numberList) {
            System.out.print(number + " ");
        }
    }

    // wildcard: more flexible and readable
    // if we don't need to add new elements or return the generic type, we can use wildcard
    static void test2(List<?> numberList){
        for (Object o : numberList) {
            System.out.print(o + " ");
        }
    }

    // wildcard: more flexible and readable
    // if we don't need to add new elements or return the generic type, we can use wildcard
    static void test3(List<? extends Number> numberList){
//        numberList.add(5);
        for (Number o : numberList) {
            System.out.print(o + " ");
        }
    }

}
