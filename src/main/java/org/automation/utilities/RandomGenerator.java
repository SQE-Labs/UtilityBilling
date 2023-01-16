package org.automation.utilities;

import org.openqa.selenium.By;

import java.util.Random;

public class RandomGenerator {

    public static void random(By path, String valueToBeSent) {
        Random objGenerator = new Random();
        for (int iCount = 0; iCount < 10; iCount++) {
            int randomNumber = objGenerator.nextInt(100);
            System.out.println("Random No : " + randomNumber);
        }
    }
}
