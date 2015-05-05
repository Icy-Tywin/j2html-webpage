package app.views.pages;

import app.views.MainView;

import static app.views.atoms.CodeExamples.*;
import static j2html.src.tags.TagCreator.*;

public class ExamplesView {
    public static String render() {
        return MainView.render(
                "Examples",
                "examples",
                section().withId("examples").with(
                        h1("Reclaim control over your HTML").withClass("banner"),
                        h2("Basic example"),
                        p("Creating a basic webpage is very similar to HTML. This Java code:"),
                        basicExampleJava(),
                        p("Becomes this HTML:"),
                        basicExampleHTML(),
                        p("It's literally impossible to forget to close a div, mistype an attribute name, or forget an attribute quote!"),


                        h2("Partials"),
                        p("You can create partials for elements you use a lot:"),
                        partialExampleJava(),
                        p("The equivalent HTML would be:"),
                        partialExampleHTML(),
                        p("You can then use these partials, for example in a registration form:"),
                        viewExampleJava(),
                        p("Pretty clean, right? The rendered HTML is more verbose:"),
                        viewExampleHTML(),
                        p().with(
                                text("Imagine if you wanted labels in addition. The Java snippet would look almost identical: You could create a partial called"),
                                em(" passwordAndLabel() "),
                                text("and nothing but the method name would change. The resulting HTML however, would be twice or thrice as big, depending on whether " +
                                        "or not you wrapped the input and label in another tag.")
                        ),


                        h2("Loops"),
                        p("Thanks to Java 8's lambda syntax, you can use loops (streams) inside your HTML-builder:"),
                        forLoopExampleJAVA8(),
                        p("You can also extract a method. This would allow you to use regular for-loop syntax (although the example uses streams because they're much cooler):"),
                        forLoopExampleJAVA(),
                        p("Since this is pure Java, all the Employee methods (getName, getImgPath, getTitle) are available to you, " +
                                "and you get autocomplete suggestions and compile time errors."),
                        p("Given three random employees, both the above approaches would give the same HTML:"),
                        forLoopExampleHTML(),


                        h2("Dynamic templates"),
                        p().with(
                                text("Once you've set up partials, you can call them from wherever, which greatly reduces potential errors. " +
                                        "Let's say we want to include the from the partials-example form in our webpage. We want a header above and a footer below. Most templating languages make you do this: ")
                        ),
                        otherTemplatesExample(),
                        p("which is a pain to work with. You have no idea what the header and footer expects, and you have no way to affect how they treat your content. " +
                                "You can easily break the site by forgetting to close divs, or by forgetting to include either the header or the footer in one of your views. " +
                                "In j2html you can specify the context in which a view is rendered, and supply the rendering method with type safe parameters! " +
                                "If we want to insert our form in a header/footer frame, we simply create a MainTemplate and make it take our view as an argument:"),
                        mainExampleJava(),
                        p("Which will result in the rendered HTML:"),
                        mainExampleHTML(),
                        p("We would now get a compilation error if we forgot to include a title, and there is 0 chance of forgetting either header or footer, mistyping paths" +
                                ", forgetting to close divs, or anything else.")

                )
        );
    }
}
