package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Examples {


        public static void main(String[] args) {
//        List<String> myList = Arrays.asList("Привет","мир","!","Я","родился","!");
//        myList.stream().filter(s-> s.length()>4).forEach(System.out::println);

//        Arrays.asList("Привет","мир","!","Я","родился","!").stream().filter(s-> s.length()>4).forEach(System.out::println);

            Stream.of("Привет", "мир", "!", "Я", "родился", "!").filter(s -> s.length() > 4).forEach(System.out::println);

            IntStream.range(0, 4).forEach(i -> System.out.println(i * 2));

            List<String> list = Arrays.asList("Не", "заменят", "край", "родимый",
                    "Никакие", "чудеса!", "Только", "здесь", "всё", "так", "любимо",
                    "Реки", "горы", "и", "леса.");
            list
                    .stream()
                    .filter(n -> n.length() > 4)
                    .filter(c->c.toLowerCase().contains("а"))
                    .forEach(n -> System.out.print(n + " "));
            List<String> listDist = Arrays.asList("а", "б", "а", "в", "а", "г", "а", "д");
            listDist.stream()
                    .distinct()
                    .forEach(n-> System.out.print(n));

            List<Integer> listSort = Arrays.asList(2,4,6,78,6,4,23,1,3,5,76);
            listSort.stream()
                    .sorted((a, z)-> {
                        int tmp = a- z;
                        if (tmp<0) return 1;
                        else if (tmp>0) return-1;
                        return 0;
                    })
                    .forEach(System.out::println);

        }

    }
