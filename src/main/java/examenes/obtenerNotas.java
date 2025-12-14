package examenes;

public class obtenerNotas {
	public String getPlantilla (String fichero) {
		FileInputStream f = new FileInputStream(fichero);
		InputStreamReader r1 = new InputStreamReader(f);
		BufferedReader html = new BufferedReader(r1);
		String info = "";
		
		while((linea = html.readLine())!=null) {
			info+=linea;
		}
		return info;
	}
	public Map<String, String> obtenerAsignaturas( ){
		FileOutputStream f = new FileOutputSrteam(f);
		PrintWriter out = new PrintWriter(f);
		out.println(info);
		out.close();
	}
}
