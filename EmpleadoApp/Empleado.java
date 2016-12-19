import java.io.*;
import java.sql.*;

public class Empleado {
	
	private String rut;
	private String nombre;
	private String apellido;
	private String fecha_nacimiento;
	private int n_cargas;
	
	public void Empleado(){
		this.rut="";
		this.nombre="";
		this.apellido="";
		this.fecha_nacimiento="";
		this.n_cargas=0;
	}
	
	public void leerDatos(){
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese Rut:");
			this.rut = teclado.readLine();
			System.out.println("Ingrese Nombre:");
			this.nombre = teclado.readLine();
			System.out.println("Ingrese Apellido:");
			this.apellido = teclado.readLine();
			System.out.println("Ingrese Fecha de Nacimiento");
			this.fecha_nacimiento = teclado.readLine();
			System.out.println("Ingrese N\u00famero de Cargas");
			this.n_cargas = Integer.parseInt(teclado.readLine());
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void mostrarDatos()
	{
		System.out.println("Rut: " + this.rut);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellidos: " + this.apellido);
		System.out.println("Fecha de Nacimiento: " + this.fecha_nacimiento);
		System.out.println("N\u00famero de Cargas: " + this.n_cargas);
	}
	
	public void agregarDatos(){
		String protocolo="jdbc:oracle:";
		String url="thin:@localhost:1521:xe";
		String user="dbd37";
		String pass="123456";
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
		Connection conn;
		Statement s;
		ResultSet r ;
		PreparedStatement pstm;

		//
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(protocolo+url,user,pass);
			String formatoQuery="SELECT * FROM empleado"+
								" where rut='%s'";
			
			String querySql=String.format(formatoQuery,this.rut);

			// String querySql=formatoQuery;
			//  String querySql=formatoQuery;

			s = conn.createStatement();
			r = s.executeQuery(querySql);
			boolean existe = false;
			while(r.next())
			{
			/*
			this.rut=r.getString("rut");
			this.nombre=r.getString("nombre");
			this.apellido=r.getString("apellido");
			this.fecha_nacimiento=r.getString("fecha_nacimiento");
			this.n_cargas=r.getInt("n_cargas");
			*/
			existe=true;
			System.out.println("El Rut ya existe");
			};
			if(!existe){
				try{
					pstm=
					conn.prepareStatement("insert into empleado(rut,nombre,apellido,fecha_nacimiento,n_cargas) values(?,?,?,?,?)");
					pstm.setString(1,this.rut);
					pstm.setString(2,this.nombre);
					pstm.setString(3,this.apellido);
					pstm.setString(4,this.fecha_nacimiento);
					pstm.setInt(5,this.n_cargas);
					int rowCount=pstm.executeUpdate();
					if(rowCount>0)
						System.out.println("Datos han sido insertados, confirme esto ejecutando el programa anterior.");
					else
						System.out.println("Los Datos no han sido insertados");
					pstm.close();
				}catch (Exception ex){
					System.out.println("Error: "+ex.getMessage());
				}
			}
			
			
			r.close(); // Cierre canasto
			s.close();// Cierre bodega
			conn.close();
			
		}catch (Exception ex){
			System.out.println("Error: "+ex.getMessage());
		}		
		
	}
	
	public void buscarDatos(String rut){
		
		String protocolo="jdbc:oracle:";//protocolo oracle "SE DEBE INVERTIGAR COMO ENTRAR CON MYSQL Y SQLSERVER"
		String url="thin:@localhost:1521:xe";
		String user="dbd37";
		String pass="123456";
		Connection conn;
		Statement s;
		ResultSet r;		

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");// va a buscar el jar a la carpeta
			conn = DriverManager.getConnection(
			protocolo+url,user,pass);
			String formatoQuery="SELECT * FROM empleado"+
								" where rut='%s'";
			
			String querySql=String.format(formatoQuery,rut);

			// String querySql=formatoQuery;
			//  String querySql=formatoQuery;

			s = conn.createStatement();
			r = s.executeQuery(querySql);
			boolean existe = false;
			while(r.next())
			{
			this.rut=r.getString("rut");
			this.nombre=r.getString("nombre");
			this.apellido=r.getString("apellido");
			this.fecha_nacimiento=r.getString("fecha_nacimiento");
			this.n_cargas=r.getInt("n_cargas");
			existe=true;
			};
			if(!existe)
			System.out.println("No existen datos de Personas en la BD.");
			r.close(); // Cierre canasto
			s.close();// Cierre bodega
			conn.close();// Cierre conexion
		}catch (Exception ex){
			System.out.println("Error: "+ex.getMessage());
		}	
		
	}
	
	public void listarDatos(){
		String protocolo="jdbc:oracle:";//protocolo oracle "SE DEBE INVERTIGAR COMO ENTRAR CON MYSQL Y SQLSERVER"
		String url="thin:@localhost:1521:xe";
		String user="dbd37";
		String pass="123456";
		Connection conn;
		Statement s;
		ResultSet r;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");// va a buscar el jar a la carpeta
			conn = DriverManager.getConnection(
			protocolo+url,user,pass);
		
			String formatoQuery="SELECT * FROM empleado";

			String querySql=formatoQuery;
		//  String querySql=formatoQuery;
			s = conn.createStatement();
			r = s.executeQuery(querySql);
			boolean existe = false;
			while(r.next())
			{
			System.out.println("Rut:"+r.getString("rut")+
			"\nNombre: "+r.getString("nombre")+			  
			"\nApellido: "+r.getString("apellido")+
			"\nFecha de Nacimiento: "+r.getString("fecha_nacimiento")+
			"\nN\u00famero de Cargas: "+r.getInt("n_cargas"));
			System.out.println("--------------------");
			existe=true;
			};
			if(!existe)
			  System.out.println("No existen datos de empleado en la BD.");
			r.close(); // Cierre canasto
			s.close();// Cierre bodega
			conn.close();// Cierre conexion
		}catch (Exception ex){
			System.out.println("Error: "+ex.getMessage());
		}

	}
	
	public void eliminarDatos(String rut){
		String protocolo="jdbc:oracle:";
		String url="thin:@localhost:1521:xe";
		String user="dbd37";
		String pass="123456";
		Connection conn;
		PreparedStatement pstm;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(protocolo+url,user,pass);	
		
			pstm=
			conn.prepareStatement("delete from empleado where rut=?");
			pstm.setString(1,rut);
			
			int rowCount=pstm.executeUpdate();
			if(rowCount>0)
				System.out.println("Los datos han sido eliminados");
			else
				System.out.println("Los datos no han sido eliminados");
			pstm.close();
			conn.close();
			
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}	

	}
	
}