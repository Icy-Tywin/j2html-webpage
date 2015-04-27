package app.views.pages;

import app.utils.MessageGetter;
import app.views.MainTemplate;

import static j2html.src.tags.TagCreator.*;

public class IndexTemplate {
    public static String render(){
        return MainTemplate.render(
                "Fast and simple Java HTML Generator",
                section().withId("index").with(
                        h1("A big boy template engine"),


                        h2("Intended use"),

                        p("Please use j2html if:"),
                        ul().with(
                                li("You love type safety. You love catching errors at compile time in stead of waiting for some poor users to notice that something is wrong"),
                                li("You like to dynamically re-use your view-code"),
                                li("Your application is not too big (I'm not sure about this one, it might still work)"),
                                li("Your application's view is app-like (easier to think of as screens than a traditional webpage)")
                        ),

                        p("Please don't use j2html if:"),
                        ul().with(
                                li("You don't know Java and HTML well"),
                                li("You're creating a classic \"website\" that has a lot of static HTML"),
                                li("Your application has a lot of text and you don't use language files / a database (it could work, but string-concatenation would get annoying)"),
                                li("You do not reuse your code a lot")
                        ),

                        h2("Generating HTML with Java? That sounds like a bad idea.."),
                        p().with(
                                unsafeHtml(MessageGetter.get("INTRO_OUTRO"))
                        )
                )
        );
    }
}