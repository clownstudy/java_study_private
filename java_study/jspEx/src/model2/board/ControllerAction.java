package model2.board;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model2.board.action.CommandAction;


/**
 * 
 * Servlet implementation class ControllerAction
 */
//@WebServlet("*.do")
public class ControllerAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//명령과 클래스가 들어가있는 map선언. HashMap();
	private Map<String, Object> commandMap = new HashMap<String, Object>();
	
    //서블릿이 실행되기 전에 초기화 과정
	public void init(ServletConfig config) {
		//필요한 Action --> 비즈니스 로직이 있으면 미리 올려놓고 (웹 메모리에 업로드 하면서 서버가 실행->> 스프링도 같음) 시작
		System.out.println(config);
		String props = config.getInitParameter("configProperty");
//		String props = "Command.properties";
		System.out.println(props);
		Properties pr = new Properties();
		FileInputStream f = null;
		try {
			// 파일로 오픈
//			File fi = new File(props);
			f = new FileInputStream(props);
			// 파일은 프로퍼티즈임( = 을 기준으로 좌측은 키, 우측은 밸류)
			pr.load(f);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(f!=null)
				try {
					f.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		// 프로퍼티를 읽어와서
		Iterator<Object> key = pr.keySet().iterator();
		// 키를 명령에 저장하고 value에 있는 것을 파일로 오픈해서 읽게함.
		// 해당되는 클래스는 공통의 메소드가 있어서 그걸 처리하는 명령 실행
		while(key.hasNext()) {
			String command = (String) key.next();
			String className = pr.getProperty(command);
			try {
				Class commandClass = Class.forName(className);
				Object commandIntance = commandClass.newInstance();
				 //해당 키와 인스턴스를 저장해서 Web상에서 불러서 사용할 것임.
				commandMap.put(command, commandIntance);
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			
		}
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requestPro(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	private void requestPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ListAction 등 모든 클래스를 실행(다형성 이용)
		String view = null; // view는 해당 액션에서 전달됨
		CommandAction com = null;
		try {
			String command = request.getRequestURI();
			if(command.indexOf(request.getContextPath())==0) { // contextPath = application path
				command = command.substring(request.getContextPath().length());
			}
			com = (CommandAction)commandMap.get(command);
			//com requestPro실행
				view = com.requestPro(request, response);
			} catch (Throwable e) {
				e.printStackTrace();
			}
			//forward view로
			RequestDispatcher dispatcher = request.getRequestDispatcher(view);
			dispatcher.forward(request, response);
	}
}
