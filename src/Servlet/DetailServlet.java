package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.HAnswersDao;
import Dao.HQuestionDao;
import Entity.HAnswersEntity;
import Entity.HQuestionEntity;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/detail")
public class DetailServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String s;
    private static ArrayList<String>listContent=new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameterMap().size() == 0) {
            //String questionSn = request.getParameter("questionSn");
            HAnswersEntity hAnswersEntity=new HAnswersEntity();
            hAnswersEntity.setQuestionSn(s);
            HAnswersDao hAnswersDao=new HAnswersDao();
            List<HAnswersEntity> questionDetailList = hAnswersDao.getAnswerByQuestion_sn(hAnswersEntity);
            JSONArray jsonArray = new JSONArray();

            for (HAnswersEntity hqe : questionDetailList) {
                JSONObject jsonobject = JSONObject.fromObject(hqe);
                jsonArray.add(jsonobject);
            }
            if(listContent.size()!=0) {
                JSONObject jsonobject = JSONObject.fromObject("{\"questionContent\":\"" + listContent.get(0).toString() + "\"}");
                jsonArray.add(jsonobject);
                response.setContentType("application/json; charset=utf-8");
                PrintWriter out = response.getWriter();
                out.write(jsonArray.toString());
                System.out.println("detail" + jsonArray.toString());
                s = "";
                listContent.clear();
            }
        } else {
            s=request.getParameter("questionSn");
            HQuestionDao hQuestionDao=new HQuestionDao();
            HQuestionEntity hQuestionEntity=new HQuestionEntity();
            hQuestionEntity.setQuestionSn(s);
            List<HQuestionEntity>list=hQuestionDao.getQuestionByQuestion_sn(hQuestionEntity);

            for(HQuestionEntity h:list){
                listContent.add(h.getQuestionContent());
            }
	        request.getRequestDispatcher("/jsp/detail.jsp").forward(request,response);

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
