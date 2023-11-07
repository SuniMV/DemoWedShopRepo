package genericUtitiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author dhanu
 *
 */
public class PropertyUtility implements IAutoConstants {
/**
 * This method is developed to read the data from property file.
 * 
 * @param Key
 * @return value of the key
 */
	public String getreadingDataFromPropertyFile(String Key) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(PROPERTY_FILE_PATH);

		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties property=new Properties();
		try {
		property.load(fis);
		
		} catch(IOException e) {
			e.printStackTrace();
		}
		return property.getProperty(Key);
	}
}