package prep;
/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ValidateDropdownUppercase {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com"); // replace with your actual URL

        WebElement dropdown = driver.findElement(By.id("country"));
        Select select = new Select(dropdown);

        List<WebElement> options = select.getOptions();
        boolean allStartWithUppercase = true;

        for (WebElement option : options) {
            String text = option.getText().trim();
            if (!text.isEmpty()) {
                char firstChar = text.charAt(0);

                if (!Character.isUpperCase(firstChar)) {
                    System.out.println("❌ Option does NOT start with uppercase: " + text);
                    allStartWithUppercase = false;
                } else {
                    System.out.println("✅ Option starts with uppercase: " + text);
                }
            }
        }

        if (allStartWithUppercase) {
            System.out.println("✅ All dropdown options start with uppercase letters.");
        } else {
            System.out.println("❌ Some dropdown options do not start with uppercase.");
        }

        driver.quit();
    } 
}*/
