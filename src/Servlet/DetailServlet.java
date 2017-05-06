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

@WebServlet("/DetailServlet")
public class DetailServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String questionSn = request.getParameter("questionSn");
	    HQuestionEntity hQuestionEntity = new HQuestionEntity();
	    hQuestionEntity.setQuestionSn(questionSn);
	    HQuestionDao hQuestionDao = new HQuestionDao();
	    List questionDetailList = hQuestionDao.getQuestionByQuestion_sn(hQuestionEntity);
	    request.getSession().setAttribute("questionDetailList", questionDetailList);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
