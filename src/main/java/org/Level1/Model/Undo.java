package org.Level1.Model;

import java.util.*;

public class Undo {

    private static Undo command;
    private static Set<String> commands;

    private Undo() {

    }

    public static Undo getInstance() {
        command = new Undo();
        commands = new HashSet<>();

        return command;
    }

    public void addCommand(String command) {
        commands.add(command);
        System.out.println("Successfully added \""+command+"\" to the list!" );
    }

    public void deleteCommand(String command) {

        boolean foundCommand = false;
        Iterator<String> setIterator = commands.iterator();

        while (setIterator.hasNext()) {
            if (setIterator.next().equals(command)) {
                setIterator.remove();
                System.out.println("Successfully removed \""+command+"\" from the list!" );
                foundCommand = true;
            }
        }
        if (foundCommand!=true) {
            System.out.println("Command \""+command+"\" not found on the list!");

        }
    }

    public void listCommands() {

        for (String command : commands){
            System.out.println(command);
        }

    }


}
