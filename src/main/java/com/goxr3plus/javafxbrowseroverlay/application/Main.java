package main.java.com.goxr3plus.javafxbrowseroverlay.application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import main.java.com.goxr3plus.javafxwebbrowser.browser.WebBrowserController;

public class Main extends Application {
	
	WebBrowserController webBrowser = new WebBrowserController();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane borderPane = new BorderPane(webBrowser);
		
		Scene scene = new Scene(borderPane);
		
		//Create the PrimaryStage
		primaryStage.setTitle("Scene");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
