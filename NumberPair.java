package Craps;

/**
 * 
 * @author Jordan Damron & Sally Holmes
 *
 */

public class NumberPair {
	
	private int d1;
	private int d2;
	
	/**
	 * <b>NumberPair</b>
	 * Constructor for a NumberPair object
	 * @param d1 the value to be initialized to d1
	 * @param d2 the value to be initialized to d2
	 */
	public NumberPair(int d1, int d2)
	{
		this.d1 = d1;
		this.d2 = d2;
	}
	
	/**
	 * <b>hashCode</b>
	 * Default hash code generation
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + d1;
		result = prime * result + d2;
		return result;
	}
	
	/**
	 * <b>equals</b>
	 * Default equals method
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NumberPair other = (NumberPair) obj;
		if (d1 != other.d1)
			return false;
		if (d2 != other.d2)
			return false;
		return true;
	}
}
