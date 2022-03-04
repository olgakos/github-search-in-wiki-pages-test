package github.olgakos;

import org.junit.jupiter.api.BeforeAll;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browserSize;

public class TestBaseGitHub {
    @BeforeAll
    static void openBrowser() {
        baseUrl = "https://github.com";
        browserSize = "1920x1080";
    }
}
