package org.mql.java.reflection;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ProjectParser {
	private String projectPath ;
	private Set<Object> listOfPackage = new HashSet<Object>() ;
	
	
	public ProjectParser() {  

	}
	public ProjectParser(String projectPath) {  
		this.projectPath = projectPath ;
		
        listOfPackage(projectPath);
        System.out.println(listOfPackage);

	}
	
       public Set<Object> listOfPackage(String projectPath) {
    	String packName ;
        File directory = new File(projectPath);
        
        File[] fList = directory.listFiles();
        for (File file : fList) {
            if (file.isFile()) {
                String path=file.getPath();
                if(path.contains("src")) {
                 packName=path.substring(path.indexOf("src")+4, path.lastIndexOf('\\'));
                 listOfPackage.add(packName.replace('\\', '.'));
                }
                
            } else if (file.isDirectory()) {

                listOfPackage(file.getAbsolutePath());
            }
        }
        return listOfPackage;
       }
       

}
