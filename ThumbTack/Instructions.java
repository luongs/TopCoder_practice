import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


public class Instructions {
	Queue<String[]> commandQ;
	Queue<String[]> rollbackQ;
	HashMap<String, Integer> hm; 
	
	public Instructions(){
		commandQ = new LinkedList<String[]>();
		rollbackQ = new LinkedList<String[]>();
		hm = new HashMap<String, Integer>();
	}
	
	public void saveInstr(String instr){
		String[] instrArr = Instructions_helper.readInstruction(instr); 
		commandQ.add(instrArr);
		rollbackQ.add(instrArr); 
	}
	
	public void execInstr(){
		while (!commandQ.isEmpty()){
			String[] tempInstr = commandQ.remove(); 
			Instructions_helper.executeInstruction(tempInstr, hm);
		}
	}

	public Queue<String[]> getCommandQ() {
		return commandQ;
	}

	public void setCommandQ(Queue<String[]> commandQ) {
		this.commandQ = commandQ;
	}

	public Queue<String[]> getRollbackQ() {
		return rollbackQ;
	}

	public void setRollbackQ(Queue<String[]> rollbackQ) {
		this.rollbackQ = rollbackQ;
	}
	
	
}
