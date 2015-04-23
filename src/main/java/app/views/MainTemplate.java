package app.views;

import j2html.src.tags.Tag;

import static app.views.partials.StaticResources.mainCSS;
import static app.views.partials.StaticResources.script_jQuery;
import static j2html.src.tags.TagCreator.*;

public class MainTemplate {

    public static String render(String brand, String title, Tag... tags) {
        return document().render() +
                html().with(
                        head().with(
                                title().withText(title),
                                mainCSS()
                        ),
                        body().with(
                                div().withId("header").with(
                                        h1().withText(brand)
                                ),
                                div().withId("main").with(
                                        div().with(
                                                tags //content from other template
                                        )
                                ),
                                div().withId("footer").withText("Footing around"),
                                script_jQuery()
                        )
                ).render();
    }

}

