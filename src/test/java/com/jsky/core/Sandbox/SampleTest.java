package com.jsky.core.Sandbox;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

/**
 * SampleTest
 */
public class SampleTest {

  @DisplayName("Test Sampl.add()")
  @Test
  public void testAdd() {
    assertEquals(25, Sample.add(20, 5));
  }
}
