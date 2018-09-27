package Service;

import Dao.BookDao;
import model.Book;

import java.util.List;

public class BookService {
    //创建Dao层对象
    private BookDao bd=new BookDao();
    //定义方法用于转接dao层的数据
    public List<Book> getAll(){
        return bd.getAll();
    }

    public void add(Book bo) {
        bd.addAny(bo);
    }
}
