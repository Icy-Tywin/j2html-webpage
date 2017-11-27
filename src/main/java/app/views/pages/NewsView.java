package app.views.pages;

import app.views.*;

import static app.views.Partials.*;
import static j2html.TagCreator.*;

public class NewsView {
    public static String render() {
        return MainView.render(
            "News about j2html",
            "The latest news",
            section(attrs("#news"),
                    // ---------------------------------------------------------------------------------------------
                    h2("j2html 1.2.1 fixes some bugs (Nov 2017)").withId("j2html-1.2.1-released"),
                    mavenLink("1.2.1"),
                    p("Changes:"),
                    ul(
                        li(join("Fix", em("\"bad closing tag (<!DOCTYPE html/>) when closeEmptyTags is true\""), "bug")),
                        li(join("Fix", em("\"can't load static resources from jar\""), "bug")),
                        li(join("Fix", em("\"CSSMin stripping last character of CSS rule if rule doesn't end in semi-colon\""), "bug"))
                    ),
                    // ---------------------------------------------------------------------------------------------
                    h2("j2html 1.2.0 already? (Sep 2017)").withId("j2html-1.2.0-released"),
                    mavenLink("1.2.0"),
                    p("Changes:"),
                    ul(
                        li(join("Added option to render formatted HTML, ex", code("body(...).renderFormatted()"))),
                        li(join("Added option to configure HTML-formatting-indent via", code("Config.indenter = (int, string) -> {...}"))),
                        li(join("Added option to configure CSS-minification via", code("Config.cssMinifier = string -> {...}"))),
                        li(join("Added option to configure JS-minification via", code("Config.jsMinifier = string -> {...}"))),
                        li(join("Added option to close empty tags via", code("Config.closeEmptyTags = true"))),
                        li(join(code("attr()"), "can now take take any object, not just strings"))
                    ),
                    // ---------------------------------------------------------------------------------------------
                    h2("j2html 1.1.0 is out! (Aug 2017)").withId("j2html-1.1.0-released"),
                    mavenLink("1.1.0"),
                    p("Changes:"),
                    ul(
                        li(join("Added a option to customize TextEscaper via", code("Config.textEscaper = text -> {}")))
                    ),
                    // ---------------------------------------------------------------------------------------------
                    h2("j2html 1.0.0 is here! (May 2017)").withId("j2html-1.0.0-released"),
                    mavenLink("1.0.0"),
                    p("Changes:"),
                    ul(
                        li(join("v1 is officially done. We will be doing", a("semantic versioning").withHref("http://semver.org/").withTarget("_blank"), "from now on.")),
                        li(join("All tag methods (", code("div()"), ",", code("p()"), "etc ) can now accept an arbitrary number of", code("DomContent"), "as arguments, eliminating the need for", code("with()"), "in most cases.")),
                        li(join("Added a shorthand-attribute overloads to all TagCreator methods:", br(), code("div(attrs(\"#id.class\")"), "becomes", code("<div id=\"id\" class=\"class\"></div>"))),
                        li(join("Added a", code("join()"), "method to more easily join sentences with inline HTML, like:", br(), code("join(\"Added a\", code(\"join()\"), \"method to more ea..."))),
                        li(join("Added a", code("document()"), "method that takes a", code("html()"), " tag and renders a HTML declaration followed by the html content")),
                        li("Added support for Java 7 and Java 6. Some functionality (each/filter) will not work on these versions, but everything else should.")
                    ),
                    // ---------------------------------------------------------------------------------------------
                    h2("j2html 0.99 released! (Apr 2017)").withId("j2html-0.99-released"),
                    mavenLink("0.99"),
                    p("Changes:"),
                    ul(
                        li(join("Added generic", code("iff()"), "/", code("iffElse()"), "methods for performing if's in method calls.")),
                        li(join("Added", code("withClasses()"), "to add multiple classes to element. Works well with", code("iff()"), ".")),
                        li("HTML-escaping is now a lot faster (and a lot faster than StringUtils)"),
                        li("Static files can now be fetched from anywhere, not just classpath")
                    ),
                    // ---------------------------------------------------------------------------------------------
                    h2("j2html 0.88 released! (Jan 2017)").withId("j2html-0.88-released"),
                    mavenLink("0.88"),
                    p("Changes:"),
                    ul(
                        li("Closure and StringUtils dependencies removed in favor of custom implementations. Most users seem interested in a very lightweight library."),
                        li(code("unsafeHtml()"), text(" is now "), code("rawHtml()")),
                        li(text("Added "), code(".equals()"), text(" to Tag-class. Two Tags are equal if they render the same HTML"))
                    ),
                    // ---------------------------------------------------------------------------------------------
                    h2("j2html 0.7 released!").withId("j2html-0.7-released"),
                    mavenLink("0.7"),
                    p("Changes:"),
                    ul(
                        li("New file-api (avilable from TagCreator class):").with(
                            dl(
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
                        li("Java 7 support (j2html previously only worked with Java 8)"),
                        li("Use apache stringutils for escaping")
                    ),
                    // ---------------------------------------------------------------------------------------------
                    h2("j2html 0.5.0 is on Maven! (Late May 2015)").withId("j2html-on-maven"),
                    mavenLink("0.5.0"),
                    p("We've finished the herculean task of releasing on Maven Central.")
            )
        );
    }
}
