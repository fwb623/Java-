package src;

public class Test {

	public static void main(String[] args) { 	// TODO Auto-generated method stubCPU cpu = new CPU();

	CPU cpu = new CPU();
		
	HardDisk HD=new HardDisk();

    cpu.setSpeed(2200);

    HD.setAmount(200);

    PC pc =new PC();

    pc.setCPU(cpu);

    pc.setHardDisk(HD);

    pc.show();
	

	}

}
