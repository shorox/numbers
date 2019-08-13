package com.numbers;

import java.io.BufferedReader;
import java.io.IOException;

public class DisplayUtil {

  private DisplayUtil() {
  }

  public static void output(String s) {
    System.out.println(s);
  }

  public static void outputWithFormat(String s, Object... args) {
    System.out.format(s, args);
  }

  public static void outputWarning(String s) {
    System.out.println("WARNING: " + s);
  }

  public static String input(String outputText, BufferedReader br) throws IOException {
    output(outputText);
    return br.readLine();
  }
}
