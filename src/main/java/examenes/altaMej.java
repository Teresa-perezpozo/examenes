package examenes;
@WebServlet("/alta")
public class altaMej {
dni apellido nombre
doget
String pagina = getPlantilla("alta.html");
PrintWriter out = response.write();
response.setContentType("text/html");

out.print(pagina);

out.close();

}
dopost{
	String dni = getSession.getAttribute("dni");
	String nombre = getSession.getAttribute("nombre");
	String apellido = getSession.getAttribute("apellido");
if(dni!=null)
}
}
