package examenes;

import java.util.Map;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/notas")
public class obtenerNotas {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws Exception {
		 String pagina = getPlantilla (String "/notas.html");
		 Map<String, String> asignaturas = obtenerAsignaturas();
		 String opciones = " ";
		 String pagina ="";
		 for(asignaturas : asignaturas.keySet()) {
			 opciones += "<option value = "'+acronimos+'"asignaturas>";
			 
		 }
		 pagina = pagina.replace("<options></options>", "<option>opciones</option>");
		 response.setContentType("text/htm");
		 out.println(pagina);
		 out.close();
		
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws Exception {
	String acronimo = request.getParameter("acronimo");
	 String email = request.getParameter("miEmail");
	 Map<String,Float> notas = (Map<String, Float>) request.getSession().getAttribute(email);
	 String pagina = getPlantilla (String "/notas.html");
	 Float nota = notas.get(acronimo);


	if(nota==null) 		 pagina = pagina.replace("<h2></h2>", "<h2>no tiene nota disponible</h2>");
	if(nota>5) 		 pagina = pagina.replace("<h2></h2>", "<h2 style color : green>  no tiene nota disponible</h2>");
	if(nota<5) 		 pagina = pagina.replace("<h2></h2>", "<h2 style color : red >no tiene nota disponible</h2>");

	
	}
}
