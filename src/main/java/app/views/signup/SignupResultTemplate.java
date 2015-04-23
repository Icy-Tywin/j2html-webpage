package app.views.signup;

import app.utils.MessageGetter;
import app.utils.Path;
import app.views.MainTemplate;

import static j2html.src.tags.TagCreator.*;

public class SignupResultTemplate {
    public static String render(MessageGetter msg, String brand, String email, String choosePassword, String repeatPassword) {
        return MainTemplate.render(
                brand,
                msg.get("SIGNUP_FORM_TITLE"),
                h1().withText(msg.get("SIGNUP_FORM_TITLE")),
                h2().withText(email),
                h2().withText(choosePassword),
                h2().withText(repeatPassword),
                a().withHref(Path.DEFAULT_QUERY_PARAMS+Path.LOGIN).withText(msg.get("LOGIN_FORM_TITLE"))
        );
    }
}
