/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mymementoproject;

//package Momento;

import java.util.ArrayList;

public class Caretaker {
	
	ArrayList<Momento> savedArticle = new ArrayList<Momento>();
	public void addMomento(Momento m) { savedArticle.add(m); }
	public Momento getMomento(int index) { return savedArticle.get(index); }

}
