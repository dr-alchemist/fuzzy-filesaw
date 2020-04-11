package norse.asgard.fuzzyfilesaw;

import norse.asgard.fuzzyfilesaw.config.PropertiesConfiguration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class FuzzyFilesawApplication {

	private static final Logger LOGGER = LogManager.getLogger(FuzzyFilesawApplication.class)

	public static void main(String[] args)throws Exception {

		try {
			PropertiesConfiguration configuration = new PropertiesConfiguration();
			Properties prop = configuration.loadProperties();

			// get the property value and print it out
		}
//		SpringApplication.run(FuzzyFilesawApplication.class, args);
	}

}
