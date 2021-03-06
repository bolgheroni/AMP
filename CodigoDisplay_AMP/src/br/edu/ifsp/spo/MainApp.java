package br.edu.ifsp.spo;

import java.io.IOException;

import br.edu.ifsp.spo.model.Exercise;
import br.edu.ifsp.spo.view.TestOverviewController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage primaryStage;
    private BorderPane rootLayout;
    private ObservableList<Exercise> exerciseData =  FXCollections.observableArrayList();

    public MainApp() {
		exerciseData.add(new Exercise("Jogo", "Sim"));
		exerciseData.add(new Exercise("C�sar", "Sim"));
		exerciseData.add(new Exercise("Jo�ozinho", "N�o"));
	}

    public ObservableList<Exercise> getExerciseData(){
    	return exerciseData;
    }

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("BOI");

        initRootLayout();
        showTestOverview();

	}

	public void initRootLayout() {
        try {
        	//Carrega o root layout
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            //Inicia o a cena com o root layout
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public void showTestOverview() {
        try {
            //Carrega o test overview
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/TestOverview.fxml"));
            AnchorPane testOverview = (AnchorPane) loader.load();

            // Coloca o test overview dentro root layout
            rootLayout.setCenter(testOverview);

            //Permite que o controller tenha acesso a main
            TestOverviewController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public static void main(String[] args) {
		launch(args);
	}
}
