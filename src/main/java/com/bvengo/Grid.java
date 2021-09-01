package com.bvengo;

import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Grid extends Pane {
  private int width, height;
  private int cols, rows;

  private Cell[][] cells;

  public Grid(int _width, int _height, int _cols, int _rows) {
    width = _width;
    height = _height;
    cols = _cols;
    rows = _rows;

    cells = new Cell[rows][cols];
  }

  public void add(Cell cell, int column, int row) {

    cells[row][column] = cell;

    double w = width / cols;
    double h = height / rows;
    double x = w * column;
    double y = h * row;

    cell.setLayoutX(x);
    cell.setLayoutY(y);
    cell.setPrefWidth(w);
    cell.setPrefHeight(h);
    cell.setBorder(new Border(new BorderStroke(
      Color.BLACK,
      BorderStrokeStyle.SOLID,
      CornerRadii.EMPTY,
      BorderStroke.THIN))
    );

    getChildren().add(cell);

  }

  public Cell getCell(int column, int row) {
    return cells[row][column];
  }
}
