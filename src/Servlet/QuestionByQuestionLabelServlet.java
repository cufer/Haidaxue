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
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class QuestionByQuestionLabelServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static String s;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if(request.getParameterMap().size()==0){
			//System.out.println();
			//request.getRequestDispatcher("/jsp/listByQuestionLabelServlet.jsp").forward(request,response);
			//response.sendRedirect("/jsp/listByQuestionLabelServlet.jsp");
//			System.out.println("request->>"+request.getRequestURL());
//			String questionLabel = request.getParameter("questionLabel");
//			System.out.println(""+questionLabel);
			HQuestionEntity hQuestionEntity = new HQuestionEntity();
			hQuestionEntity.setQuestionLabel(s);
			HQuestionDao hQuestionDao = new HQuestionDao();
			List<HQuestionEntity> questionList = hQuestionDao.getQuestionByQuestion_Label(hQuestionEntity);
			JSONArray jsonArray = new JSONArray();
			for(HQuestionEntity hqe : questionList){
				JSONObject jsonobject = JSONObject.fromObject(hqe);
				jsonArray.add(jsonobject);
			}
			response.setContentType("application/json; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.write(jsonArray.toString());
			System.out.println(jsonArray.toString());
	}else{
			s=request.getParameter("questionLabel");
			request.getRequestDispatcher("/jsp/listByQuestionLabelServlet.jsp").forward(request,response);

			//response.setHeader("refresh", "1");
			//response.sendRedirect("/jsp/listByQuestionLabelServlet.jsp");
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
