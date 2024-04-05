public class Triangle {
	private int angleA;
	private int angleB;
	private int angleC;

	public Triangle(int angleA, int angleB){
		this.angleA = angleA;
		this.angleB = angleB;
		this.angleC = 180 - angleA - angleB;
	}
	public int type(){
		int res = 0;
		if (this.angleA + this.angleB + this.angleC < 90){
			res = 1;
		} else if (180 - this.angleA == 90 || 180 - this.angleB == 90
				|| 180 - this.angleC == 90   ){
			res = 2;
		} else if (this.angleA > 90 || this.angleB > 90 || this.angleC > 90) {
			res = 3;
		}
		return res;
	}

	public int specialType(){
		int res = 0;
		if (this.angleA == this.angleB && this.angleB == this.angleC){
			res = 2;
		} else if (this.angleA == this.angleB || this.angleA == this.angleC || this.angleC == this.angleB){
			res = 1;
		}
		if (type() == 2 && res ==1){
			res = 3;
		}
		return res;
	}
}
