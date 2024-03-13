package tema1;

public class Variables {
	// atributos 
	private int n;
	private double d;
	private float f;
	private Long l;
	private Byte b;
	private Short s;
	
	/**
	 *  parametros que hemos utilizado
	 * @param n
	 * @param d
	 * @param f
	 * @param l
	 * @param b
	 * @param s
	 */
	public Variables(int n, double d, float f, Long l, Byte b, Short s) {
		this.n = n;
		this.d = d;
		this.f = f;
		this.l = l;
		this.b = b;
		this.s = s;
	}

	protected int getN() {
		return n;
	}

	protected void setN(int n) {
		this.n = n;
	}

	protected double getD() {
		return d;
	}

	protected void setD(double d) {
		this.d = d;
	}

	protected float getF() {
		return f;
	}

	protected void setF(float f) {
		this.f = f;
	}

	protected Long getL() {
		return l;
	}

	protected void setL(Long l) {
		this.l = l;
	}

	protected Byte getB() {
		return b;
	}

	protected void setB(Byte b) {
		this.b = b;
	}

	protected Short getS() {
		return s;
	}

	protected void setS(Short s) {
		this.s = s;
	}
	
	
	

}
