package epam.courses.view;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by eugene on 26.07.17.
 */
public class View {
    // Resource Bundle Installation's
    public static final String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    //new Locale("UA_ua"));  // Ukrainian
                    new Locale("en"));        // English

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concatenateString(String... strings) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String string :
                strings) {
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }

    public void showMenu() {
        printMessage(bundle.getString(ConstantMessage.MENU));
    }
}
