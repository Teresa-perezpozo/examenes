package examenes;
@WebServlet("/controlLuz")
public class controlLuz extends HttpServlet{

	//doget
	boolean alternar = true;
	InputStream file = getServletContext().getResourceAsInputStream();
	BufferedReader html = new BufferedReade(newInputStreamReader(file));
	String pagina = "", linea;
	while(linea = html.readLine())!=null) pagina+= linea;
	
	HttpSession sesion = request.getSession();
    
    Boolean estado = (Boolean) sesion.getAttribute("estadoLuz");
   String textoEstado;
       pagina = pagina.replace("[ESTADO]", textoEstado);
    out.println(pagina);
    out.close();
}
}
