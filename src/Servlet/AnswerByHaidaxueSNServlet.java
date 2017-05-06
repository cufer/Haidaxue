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

@WebServlet("/AnswerByHaidaxueSNServlet")
public class AnswerByHaidaxueSNServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String haidaxueSn = request.getParameter("haidaxueSn");
		HUsersEntity hUsersEntity = new HUsersEntity();
		hUsersEntity.setHaidaxueSn(haidaxueSn);

		HAnswersDao hAnswerDao = new HAnswersDao();
	    List<HAnswersEntity> myAnswerList = hAnswerDao.getAnswerByUserHaidaxue_sn(hUsersEntity);

	    JSONArray jsonArray = new JSONArray();
	    for(HAnswersEntity hqe : myAnswerList){
	    	JSONObject jsonobject = JSONObject.fromObject(hqe);
	    	jsonArray.add(jsonobject);
	    }
	    response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write(jsonArray.toString());
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
