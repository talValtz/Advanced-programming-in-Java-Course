public class Logic{
	private Boolean[][]currLife;
	private Boolean[][]nextLife;
	private final int SIZE=4;
	
	// Constructor to initialize the game state
	public Logic() {
		currLife = new Boolean[4][4];
		nextLife = new Boolean[4][4];
		initialArr();
	}
	
	 // Initialize the grid with random true/false values
	private void initialArr() {
		boolean randomBoolean;
		for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				randomBoolean = Math.random() < 0.5;
				currLife[i][j]=randomBoolean;
			}
		}
	}
	
	// Get the state of a specific cell
	public Boolean getCell(int i,int j) {
		return currLife[i][j];
	}
	
    // Update the grid to the next generation
	public void updateNextLife() {
		for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				checkNext(i,j);
			}
		}
		updateCurrLife();
	}
	
    // Copy the next generation grid to the current grid
	private void updateCurrLife() {
		for(int i=0;i<SIZE;i++) {
			for (int j=0;j<SIZE;j++) {
				currLife[i][j]=nextLife[i][j];
			}
		}
	}
	
    // Calculate the next state of a specific cell
	private void checkNext(int i, int j) {
		int count=0;
		for(int k=i-1;k<=i+1;k++) {
			for(int l=j-1;l<=j+1;l++) {
				if(k>=0&&k<4&&l>=0&&l<SIZE) {
					if(currLife[k][l]&&((i!=k)||(l!=j))) {
						count++;
					}
				}
			}
		}
		// Apply Game of Life rules
        if (!currLife[i][j]) { 
            nextLife[i][j] = count == 3; 
        } else { 
            nextLife[i][j] = count >= 2 && count <= 3;
        }
	}
	
	
	
	
	
}