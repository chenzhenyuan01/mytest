package web;

import Service.BookService;
import model.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListBookServlet", urlPatterns = "/ListBookServlet")
public class ListBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
   //定义成员Service层
    private BookService bs=new BookService();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //获取读取的List
        List<Book> list=bs.getAll();
        //将联系人存储到域对象中
        request.setAttribute("list",list);
        //请求转发
        request.getRequestDispatcher("/List.jsp").forward(request,response);
    }
}
