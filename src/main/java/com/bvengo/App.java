package com.bvengo;

import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

  private int maxWindowWidth = 1024;
  private int maxWindowHeight = 1024;

  private int cols = 20;
  private int rows = 20;
  private int cellSize = 50;

  @Override
  public void start(Stage stage) {

    int width = cols * cellSize;
    int height = rows * cellSize;

    try {
      StackPane root = new StackPane();

      Grid grid = new Grid(width, height, cols, rows);

      root.getChildren().add(grid);

      Scene scene = new Scene(root, 
        width > maxWindowWidth ? maxWindowWidth : width,
        height > maxWindowHeight ? maxWindowHeight : height
      );

      stage.setScene(scene);
      stage.show();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void run(String[] args) {
    launch(args);
  }

}
