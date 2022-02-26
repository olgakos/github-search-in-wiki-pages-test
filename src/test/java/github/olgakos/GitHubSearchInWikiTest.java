package github.olgakos;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browserSize;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class GitHubSearchInWikiTest {

    @DisplayName("Тест на поиск в GitHub-Wiki")
    @BeforeAll
    static void openBrowser() {
//Arrange
        baseUrl = "https://github.com";
        browserSize = "1920x1080";
    }
    @DisplayName("Тест на поиск в GitHub-Wiki")
    @Test
    void searchInGitHubsWiki (){
//Aсt
        open("/selenide/selenide");
        $(byText("Wiki")).click();
        $(".markdown-body").shouldHave(text("Welcome to the selenide wiki!"));
        $(".Box-row button").click(); // развернуть скрытую часть меню
        $(".Box-row wiki-rightbar").find(byText("SoftAssertions"));
        $(byText("SoftAssertions")).click();
//Assert
        $(".markdown-body").shouldHave(text("JUnit5 extension - com.codeborne.selenide.junit5.SoftAssertsExtension"));
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
