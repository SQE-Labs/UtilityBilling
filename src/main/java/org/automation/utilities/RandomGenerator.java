package org.automation.utilities;

import java.util.Random;

import org.openqa.selenium.By;

public class RandomGenerator {

        public static void random(By path, String valueToBeSent) {
        	Random objGenerator = new Random();
            for (int iCount = 0; iCount< 10; iCount++){
              int randomNumber = objGenerator.nextInt(100);
              System.out.println("Random No : " + randomNumber); 
             }
     }
}
	
