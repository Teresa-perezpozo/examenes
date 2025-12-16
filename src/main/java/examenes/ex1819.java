package examenes;

import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("login.html")
public class ex1819 {
	public class Login extends HttpServlet {
		 protected void doPost (HttpServletRequest request, HttpServletResponse response){
			 String usuario = request.getParameter("usuario");
			 String password = (String)request.getParameter("password");
			 PrintWriter out = response.getWriter();
			 HttpSession sesion = request.getSession();
			 response.setContentType("text/html");

			 if(sesion.getAtribute("user").equals(password)) {
			 out.print("<html><body>autennticación correcta</body></html>");
			 }else {
			 out.print("<html><body>autennticación incorrecta</body></html>");
			 
		 }
			 out.close();			 
			 }

}
	//ejercicio 3
	public static void main(String[] args) throws Exception {
		Socket conexión;
		try {
			conexión= new Socket("", 10007);
		}catch{}
		InputStream in = conexión.getInputStream();
		OutputStream out = conexión.getOutputStream();
		out.close();
		in.close();
		}
	}
}
