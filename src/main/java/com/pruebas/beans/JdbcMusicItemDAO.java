package com.pruebas.beans;

import org.springframework.core.serializer.Serializer;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.io.Serializable;

/**
 * Created by pepesan on 7/5/16.
 */
public class JdbcMusicItemDAO implements Serializable{
    private DriverManagerDataSource dataSource;

    public JdbcMusicItemDAO() {
        this.dataSource = null;
    }
    public JdbcMusicItemDAO(DriverManagerDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DriverManagerDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DriverManagerDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String toString() {
        return "JdbcMusicItemDAO{" +
                "dataSource=" + dataSource +
                '}';
    }
}
