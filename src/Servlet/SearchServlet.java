package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.HQuestionDao;
import Entity.HQuestionEntity;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String questionLable = request.getParameter("questionLable");
	    HQuestionEntity hQuestionEntity = new HQuestionEntity();
	    hQuestionEntity.setQuestionLable(questionLable);
	    HQuestionDao hQuestionDao = new HQuestionDao();
	    List questionQueryList = hQuestionDao.getQuestionByQuestion_Label(hQuestionEntity);
	    request.getSession().setAttribute("questionQueryList", questionQueryList);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
