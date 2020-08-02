package org.bitbucket.anuarkaliyev23.cli.crud.example.command.student;

import org.bitbucket.anuarkaliyev23.cli.crud.example.model.Student;

import java.sql.SQLException;

public class StudentDeleteCommand implements StudentCommand {
    private final int id;

    public StudentDeleteCommand(int id) {
        this.id = id;
    }

    @Override
    public void execute() throws SQLException {
        int student = dao().deleteById(id);
        if(student > 0) System.out.println("Deleted student.");
        else throw new RuntimeException("Not supported yet.");
    }
}
