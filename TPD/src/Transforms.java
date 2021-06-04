import java.lang.Math;
public class Transforms {

	public void resize(Structs.Cordinate c, int a, int b) {
		double[] x = { c.x, c.y, 1 };
		double[] r = { 1, 1, 1 };
		double[][] trans = new double[3][3];
		trans[0][0] = 1;
		trans[0][2] = a;
		trans[1][1] = 1;
		trans[1][2] = b;
		trans[2][2] = 1;

		c.x = (x[0] + trans[0][2]);
		c.y = (x[1] + trans[1][2]);

	}

	public void rescale(Structs.Cordinate c, double n) {
		double[] x = { c.x, c.y, 1 };
		double[] r = { 1, 1, 1 };
		double[][] trans = new double[3][3];
		trans[0][0] = n;
		trans[1][1] = n;
		trans[2][2] = 1;

		c.x = (x[0] * trans[0][0]);
		c.y = (x[1] * trans[1][1]);
	}

	public void rotate(Structs.Cordinate c, double n) {
		
		double[] x = { c.x, c.y, 1 };
		double[] r = { 1, 1, 1 };
		double[][] trans = new double[3][3];
		trans[0][0] = Math.cos(n);trans[0][1] = -1*Math.sin(n);
		trans[1][0] = Math.sin(n);trans[1][1] = Math.cos(n);
		trans[2][2] = 1;
		
		Math.cos(n);
		c.x = (x[0] * trans[0][0] + x[1] * trans[0][1]  );
		c.y = (x[0] * trans[1][0] + x[1] * trans[1][1]  );
	
	}
}
