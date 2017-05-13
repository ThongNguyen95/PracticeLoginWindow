/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceloginwindow;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 *
 * @author Thong Nguyen
 */
public class PracticeLoginWindow extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Practice Login");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(25,25,25,25));
        grid.setHgap(10);
        grid.setVgap(10);
        
        Text welcome = new Text("Welcome");
        welcome.setId("welcome");
        grid.add(welcome, 0, 0, 2, 1);
        
        Label userName = new Label("User Name: ");
        grid.add(userName, 0, 1);
        
        TextField userField = new TextField();
        grid.add(userField, 1, 1);
        
        Label pw = new Label("Password: ");
        grid.add(pw, 0, 2);
        
        PasswordField pwField = new PasswordField();
        grid.add(pwField, 1,2);
        
        HBox hbtn = new HBox();
        Button signIn = new Button("Sign in");
        hbtn.getChildren().add(signIn);
        hbtn.setAlignment(Pos.BOTTOM_RIGHT);
        grid.add(hbtn, 1, 4);
        
        Text actiontarget = new Text();
        actiontarget.setId("actiontarget");
        grid.add(actiontarget, 1, 6);
        
        signIn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setText("Sign-In Button pressed");
            }
        });
        
        //grid.setGridLinesVisible(true);
        
        Scene scene = new Scene(grid, 300, 275);
        scene.getStylesheets().add(PracticeLoginWindow.class.
                getResource("PracticeLoginWindow.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
