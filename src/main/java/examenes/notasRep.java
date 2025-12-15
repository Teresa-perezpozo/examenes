package examenes;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/notas")

public class notasRep extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String pagina = getPlantilla("/notas.html");
		String opciones = "";
		for(String a : obtenerAsignaturas.keySet()) {//recorremos todas las key
		String nombre = (String) asignaturas.get(acronimo);
		opciones += "<option value ="+a+" name ="+a+" , "+obtenerAsignaturas.get("a")+">";
		}
		
		pagina = pagina.replace("##", opciones);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print(pagina);
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		String acronimo = request.getParameter("acronimo");	
		float nota= session.getAttribute().getValue("acronimo");
		 Map<String,Float> notas = (Map<String, Float>) request.getSession().getAttribute(email);

		String pagina = getPlantilla("/notas.html");
		String resultado = " ";
		
		if(nota>=5) resultado = "<p style = 'green'> 'Muy bien, has sacado un' + nota + </p>";
		if(nota>=5) resultado = "<p style = 'red'> 'Que mal, has sacado un' + nota + </p>";

		pagina=pagina.replace("<h2></h2>","<h2>resultado</h2>0");
		response.setContentType("text/html");
		out.println("pagina");
		out.close();	
	}
	@WebServlet("/notas")
	public Map<String, String> obtenerAsignaturas( ) throws Exception{
		Servlet Socket s ;
		try {
			s = new ServletSocket(1234);
		}catch(Exception e ){		}
		java.net.Socket remote = s.accept();
		
		Map<String,String> lista;
		
		while(linea = html.nextLine()!=null) {
			String [] notasL = linea.split(":");
			lista.add(notasL[0],notasL[1]);
		}
		
		
		
		
		InputStream in = remote.getInputStream();
		OutputStream out = remote.getOutputStream();
		out.print(pagina);
		out.close();
	
	
	}
}








