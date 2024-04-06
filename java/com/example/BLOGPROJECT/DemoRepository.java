package com.example.BLOGPROJECT;


import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DemoRepository  {

    private static JdbcClient Jc = null;

    public DemoRepository(JdbcClient jc) {
        Jc = jc;
    }

    public List<Datas> GetAllNames() {
        return Jc.sql("SELECT * FROM blog_users;").query(
                (rs, rowNum) -> new Datas(
                        rs.getString("username"),
                        rs.getString("password"))
        ).list();
    }

    public static void addRow(Datas data){
        String qry = "INSERT INTO blog_users (username,password) VALUES(?,?);";
        Jc.sql(qry).params(data.getUsername(),data.getPassword())
                .update();

    }
}
