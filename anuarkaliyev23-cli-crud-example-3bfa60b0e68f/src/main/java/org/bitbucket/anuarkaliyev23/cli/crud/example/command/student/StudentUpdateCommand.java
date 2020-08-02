package org.bitbucket.anuarkaliyev23.cli.crud.example.command.student;

import org.bitbucket.anuarkaliyev23.cli.crud.example.model.Student;

import java.sql.SQLException;

public class StudentUpdateCommand implements StudentCommand {
    private final int id;
    private final String firstName;
    private final String lastName;

    public StudentUpdateCommand(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void execute() throws SQLException {
        int deleted = dao().deleteById(id);
        Student student = new Student(id, firstName, lastName);
        dao().create(student);
        System.out.println("Updated student.");
    }
}
