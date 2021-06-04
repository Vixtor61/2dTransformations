
public class OpLevel {
	
		int L = 1;
		int MAX_LEVEL = 5;
		Operation Op;
		
		double[] levelValues = new double[MAX_LEVEL];
		public void modifyLevel(boolean op) {
			if (op) {
				if (this.L >= MAX_LEVEL )
					return;
				this.L++;
			} else {
				if (this.L <= 1)
					return;
				this.L--;
			}
		}
		
		public OpLevel(Operation Operation) {
			// TODO Auto-generated constructor stub
			for (int i = 0; i < levelValues.length; i++) {
				levelValues[i] = i+1;
			}
			this.L =  (int) Math.ceil(((double)(MAX_LEVEL))/2);
			this.Op = Operation;
		}
		public OpLevel(Operation Operation,double[] levels) {
			// TODO Auto-generated constructor stub
			this.levelValues = levels;
			this.L =  (int) Math.ceil(((double)(MAX_LEVEL))/2);
			this.Op = Operation;
		}
		
		public double returnLevelVal() {
			return levelValues[L-1];
		}
	
}
