package demotest.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPageObject {
    //locators & elements
    private final String FORM_TITLE = "Записаться на консультацию";
    private SelenideElement
            formTitle = $(".container-default"),
            NameInput = $("#name"),
            userEmail = $("#email"),
            userNumber = $("#phone_number"),
            userComment = $("#comment"),
            submit = $(".el-form-item button"),
            resultsTable = $(".container-submitted");


    //actions
    public RegistrationPageObject openPage(){
        open("https://www.in-aim.ru/");
        formTitle.scrollTo().shouldHave(text(FORM_TITLE));

        return this;
    }
    public RegistrationPageObject typeUserName(String value){
        NameInput.setValue(value);

        return this;
    }
    public RegistrationPageObject typeUserEmail(String value){
        userEmail.setValue(value);

        return this;
    }
    public RegistrationPageObject typeUserNumber(String value){
        userNumber.setValue(value);

        return this;
    }
    public RegistrationPageObject typeUserComment(String value){
        userComment.setValue(value);

        return this;
    }
    public RegistrationPageObject checkResultsValue(String value){
        resultsTable.shouldHave(text(value));

        return this;
    }
    public RegistrationPageObject typeSubmit(){
        submit.click();

        return this;
    }
}
