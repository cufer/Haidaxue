package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.HCollectionsDao;
import Entity.HUsersEntity;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/collection")
public class AddIntoCollectionServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String haidaxueSn = request.getParameter("haidaxueSn");
		String questionSn = request.getParameter("questionSn");
		String answersSn = request.getParameter("answerSn");
		System.out.println("haidaxue"+questionSn+"   "+answersSn);
		String haidaxueSn=((HUsersEntity)request.getSession().getAttribute("loginUser")).getHaidaxueSn();

	    HCollectionsDao hCollectionsDao = new HCollectionsDao();
	    boolean addPCollectionResult = hCollectionsDao.addCollections(haidaxueSn, questionSn, answersSn);

//	    JSONArray jsonArray = new JSONArray();
//		JSONObject jsonobject = JSONObject.fromObject(addPCollectionResult);
//		jsonArray.add(jsonobject);
//		response.setContentType("application/json; charset=utf-8");
//		PrintWriter out = response.getWriter();
//		out.write(jsonArray.toString());
//		System.out.print(jsonArray);
//		response.setStatus(200);
//		response.setHeader("refresh","1");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
