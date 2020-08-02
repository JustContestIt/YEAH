package org.bitbucket.anuarkaliyev23.cli.crud.example.command.student;

import org.bitbucket.anuarkaliyev23.cli.crud.example.model.Student;

import java.sql.SQLException;

public class StudentReadCommand implements StudentCommand {
    private final int id;

    public StudentReadCommand(int id) {
        this.id = id;
    }

    @Override
    public void execute() throws SQLException {
        Student student = dao().queryForId(id);
        System.out.println("Read student " + student);
    }
}
