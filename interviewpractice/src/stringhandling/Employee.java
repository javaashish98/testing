package stringhandling;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

	private Integer empNo;
	private String empName;
	private Integer age;
	
//like immutable
	//not changing on same object
	//changing on new object
public Employee upateName(String name) {
return new Employee(this.empNo, name, this.age);
}


//mutable
//changing on the same object
public void updateNameNormally(String name) {
	
	this.empName = name;
	
}
	
	
}
