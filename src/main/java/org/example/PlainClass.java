package org.example;

public class PlainClass {
    PlainInterface anInterface;

    public static void main(String[] args) {
//        PlainInterface anInterface = new PlainInterface() {
//            @Override
//            public String action(int x, int y) {
//                return String.valueOf(x+y);
//            }
//        };
//        PlainInterface anInterface1 = (int x, int y) -> String.valueOf(x + y);
//        PlainInterface anInterface2 = (int x, int y) -> String.valueOf(x * y);

        PlainInterface anInterface = (int x, int y) -> String.valueOf(x + y);
        System.out.println(anInterface.action(5, 5));
        anInterface = (int x, int y) -> String.valueOf(x * y);
        System.out.println(anInterface.action(5, 5));
//        PlainInterface2 anInterface2 = Integer::compare;
        PlainInterface2 anInterface2 = (int x, int y) -> Integer.compare(x,y);
        System.out.println(anInterface2.action(5, 6));

    }
}

@FunctionalInterface
interface PlainInterface {
    String action(int x, int y);
}

@FunctionalInterface
interface PlainInterface2 {
    int action(int x, int y);
}