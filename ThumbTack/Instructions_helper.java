import java.util.HashMap;


public class Instructions_helper {

	public static String[] readInstruction(String instr){
		String[] strArr = instr.split("\\s+");
		return strArr;
	}
	
	public static void executeInstruction(String[] instrArr, HashMap<String, Integer> hm){
		// Determine the amount of variables saved
		String command = instrArr[Constants.COMMAND];
		if (instrArr.length == 1){
			// Used for END function
			return; 
		}
		String variable = instrArr[Constants.VARIABLE];
		if (instrArr.length == 2){
			// GET, UNSET, NUMEQUALTO
			if (command.equals(Constants.GET))
				get(variable, hm);
			else if (command.equals(Constants.UNSET))
				unset(variable, hm);
			else // NUMEQUALTO	
				numEqualTo(variable, hm);
		}
		else{	// Used for 3 variables
			// SET
			int value = Integer.parseInt(instrArr[Constants.VALUE]);
			set(variable, value, hm);
		}
		
		
	}
	
	public static void set(String name, int value, HashMap<String, Integer> hm){
		hm.put(name, value);
	}
	
	public static void get(String name, HashMap<String, Integer> hm){
		if (hm.containsKey(name))
			System.out.println("Value at "+name+": "+hm.get(name));
		else 
			System.out.println(Constants.GET_NULL);
		
	}
	
	public static void unset(String name, HashMap<String, Integer> hm){
		if (hm.containsKey(name))
			hm.remove(name);
		else 
			System.out.println(Constants.ERROR_NO_VALUE);
	}
	
	public static void numEqualTo(String variable, HashMap<String, Integer> hm){
		
		if (hm.containsKey(variable)){
			
		}
		else 
			System.out.println(Constants.NUM_EQUAL_TO_NULL);
	}
	
	public static void end(){
		System.exit(0);
	}

}
