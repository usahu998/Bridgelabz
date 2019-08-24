package com.bridgelabz.oops_program;

import java.io.Serializable;

public class Pro1_DataImp implements Serializable {
private String Rice,pulse,Wheats;
private String name;
private float weight;
private float price;
public String getRice() {
	return Rice;
}
public void setRice(String rice) {
	Rice = rice;
}
public String getPulse() {
	return pulse;
}
public void setPulse(String pulse) {
	this.pulse = pulse;
}
public String getWheats() {
	return Wheats;
}
public void setWheats(String wheats) {
	Wheats = wheats;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getWeight() {
	return weight;
}
public void setWeight(float weight) {
	this.weight = weight;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
}