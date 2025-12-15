package examenes;
@WebServlet("contadorVisitas.html")
public class contadorVisitas extends HttpServlet {
		protected void doGet _(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		InputStream file = getServletContext().getResourceAsStream("/contadorCisitas.html");
		InputStreamReader r1 = new InputStreamReader(file);
		BufferedReader html = new BufferedReader(r1);
		PrintWriter out = reponse.getWriter();
		String pagina = " ",linea;
		while(linea= html.readLine()!=null) pagina+=linea;
		int n = request.getSession().getAttribute(contador);
		request.getSession().setAtribute(contador, n++);//tener en cuenta q pueda ser null, null+1 no(if)
		pagina = pagina.replace("<div>X</div>","<div>"+n+"</div>");
		responseSetContentType("text/html");
		out.println(pagina);
		out.close();
				 
		}
		//doPost lo volvemos a setear a 0
		HttpSession sesion = request.getSession();
		 sesion.setAttribute(“contador”, 0);
		 pagina = pagina.replace(“X”, n);
		 out.println(pagi
}

