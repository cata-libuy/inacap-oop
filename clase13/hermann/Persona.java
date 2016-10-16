import java.io.*;



public class Persona
{
    public String rut;
	public String nombre;
	public String apellido;
	public char sexo;
	
	public Persona()
	{
		this.rut="";
		this.nombre="";
		this.apellido="";
		this.sexo=' ';
	}	 
	public Persona(String rut, String nombre, String apellido, char sexo)
	{
		this.rut=rut;
        this.nombre=nombre;
        this.apellido=apellido;
        this.sexo=sexo;
    }

    public void leerDatos()
    {

      BufferedReader teclado = new BufferedReader( new InputStreamReader(System.in));

        try{
            System.out.println("Ingrese su rut");
            rut=teclado.readLine();
		    System.out.println("Ingrese su Nombre");
            nombre=teclado.readLine();
		    System.out.println("Ingrese su apellido");
            apellido=teclado.readLine();
		    System.out.println("Ingrese su Sexo [F / M] ");
            sexo=(char)teclado.read();
		}catch (Exception ex){
		    System.out.println("Error"+ex.getMessage());  
	    } 
	}
		 
	public void desplegarDatos()
	{
	    try{
	        System.out.println("Rut"+rut);
			System.out.println("Nombre"+nombre);
			System.out.println("apellido"+apellido);
			System.out.println("Sexo"+sexo);
			if (sexo=='f') System.out.println("sexo : Femenino");
			if (sexo=='m') System.out.println("sexo : Masculino");
					  
		}catch (Exception ex)
		{           
			System.out.println("Error"+ex.getMessage());
		}
	}
}
		 
		 
		 
		 
		 
     