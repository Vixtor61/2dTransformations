

public class Transforms {

	
	public void resize(Structs.Cordinate c,int a, int b) {
			int[] x = {c.x,c.y,1};
			int[] r = {1,1,1};
			int[][] trans = new int[3][3];
			trans[0][0] =1;trans[0][2]=a;
			trans[1][1] =1;trans[1][2]=b;
			trans[2][2] =1;
			
			r[0]=(x[0]+trans[0][2]);
			r[1]=(x[1]+trans[1][2]);
			
			c.x=r[0];
			c.y=r[1];
			
			
	}
	

}

