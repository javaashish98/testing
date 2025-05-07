package day10;

import java.util.function.Function;

public class FunImpl implements Function<String, String>{

	@Override
	public String apply(String t) {
		
		return t.toUpperCase();
	}

	
	
}
