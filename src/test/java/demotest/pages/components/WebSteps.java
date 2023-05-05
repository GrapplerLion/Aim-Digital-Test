package demotest.pages.components;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Disabled;

import static com.codeborne.selenide.Selenide.open;

@Disabled
public class WebSteps {
    @Step("Открываем главную страницу")
    public void openMainPage() {
        open("https://www.in-aim.ru/");
    }

}
