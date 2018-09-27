package Dao;

import model.Book;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import util.JDBCUtils;

import java.util.List;

public class BookDao {
    //创建JDBCTemplet对象
    private JdbcTemplate jtl = new JdbcTemplate(JDBCUtils.getDataSource());

    //定义方法用于读书所有书籍
    public List<Book> getAll() {
        //定义sql语句
        String sql = "select * from book;";
        List<Book> list = null;
        try {
            list = jtl.query(sql, new BeanPropertyRowMapper<>(Book.class));
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
        return list;
    }

    public void addAny(Book bo) {
        //编写sql语句
        String sql="insert into book(name,author,time,type )values(?,?,?,?)";
        //添加进数据库
        jtl.update(sql,bo.getName(),bo.getAuthor(),bo.getTime(),bo.getType());
    }
}
