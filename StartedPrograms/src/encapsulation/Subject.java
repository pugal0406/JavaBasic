package encapsulation;

import java.util.List;
import java.util.Set;

public class Subject {
	private Set<Teacher> setteacher;
	private List<Student> studentlist;
private String subject;
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getSection() {
	return section;
}
public void setSection(String section) {
	this.section = section;
}
public List<Student> getStudentlist() {
	return studentlist;
}
public void setStudentlist(List<Student> studentlist) {
	this.studentlist = studentlist;
}
public Set<Teacher> getSetteacher() {
	return setteacher;
}
public void setSetteacher(Set<Teacher> setteacher) {
	this.setteacher = setteacher;
}
private String section;
}
