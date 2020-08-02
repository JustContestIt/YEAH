package org.bitbucket.anuarkaliyev23.cli.crud.example.command.student;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import org.bitbucket.anuarkaliyev23.cli.crud.example.configuration.DatabaseUtils;
import org.bitbucket.anuarkaliyev23.cli.crud.example.model.Student;
import org.bitbucket.anuarkaliyev23.cli.crud.example.command.Command;

import java.sql.SQLException;

public interface StudentCommand extends Command {
    default Dao<Student, Integer> dao() throws SQLException {
        return DaoManager.createDao(DatabaseUtils.CONNECTION_SOURCE, Student.class);
    }
}
