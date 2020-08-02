package org.bitbucket.anuarkaliyev23.cli.crud.example.configuration;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import org.bitbucket.anuarkaliyev23.cli.crud.example.model.Student;

import java.sql.SQLException;

public class DatabaseUtils {
    public static String JDBC_CONNECTION_STRING = "jdbc:sqlite:D:\\Work\\Дистанционное обучение\\BackEnd\\Data Bases\\my-example-base.sqlite";

    public static ConnectionSource CONNECTION_SOURCE;

    static {
        try {
            CONNECTION_SOURCE = new JdbcConnectionSource(JDBC_CONNECTION_STRING);
            TableUtils.createTableIfNotExists(CONNECTION_SOURCE, Student.class);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
