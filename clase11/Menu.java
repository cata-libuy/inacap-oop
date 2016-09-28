void menu (){
		try{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println("---- Menu ----");
		System.out.println("1) Ingresar Datos del curso");
		System.out.println("2) Buscar datos por alumno");
		System.out.println("3) Listar alumnos");
		System.out.println("4) Salir");
		
		String entrada = br.readLine();
		int respuesta = Integer.parseInt(entrada);
		
		switch (respuesta){
			case 1: System.out.println("1"); break; //Faltan metodos a los cuales ingresar
			case 2: System.out.println("1"); break;
			case 3: System.out.println("1"); break;
			case 4: System.out.println("1"); break;
			}
		}
		
		catch(Exception ex){
		System.out.println(ex.getMessage());
		}
	}