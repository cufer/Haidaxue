package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.HQuestionDao;
import Entity.HQuestionEntity;
import Entity.HUsersEntity;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/questionByUser")
public class QuestionByHaidaxueSNServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String s;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameterMap().size() == 0) {
            System.out.println("mapsize=0" + s);
            HQuestionEntity hQuestionEntity = new HQuestionEntity();
            hQuestionEntity.setHaidaxueSn(s);

            HQuestionDao hQuestionDao = new HQuestionDao();
            List<HQuestionEntity> myQuestionList = hQuestionDao.getQuestionByHaidaxue_sn(hQuestionEntity);

            JSONArray jsonArray = new JSONArray();
            for (HQuestionEntity hqe : myQuestionList) {
                JSONObject jsonobject = JSONObject.fromObject(hqe);
                jsonArray.add(jsonobject);
            }
            response.setContentType("application/json; charset=utf-8");
            PrintWriter out = response.getWriter();
            out.write(jsonArray.toString());
            System.out.println("questionResult" + jsonArray.toString());
        } else {
            s = request.getParameter("haidaxueSn");
            if (s == null) {
                s = ((HUsersEntity) request.getSession().getAttribute("loginUser")).getHaidaxueSn();
            }
            System.out.println("question" + s);
            request.getRequestDispatcher("/jsp/showQuestions.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
