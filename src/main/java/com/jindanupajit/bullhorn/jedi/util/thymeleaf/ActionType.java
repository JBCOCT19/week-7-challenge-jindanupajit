package com.jindanupajit.bullhorn.jedi.util.thymeleaf;

public enum ActionType {
    PERSIST,
    MERGE,
    DELETE,
    LOGIN,
    LIST,
    VIEW,
    SEARCH;

    public static final String expressionObjectName = "ActionType";
}
