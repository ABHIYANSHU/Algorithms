package algorithms;

/**
 * @author Abhinav Srivastava
 * Euclid's Algorithm
 */
public class GCD {

	//For byte
	public byte getGCD(byte item, byte item1) {
		byte r = (byte)(item%item1);
		if(r==0)
			return item1;
		item=item1;
		item1=r;
		return getGCD(item, item1);
	}
	
	//For short
	public short getGCD(short item, short item1) {
		short r = (short)(item%item1);
		if(r==0)
			return item1;
		item=item1;
		item1=r;
		return getGCD(item, item1);
	}
	
	//For Integer
	public int getGCD(int item, int item1) {
		int r = (item%item1);
		if(r==0)
			return item1;
		item=item1;
		item1=r;
		return getGCD(item, item1);
	}
	
	//For Long
	public long getGCD(long item, long item1) {
		long r = (long)(item%item1);
		if(r==0)
			return item1;
		item=item1;
		item1=r;
		return getGCD(item, item1);
	}
}