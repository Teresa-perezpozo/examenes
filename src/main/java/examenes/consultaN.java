package examenes;
@WebServlet("/consulta.html")
public class consultaN {
String pagina = getPlantilla("consulta.html");
Map<String,String> n = new HashMap<>;
n = obtenerAsignaturas();
String opciones = " ";
for(acronimos a :n.getKeySet()) {
	opciones += "<option name ="+a+"value= "+a+","+a.getValue()">";
}

}
}
