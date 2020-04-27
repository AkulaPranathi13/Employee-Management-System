
public class Employee {
private String firstName;
private String lastname;
private String userName;
private String password;
private String address;
private String contact;
public Employee(String firstName, String lastname, String userName, String password, String address, String contact) {
	this.firstName = firstName;
	this.lastname = lastname;
	this.userName = userName;
	this.password = password;
	this.address = address;
	this.contact = contact;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}



}
