package encapsulation;

import java.util.List;

public class Student {
	private List<Teacher> teacher;
private String studname;
public String getStudname() {
	return studname;
}
public void setStudname(String studname) {
	this.studname = studname;
}
public String getStudclass() {
	return studclass;
}
public void setStudclass(String studclass) {
	this.studclass = studclass;
}
public int getStudrollno() {
	return studrollno;
}
public void setStudrollno(int studrollno) {
	this.studrollno = studrollno;
}
public List<Teacher> getTeacher() {
	return teacher;
}
public void setTeacher(List<Teacher> teacher) {
	this.teacher = teacher;
}
private String studclass;
private int studrollno;
}
