package com.cybertek.tests.day8_windows_java_faker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {
    @Test
    public void test1(){
        Faker faker = new Faker();
        String fullName = faker.name().fullName();
        String address = faker.address().fullAddress();
        String chuckNorris = faker.chuckNorris().fact();
        String gameOfThrones = faker.gameOfThrones().city();
        System.out.println("fullName = " + fullName);
        System.out.println("address = " + address);
        System.out.println("chuckNorris = " + chuckNorris);
        System.out.println("gameOfThrones = " + gameOfThrones);
    }
}
