package com.example.shakki;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseButton;
import javafx.event.EventHandler;

public class ChessApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {

        int[][] coordinates = new int[8][8];
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                coordinates[x][y] = ((x * 10) + y);
            }
        }

        Rectangle[] rectangles = new Rectangle[64];
        int colorCount = 0;
        int x = 0, y = 0;
        boolean isFirstBlack = true;
        for (int z = 0; z < 64; z++) {
            rectangles[z] = new Rectangle();
            rectangles[z].setX(x);
            rectangles[z].setY(y);
            rectangles[z].setWidth(100);
            rectangles[z].setHeight(100);
            rectangles[z].setStroke(Color.TRANSPARENT);
            if (z == 1 || z == 3 || z == 5 || z == 7 ||
                    z == 8 || z == 10 || z == 12 || z == 14 ||
                    z == 17 || z == 19 || z == 21 ||
                    z == 23 || z == 24 || z == 26 || z == 28 ||
                    z == 30 || z == 33 || z == 35 ||
                    z == 37 || z == 39 || z == 40 || z == 42 ||
                    z == 44 || z == 46 || z == 49 ||
                    z == 51 || z == 53 || z == 55 ||
                    z == 56 || z == 58 || z == 60 || z == 62)

                rectangles[z].setFill(Color.valueOf("#dedede"));
            else
                rectangles[z].setFill(Color.valueOf("#000000"));

            x = x + 100;
            if (x > 700) {
                x = 0;
                y = y + 100;
            }
        }


        Pane pane = new Pane();
        for (int i = 0; i < 64; i++)
            pane.getChildren().add(rectangles[i]);


        Scene scene = new Scene(pane, 800, 800, true);
        primaryStage.setMinWidth(800);
        primaryStage.setMinHeight(800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("2D Example");

        primaryStage.show();


    }

}