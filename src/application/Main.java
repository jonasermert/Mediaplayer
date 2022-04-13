package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage meineStage) throws Exception {
		FXMLLoader meinLoader = new FXMLLoader(getClass().getResource("je_mediaplayer.fxml));"
		Parent root = meinLoader.load();
		FXMLController meinController = meinLoader.getController();
		meinController.setmeineStage(meineStage);
		Scene meineScene = new Scene(root, 800, 600);
		meineStage.setTitle("Jonas Mediaplayer");
		meineStage.setScene(meineScene);
		meineStage.setMaximized(true);
		meineStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
