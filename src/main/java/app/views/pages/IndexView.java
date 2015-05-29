package app.views.pages;

import app.views.MainView;

import static app.views.atoms.CodeExamples.*;
import static j2html.TagCreator.*;

public class IndexView {
    public static String render() {
        return MainView.render(
                "Fast and fluent Java 8 HTML5 builder",
                "index",
                section().withId("index").with(
                        h1("Fast and fluent Java 8 HTML5 builder").withClass("banner"),
                        h2("Getting started with j2html"),
                        p("Import TagCreator and create some HTML-tags. j2html's syntax is fluent and closely matched to HTML. This Java code:"),
                        minimalExampleJava(),
                        p("Becomes this HTML:"),
                        minimalExampleHTML(),
                        p().with(
                                text("Check out some more "),
                                a("examples").withHref("/examples.html"),
                                text(".")
                        ),
                        h2("Intended use"),
                        h3("Consider using j2html if:"),
                        ul().with(
                                li("You love type safety. You love catching errors at compile time in stead of waiting for some poor users to notice that something is wrong"),
                                li("You like to dynamically re-use your view-code"),
                                li().with(
                                        text("You think template engines are too slow. This index page was rendered 100 000 times in less a second on an i5-4670. That's about a thousand times faster than Apache \""),
                                        a("Velocity").withHref("http://velocity.apache.org/").withTarget("_blank"),
                                        text("\" (hah!)")
                                )
                        ),

                        h3("Please don't use j2html if:"),
                        ul().with(
                                li("You don't know Java and HTML well"),
                                li("You're creating a classic \"website\" that has a lot of static HTML (if it's all generated then it's fine)"),
                                li("Your application has a lot of text and you don't use language files / a database (it could work, but string-concatenation would get very annoying)"),
                                li("You use a CSS framework such as Bootstrap. We tried to use it for this site, it was a nightmare. We might add bootstrap support later, which could reduce Bootstrap boilerplate significantly")
                        ),
                        h2("Why did you make this library?"),
                        p().with(
                                text("First: j2html is a Java HTML builder. It's not a template engine, and it doesn't want to compete with template engines. "),
                                br(),
                                text("We were looking for a good way to create HTML for a complex login solution which had many different forms (with different configurations, " +
                                    "depending on user state and user actions, etc), but very little actual HTML per page. " +
                                    "The result was j2html."),
                                br(),
                                text("We decided to release the Java HTML builder we made, since it seems better " +
                                    "than all the other Java HTML builders we found while researching the subject. Hopefully someone will find it useful!")
                        )
                )
        );
    }
}


