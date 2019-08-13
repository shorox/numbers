package com.numbers;

public enum CommandsType {
  MIN("min"),
  MAX("max"),
  AVERAGE("average"),
  EXIT("exit");

  private final String value;

  CommandsType(String value) {
    this.value = value;
  }

  public static CommandsType parseString(String value) {
    for (CommandsType commandsType : CommandsType.values()) {
      if (commandsType.getValue().equals(value)) {
        return commandsType;
      }
    }
    return null;
  }

  public String getValue() {
    return value;
  }
}
