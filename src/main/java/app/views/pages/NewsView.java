package app.views.pages;

import app.views.MainView;

import static j2html.TagCreator.*;

public class NewsView {
    public static String render() {
        return MainView.render(
                "News about j2html",
                "The latest news",
                section().withId("news").with(
                        // ---------------------------------------------------------------------------------------------
                        h2().withId("j2html-0.99-released").withText("j2html 0.99 released! (Apr 2017)"),
                        p().with(
                                text("j2html 0.99 is available for download on "),
                                a("Maven Central").withHref("http://search.maven.org/#artifactdetails%7Ccom.j2html%7Cj2html%7C0.99%7Cjar").withTarget("_blank"),
                                text(".")
                        ),
                        p("Changes:"),
                        ul().with(
                                li().with(text("Added generic "), code().withText("iff()"), text("/"), code().withText("iffElse()"), text(" methods for performing if's in method calls")),
                                li().with(text("Added "), code().withText("withClasses()"), text(" to add multiple classes to element. Works well with "), code().withText("iff()"), text(".")),
                                li().withText("HTML-escaping is now a lot faster (and a lot faster than StringUtils)"),
                                li().withText("Static files can now be fetched from anywhere, not just classpath")
                        ),
                        // ---------------------------------------------------------------------------------------------
                        h2().withId("j2html-0.88-released").withText("j2html 0.88 released! (Jan 2017)"),
                        p().with(
                                text("j2html 0.88 is available for download on "),
                                a("Maven Central").withHref("http://search.maven.org/#artifactdetails%7Ccom.j2html%7Cj2html%7C0.88%7Cjar").withTarget("_blank"),
                                text(".")
                        ),
                        p("Changes:"),
                        ul().with(
                                li().withText("Closure and StringUtils dependencies removed in favor of custom implementations. Most users seem interested in a very lightweight library."),
                                li().with(code().withText("unsafeHtml"), text(" is now "), code().withText("rawHtml")),
                                li().with(text("Added "), code().withText(".equals()"), text(" to Tag-class. Two Tags are equal if they render the same HTML"))
                        ),
                        // ---------------------------------------------------------------------------------------------
                        h2().withId("j2html-0.7-released").withText("j2html 0.7 released!"),
                        p().with(
                                text("We have sacrificed to the Maven Gods, and j2html 0.7 is available for download on "),
                                a("Maven Central").withHref("http://search.maven.org/#artifactdetails%7Ccom.j2html%7Cj2html%7C0.7%7Cjar").withTarget("_blank"),
                                text(".")
                        ),
                        p("Changes:"),
                        ul().with(
                                li().with(text("New file-api (avilable from TagCreator class):")).with(
                                        dl().with(
                                                dt("fileAsString(String path)"),
                                                dd("returns a file's content as a String (useful for including static HTML such as Google Analytics code)"),

                                                dt("fileAsEscapedString(String path)"),
                                                dd("returns fileAsString(path) escaped (useful for including the code-examples on this website)"),

                                                dt("styleWithInlineFile(String path)"),
                                                dd("returns <style>fileAsString(path)</style>"),

                                                dt("styleWithInlineFile_min(String path)"),
                                                dd("returns <style>fileAsString(path)</style>, minimized using CSSMin"),

                                                dt("scriptWithInlineFile(String path)"),
                                                dd("returns <script>fileAsString(path)</script>"),

                                                dt("scriptWithInlineFile_min(String path)"),
                                                dd("returns <script>fileAsString(path)</script>, minimized using Google Closure")
                                        )
                                ),
                                li().with(text("Java 7 support (j2html previously only worked with Java 8)")),
                                li().with(text("Use apache stringutils for escaping"))
                        ),
                        // ---------------------------------------------------------------------------------------------
                        h2().withId("j2html-on-maven").withText("j2html is on Maven! (Late May 2015)"),
                        p().with(
                                text("We've finished the herculean task of releasing on Maven Central. Thanks to Nicholas Smith for his great "),
                                a("tutorial").withHref("http://nicholaspaulsmith.com/maven-sonatype-release/").withTarget("_blank"),
                                text(".")
                        ),
                        // ---------------------------------------------------------------------------------------------
                        h2().withId("hello-j2html").withText("Hello j2html! (Mid May 2015)"),
                        p("After years in the making (okay, days), j2html is finally ready for launch! Check out the examples and be amazed.")
                )
        );
    }
}
