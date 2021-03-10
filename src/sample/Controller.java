package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Controller {

    @FXML
    AnchorPane charizard;
    @FXML
    AnchorPane mew;
    @FXML
    AnchorPane ninetiles;
    @FXML
    AnchorPane articuno;
    @FXML
    AnchorPane mewtwo;
    @FXML
    AnchorPane snorlax;
    @FXML
    Button boton1;



    public void click1(MouseEvent mouseEvent) {
        charizard.setStyle("-fx-background-color: #00FFD1;");
        mew.setStyle("-fx-background-color: #06799B;");
        ninetiles.setStyle("-fx-background-color: #06799B;");
        articuno.setStyle("-fx-background-color: #06799B;");
        mewtwo.setStyle("-fx-background-color: #06799B;");
        snorlax.setStyle("-fx-background-color: #06799B;");
    }
    public void click2(MouseEvent mouseEvent) {
        charizard.setStyle("-fx-background-color: #06799B;");
        mew.setStyle("-fx-background-color: #00FFD1;");
        ninetiles.setStyle("-fx-background-color: #06799B;");
        articuno.setStyle("-fx-background-color: #06799B;");
        mewtwo.setStyle("-fx-background-color: #06799B;");
        snorlax.setStyle("-fx-background-color: #06799B;");
    }
    public void click3(MouseEvent mouseEvent) {
        charizard.setStyle("-fx-background-color: #06799B;");
        mew.setStyle("-fx-background-color: #06799B;");
        ninetiles.setStyle("-fx-background-color: #00FFD1;");
        articuno.setStyle("-fx-background-color: #06799B;");
        mewtwo.setStyle("-fx-background-color: #06799B;");
        snorlax.setStyle("-fx-background-color: #06799B;");
    }
    public void click4(MouseEvent mouseEvent) {
        charizard.setStyle("-fx-background-color: #06799B;");
        mew.setStyle("-fx-background-color: #06799B;");
        ninetiles.setStyle("-fx-background-color: #06799B;");
        articuno.setStyle("-fx-background-color: #00FFD1;");
        mewtwo.setStyle("-fx-background-color: #06799B;");
        snorlax.setStyle("-fx-background-color: #06799B;");
    }
    public void click5(MouseEvent mouseEvent) {
        charizard.setStyle("-fx-background-color: #06799B;");
        mew.setStyle("-fx-background-color: #06799B;");
        ninetiles.setStyle("-fx-background-color: #06799B;");
        articuno.setStyle("-fx-background-color: #06799B;");
        mewtwo.setStyle("-fx-background-color: #00FFD1;");
        snorlax.setStyle("-fx-background-color: #06799B;");
    }
    public void click6(MouseEvent mouseEvent) {
        charizard.setStyle("-fx-background-color: #06799B;");
        mew.setStyle("-fx-background-color: #06799B;");
        ninetiles.setStyle("-fx-background-color: #06799B;");
        articuno.setStyle("-fx-background-color: #06799B;");
        mewtwo.setStyle("-fx-background-color: #06799B;");
        snorlax.setStyle("-fx-background-color: #00FFD1;");
    }

    public void abrirMochila(ActionEvent actionEvent) {

        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Bag.fxml"));
            BorderPane root = (BorderPane) loader.load();
            Scene scene = new Scene(root,450,410);
            stage.setScene(scene);
            // Oculta los botones de cerrar/minimizar/maximizar
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();

            Bag controller = loader.getController();
        } catch(Exception e) {
            e.printStackTrace();
        }


    }

}

