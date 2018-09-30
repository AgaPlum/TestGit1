
public class Animal {
private int age;
private String name;
private String address;
private String Town;

public Animal(int age, String name, String address, String town) {
	super();
	this.age = age;
	this.name = name;
	this.address = address;
	Town = town;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getTown() {
	return Town;
}
public void setTown(String town) {
	Town = town;
}

}
