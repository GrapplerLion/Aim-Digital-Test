package demotest.tests;

import com.codeborne.selenide.Configuration;
import demotest.pages.components.RegistrationPageObject;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    RegistrationPageObject registrationPage = new RegistrationPageObject();

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
        open("https://www.in-aim.ru/");
    }
}

