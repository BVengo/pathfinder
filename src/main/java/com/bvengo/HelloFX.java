package com.bvengo;

import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloFX extends Application {

  private int maxWindowWidth = 1024;
  private int maxWindowHeight = 720;

  private int cols = 50;
  private int rows = 50;
  private int cellSize = 40;

  @Override
  public void start(Stage stage) {

    int width = cols * cellSize;
    int height = rows * cellSize;

    try {
      StackPane root = new StackPane();

      Grid grid = new Grid(width, height, cols, rows);

      for (int row = 0; row < rows; row++) {
        for (int col = 0; col < cols; col++) {
          grid.add(new Cell(col, row), col, row);
        }
      }

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
