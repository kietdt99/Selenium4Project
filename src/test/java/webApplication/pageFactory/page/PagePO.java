package webApplication.pageFactory.page;

import org.openqa.selenium.By;
import webApplication.textValidation.PageText;

public interface PagePO extends PageText {
    By btnSearch = By.id("abc");
    By lblPopupTitle = By.id("xyz");
}
