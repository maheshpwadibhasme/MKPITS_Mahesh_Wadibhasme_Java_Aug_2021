package com.example.spring_jdbc2.Dao;

import com.example.spring_jdbc2.Stud;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudDaoImpl implements StudDao{
    JdbcTemplate template;
    public void  insert(Stud sob){
        String qr="insert into students2(id,name,addr) Values(?,?,?)";
        int update =this.template.update(qr, sob.getId(), sob.getName(), sob.getAddr());
        System.out.println("Record inserted "+update);
    }
    public void Update(Stud sob){
        String qr="update students2 set name=?,addr=? where id=?";
        int update = this.template.update(qr, sob.getName(), sob.getAddr(), sob.getId());
        System.out.println("Record Updated "+update);
    }
    public  void  delete(Stud sob){
        String qr= "delete from students2 where id=?";
        int update = this.template.update(qr, sob.getId());
        System.out.println("Record deleted "+update);
    }
    public void displaybyid(int id) {
        String qr = "select * from students2 where id=?";
        Stud s = (Stud) this.template.queryForObject(qr, new Object[]{id}, new rowdemo()); //this is for single data show
        System.out.println(s);
    }

    public void displayAll() {
        String qr = "select * from students2";
        List<Stud> list= this.template.query(qr,new rowdemo()); // This is for list of data show
        System.out.println(list.size());

        for(Stud s:list){
            System.out.println(s.getId()+" "+s.getName()+" "+s.getAddr());
        }
    }

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
}
class rowdemo implements RowMapper<Stud>{

    @Override
    public Stud mapRow(ResultSet resultSet, int i) throws SQLException {
        Stud sob=new Stud();
          sob.setId( resultSet.getInt("id"));
          sob.setName(resultSet.getString("name"));
          sob.setAddr( resultSet.getString("addr"));
        return sob;
    }
}
