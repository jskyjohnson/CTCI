package com.jsky.core.ArraysAndStrings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ZeroMatrix {

  /**
   * @param matrix, an NxM matrix that will have all it's 0's covert their respective columns and rows to 0 as well
   */
  public static void Zero(int[][] matrix) {
    Set<Tuple<Integer, Integer>> zeros = new HashSet<>();
    //Find all the zero coordinates
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (matrix[i][j] == 0) {
          zeros.add(new Tuple<Integer, Integer>(i, j));
        }
      }
    }
    //apply edits to the matrix functions.
    Iterator<Tuple<Integer, Integer>> iter = zeros.iterator();
    while (iter.hasNext()) {
      Tuple<Integer, Integer> k = iter.next();
      for (int i = 0; i < matrix.length; i++) {
        matrix[i][k.y] = 0;
      }
      for (int j = 0; j < matrix[k.y].length; j++) {
        matrix[k.x][j] = 0;
      }
    }
  }

  /**
   * @param matrix, Prints the matrix to the console
   */
  public static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) { //this equals to the row in our matrix.
      for (int j = 0; j < matrix[i].length; j++) { //this equals to the column in each row.
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println(); //change line on console as row comes to end in the matrix.
    }
  }
}

class Tuple<X, Y> {

  public final X x;
  public final Y y;

  public Tuple(X x, Y y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return x + " : " + y;
  }
}
