package interviewpractice.typecast;

public class SuperEmp extends Emp{

	@Override
	public int m1() {
		return 10;
	}
	
	public int hashCode() {
		return 100;
	}
	
	public static void main(String[] args) {
		
		
		SuperEmp obj = new SuperEmp();
		obj.test();
		
	}
	
	public void test() {
		int hashCode = m1();
		System.out.println(hashCode);
		
		int hashCodeVal = hashCode();
		System.out.println(hashCodeVal);
		
	}
	
}

