package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.HAnswersDao;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/ProvideAnswerServlet")
public class ProvideAnswerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String haidaxueSn = request.getParameter("haidaxueSn");
		String questionSn = request.getParameter("questionSn");
		String answersContent = request.getParameter("answersContent");
		boolean answersAnonymity = Boolean.valueOf(request.getParameter("answersAnonymity"));

//	    HAnswersEntity hAnswersEntity = new HAnswersEntity();
//	    hAnswersEntity.setHaidaxueSn(haidaxueSn);
//	    hAnswersEntity.setQuestionSn(questionSn);
//	    hAnswersEntity.setAnswersContent(answersContent);
//	    hAnswersEntity.setAnswersAnonymity(answersAnonymity);

	    HAnswersDao hAnswersDao = new HAnswersDao();
	    boolean provideResult = hAnswersDao.provideAnswer(haidaxueSn, questionSn, answersContent, answersAnonymity);

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
