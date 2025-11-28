package advance.collectionConcept.comparableConcept;

public  class Student implements Comparable{
	{
}

		// TODO Auto-generated method stub
		private int id;
	private String name;
	private int age;
	public int  getId() {
		return id;
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
	return name;
	}
	public  void  setName(String name) {
	 this.name=name;

	}
	public int getAge() {
		return age;

	}
	public void setAge(int age) {
		this.age=age;
		
	}
@Override
public String toString() {
	return "Student[id=" +id+",name=" +name+ ",age="+age+"]";
}
@Override
public int hashCode() {
	return id;
}
@Override
public boolean equals(Object obj) {
	Student st3=(Student)obj;
	this.id=st3.id;
	
return super .equals(obj);
}
@Override
public int compareTo(Object o) {
	Student s1=(Student) o;
	return this.id-s1.id;
	
}

}
