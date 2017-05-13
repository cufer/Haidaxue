package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.HQuestionDao;
import Dao.generateDate;
import Dao.generateSn;
import Entity.HQuestionEntity;
import Entity.HUsersEntity;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/raisequestion")
public class RaiseQuestionServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String haidaxueSn = ((HUsersEntity) request.getSession().getAttribute("loginUser")).getHaidaxueSn();
			String questionLabel = request.getParameter("questionLabel");
			String questionContent = request.getParameter("questionContent");
			questionLabel = new String(questionLabel.getBytes("ISO-8859-1"), "utf-8");//解决编码问题。
			questionContent = new String(questionContent.getBytes("ISO-8859-1"), "utf-8");//这里改成跟我这里一样！！！
			boolean questionAnonymity = Boolean.valueOf(request.getParameter("questionAnonymity"));
			boolean questionBonus = Boolean.valueOf(request.getParameter("questionBonus"));

			System.out.println("haidaxueSn" + haidaxueSn + "questionLabel" + questionLabel + "questionContent" + questionContent + "questionAnonymity" + questionAnonymity + "questionBonus" + questionBonus);
			HQuestionEntity hQuestionEntity = new HQuestionEntity();
			hQuestionEntity.setHaidaxueSn(haidaxueSn);
			hQuestionEntity.setQuestionSn(generateSn.generateSn());
			hQuestionEntity.setQuestionLabel(questionLabel);
			hQuestionEntity.setQuestionContent(questionContent);
			hQuestionEntity.setQuestionAnonymity(questionAnonymity);
			hQuestionEntity.setQuestionBonus(questionBonus);
			hQuestionEntity.setQuestionDate(generateDate.generateDate());

			HQuestionDao hQuestionDao = new HQuestionDao();
			boolean raiseResult = hQuestionDao.raiseQusetion(hQuestionEntity);
			if(raiseResult){
				response.sendRedirect("/jsp/index.jsp");
			}else{
				response.sendRedirect("/jsp/raiseQuestion.jsp?abc=1") ;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
//		JSONArray jsonArray = new JSONArray();
//    	JSONObject jsonobject = JSONObject.fromObject(raiseResult);
//    	jsonArray.add(jsonobject);
//	    response.setContentType("application/json; charset=utf-8");
//		PrintWriter out = response.getWriter();
//		out.write(jsonArray.toString());

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
