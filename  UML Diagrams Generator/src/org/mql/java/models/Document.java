package org.mql.java.models;

import java.util.List;
import java.util.Vector;

public class Document extends Author implements TestInterface {
	private int id;
	private String title;
	private List<Author> authors;

	public Document() {
		authors = new Vector<Author>();
	}

	public Document(int id) {
		super();
		this.id = id;
		authors = new Vector<Author>();
	}

	public Document(int id, String title) {
		super();
		this.id = id;
		this.title = title;
		authors = new Vector<Author>();
	}
	
	public void add(Author a) {
		authors.add(a);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}



	@Override
	public String toString() {
		return "Document [id=" + id + ", title=" + title + ", authors=" + authors + "]";
	}
	
	public class TestInnerClassA {
		
	}
    public class TestInnerClassB {
		
	}
}

