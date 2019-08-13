package com.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.numbers.DisplayUtil.*;

public class Start {

  private final Storage storage = new Storage();

  public void run() {
    output("Welcome to number app!\n");
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      while (doAction(br)) ;
    } catch (IOException e) {
      outputWarning("Operation is failed");
    }
  }

  private boolean doAction(BufferedReader br) throws IOException {
    String line =
      input("Enter any number or select any command ('min', 'max', 'average' or 'exit') for continue: ", br);
    return storage.doOperation(line);
  }
}