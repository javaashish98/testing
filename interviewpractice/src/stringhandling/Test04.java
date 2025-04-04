package stringhandling;

public class Test04 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb = sb.append("Ashsih");
		System.out.println(sb.hashCode());

		sb = sb.append(" ");
		System.out.println(sb.hashCode());

		sb = sb.append("Sahu");
		
		System.out.println(sb.hashCode());
		
		
		
	}
	
}
