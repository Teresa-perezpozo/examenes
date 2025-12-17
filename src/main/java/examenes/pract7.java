package examenes;

import java.net.Socket;
import java.util.Enumeration;

import jakarta.servlet.http.HttpSession;

@WebServlet("/pract7")
public class pract7 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String pagina = leerPlantilla();
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");
	out.println(pagina);
	out.close();
	}
	
	
	
protected void doPost(HttpeServletRequest request, HttpServletResponse response)thows ServletException,IOException{
	String pagina = leerPlantilla();
	String nombre = request.getParameter("nombre");
	String apellidos = request.getParameter("apellidos");
	String dni = request.getParameter("dni");
	HttpSession sesion = request.getSession();

	String resultado = " ";
	Enumeration<String> pacientes = sesion.getAttributeNames();
	List<Paciente> encontrados = new ArrayList();

	if(!dni.equals(" ")) {//es decir q lo tenemos
		Paciente p = (Paciente)sesion.getAttribute(dni);
		if(p!null) {
			encontrados.add(p);
		}
	}
	if(dni.equals(" ")&& !apellido.equals(" ")) {
		Paciente p ;
		String dni1;
		while(pacientes.hasMoreElements()) {
			dni1 = (String) pacientes.nextElement();
			p = (Paciente)s.getAttribute(unDni);
			if(p.getApellido().equals(apellidos))
				encontrados.add(p);
		}
	}
	if(dni.equals(" ")&& apellido.equals(" ")&&!nombre.equals(" ")) {
		
	}
	else { resultado = "no se ha encoentrado al paciente";

	
	
	
	
	pagina = pagina.replace("<h2></h2>","<h2>"+resultados+"</h2>");
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.print(pagina);
	out.close();
	}
	//socket
	//ESTABLECEMOS CONEXIÓN
	SocketService service = new SocketService(8888);
	Socket s = service.accept();
	//LEEMOS
	InputStream in = s.getInputStream();
	InputStreamReader r1 = new InputStreamReader(in);
	BufferedReader html = new BufferedReader(r1);
//me guardo el int
	int num = Integer.parseInt(html.nextLine);
	
	
	
	
	s.close();
	service.close();
	

}
