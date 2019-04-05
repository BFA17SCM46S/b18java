package instanceInitializerBlock;

public class InstanceInitializerBlock {

	int numberOfBlocks;

	InstanceInitializerBlock() {
		System.out.println(numberOfBlocks);
	}
	
	{numberOfBlocks = 200;}

	public static void main(String[] args) {
		InstanceInitializerBlock instanceInitializerBlock1 = new InstanceInitializerBlock();
		InstanceInitializerBlock instanceInitializerBlock2 = new InstanceInitializerBlock();
	}

}
