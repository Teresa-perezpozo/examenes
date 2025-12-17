package examenes;
@WebServlet("/consulta.html")
public class consultaN {
	//doGet
String pagina = getPlantilla("consulta.html");
Map<String,String> n = new HashMap<>;
n = obtenerAsignaturas();
String opciones = " ";
for(String a :n.getKeySet()) {
	opciones += "<h2>option name ="+a+"value= "+a+","+a.getValue(a)+"</h2>";
}
pagina = pagina.replace("<h2></h2>",opciones);
PrintWriter out = response.getWriter();
out.setContextType("text/html");
out.print(pagina);
out.close();

}
//doPost
String pagina = getPlantilla("consulta.html");
HttpSession sesion = getSesion();
String asig = (String)request.getParameter("acronimo");
Float nota =Float.parseFloat().sesion.getParameter().getValue("asig");
String resultado = " ";
if(nota<5)resultado = "<h2 style = '#f22'> la nota obtenida en "+asig+"es un "+nota;"</h2>";
else resultado = "<h2 style = '#1f1'> la nota obtenida en "+asig+"es un "+nota;"</h2>";
pagina = pagina.replace("<h2></h2>",resultado);
PrintWriter out = response.getWriter();
out.setContextType("text/html");
out.print(pagina);
out.close();


}
