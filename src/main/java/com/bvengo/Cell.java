package com.bvengo;

import javafx.scene.layout.StackPane;

public class Cell extends StackPane {

  int col;
  int row;

  public Cell(int _col, int _row) {

    col = _col;
    row = _row;
  }

  public String toString() {
    return col + "/" + row;
  }
}