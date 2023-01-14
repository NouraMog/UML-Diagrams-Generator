package org.mql.java.reflection;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class PackageParser {

	private String projectPath ;
	private Set<Object> listOfClass = new 	HashSet<Object>();
	
	public PackageParser() {
		
	}
	 
    public PackageParser(String projectPath) {
    	this.projectPath = projectPath ;
    	
    	listOfClasses(projectPath, "org.mql.java.ui");
        System.out.println(listOfClass);
	}
    
    public Set<Object> listOfClasses(String projectPath, String packageName) {
 	   String src = "\\src\\";
 	   String projectPathg = projectPath +src +packageName.replace(".", "\\") ;
 	   File directory = new File(projectPathg);
 	   File[] files = directory.listFiles();
 	   System.out.println(projectPathg);
 	    for (File file : files) {
 	        if (file.isFile() && file.getName().endsWith(".java")) {
 	           
 	      listOfClass.add(file.getName().substring(0, file.getName().length() - 5));
					
 	        }
 	    }
 	    return listOfClass;
 	}
    

}
