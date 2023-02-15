package org.mql.java.exemples;

import org.mql.java.reflection.ClassParser;
import org.mql.java.reflection.PackageParser;
import org.mql.java.reflection.ProjectParser;

public class ProjectMain {
	
	private String projectPath="C:\\Users\\Qsus\\eclipse-workspace\\p04-XML Parsers" ;
	
	public ProjectMain() {
		exp01();
	}
	
	public void exp01() {
		ProjectParser prj = new ProjectParser(projectPath);
		PackageParser pkg = new PackageParser(projectPath);	
	}


	public static void main(String[] args) {
		new ProjectMain() ;
	}

}
