package BobbyHood.GUI.Controllers;

import BobbyHood.GUI.BobbyGUI;
import BobbyHood.Game;
import BobbyHood.Room;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BuildingController extends GameController implements Initializable {

    private final CharacterController characterController = new CharacterController();

    @FXML
    private AnchorPane scene;
    @FXML
    ImageView bobby;
    @FXML
    Text inventoryText;

    @FXML
    Rectangle door;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String direction = "north";
        characterController.makeMovable(bobby, scene, door, direction);
        door.setFill(Color.TRANSPARENT);
        //System.out.println(game.currentRoom.getShortDescription());
    }
}
