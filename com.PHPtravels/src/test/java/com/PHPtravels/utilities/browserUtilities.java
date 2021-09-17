package com.PHPtravels.utilities;


import java.util.Iterator;
import java.util.Set;



public class browserUtilities {
	public static void windowHandle() {
		String mainWindowHandle = BaseClass.getDriver().getWindowHandle();
		Set<String> allWindowHandles = BaseClass.getDriver().getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();

		// Here we will check if child window has other child windows and will fetch the
		// heading of the child window
		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
				BaseClass.getDriver().switchTo().window(ChildWindow);
			}

		}
	}
}
