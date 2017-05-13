package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.HPreferenceDao;
import Entity.HUsersEntity;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/preference")
public class AddIntoPreferenceServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String haidaxueSn = ((HUsersEntity)request.getSession().getAttribute("loginUser")).getHaidaxueSn();
		String answersSn = request.getParameter("answerSn");
		System.out.println("haidaxue"+haidaxueSn+"   "+answersSn);
	    HPreferenceDao hPreferenceDao = new HPreferenceDao();
	    boolean addPreferenceResult = hPreferenceDao.addPreferences(haidaxueSn,  answersSn);
	    hPreferenceDao.addcount(answersSn);

//	    JSONArray jsonArray = new JSONArray();
//    	JSONObject jsonobject = JSONObject.fromObject(addPreferenceResult);
//    	jsonArray.add(jsonobject);
//	    response.setContentType("application/json; charset=utf-8");
//		PrintWriter out = response.getWriter();
//		out.write(jsonArray.toString());
//		System.out.print(jsonArray);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
