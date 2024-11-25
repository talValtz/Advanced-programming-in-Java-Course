import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Rectangle;


public class GameController {
	
	private final int SIZE=4;// The size of the grid

	@FXML
	private Canvas canv;
	private Rectangle[][] rect;
	private GraphicsContext gc1 ;
	private Logic lg;
	
	//Initialize the game, create new logic instance, initialize the rectangle grid and create the grid
	public void initialize() {
		lg=new Logic();
		gc1 = canv.getGraphicsContext2D();
		rect = new Rectangle[SIZE][SIZE];
		
		createSquare();
	}

	//Create the grid rectangle by the size of the grid square and render them
	private void createSquare()
	{
		gc1.clearRect(0, 0, canv.getWidth(), canv.getHeight());
		int h=(int) canv.getHeight()/SIZE;
		int w=(int)canv.getWidth()/SIZE;
		for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				rect[i][j]=new Rectangle(w*j, i*h, w, h);
				colorFill(i,j);
				
			}
		}
	}
	
    // Fill the grid square with color based on its state
	private void colorFill(int i,int j) {
		Rectangle selectedRect = rect[i][j];
		if(lg.getCell(i,j)) {
			gc1.setFill(javafx.scene.paint.Color.DARKGRAY);
			gc1.fillRect(selectedRect.getX(), selectedRect.getY(), selectedRect.getWidth(), selectedRect.getHeight());
		}
		gc1.setStroke(javafx.scene.paint.Color.BLACK);
		gc1.strokeRect(selectedRect.getX(), selectedRect.getY(), selectedRect.getWidth(), selectedRect.getHeight());
	}
	
    // Button click event to update the game state
	@FXML
	void btnPressed(ActionEvent event) {
		lg.updateNextLife();
		createSquare();
	}





}
