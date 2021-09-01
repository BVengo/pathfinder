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
  private int cellWidth, cellHeight;

  private Cell[][] cells;

  public Grid(int _width, int _height, int _cols, int _rows) {
    width = _width;
    height = _height;
    cols = _cols;
    rows = _rows;

    cellWidth = width/cols;
    cellHeight = height/rows;

    cells = new Cell[rows][cols];

    populate();
  }

  public void populate() {
    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        setCell(new Cell(col, row), col, row);
      }
    }
  }

  public void setCell(Cell cell, int col, int row) {
    cells[row][col] = cell;

    double x = cellWidth * col;
    double y = cellHeight * row;

    cell.setLayoutX(x);
    cell.setLayoutY(y);
    cell.setPrefWidth(cellWidth);
    cell.setPrefHeight(cellHeight);
    cell.setBorder(new Border(new BorderStroke(
      Color.BLACK,
      BorderStrokeStyle.SOLID,
      CornerRadii.EMPTY,
      BorderStroke.THIN))
    );

    getChildren().add(cell);

  }

  public Cell getCell(int col, int row) {
    return cells[row][col];
  }
}
