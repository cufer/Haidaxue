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
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/SpecialDatial")
public class SpecialDatial extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String haidaxueSn = request.getParameter("haidaxueSn");
		HAnswersEntity hAnswersEntity = new HAnswersEntity();
	    hAnswersEntity.setHaidaxueSn(haidaxueSn);
	    HAnswersDao hAnswersDao = new HAnswersDao();
	    List<HAnswersEntity> specialDetailList = hAnswersDao.getAnswerByHaidaxue_sn(hAnswersEntity);
	    JSONArray jsonArray = new JSONArray();
	    for(HAnswersEntity hae : specialDetailList){
	    	JSONObject jsonobject = JSONObject.fromObject(hae);
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
