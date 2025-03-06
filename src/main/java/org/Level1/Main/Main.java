package org.Level1.Main;

import org.Level1.Model.Undo;

public class Main {

    public static void main(String[] args) {

        Undo c = Undo.getInstance();

        c.addCommand("move");
        c.addCommand("dir");
        c.addCommand("delete");

        c.listCommands();

        c.deleteCommand("delete");

        c.listCommands();

    }
}
