package github.olgakos;

import org.junit.jupiter.api.BeforeAll;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browserSize;

public class TestBaseTheInternet {
    @BeforeAll
    static void openBrowser() {
        baseUrl = "https://the-internet.herokuapp.com";
        browserSize = "1920x1080";
    }
}