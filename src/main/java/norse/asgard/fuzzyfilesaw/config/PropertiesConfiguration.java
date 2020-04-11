package norse.asgard.fuzzyfilesaw.config;

import norse.asgard.fuzzyfilesaw.exceptions.FileSawProcessException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.Properties;

public class PropertiesConfiguration {

    private String basePath;
    private String configPropFile = "properties/split-file-file-prgm-config.properties";

    public PropertiesConfiguration(String basePath) {this.basePath = basePath;}

    public Properties loadProperties() {
        File propertyFile = Paths.get(basePath, configPropFile).toFile();

        if(!propertyFile.canRead()) {
            throw new FileSawProcessException(
                    MessageFormat.format("Could not find a properties file ''{0}''", propertyFile.getAbsolutePath()));
        }

        if(!propertyFile.canRead()) {
            throw new FileSawProcessException(MessageFormat.format("Could not find a properties file ''{0}''", propertyFile.getAbsolutePath()));
        }

        Properties prop = new Properties();
        try (InputStream input = new FileInputStream(propertyFile)) {
                prop.load(input);
            } catch (IOException ex) {
            throw new FileSawProcessException(MessageFormat.format("Error while loading the configuration from properties file ''{0}''", propertyFile.getAbsoluteFile()));
        }
        return prop;
    }
}
