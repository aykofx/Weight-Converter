import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WeightConverterMain extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
        // Load FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("weightconverter.fxml"));
        Parent root = loader.load();
        
        // Set scene
        Scene scene = new Scene(root);
        
        // Configure window
        primaryStage.setTitle("Weight Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
	}

}
