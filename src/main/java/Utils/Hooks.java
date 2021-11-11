package Utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Hooks {

    public static Properties prop = new Properties();

    public static void loadProperties() {
        InputStream is = Hooks.class.getResourceAsStream("/application.properties");
        try {
            prop.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}