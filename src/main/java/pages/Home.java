package pages;

import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class Home extends Page{

    private static final String URl = "http://pn.com.ua/";

    public void open(){
        open(URl);
    }

    public WebElement getCategoty(String name){
        return $("//a[contains(.,'%s')]",name);
    }
}