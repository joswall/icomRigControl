package utils;

import java.io.File;

public class fileUtils {
	
	public void updateConfig (){
		Boolean found = fileExistsCheck("config.json");
		System.out.println(found);
		
	}
	
	private Boolean fileExistsCheck (String filePathString) {
		File f = new File(filePathString);
		Boolean found = false;
		
		if(f.exists() && !f.isDirectory()) { 
		// set found to true if file exists
		found = true;
		}
		// return found to caller
		return found;
	}

}
