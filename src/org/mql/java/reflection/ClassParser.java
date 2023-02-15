package org.mql.java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Vector;


public class ClassParser {
	
    private String className ;
    
    private int propreteCounter ;
    private int methodsCounter ;
    private int constructCounter ;
    private int innerClassCounter ;
    
	
	public ClassParser(String className) {
		this.className = className ;
        System.out.println("Nom complètement qualifié de la classe : " + getClassName());
        System.out.println("Nom simple de la classe : " + getSimpleClassName());
		getClassAttributs();
		getClassMethods();
		getClassConstructors();
		getClassInnerClasses();
	}
	
    // Afficher le nom de nom complètement qualifié de la classe
    public String  getClassName() {
    	
    	    	@SuppressWarnings("unused")
				Class<?> testClass = null;
				try {
					testClass = Class.forName(className);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    	    	    	        	
    	 return testClass.getName() ;
    	 }
    
    // Afficher le nom de nom complètement qualifié de la classe
    public String  getSimpleClassName() {
    	@SuppressWarnings("unused")
		Class<?> testClass = null;
		try {
			testClass = Class.forName(className);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	    	        	
        return testClass.getSimpleName() ;    
 }
    
    
    // Afficher les propriétés de la classe avec leur type, leur signature et leurs modificateurs
    public void  getClassAttributs() {
    	propreteCounter = 0;
    	System.out.println("----------------");
   	    try {
   	    	@SuppressWarnings("unused")
			Class<?> testClass = Class.forName(className) ;
   	    	Field fields[] = testClass.getDeclaredFields();
			  for (Field field : fields) {
				  System.out.println("Attribut Name : " + field.getName() + "  =>  Type : " + field.getType());
				  propreteCounter++;
			  }
   	    	} catch (ClassNotFoundException e) {
   	    	e.printStackTrace();
   	    }
     }
    
    // Afficher les méthodes de la classe avec leur type, leur signature et leurs modificateurs
    public void  getClassMethods() {
    	methodsCounter = 0;
    	System.out.println("----------------");
   	    try {
   	    	@SuppressWarnings("unused")
			Class<?> testClass = Class.forName(className) ;
   	    	Method Methods[] = testClass.getMethods();
			  for (Method Method : Methods) {
				  System.out.println("Attribut Name : " + Method.getName() + "  =>  Type : ");
				  methodsCounter++;
			  }
   	    	} catch (ClassNotFoundException e) {
   	    	e.printStackTrace();
   	    }
     }
    
    // Afficher les constructeurs de la classe avec leur type, leur signature et leurs modificateurs
    public void  getClassConstructors() {
    	constructCounter = 0;
    	System.out.println("----------------");
   	    try {
   	    	@SuppressWarnings("unused")
			Class<?> testClass = Class.forName(className) ;
   	    	Constructor<?>[] constructors = testClass.getConstructors();
			  for (Constructor<?> constructor : constructors) {
				  System.out.println("Constructor Name : " + constructor.getName() + "()");
				  constructCounter++;
			  }
   	    	} catch (ClassNotFoundException e) {
   	    	e.printStackTrace();
   	    }
     }
    
    
    // Afficher la classe dont elle hérite
    public Class<?> getSuperClass() throws ClassNotFoundException{
    	Class<?> testClass = Class.forName(className);
		return testClass.getSuperclass();
	}
    
    public Vector<Class<?>> getHeritageChaine() throws ClassNotFoundException{
    	Class<?> testClass = Class.forName(className);
		Class<?> classTmp = testClass;
		Vector<Class<?>> classes = new Vector<Class<?>>();
		while (classTmp != null) {
			classes.add(classTmp);
			classTmp = classTmp.getSuperclass();
		}
		return classes;
	}
    
    // Afficher les modificateurs de la classe
    
    // Afficher les interfaces implémentées
    
    // Afficher les classes internes
    public void  getClassInnerClasses() {
    	innerClassCounter = 0 ;
    	System.out.println("----------------");
   	    try {
   	    	@SuppressWarnings("unused")
			Class<?> testClass = Class.forName(className) ;
   	    	Class<?>[] innerClasses = testClass.getDeclaredClasses();
			  for (Class<?> innerClass : innerClasses) {
				  System.out.println("Inner Class : " + innerClass.getName() + "()");
				  innerClassCounter++;
			  }
   	    	} catch (ClassNotFoundException e) {
   	    	e.printStackTrace();
   	    }
     }

	public int getConstructCounter() {
		return constructCounter;
	}

	public void setConstructCounter(int constructCounter) {
		this.constructCounter = constructCounter;
	}
	
	public int getPropreteCounter() {
		return propreteCounter;
	}

	public void setPropreteCounter(int propreteCounter) {
		this.propreteCounter = propreteCounter;
	}

	public int getMethodsCounter() {
		return methodsCounter;
	}

	public void setMethodsCounter(int methodsCounter) {
		this.methodsCounter = methodsCounter;
	}

	public int getInnerClassCounter() {
		return innerClassCounter;
	}

	public void setInnerClassCounter(int innerClassCounter) {
		this.innerClassCounter = innerClassCounter;
	}


    

}
