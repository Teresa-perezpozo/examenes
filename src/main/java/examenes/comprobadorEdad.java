package examenes;
@WebServlet("index/html")
public class comprobadorEdad extends HttpServlet{
//doGet
String param = request.getParameter("edad");
int edad = Integer.parseInt(param);
response.setContentType("text/html");
PrintWriter out = response.getWriter();
if(edad<18) out.print("<html><body>menor</body></html>")
else out.print("<html><body>mayor</body></html>")
}
