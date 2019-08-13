package com.numbers;

import java.util.ArrayList;
import java.util.List;

import static com.numbers.DisplayUtil.outputWarning;
import static com.numbers.DisplayUtil.outputWithFormat;
import static java.util.Collections.max;
import static java.util.Collections.min;

public class Storage {

  private final List<Double> store = new ArrayList<>();

  public boolean doOperation(String input) {
    if (CommandsType.MIN.getValue().equalsIgnoreCase(input)) {
      minElementInStore();
    } else if (CommandsType.MAX.getValue().equalsIgnoreCase(input)) {
      maxElementInStore();
    } else if (CommandsType.AVERAGE.getValue().equalsIgnoreCase(input)) {
      averageElementInStore();
    } else if (CommandsType.EXIT.getValue().equalsIgnoreCase(input)) {
      return false;
    } else {
      addInStore(input);
    }

    return true;
  }

  private void minElementInStore() {
    if (!store.isEmpty()) {
      outputWithFormat("Smallest number is: %f%n", min(store));
    }
  }

  private void maxElementInStore() {
    if (!store.isEmpty()) {
      outputWithFormat("Largest number is: %f%n", max(store));
    }
  }

  private void averageElementInStore() {
    if (!store.isEmpty()) {
      Double average = store.stream().reduce(0.0, Double::sum) / store.size();
      outputWithFormat("Average number is: %f%n", average);
    }
  }

  private void addInStore(String input) {
    try {
      store.add(Double.parseDouble(input));
    } catch (NumberFormatException e) {
      outputWarning("Entered not number or a wrong command!");
    }
  }
}
