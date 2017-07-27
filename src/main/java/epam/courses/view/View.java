package epam.courses.view;

/**
 * Created by eugene on 26.07.17.
 */
public class View {
    public void printMessage(String message){
        System.out.println(message);
    }
    public String concatenateString(String...strings){
        StringBuffer stringBuffer = new StringBuffer();
        for (String string:
             strings) {
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }
}
