package j2html.test.tags;

import org.junit.Test;

import static j2html.src.tags.TagCreator.*;
import static j2html.src.tags.TagCreator.script;
import static org.junit.Assert.assertTrue;

public class ComplexRenderTest {
    private String renderTest() {
        return  document().render()+
                html().with(
                head().with(
                        title().withText("Test")
                ),
                body().with(
                        header().with(
                                h1("Test Header")
                        ),
                        main().with(
                                h2("Test Form"),
                                div().with(
                                        input().withType("email").withName("email").withPlaceholder("Email"),
                                        input().withType("password").withName("password").withPlaceholder("Password"),
                                        button().withType("submit").withText("Login")
                                )
                        ),
                        footer().withText("Test Footer"),
                        script().withSrc("/testScript.js")
                )
        ).render();
    }

    @Test
    public void testComplexRender() {
        String expectedResult = "<!DOCTYPE html><html><head><title>Test</title></head><body><header><h1>Test Header</h1></header><main><h2>Test Form</h2><div><input type=\"email\" name=\"email\" placeholder=\"Email\"><input type=\"password\" name=\"password\" placeholder=\"Password\"><button type=\"submit\">Login</button></div></main><footer>Test Footer</footer><script src=\"/testScript.js\"></script></body></html>";
        assertTrue(renderTest().equals(expectedResult));
    }
}
