package com.bvengo;

import javafx.scene.layout.StackPane;

public class Cell extends StackPane {
  
  boolean isBarrier = false;

  int col;
  int row;

  public Cell(int _col, int _row) {

    col = _col;
    row = _row;
  }

  public void setBarrier() {
    isBarrier = true;
  }

  public boolean isBarrier() {
    return isBarrier;
  }
  
  public String toString() {
    return col + "/" + row;
  }
}