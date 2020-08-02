package org.bitbucket.anuarkaliyev23.cli.crud.example.command.student;

import org.bitbucket.anuarkaliyev23.cli.crud.example.model.Student;

import java.sql.SQLException;

public class StudentCreateCommand implements StudentCommand {
    private final Student student;

    public StudentCreateCommand(Student student) {
        this.student = student;
    }

    @Override
    public void execute() throws SQLException {
        dao().create(student);
        System.out.println("Created student " + student);
    }
}
