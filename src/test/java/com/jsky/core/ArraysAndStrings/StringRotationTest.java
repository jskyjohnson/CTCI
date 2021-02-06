package com.jsky.core.ArraysAndStrings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Question 1.9 String Rotation
 * With using a function isSubstring, check if one word is a rotation of another
 */

public class StringRotationTest {

  @DisplayName("String Rotation Test")
  @Test
  public void testRotateMatrix() {
    assertEquals(true, StringRotation.isRotation("waterbottle", "erbottlewat"));
  }
}
