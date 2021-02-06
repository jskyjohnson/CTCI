package com.jsky.core.ArraysAndStrings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Question 1.7 Rotate Matrix
 * Given an NxN int matrix, write a method to rotate the image by 90 degrees,
 * Do it in place!
 */

public class RotateMatrixTest {

  @DisplayName("Matrix Rotation Test")
  @Test
  public void testRotateMatrix() {
    int[][] mat1 = {
      { 1, 1, 1, 1 },
      { 0, 1, 1, 1 },
      { 0, 0, 1, 1 },
      { 0, 0, 0, 1 },
    };

    int[][] mat2 = {
      { 0, 0, 0, 1 },
      { 0, 0, 1, 1 },
      { 0, 1, 1, 1 },
      { 1, 1, 1, 1 },
		};
		
		RotateMatrix.Rotate90degrees(mat1);

		boolean check1 = true;
		for (int i = 0; check1 && i < mat1.length; ++i) {
				check1 = Arrays.equals(mat1[i], mat2[i]);
		}
    assertEquals(true, check1);
  }
}
