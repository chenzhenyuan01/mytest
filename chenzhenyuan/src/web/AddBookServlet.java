package web;

import Service.BookService;
import model.Book;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "AddBookServlet", urlPatterns = "/AddBookServlet")
public class AddBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    private BookService bs=new BookService();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        try {
            Map<String, String[]> map = request.getParameterMap();
            Book bo=new Book();
            BeanUtils.populate(bo,map);
            //传给service层
            bs.add(bo);
            response.getWriter().print("<h1>添加成功</h1>");
            //请求重定向
            response.sendRedirect(request.getContextPath()+"/book.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
