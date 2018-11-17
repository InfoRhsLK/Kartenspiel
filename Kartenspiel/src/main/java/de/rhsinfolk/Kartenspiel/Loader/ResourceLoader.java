package de.rhsinfolk.Kartenspiel.Loader;

import java.io.File;
import java.util.stream.Stream;

public class ResourceLoader{
	
	public ResourceLoader() {
		
	}
	
	public File loadFile(String path) {
		return new File(getClass().getClassLoader().getResource(path).getFile());
	}

}
