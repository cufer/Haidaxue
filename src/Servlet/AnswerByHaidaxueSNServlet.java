package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.HAnswersDao;
import Entity.HAnswersEntity;
import Entity.HUsersEntity;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/answerByUser")
public class AnswerByHaidaxueSNServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static String s;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameterMap().size() == 0) {

			HAnswersEntity hAnswersEntity = new HAnswersEntity();
			hAnswersEntity.setHaidaxueSn(s);

			HAnswersDao hAnswerDao = new HAnswersDao();
			List<HAnswersEntity> myAnswerList = hAnswerDao.getAnswerByHaidaxue_sn(hAnswersEntity);

			JSONArray jsonArray = new JSONArray();
			for (HAnswersEntity hqe : myAnswerList) {
				JSONObject jsonobject = JSONObject.fromObject(hqe);
				jsonArray.add(jsonobject);
			}
			response.setContentType("application/json; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.write(jsonArray.toString());
		}else{

			s=request.getParameter("haidaxueSn");
			if(s==null){
				s=((HUsersEntity)request.getSession().getAttribute("loginUser")).getHaidaxueSn();
			}
			System.out.println("answer"+s);
			request.getRequestDispatcher("/jsp/showAnswers.jsp").forward(request,response);
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
