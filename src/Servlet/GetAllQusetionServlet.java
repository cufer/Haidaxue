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


public class GetAllQusetionServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			HQuestionDao hQuestionDao = new HQuestionDao();
			List<HQuestionEntity> allQuestionList = hQuestionDao.getAllQuestion();

			JSONArray jsonArray = new JSONArray();
			for (HQuestionEntity hqe : allQuestionList) {
				JSONObject jsonobject = JSONObject.fromObject(hqe);
				jsonArray.add(jsonobject);
			}
			response.setContentType("application/json; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.write(jsonArray.toString());
			System.out.println("array is like " + jsonArray.toString());
		}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
