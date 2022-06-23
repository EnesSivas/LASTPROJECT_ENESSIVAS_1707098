/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.enes_sivas_project;

/**
 *
 * @author eness
 */
public class Drone {
public String Brand = "";
public int height=0;
private	String Direction="";
private	String Way="";
private	String Speed="";
protected boolean isLeftMotorsWork=false;
protected boolean isRightMotorsWork=false;
public String Colour ="";
protected static int numberRotors=0;
public static int NumberWeight=0;
public boolean	isOn=false;

public void TurnRight(int x){}
public void TurnLeft(int x){}
public void Reverse(boolean x){}
public void turnOn(boolean x){}


public	void setBrand(String x){
    Brand=x; 
}
public	String getBrand(){
    return Brand;
}
public int getheight(){
    return height;
}
public void setheight(int x){
    height=x;
}
public	void setDirection(String x){
    Direction=x; 
}
public	String getDirection(){
    return Direction;
}
public	void setSpeed(String x){
    Speed=x; 
}
public	String getSpeed(){
    return Speed;
}
public	void setWay(String x){
    Way=x; 
}
public	String getWay(){
    return Way;
}	

public	 boolean getisLeftMotorsWork(){
    return isLeftMotorsWork;
}	

public	void setisLeftMotorsWork(boolean x){
    isLeftMotorsWork=x;
}
public	boolean	getisRightMotorsWork(){
    return isRightMotorsWork;
}	
public void setisRightMotorsWork(boolean x){
    isRightMotorsWork=x;
}
public	String getColour(String x){
    return Colour;
}
public	void setColour(String x){
    Colour = x;
}
public static int getisnumberRotors(){
    return numberRotors;
}
public void setisnumberRotors(int x){
    numberRotors=x;
}
public static int getisNumberWeight(){
    return numberRotors;
}
public void setisNumberWeight(int x){
    numberRotors=x;
}
public	 boolean getisisOn(){
    return isOn;
}	
public	void setisisOn(boolean x){
    isOn=x;
}
}



        
