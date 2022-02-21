package mymail.ok2304;


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
        //AAA Arrange: Пользователь имеет доступ к сайту. Залогин не требуется.
        //open("https://github.com/selenide/selenide");
        baseUrl = "https://github.com";
        browserSize = "1920x1080";
    }
    @DisplayName("Тест на поиск в GitHub-Wiki")
    @Test
    void searchInGitHubsWiki (){
        //AAA Aсt
        //откройте сайт

        //open("https://github.com");
        //open("/selenide/selenide"); //перекидывает на сайт Ддженкинса???

        //Откройте страницу Selenide в Github
        open("/selenide/selenide");
        //Перейдите в раздел Wiki проекта
        //$("a").$("#wiki-repo-tab-count").click(); //не работает
        $(byText("Wiki")).click();  //клик по ссылке
        $(".markdown-body").shouldHave(text("Welcome to the selenide wiki!")); //контрольная проверка заголовка стр.
        $(".Box-row button").click(); // развернуть скрытую часть меню
        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        //$(".Box-row wiki-more-pages-link").find(byText("SoftAssertions")); // вариант
        //#wiki-pages-box // вариант
        //.wiki-more-pages-link // вариант
        $(".Box-row wiki-rightbar").find(byText("SoftAssertions"));
        $(byText("SoftAssertions")).click();

        //AAA Assert
        //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $(".markdown-body").shouldHave(text("JUnit5 extension - com.codeborne.selenide.junit5.SoftAssertsExtension")); //контрольная проверка заголовка стр.
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
