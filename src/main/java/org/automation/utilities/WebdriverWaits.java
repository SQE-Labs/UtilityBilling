package org.automation.utilities;

import org.automation.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WebdriverWaits extends BaseTest {
    /**
     * Waits for a given element to be visible
     *
     * @param waitTime  WebDriver instance
     * @param locator By of the element to wait for
     */
    public static void waitForElementVisible(By locator, long waitTime) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(waitTime));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    /**
     * Waits for a given element to be visible
     *
     * @param waitTime WebDriver instance
     * @param locator      element to wait for
     */
    public static void waitForElementVisible(By locator, int waitTime) {
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(waitTime));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }


    /**
     * Waits for a given element to be selected
     *
     * @param waitTime  WebDriver instance
     * @param locator By of the element to wait for
     */
    public static void waitForElementSelected(By locator, int waitTime) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(waitTime));
        Boolean bool = wait.until(ExpectedConditions.elementToBeSelected(locator));
    }


    /**
     * Waits for a given element to be clickable
     *
     * @param waitTime  WebDriver instance
     * @param locator By to locate element to wait for
     */
    public static void waitForElementClickable(By locator, int waitTime) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(waitTime));
        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static WebElement waitForElementUntilVisible(By locator, int waitTime) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(waitTime));
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return e;
    }

    /**
     * Waits for the page to have a given title
     * <p>
     * This method is an attempt to address a problem where Chrome/IE drivers
     * are trying to check the page title on page load before the title has
     * changed to that of the new page.
     *
     * @param waitTime WebDriver instance
     * @param title  title the page should have
     */
    public static boolean waitForPageTitle(String title, int waitTime) {
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(waitTime));
        return wait.until(ExpectedConditions.titleContains(title));
    }


    /**
     * Sleep script for the specified length
     * (generally not an ideal solution)
     *
     * @param length
     */
    public static void sleep(long length) {
        try {
            Thread.sleep(length);
        } catch (InterruptedException e) {
            /*
             * Log.error("Sleep Interrupted"); e.printStackTrace();
             */
        }
    }

    public static void fluentWait_ElementLocated(long waitTimeForTimeout, long waitTimeForPolling, By locator) {
//        Wait<WebDriver> wait = new FluentWait<>(getDriver())
//                .withTimeout(waitTimeForTimeout, TimeUnit.SECONDS)
//                .pollingEvery(waitTimeForPolling, TimeUnit.SECONDS)
//                .ignoring(NoSuchElementException.class);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

        Wait<WebDriver> wait = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(waitTimeForTimeout))
                .pollingEvery(Duration.ofSeconds(waitTimeForPolling))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));


    }
    
    public static void SwitchToNewTab() throws InterruptedException {
		String originalHandle = getDriver().getWindowHandle();
		Set<String> tabs = getDriver().getWindowHandles();

		for(String handle : tabs) {
			if (!handle.equals(originalHandle)) {
				getDriver().switchTo().window(handle);
			}
		}

		Thread.sleep(3000);
	}

}
