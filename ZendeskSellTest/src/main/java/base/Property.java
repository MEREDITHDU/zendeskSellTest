package base;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.UUID;

/**
 * @author Qilin
 * @version 1.0
 */
public class Property {

    /**
     *
     * @param propertyName
     * @return
     */
    public String getPropertyData(String propertyName) {
        return getProperty("configuration.properties", propertyName);
    }

    /**
     *
     * @param file
     * @param property
     * @return
     */
    private String getProperty(String file, String property) {
        try {
            Properties properties = new Properties();

            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(file);
            assert inputStream != null;
            properties.load(inputStream);

            return properties.getProperty(property);

        } catch (IOException e) {
            System.out.println("Unable to read: " + file + " or find property: " + property + ". Error: " + e);
            return null;
        }
    }

    /**
     *
     * @return
     */
    public String getRandomUUID() {
        return String.valueOf(UUID.randomUUID());
    }
}
