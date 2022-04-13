package application;

public class AppController {
	
	private Stage meineStage;
	private MediaPlayer mediaplayer;
	
	@FXML private MediaView mediaview;
	@FXML private ImageView symbol;
	@FXML private ListView<String> liste;
	
	public void setMeineStage(Stage meineStage) {
		this.meineStage = meineStage;
	
	}
	
	// Mediaplayer beenden
	@FXML protected void beendenKlick(ActionEvent event) {
		Platform.exit;
	}
	
	// Abspielen stoppen
	@FXML protected void stoppKlick(ActionEvent event) {
		if(mediaplayer != null) {
			mediaplayer.stop();
		}
	}
	
	// Abspielen pausieren
	@FXML protected void pauseKlick(ActionEvent event) {
		if(mediaplayer != null) {
				mediaplayer.pause();
		}
	}
	
	// Wiedergabe
	@FXML protected void startKlick(ActionEvent event) {
		if(mediaplayer != null) {
				mediaplayer.play();
		}
	}
	
	
	
	
}
