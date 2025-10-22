package oops.methodDetails.overloading;

class Teachers{

/* private String name;
private long  salary;
private String subject;



public Teachers(String name, String subject, long salary){
	this.name=name;
	this.salary=salary;
	this.subject=subject;
	
}
public String getName(){
return name;
}
public String getSubject(){
	return subject;
}
public long getSalary(){
	return salary;
}
}*/


    private String name;
    private double salary; 
    private String subject;

    public Teachers(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }
}