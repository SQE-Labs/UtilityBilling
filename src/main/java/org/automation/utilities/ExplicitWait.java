package org.automation.utilities;


import org.automation.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

/**
 * To handle conditions that require synchronization.
 *
 * @author Sujay Sawant
 * @version 1.0.0
 * @since 08/31/2020
 */
public final class ExplicitWait extends BaseTest {

    private final Wait<WebDriver> wait;
    private long timeout, polling;

    /**
     * Create wait object with default timeout and polling interval.
     */
    public ExplicitWait() {
        timeout = 10;
        polling = 200;
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(2));
    }

    /**
     * Create wait object with specified timeout and polling interval.
     *
     * @param timeout time to wait
     * @param polling poll interval
     */
    public ExplicitWait(long timeout, long polling) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(2));
    }

    /**
     * Wait until the specified expected condition is met.
     *
     * @param <R>               the output to return
     * @param expectedCondition condition to wait
     * @return output
     */
    public <R> R until(Function<WebDriver, R> expectedCondition) {
        return wait.until(expectedCondition);
    }
}
