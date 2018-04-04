package com.airhacks;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean(name="student")
@SessionScoped
public class StudentBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private static long  x = 000;
	private static final ArrayList<Student> students = 
			new ArrayList<Student>(
			Arrays.asList(
					new Student(2332,"Test", "Test", "Test",4444, "Test"),
					new Student(21232,"Te2st", "Tes2t", "Tes2t",3333, "T2est")
					));
	
	public ArrayList<Student> getStudents() {
		return students;
	}


	public static class Student{
		private long martikelnummer;
		private String nachname;
		private String vorname;
		private String adresse;
		private Integer postleitzahl;
		private String ort;
		
		
		public Student(long martikelnummer, String nachname, String vorname, String adresse, Integer postleitzahl, String ort) {
			super();
			this.martikelnummer = martikelnummer;
			this.nachname = nachname;
			this.vorname = vorname;
			this.adresse = adresse;
			this.postleitzahl = postleitzahl;
			this.ort = ort;
		  }

		public long getMartikelnummer(){
			return this.martikelnummer;
		}
	
		public void setMartikelnummer(long martikelnummer){
			this.martikelnummer = martikelnummer;
		}
	
		public String getVorname(){
		  return this.vorname;
		}
	  
		public void setVorame(String vorname){
		  this.vorname = vorname;
		}
	  
		public String getNachname(){
		  return this.nachname;
		}
	  
		public void setNachname (String nachname){
		  this.nachname = nachname;
		}
	
	  
		public String getAdresse(){
		  return this.adresse;
		}
	
		public void setAdresse(String adresse){
		  this.adresse = adresse;
		}
	
		public Integer getPostleitzahl(){
			return this.postleitzahl;
		}
	
		public void setPostleitzahl(Integer postleitzahl){
			this.postleitzahl = postleitzahl;
		}
	
		public String getOrt(){
			return this.ort;
		}
	
		public void setOrt(String ort){
			this.ort = ort;
		}

	}
}