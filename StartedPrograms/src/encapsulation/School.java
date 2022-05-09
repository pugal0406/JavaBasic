package encapsulation;

import java.util.ArrayList;
import java.util.List;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student st=new Student();
st.setStudname("vijay");
st.setStudclass("b");
st.setStudrollno(2112);

st.setStudname("pugal");
st.setStudclass("a");
st.setStudrollno(2136);

st.setStudname("siva");
st.setStudclass("c");
st.setStudrollno(2122);

/*
 * st.getStudname(); st.getStudclass(); st.getStudrollno();
 */
List<Student> stlist=new ArrayList();
stlist.add(st);
stlist.forEach(slist ->{System.out.println(slist.getStudname()+" "+slist.getStudclass()+" "+slist.getStudrollno());});
	}

}
