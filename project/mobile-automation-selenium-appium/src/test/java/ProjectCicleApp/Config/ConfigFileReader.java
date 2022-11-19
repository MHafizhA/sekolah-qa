package ProjectCicleApp.Config;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigFileReader {
    public static String getConfigPropertyVal(String propertyName) {
        String reportConfigPath = "";
        try (InputStream input = new FileInputStream("src/test/resources/Cofinguration.properties")) {

            Properties prop = new Properties();

            //load a properties file
            prop.load(input);
            reportConfigPath = prop.getProperty(propertyName);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return reportConfigPath;
        }
    }

