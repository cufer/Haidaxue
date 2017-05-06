package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.HQuestionDao;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/RaiseQuestionServlet")
public class RaiseQuestionServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String haidaxueSn = request.getParameter("haidaxueSn");
		String questionLabel = request.getParameter("questionLabel");
		String questionContent = request.getParameter("questionContent");
		boolean questionAnonymity = Boolean.valueOf(request.getParameter("questionAnonymity"));
		boolean questionBonus = Boolean.valueOf(request.getParameter("questionBonus"));

//		HQuestionEntity hQuestionEntity = new HQuestionEntity();
//		hQuestionEntity.setHaidaxueSn(haidaxueSn);
//		hQuestionEntity.setQuestionLabel(questionLabel);
//		hQuestionEntity.setQuestionContent(questionContent);
//		hQuestionEntity.setQuestionAnonymity(questionAnonymity);
//		hQuestionEntity.setQuestionBonus(questionBonus);

		HQuestionDao hQuestionDao = new HQuestionDao();
		boolean raiseResult = hQuestionDao.raiseQusetion(haidaxueSn, questionLabel, questionContent, questionAnonymity, questionBonus);

		JSONArray jsonArray = new JSONArray();
    	JSONObject jsonobject = JSONObject.fromObject(raiseResult);
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
