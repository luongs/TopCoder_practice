import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;


public class Instructions_helper {
	
	//TODO: Add proper error handling instead of simply returning

	public static String[] readInstruction(String instr){
		String[] strArr = instr.split("\\s+");
		return strArr;
	}
	
	public static void addInstrToStruct(String[] instrArr, Queue<String[]> commandQ, 
										Stack<String[]> txnStack, boolean setInTxn){
		// check if transaction command is set (BEGIN, ROLLBACK, COMMIT)
		String command = instrArr[Constants.COMMAND];
		
		if (command.equals(Constants.BEGIN)){
			setInTxn = true; 
			begin(txnStack, instrArr);
		}
		else if (command.equals(Constants.ROLLBACK)){
			rollback(txnStack);
		}
		else if (command.equals(Constants.COMMIT)){
			setInTxn = false; 
			commit(txnStack, commandQ);
		}
		else{
			// Other commands within nested blocks are added
			if (setInTxn)
				txnStack.add(instrArr);
			else 
			// commands outside block are automatically added to the command queue
				commandQ.add(instrArr);
		}
			
	}
	
	public static void executeInstruction(String[] instrArr, HashMap<String, Integer> hm,
											HashMap<Integer, Integer> hmValues)
	{
		// Determine the amount of variables saved
		String command = instrArr[Constants.COMMAND];
		if (instrArr.length == 1){
			if (command.equals(Constants.END))
				end();
			else
				// Invalid command
				return; 
		}
		String variable = instrArr[Constants.VARIABLE];
		if (instrArr.length == 2){
			// GET, UNSET, NUMEQUALTO
			if (command.equals(Constants.GET))
				get(variable, hm);
			else if (command.equals(Constants.UNSET))
				unset(variable, hm);
			else if (command.equals(Constants.NUMEQUALTO)){ // NUMEQUALTO
				int value = Integer.parseInt(variable);
				numEqualTo(value, hmValues);
			}
			else{
				// Invalid instruction input
				return;
			}
		}
		else if (instrArr.length == 3){
			// SET
			int value = Integer.parseInt(instrArr[Constants.VALUE]);
			set(variable, value, hm, hmValues);
		}
		else {
			// Reject > 3 variables
			return; 
		}
		
		
	}
	
	// Data commands	
	public static void set(String name, int value, HashMap<String, Integer> hm, HashMap<Integer, Integer> hmValues){
		// variable has not been set yet
		if (!hm.containsKey(name)){
			hm.put(name, value);
			// update amount of value present
			updateHmValues(value, hmValues);
		}
		// variable has been set
		else{
			// previous value must be decremented for hmValues/hm
			int previousValue = hm.get(name);
			decrementHmValues(previousValue, hmValues);
			hm.remove(name);
			// update hmValues/hm 
			hm.put(name, value);
			updateHmValues(value, hmValues);
		}
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
	
	public static void numEqualTo(int value, HashMap<Integer, Integer> hmValues){
		
		if (hmValues.containsKey(value)){
			int count = hmValues.get(value);
			System.out.println("Amount of variable: "+count);
		}
		else 
			System.out.println(Constants.NUM_EQUAL_TO_NULL);
	}
	
	public static void updateHmValues(int value, HashMap<Integer, Integer> hmValues){
		if (!hmValues.containsKey(value)){
			// New value set, set count to 1
			hmValues.put(value, 1);
		}
		else{
			hmValues.put(value, hmValues.get(value)+1);
		}
	}
	
	public static void decrementHmValues(int previousValue, HashMap<Integer, Integer> hmValues){
		hmValues.put(previousValue, hmValues.get(previousValue)-1);
	}
	
	public static void end(){
		System.exit(0);
	}
	
	// Transaction commands
	
	public static void begin(Stack<String[]> txnStack, String[] instrArr){
		txnStack.push(instrArr);
	}
	
	public static void rollback(Stack<String[]> txnStack){
		if (!txnStack.isEmpty())
			txnStack.pop();
		else 
			System.out.println("NO TRANSACTION");
	}
	
	public static void commit(Stack<String[]> txnStack, Queue<String[]> commandQ){
		if (!txnStack.isEmpty()){
			while (!txnStack.isEmpty())
				commandQ.add(txnStack.pop());
		}
		else 
			System.out.println("NO TRANSACTION");
	}
}
