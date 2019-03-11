package edu.cnm.deepdive;

public class Matrices {

  public static int[][] rotate(int[][] data) {

    int[][] Rotated = new int[data.length][data.length];

    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data.length; j++){
        Rotated[i][j] = data[data.length - 1 - j][i];
      }
    }
    return Rotated;
  }

}
