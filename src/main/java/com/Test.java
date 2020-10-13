package com;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static class User {
        private String email;
        private String name;

        public User(String email, String name){
            this.email = email;
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static class Address {
        private Country country;

        public Optional<Country> getCountry() {
            return Optional.ofNullable(country);
        }

        // ...
    }

    public static class Country {
        private String isocode ;
        public String getIsocode (){
            return isocode;
        }
        public void setIsocode(String isocode){
            this.isocode = isocode;
        }
    }

    public void test(){
        class TestClass{
            private int testInt;
            public TestClass(int testInt){
                this.testInt = testInt;
            }
            public void print(){
                System.out.println(testInt);
            }
        }

        System.out.println();
    }
    public static void main(String[] args) {
        List<User> users = IntStream.range(0,10).mapToObj( i -> new User("hello" +i,"99"+i)).collect(Collectors.toList());
//        Optional accResult = Stream.of(5,1,9,2,10).reduce((acc, item) -> {
//           System.out.println("acc : "  + acc);
//           acc += item;
//           System.out.println("item: " + item);
//           System.out.println("acc+ : "  + acc);
//           System.out.println("--------");
//           return acc;
//       });
//
//        System.out.println("accResult: " + accResult.get());
    }
}
