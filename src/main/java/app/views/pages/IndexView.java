package app.views.pages;

import app.views.MainView;

import static j2html.src.tags.TagCreator.*;

public class IndexView {
    public static String render() {
        return MainView.render(
                "Fast and simple Java HTML Generator",
                "index",
                section().withId("index").with(
                        h1("Not a template engine!").withClass("banner"),

                        h2("Intended use"),
                        p("Consider using j2html if:"),
                        ul().with(
                                li("You love type safety. You love catching errors at compile time in stead of waiting for some poor users to notice that something is wrong"),
                                li("You like to dynamically re-use your view-code"),
                                li("Your application is not too big (I'm not sure about this one, it might still work)"),
                                li("Your application's view is app-like (easier to think of as screens than a traditional webpage)"),
                                li("You have to write everything from scratch")
                        ),

                        p("Please don't use j2html if:"),
                        ul().with(
                                li("You don't know Java and HTML well"),
                                li("You're creating a classic \"website\" that has a lot of static HTML"),
                                li("Your application has a lot of text and you don't use language files / a database (it could work, but string-concatenation would get annoying)"),
                                li("You use a CSS framework such as Bootstrap. I tried to use it for this site, it was a nightmare")
                        ),

                        h2("Generating HTML with Java? That sounds like a bad idea.."),
                        p("It is.")
                )
        );
    }
}


