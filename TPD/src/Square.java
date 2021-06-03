public class Square {
	int N_OF_VERTICES=4;
	
	Structs.Cordinate[] cords = new Structs.Cordinate[N_OF_VERTICES];
	Structs.Arist[] arists = new Structs.Arist[N_OF_VERTICES];
	
	public Square(int x,int y, int size) {
		//Creates square structure
		cords[0]=new Structs.Cordinate(x,y);
		cords[1]=new Structs.Cordinate(x,y+size);
		cords[2]=new Structs.Cordinate(x+size,y+size);
		cords[3]=new Structs.Cordinate(x+size,y);
		
		arists[0] = new Structs.Arist(cords[0], cords[1]);
		arists[1] = new Structs.Arist(cords[1], cords[2]);
		arists[2] = new Structs.Arist(cords[2], cords[3]);
		arists[3] = new Structs.Arist(cords[3], cords[0]);
		

	}
	
	public void resizeSqr(int a, int b) {
		Transforms d= new Transforms();
		for (int i = 0; i < N_OF_VERTICES; i++) {
			d.resize(cords[i], a, b);
		}
		
	
		
	}

	public void printCords() {
		for (int i = 0; i < N_OF_VERTICES; i++) {
		//	System.out.print("");
			System.out.print("("+ cords[i].x + " " + cords[i].y + ")");
			
		}
		System.out.print("\n");
		
	}

}
