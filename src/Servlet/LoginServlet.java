package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.HUsersDao;
import Entity.HUsersEntity;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request.getRequestDispatcher("/jsp/login.jsp").forward(request,response);
        System.out.print("url" + request.getRequestURL());
        if (request.getParameterMap().size() == 0) {
            request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
        } else {
            String userName = request.getParameter("telephoneNumber");
            String password = request.getParameter("password");
            System.out.print(userName + password);
            HUsersEntity hUsersEntity = new HUsersEntity();
            hUsersEntity.setTelephoneNumber(userName);
            hUsersEntity.setPassword(password);
            HUsersDao hUsersDao = new HUsersDao();
            List loginResult = hUsersDao.login(hUsersEntity);
            boolean result=loginResult.size()==0?false:true;
            if (result) {
                HttpSession session = request.getSession();
                //将数据存储到session中
                session.setAttribute("loginUser", (HUsersEntity)loginResult.get(0));

                response.sendRedirect("/jsp/ihaidaxue.jsp");//成功之后跳转

                //获取session的Id
            } else {
                response.sendRedirect("/jsp/login_failure.jsp");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
