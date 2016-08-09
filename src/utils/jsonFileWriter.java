package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;


public class jsonFileWriter {
	
	
	{

	try{
	JsonReader reader = Json.createReader(new FileReader("config.json"));
	
	} catch (FileNotFoundException fnfe){
	System.out.println("Config file not found for json properties. Creating...");
		
	}
	
	}

	
	
}