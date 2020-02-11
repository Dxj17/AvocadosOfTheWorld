/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 */

package fruit1;

/***
 * An Abstract class upon which we will build fruits
 * 
 * @author nicomp
 *
 */
public abstract class Fruit1 {
	private int weigth;
	private float cost;
	/***
	 * Constructor 
	 * @param weigth weigth of the fruit 
	 * @param cost cost of the fruit 
	 */
	public Fruit1(int weigth, float cost) {
		setWeigth(weigth);
		setCost(cost);
		
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
public String toString() {
	return "Weigth = " + weigth + " Cost = "+ cost;
	
}
}
