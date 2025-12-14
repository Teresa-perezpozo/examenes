package examenes;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;

public class gestionPacientes {
	

	public List<Paciente> leerPacientes(String f) throws Exception{
		List<Paciente> pacientes = new Paciente<>;
		
		
		//abrir el flujo	
		FileInputStream f = new FileInputStream(f1);
		InputStreamReader r1 = new InputStreamReader(file);
		BufferedReader html = new BufferedReader(r1);
		
		
		//hacer pacientes
		while(html.nextLine()!=null) {
		String[] info  = linea.split(",");
		String nombre = info[0];
		String apellidos = info[1];
		String dni = info[2];
		Paciente p = new Paciente (nombre, apellidos, dni);	
		pacientes.add(p);
		}
		s.close()
;		return pacientes;
		}
	public void escribirPacientes(List<Paciente> ps, String f1) throws Exception{
		FileInputStream f = new FileInputStream(f1);
		InputStreamReader r1 = new InputStreamReader(file);
		BufferedReader html = new BufferedReader(r1);
		PrintWriter out = new PrintWriter(f);
		
		
		
		
	}
}
