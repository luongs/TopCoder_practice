import java.util.LinkedList;
import java.util.Queue;


public class Instructions {
	Queue<String[]> commandQ;
	Queue<String[]> rollbackQ;
	
	public Instructions(){
		commandQ = new LinkedList<String[]>();
		rollbackQ = new LinkedList<String[]>();
	}
	
	public void saveInstr(String instr){
		String[] instrArr = Instructions_helper.readInstruction(instr); 
		commandQ.add(instrArr);
		rollbackQ.add(instrArr); 
	}
}
