package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.HAnswersDao;
import Dao.generateSn;
import Entity.HAnswersEntity;
import Entity.HUsersEntity;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/provideanswer")
public class ProvideAnswerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String haidaxueSn = ((HUsersEntity) request.getSession().getAttribute("loginUser")).getHaidaxueSn();
		String questionSn = request.getParameter("questionSn");
		String answersContent = request.getParameter("answerContent");
		//boolean answersAnonymity = Boolean.valueOf(request.getParameter("answersAnonymity"));

	    HAnswersEntity hAnswersEntity = new HAnswersEntity();
	    hAnswersEntity.setHaidaxueSn(haidaxueSn);
	    hAnswersEntity.setQuestionSn(questionSn);
	    hAnswersEntity.setAnswersContent(answersContent);
	    hAnswersEntity.setAnswersSn(generateSn.generateSn());
	    //hAnswersEntity.setAnswersAnonymity(answersAnonymity);

	    HAnswersDao hAnswersDao = new HAnswersDao();
	    boolean provideResult = hAnswersDao.provideAnswer(hAnswersEntity);

	    JSONArray jsonArray = new JSONArray();
    	JSONObject jsonobject = JSONObject.fromObject(provideResult);
    	jsonArray.add(jsonobject);
	    response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write(jsonArray.toString());
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
