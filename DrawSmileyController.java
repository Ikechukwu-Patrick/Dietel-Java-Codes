import JavaFX.event.ActionEvent;
import JavaFX.fxml.FXML;
import JavaFX.scene.canvas.Canvas;
import JavaFX.scene.canvas.GraphicsContext;
import JavaFX.scene.paint.Color;

public class DrawSmileyController{
	@FXML private Canvas canvas;

	@FXML
	void drawSmileyButtonPressed(ActionEvent event){
		GraphicsContext gc = canvas.getGraphicsContext2D();

		gc.setFill(Color.YELLOW);
		gc.fillOval(10, 10, 280, 280);
		gc.strokeOval(10, 10, 280, 280);

		gc.setFill(Color.Black);
		gc.fillOval(75, 85, 40, 40);
		gc.fillOval(185, 85, 40, 40);

		gc.fillOval(50, 130, 200, 120);
		gc.setFill(Color.YELLOW);
		gc.FiiRect(50, 130, 200, 60);
		gc.fillOval(50, 140, 200, 90);

       }

}