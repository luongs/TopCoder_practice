
public class Driver {

	public static void main(String[] args) {
		Instructions instr = new Instructions();
		instr.saveInstr("BEGIN");
		instr.saveInstr("SET a 10");
		instr.saveInstr("GET a");
		instr.saveInstr("BEGIN");
		instr.saveInstr("SET a 20");
		instr.saveInstr("GET a");
		instr.saveInstr("ROLLBACK");
		instr.saveInstr("GET a");
		instr.saveInstr("ROLLBACK");
		instr.saveInstr("GET a");
		instr.saveInstr("END");
		
	}

}
