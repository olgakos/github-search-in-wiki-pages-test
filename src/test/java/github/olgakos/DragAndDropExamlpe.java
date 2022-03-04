package github.olgakos;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDropExamlpe extends TestBaseTheInternet {
        @Test
        void dragDropTest(){
            open("/drag_and_drop");
            $("#column-a").shouldHave(text("A"));
            $("#column-a").dragAndDropTo("#column-b");
            $("#column-a").shouldHave(text("B"));
        }
}