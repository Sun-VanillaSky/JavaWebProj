package test.sun.testftl.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import test.sun.testftl.bean.User;

@WebServlet("/freemarkerTest")  //  @WebServlet 是servlet3.0新特性
public class freemarkerTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

    private Configuration cfg;

	/* (non-Javadoc)
	 * @see javax.servlet.GenericServlet#init()
	 * servlet初始化 加载freemark
	 */
	@Override
	public void init() throws ServletException {
        cfg = new Configuration();
        cfg.setServletContextForTemplateLoading(getServletContext(), "WEB-INF/ftl");
  
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		
		// 塞值
		Map<Object, Object> data = new HashMap<>();
		
		data.put("name", "印度神奇油");
		data.put("age", "18");
		data.put("gender", "女");
		data.put("contextPath",request.getContextPath());
		
		User user = new User();
		user.setId("12342341324");
		user.setName("管管");
		
		data.put("user", user);
		
		
		
		
        // 将数据塞进模板
        Template template = cfg.getTemplate("marker1.ftl");
        try {
			template.process(data, response.getWriter());
		} catch (TemplateException e) {
			// 模板异常
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
