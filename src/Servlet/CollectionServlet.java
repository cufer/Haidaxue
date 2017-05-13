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
import Dao.HCollectionsDao;
import Dao.HQuestionDao;
import Entity.HAnswersEntity;
import Entity.HCollectionsEntity;
import Entity.HQuestionEntity;
import Entity.HUsersEntity;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/CollectionServlet")
public class   CollectionServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    HCollectionsDao hCollectionsDao = new HCollectionsDao();
	    HUsersEntity hUsersEntity=(HUsersEntity) request.getSession().getAttribute("loginUser");
	    System.out.println(hUsersEntity.getHaidaxueSn());
	    List<HCollectionsEntity> collectionList = hCollectionsDao.getAllCollection(hUsersEntity);

	    JSONArray jsonArray = new JSONArray();
	    for(HCollectionsEntity hce : collectionList){
			HQuestionDao hQuestionDao=new HQuestionDao();
			HQuestionEntity hQuestionEntity=new HQuestionEntity();
			hQuestionEntity.setQuestionSn(hce.getQuestionSn());
			List<HQuestionEntity>list=hQuestionDao.getQuestionByQuestion_sn(hQuestionEntity);
			for(HQuestionEntity h:list){
	    	JSONObject jsonobject = JSONObject.fromObject(h);
	    	jsonArray.add(jsonobject);
	    }
	    }
	    response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write(jsonArray.toString());
		System.out.println(jsonArray);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
