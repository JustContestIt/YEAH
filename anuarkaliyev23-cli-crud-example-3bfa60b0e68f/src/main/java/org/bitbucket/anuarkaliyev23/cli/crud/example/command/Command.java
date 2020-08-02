package org.bitbucket.anuarkaliyev23.cli.crud.example.command;

import java.sql.SQLException;

public interface Command {
    void execute() throws SQLException;
}
