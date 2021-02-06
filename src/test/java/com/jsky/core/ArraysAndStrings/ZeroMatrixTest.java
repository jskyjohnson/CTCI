package com.jsky.core.ArraysAndStrings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Question 1.8 Zero Matrix
 * Write an algorithm such that if an element in an MxN matrix is 0, it's entire row and column are set to 0
 */

public class ZeroMatrixTest {

  @DisplayName("Matrix Rotation Test")
  @Test
  public void testRotateMatrix() {
    int[][] mat1 = {
      { 1, 1, 1, 1 },
      { 1, 1, 1, 1 },
      { 1, 0, 1, 1 },
      { 1, 1, 1, 1 },
    };

    int[][] mat2 = {
      { 1, 0, 1, 1 },
      { 1, 0, 1, 1 },
      { 0, 0, 0, 0 },
      { 1, 0, 1, 1 },
    };

    ZeroMatrix.Zero(mat1);

    boolean check1 = true;
    for (int i = 0; check1 && i < mat1.length; ++i) {
      check1 = Arrays.equals(mat1[i], mat2[i]);
    }
    assertEquals(true, check1);
  }
}
