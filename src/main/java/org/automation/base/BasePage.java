package org.automation.base;


import java.io.File;

import org.automation.elements.Element;
import org.automation.logger.Log;
import org.automation.utilities.CheckFileHash;
import org.automation.utilities.HashType;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;

/**
 * To extend every page class created.
 * 
 * @author Sujay Sawant
 * @version 1.0.0
 * @since 6/11/2020
 *
 */
public abstract class BasePage extends  BaseTest {

	private String parentWindow;

	public BasePage(WebDriver driver) {
		super();
	}

	/**
	 * Open the specified URL.
	 * 
	 * @param url URL to open
	 */
	protected void openUrl(String url) {
		Log.info("Open the URL [" + url + "]");
		driver.get(url);
	}

	/**
	 * Get the URL of the current page.
	 * 
	 * @return page URL
	 */
	protected String getPageUrl() {
		Log.info("Get the Current URL");
		return driver.getCurrentUrl();
	}

	/**
	 * Get the Title of the current page.
	 * 
	 * @return page title
	 */
	protected String getPageTitle() {
		Log.info("Get the Current Page Title");
		return driver.getTitle();
	}

	/**
	 * Refresh the current page.
	 */
	protected void refreshPage() {
		Log.info("Refresh the browser");
		driver.navigate().refresh();
	}

	/**
	 * Get the Hash String of the specified file.
	 * 
	 * @param file     file whose hash is needed
	 * @param hashType The hash type of the file
	 * @return The hash of the specified file
	 */
	protected String getFileHash(File file, HashType hashType) {
		Log.info("Get the hash of the [" + file.getName() + "] file");
		try {
			return CheckFileHash.generateHashForFileOfType(file, hashType);
		} catch (RuntimeException e) {
			Log.error("Unable to get the hash of the [" + file.getName() + "] file", e);
			return e.getMessage();
		}
	}

	/**
	 * Switch to the newly opened window.
	 * 
	 * @param description description of the new window
	 */
	protected void switchToWindow(String description) {
		Log.info("Switch to window [" + description + "]");
		parentWindow = driver.getWindowHandle();
		for (String windowHandle : driver.getWindowHandles())
			if (!windowHandle.equals(parentWindow))
				driver.switchTo().window(windowHandle);
	}

	/**
	 * Switch to the window containing the specified URL text.
	 * 
	 * @param description description of the new window
	 * @param urlText     URL text that the window contains
	 */
	protected void switchToWindowContainingUrlText(String description, String urlText) {
		Log.info("Switch to window [" + description + "] which contains URL text [" + urlText + "]");
		parentWindow = driver.getWindowHandle();
		driver.getWindowHandles().stream().map(driver.switchTo()::window)
				.filter(driver -> driver.getCurrentUrl().contains(urlText)).findFirst()
				.orElseThrow(() -> new NoSuchWindowException(
						"Unable to find window [" + description + "] which contains URL text [" + urlText + "]"));
	}

	/**
	 * Switch to the window containing the specified title.
	 * 
	 * @param description description of the new window
	 * @param title       title that the window contains
	 */
	protected void switchToWindowContainingTitle(String description, String title) {
		Log.info("Switch to window [" + description + "] which contains title [" + title + "]");
		parentWindow = driver.getWindowHandle();
		driver.getWindowHandles().stream().map(driver.switchTo()::window)
				.filter(driver -> driver.getTitle().contains(title)).findFirst()
				.orElseThrow(() -> new NoSuchWindowException(
						"Unable to find window [" + description + "] which contains title [" + title + "]"));
	}

	/**
	 * Switch to the Main window.
	 * 
	 * @param description description of the main window
	 */
	protected void switchToParentWindow(String description) {
		Log.info("Switch to parent window [" + description + "]");
		driver.switchTo().window(parentWindow);
	}

	/**
	 * Switch to the frame containing the specified element.
	 * 
	 * @param description description of the frame
	 * @param element     element of the frame
	 */
	protected void switchToFrame(Element element) {
		Log.info("Switch to frame [" + element.getDescription() + "]");
		driver.switchTo().frame(element.getWebElement());
	}

	/**
	 * Switch to the frame containing the specified name or ID.
	 * 
	 * @param description description of the frame
	 * @param nameOrId    name or ID of the frame
	 */
	protected void switchToFrame(String description, String nameOrId) {
		Log.info("Switch to frame [" + description + "]");
		driver.switchTo().frame(nameOrId);
	}

	/**
	 * Switch to the frame containing the specified index number.
	 * 
	 * @param description description of the frame
	 * @param index       index number of the frame
	 */
	protected void switchToFrame(String description, int index) {
		Log.info("Switch to frame [" + description + "]");
		driver.switchTo().frame(index);
	}

	/**
	 * Switch to the default window.
	 * 
	 * @param description description of the window
	 */
	protected void switchToDefaultContent(String description) {
		Log.info("Switch to main window [" + description + "]");
		driver.switchTo().defaultContent();
	}

}
