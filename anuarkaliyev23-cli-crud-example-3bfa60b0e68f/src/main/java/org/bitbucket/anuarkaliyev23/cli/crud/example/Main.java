package org.bitbucket.anuarkaliyev23.cli.crud.example;

import org.bitbucket.anuarkaliyev23.cli.crud.example.command.Command;
import org.bitbucket.anuarkaliyev23.cli.crud.example.command.student.StudentCreateCommand;
import org.bitbucket.anuarkaliyev23.cli.crud.example.command.student.StudentDeleteCommand;
import org.bitbucket.anuarkaliyev23.cli.crud.example.command.student.StudentReadCommand;
import org.bitbucket.anuarkaliyev23.cli.crud.example.command.student.StudentUpdateCommand;
import org.bitbucket.anuarkaliyev23.cli.crud.example.model.Student;

import java.sql.SQLException;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            Command c = parseLine(line);
            c.execute();
        }
    }

    private static Command parseLine(String line) {
        //create student 1 John Doe

        //update student 1 Jane Doe

        //delete student 1

        //read student 1
        Scanner scanner = new Scanner(line);
        String first = scanner.next();
        if (first.equals(CREATE)) {
            return createCommand(scanner);
        } else if (first.equals(READ)) {
            return readCommand(scanner);
        } else if(first.equals(UPDATE)) {
            return updateCommand(scanner);
        } else if(first.equals(DELETE)) {
            return deleteCommand(scanner);
        }
        else throw new RuntimeException("Not supporter yet.");
    }

    private static Command createCommand(Scanner scanner) {
        String className = scanner.next();
        if (className.equals(CLASS_STUDENT)) {
            int id = scanner.nextInt();
            String firstName = scanner.next();
            String lastName = scanner.next();

            return new StudentCreateCommand(new Student(id, firstName, lastName));

        } else throw new RuntimeException("Not supported yet.");
    }

    private static Command readCommand(Scanner scanner) {
        String className = scanner.next();
        if (className.equals(CLASS_STUDENT)) {
            int id = scanner.nextInt();

            return new StudentReadCommand(id);

        } else throw new RuntimeException("Not supported yet.");
    }

    private static Command updateCommand(Scanner scanner) {
        String className = scanner.next();
        if(className.equals(CLASS_STUDENT)) {
            int id = scanner.nextInt();
            String firstName = scanner.next();
            String lastName = scanner.next();

            return new StudentUpdateCommand(id, firstName, lastName);

        } else throw new RuntimeException("Not supported yet.");
    }

    private static Command deleteCommand(Scanner scanner) {
        String className = scanner.next();
        if(className.equals(CLASS_STUDENT)) {
            int id = scanner.nextInt();

            return new StudentDeleteCommand(id);

        } else throw new RuntimeException("Not supported yet.");
    }

    private static final String CREATE = "create";
    private static final String UPDATE = "update";
    private static final String DELETE = "delete";
    private static final String READ = "read";

    private static final String CLASS_STUDENT = "student";
}
