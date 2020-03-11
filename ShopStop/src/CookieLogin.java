

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieLogin
 */
@WebServlet("/CookieLogin")
public class CookieLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try{
			response.setContentType("text/html");
			PrintWriter pwriter = response.getWriter();
			String name = request.getParameter("u");
			String password = request.getParameter("p");
			pwriter.print("Hello here:"+name);
			pwriter.print(" Your Password is: "+password);
			
			Cookie c1 = new Cookie("UserName",name);
			Cookie c2 = new Cookie("userPass",password);
			
			response.addCookie(c1);
			response.addCookie(c2);

			pwriter.print("<a href='CookieWelcome'>View Details</a>");
			pwriter.close();
			}catch(Exception exp){
			System.out.println(exp);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
