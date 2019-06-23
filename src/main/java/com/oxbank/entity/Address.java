package com.oxbank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Adressid;
	private String BuildingNo;
 private String ApartmentName;
 private String StreetName;
 private long Pincode;
 private String City;
 private String State;
 private String customername;
 public int getAdressid() {
	return Adressid;
}
public void setAdressid(int adressid) {
	Adressid = adressid;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
@ManyToOne
 private Customer customer;
 
public String getBuildingNo() {
	return BuildingNo;
}
public void setBuildingNo(String buildingNo) {
	BuildingNo = buildingNo;
}
public String getApartmentName() {
	return ApartmentName;
}
public void setApartmentName(String apartmentName) {
	ApartmentName = apartmentName;
}
public String getStreetName() {
	return StreetName;
}
public void setStreetName(String streetName) {
	StreetName = streetName;
}
public long getPincode() {
	return Pincode;
}
public void setPincode(long pincode) {
	Pincode = pincode;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
 


}
