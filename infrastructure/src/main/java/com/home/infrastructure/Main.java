package com.home.infrastructure;

import com.home.infrastructure.tasks.TaskOne;

public class Main {
    public static void main(String[] args) throws Exception {
        new TaskOne().call();
    }
}
