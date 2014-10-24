
public class Driver {

	public static void main(String[] args) {
		Instructions instr = new Instructions();
		instr.saveInstr("SET ex 10");
		instr.saveInstr("GET ex");
		instr.saveInstr("UNSET ex");
		instr.saveInstr("GET ex");
		instr.saveInstr("END");
		instr.execInstr();
		
		instr.saveInstr("SET ex 10");
		instr.saveInstr("GET ex");
		instr.execInstr();
	}

}
