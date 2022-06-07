/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mymementoproject;

//package Momento;

public class Originator {

	private String article;
	
	public void set(String newArticle) {
		System.out.println("From Originator: Current version of Article\n" + newArticle + "Jn");
		article = newArticle;
	}
	
	public Momento storeInMomento() {
		System.out.println("From Originator : Saving to Momento");
		return new Momento(article);
	}
	
	public String restoreFromMomento(Momento momento) {
		article = momento.getSavedArticle();
		System.out.println("From Originator : Previous Article Saved in Momento\n"+article+"\n");
		return article;
	}
}
