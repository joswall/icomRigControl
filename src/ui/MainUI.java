package ui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class MainUI {
	
	Stage primaryStage = null;
	
    public void startMainUI() {
    	
		primaryStage = new Stage();		
        primaryStage.setTitle("ICOM 7200 Rig Control");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 600, 500);
        primaryStage.setScene(scene);
        
        primaryStage.show();
        
    }

}
