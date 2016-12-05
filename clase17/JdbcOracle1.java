import java.sql.*;
import java.io.*;

public class JdbcOracle1{
	
	public static void main(String[] args)
	throws IOException,
		   SQLException,
		   ClassNotFoundException
		   
		   {
			   String protocolo="jdbc:oracle:";
			   String url="thin:@localhost:1521:xe";
			   String user="dbd37";
			   String pass="123456";
			   
			   
			   Class.forName ("oracle.jdbc.driver.OracleDriver");
			   Connection conn = DriverManager.getConnection(protocolo+url, user, pass);
			   
			   String formatoQuery="Select * from persona";
			   String querySql= formatoQuery;
			   
			   Statement s = conn.createStatement();
			   ResultSet r = s.executeQuery(querySql);
			   
			   boolean existe = false;
			   
			   while (r.next()){
				   
				   System.out.println("Rut:"+r.getString("rut")+
					"\nNombre: "+ r.getString("nombre")+
					"\nApellido Paterno: " + r.getString("apPate")+
					"\nApellido Materno: " + r.getString("apMate"));
					
					System.out.println("----------------");
					existe = true;
					
			   };
			   
			   if(!existe)
				   System.out.println("No existen datos de Personas en la Bd.");
			   
			   r.close();
			   s.close();
			   conn.close();

		   }
}