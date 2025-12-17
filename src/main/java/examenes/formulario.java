package examenes;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

@WebServlet("/calc")
public class formulario {

	//doGet
	String pagina = getPlantilla("/calc.html");
	PrintWriter out = response.getWriter();
	
	
	response.setContentType("text/html");
	out.print(pagina);
	out.close();
	
	//doPost
	String pagina = getPlantilla("calc.html");
	PrintWriter out = response.getWriter();
	int num1 = Integer.parseInt.(request.getParameter("n1"));
	int num2 = Integer.parseInt.(request.getParameter("n2"));
	Integer resultado=null;
	String op = response.getParameter("op");
	if(op.equals("suma")) resultado = num1+num2;
	else {
		resultado = num1-num2;
	}
	if(resultado<0) 		pagina=pagina.replace("<h2></h2>","<h2 style= 'color:red'> el resultado es  "+resultado);
	if(resultado>=0) 		pagina=pagina.replace("<h2></h2>","<h2 style: 'color:green'> el resultado es  "+resultado);

	response.setContextType("text/html");
	out.print(pagina);
	out.close();
	
}

//socket main
SocketService service = new ServerSocket(5678);
Socket s = service.accept();

InputStream file = new InputStreamI();
InputStreamReader r1 = new InputStreamReader(file);
BufferedReader html = new BufferedReader(r1);
 String ruta = html.readLine();
 InputStream in = new FileInputStream(ruta);
 OutputStream out = s.getOutputStream();
 
 byte[] bytes = new Byte[4096];
 while(in.read(bytes)!=-1) {
	 out.write(bytes);
 }
 s.close();
 in.close();
 


//socket
 ServetSocket servidor = new ServetSocket(5678);
 Socket s = servidor.accept();
 
 InputStreamReader r1 = new InputStreamReader(s.getInputStream());
 BufferedReader html = new BufferedReader(r1);
 
 String ruta = html.readLine();
 
 InputStream in = new FileInputStream(ruta);
 OutputStream out = s.getOutputStream();


byte[] bytes = nwe byte[4096];
while(in.read(bytes)!=-1) out.write(bytes);
s.close();
in.close();

}
