package demotest.tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import java.util.Locale;


public class RegistrationTests extends TestBase{

    Faker faker = new Faker(new Locale("en-END"));
    String userName = faker.name().firstName();
    String userEmail = faker.internet().emailAddress();
    String userMobileNumber = "12345678910";
    String userComment = faker.chuckNorris().fact();

    @Test
    void successfulRegistrationTest() {

            registrationPage.openPage()
                    .typeUserName(userName)
                    .typeUserEmail(userEmail)
                    .typeUserNumber(userMobileNumber)
                    .typeUserComment(userComment)
                    .typeSubmit()
                    .checkResultsValue("Ваш запрос успешно отправлен!");
    }
}
