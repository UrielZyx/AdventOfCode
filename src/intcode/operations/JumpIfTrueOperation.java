package intcode.operations;

import java.util.Arrays;

import intcode.IntcodeMachine;
import intcode.operations.Params.ParamType;

public class JumpIfTrueOperation extends AbstractOperation{
	
	Long nextInstructionCounter = null;
	
	public JumpIfTrueOperation() {
		setParameters(Arrays.asList(ParamType.READ, ParamType.READ));
	}
	
	@Override
	protected void doOperation(Params params, IntcodeMachine machine) {
		
		nextInstructionCounter = null;
		
		if (params.getReadParam(0) != 0) {
			nextInstructionCounter = params.getReadParam(1);
		}
	}
	
	@Override
	protected long getNewInstructionCounter(long i) {
		if (nextInstructionCounter != null) {
			return nextInstructionCounter;
		}
		return super.getNewInstructionCounter(i);
	}	
}