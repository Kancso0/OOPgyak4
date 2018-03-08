
public class EmployeManager {
	public static void main(String[] args) {
//		Employee employee = new Employee();
//		employee.employeeName = "MindlessWorker";
//		employee.salary=1000;
		
//		employee.setEmployeeName("MindlesWorker");
//		employee.setSalary(1000);
		
//		employee.salary= employee.increaseSalary(500, employee.salary);
//		System.out.println(employee.displayInfo(employee.salary, employee.employeeName));
		
//		Employee employee2 = new Employee();
		
//		employee2.setEmployeeName("Pista");
//		employee2.setSalary(2000);
		
//		System.out.println(employee.displayInfo() +employee2.displayInfo());
		
//		System.out.println(employee.isInSalaryRange(500, 3000) +" "+ employee.getTax() + " " + employee.hasHigherSalary(employee2));
	
		Employee[] employeeArray = new Employee[10];
		
		for ( int i = 0;i < employeeArray.length; i++){
			employeeArray[i]= new Employee();
			employeeArray[i].setSalary(i*1000+i*200);
			employeeArray[i].setEmployeeName("MindlesWorker"+i);
			
			
		}
		
		int maxIndex= 0;
		for( int i =1; i< employeeArray.length; i++){
			if (employeeArray[maxIndex].hasHigherSalary(employeeArray[i])){
				maxIndex=i;
			}
			
		}
		System.out.println(employeeArray[maxIndex].getEmployeeName() + " has the highest salary: " + employeeArray[maxIndex].getSalary());
		int db = 0;
		for(int i=0; i < employeeArray.length; i++ ){
			if (employeeArray[i].isInSalaryRange(1000, 5000)){
				db++;
			}
		}
		System.out.println(db + " employees have their salary between 1000 and 5000");
		
	}
}

