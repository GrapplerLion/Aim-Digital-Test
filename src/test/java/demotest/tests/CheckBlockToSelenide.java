package demotest.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class CheckBlockToSelenide {

    @Test
    public void portfolioShouldBeTheFirstBlock() {

        open("https://www.in-aim.ru/");

        $("div.white nav").$("a").click();
        $("div.content").scrollTo().$("#bx_3218110189_317").hover();
        $("div.hover").$("h2.title").
                shouldHave(Condition.text("Премиум-сайт ПСБ Private Banking"));
        $("div.content").$("#bx_3218110189_317").click();
        $(".portfolio-detail__wrap").
                $(".portfolio-detail__text").shouldHave(Condition.visible);
    }

}
