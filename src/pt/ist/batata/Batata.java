package pt.ist.batata;

import pt.ist.batata.exception.AlreadyCookedException;

/**
 * The Class Batata.
 */
public class Batata {
	
	/** The weight (kg). */
	private float weight;
	
	/** The sweetness. (scaled from 0 to 10) */
	private int sweetness;
	
	/** The cooked status. */
	private boolean cooked;
	
	/**
	 * Instantiates a new Batata.
	 *
	 * @param weight the weight
	 * @param sweetness the sweetness
	 */
	public Batata(float weight, int sweetness) {
		super();
		this.weight = weight;
		this.sweetness = sweetness;
	}

	/**
	 * Gets the weight.
	 *
	 * @return the weight
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * Sets the weight.
	 *
	 * @param weight the new weight
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}

	/**
	 * Gets the sweetness.
	 *
	 * @return the sweetness
	 */
	public int getSweetness() {
		return sweetness;
	}

	/**
	 * Sets the sweetness.
	 *
	 * @param sweetness the new sweetness
	 */
	public void setSweetness(int sweetness) {
		this.sweetness = sweetness;
	}

	/**
	 * Checks if is cooked.
	 *
	 * @return true, if is cooked
	 */
	public boolean isCooked() {
		return cooked;
	}

	/**
	 * Sets the cooked status.
	 *
	 * @param cooked the new cooked
	 */
	private void setCooked(boolean cooked) {
		this.cooked = cooked;
	}
	
	/**
	 * Cooks the batata.
	 *
	 * @throws AlreadyCookedException the already cooked exception
	 */
	public void cook() throws AlreadyCookedException{
		if(isCooked()){
			throw new AlreadyCookedException();
		}
		setCooked(true);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (cooked ? 1231 : 1237);
		result = prime * result + sweetness;
		result = prime * result + Float.floatToIntBits(weight);
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batata other = (Batata) obj;
		if (cooked != other.cooked)
			return false;
		if (sweetness != other.sweetness)
			return false;
		if (Float.floatToIntBits(weight) != Float.floatToIntBits(other.weight))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Batata [weight=" + weight + ", sweetness=" + sweetness
				+ ", cooked=" + cooked + "]";
	}

	
}
