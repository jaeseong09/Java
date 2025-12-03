package eaxm1027;

public class MyStick implements Usb{
	public long size= 8 * 1073741824L;
	public long currentSize=0;
	
	public MyStick() {
	}
	
	public MyStick(long giga) {
		size=giga*1073741824L;
	}
	
	
	public String read() {
		return "총 "+currentSize+"바이트 사용.";
	}
	
	
	public void write(long dataSize) {
		long letfSize = size - currentSize;
		if(dataSize<=size) {
			currentSize+=dataSize;
		}
	}

}
