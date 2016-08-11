package main;

import javafx.stage.Stage;

public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		utils.fileUtils futil = new utils.fileUtils();
		futil.updateConfig();
		
		//call ui to start interface
				
		ui.MainUI mainui = new ui.MainUI();
		mainui.startMainUI();
		
		
	}
	
	
	}
	
