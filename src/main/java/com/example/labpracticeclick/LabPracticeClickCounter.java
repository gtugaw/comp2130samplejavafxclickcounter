package com.example.labpracticeclick;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LabPracticeClickCounter extends Application {
    // Defensive: keep state private
    private int clickCount = 0;

    @Override
    public void start(Stage primaryStage) {
        // Label initialized with count 0
        Label countLabel = new Label("Count: 0");

        // Button with event handler
        Button clickButton = new Button("Click Me!");
        clickButton.setOnAction(event -> {
            clickCount++;
            countLabel.setText("Count: " + clickCount);
            System.out.println("Button clicked! Count: " + clickCount); // Bonus
        });

        // Layout container
        VBox root = new VBox(10); // spacing = 10px
        root.getChildren().addAll(countLabel, clickButton);

        // Scene setup
        Scene scene = new Scene(root, 250, 150);
        primaryStage.setTitle("JavaFX Click Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
