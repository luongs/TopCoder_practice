import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Instructions {
	Queue<String[]> commandQ;
	Stack<String[]> txnStack;
	HashMap<String, Integer> hm;
	HashMap<Integer, Integer> hmValues;
	
	public Instructions(){
		commandQ = new LinkedList<String[]>();
		txnStack = new Stack<String[]>();
		hm = new HashMap<String, Integer>();
		hmValues = new HashMap<Integer, Integer>();
	}
	
	public void saveInstr(String instr){
		if (instr==null)
			return;
		String[] instrArr = Instructions_helper.readInstruction(instr); 
		//commandQ.add(instrArr);
		Instructions_helper.addInstrToStruct(instrArr, commandQ, txnStack);
	}
	
	public void execInstr(){
		while (!commandQ.isEmpty()){
			String[] tempInstr = commandQ.remove(); 
			Instructions_helper.executeInstruction(tempInstr, hm, hmValues);
		}
	}

	public Queue<String[]> getCommandQ() {
		return commandQ;
	}

	public void setCommandQ(Queue<String[]> commandQ) {
		this.commandQ = commandQ;
	}

	public Stack<String[]> getTxnStack() {
		return txnStack;
	}

	public void setRollbackQ(Stack<String[]> txnStack) {
		this.txnStack = txnStack;
	}
	
	
}
