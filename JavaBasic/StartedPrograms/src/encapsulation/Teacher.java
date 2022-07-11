package encapsulation;

public class Teacher {
private String techname;
public String getTechname() {
	return techname;
}
public void setTechname(String techname) {
	this.techname = techname;
}
public String getTechsub() {
	return techsub;
}
public void setTechsub(String techsub) {
	this.techsub = techsub;
}
public int getTechid() {
	return techid;
}
public void setTechid(int techid) {
	this.techid = techid;
}
private String techsub;
private int techid;
}
