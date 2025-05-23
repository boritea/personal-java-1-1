package television;

public class Television {
	int channel;
	int volume;
	boolean onOff;

	int add(int x, int y) {
		return x + y;
	}
	
	int add(int x, int y, int z) {
		return x + y + z;
	}
	
	public static void main(String[] args) {
		Television myTV = new Television();
		myTV.channel = 7;
		myTV.volume = 15;
		myTV.onOff = false;
		
		Television yourTV = new Television();
		yourTV.channel = 207;
		yourTV.volume = 4;
		yourTV.onOff = true;
		
		
	}
}
