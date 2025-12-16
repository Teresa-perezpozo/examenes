package examenes;

public class dic19 {
	@WebServlet(“/contador”)
	public class ServletContador extends HttpServlet {
	protected void doGet _(HttpServletRequest request, HttpServletResponse
	response) throws ServletException, IOException {
	 InputStream file = getServletContext().getResourceAsStream("/contador.html");
}
