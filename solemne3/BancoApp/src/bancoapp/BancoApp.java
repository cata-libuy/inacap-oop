/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoapp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Leica
 */
public class BancoApp {

    ArrayList<CuentaCorriente> ctasCtes = new ArrayList<CuentaCorriente>();
    ArrayList<CuentaAhorro> ctasAhorro = new ArrayList<CuentaAhorro>();
    Scanner sc = new Scanner(System.in);
    // BufferedReader teclado = new BufferedReader(new StreamReader(System.in));
    boolean continuar = true;
    
    public static void main(String[] args) {
         BancoApp app = new BancoApp();
        while(app.continuar) {
            app.menu();
        }
        System.out.println("Hasta Pronto");
    }
    
    public void menu()
    {
        int opcion = 0;
        System.out.println("INGRESE OPCION DE MENU \n 1. Agregar Cuenta \n 2. Girar de Cta.  x Numero Cta. \n 3. Depositar Cta. x Numero Cta. \n 4. Ver Saldo Cta. x Numero Cta. \n 5. Listar Ctas x numero \n Fin");
        try {
            opcion = sc.nextInt();
        } catch(Exception ex){
            System.out.println("err: " + ex.getMessage());
        }
        switch(opcion){
            case 1: agregarCuenta();
                break;
            case 2: girarDeCuenta();
                break;
            case 3: depositarEnCuenta();
                break;
            case 4: verSaldo();
                break;
            case 5: listarCuentasPorNumero();
                break;
            case 6: continuar = false;
                break;                
            default: 
                System.out.println("Ingrese opción válida");
                menu();
        }
    }
    
    public void agregarCuenta()
    {   
        String nombre = ""; 
        String apellidos = "";
        int edad = 0;
        int tipo = 0; 
        String numCuenta = "";
        try {            
            System.out.println("Nombre titular: ");
            nombre = sc.nextLine();
            sc.nextLine();
            System.out.println("Apellidos titular: ");
            apellidos = sc.nextLine();
            System.out.println("Numero de cuenta: ");
            numCuenta = sc.nextLine();
            System.out.println("Edad titular: ");
            edad = sc.nextInt();            
            System.out.println("Tipo de cuenta: 1. Corriente, 2. Ahorro ");
            tipo = sc.nextInt();             
        } catch(Exception ex) {
            System.out.println("err: " + ex.getMessage());
        }
        Titular titular = new Titular(nombre, apellidos, edad);
        if (tipo == 1) {
            CuentaCorriente nuevaCtaCte = new CuentaCorriente(titular, numCuenta);
            ctasCtes.add(nuevaCtaCte);
            System.out.println("Cuenta corriente agregada");
        } else if (tipo == 2) {
            CuentaAhorro nuevaCtaAhorro = new CuentaAhorro(titular, numCuenta);
            ctasAhorro.add(nuevaCtaAhorro);
            System.out.println("Cuenta ahorro agregada");
        } else {
            System.out.println("Cuenta no agregada, no se reconoce tipo");
        }
    }
    
    public void girarDeCuenta()
    {
        String numCuenta = "";
        int tipo = 0;
        double monto = 0.0;
        try {          
            System.out.println("Tipo de cuenta: 1. Corriente, 2. Ahorro ");
            tipo = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese numero de cuenta ");
            numCuenta = sc.nextLine();
            System.out.println("Ingrese monto a girar");
            monto = sc.nextDouble();
        } catch(Exception ex) {
            System.out.println("err: " + ex.getMessage());
        }
        if (tipo == 1) {
            for (CuentaCorriente cuenta:ctasCtes) {
                if(cuenta.getNumCuenta().equals(numCuenta)) {
                    cuenta.decrementSaldo(monto);
                    System.out.println("Monto descontado");
                    break;
                }
            }           
        } else if (tipo == 2) {
             for (CuentaCorriente cuenta:ctasAhorro) {
                if(cuenta.getNumCuenta().equals(numCuenta)) {
                    cuenta.decrementSaldo(monto);
                    System.out.println("Monto descontado");
                    break;
                }
            }           
        } else {
            System.out.println("Operación no realizada");
        }
    }
    
 public void depositarEnCuenta()
    {
        String numCuenta = "";
        int tipo = 0;
        double monto = 0.0;
        try {          
            System.out.println("Tipo de cuenta: 1. Corriente, 2. Ahorro ");
            tipo = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese numero de cuenta ");
            numCuenta = sc.nextLine();
            System.out.println("Ingrese monto a depositar");
            monto = sc.nextDouble();
        } catch(Exception ex) {
            System.out.println("err: " + ex.getMessage());
        }
        if (tipo == 1) {
            for (CuentaCorriente cuenta:ctasCtes) {
                if(cuenta.getNumCuenta().equals(numCuenta)) {
                    cuenta.incrementSaldo(monto);
                    System.out.println("Monto agregado");
                    break;
                }
            }           
        } else if (tipo == 2) {
             for (CuentaCorriente cuenta:ctasAhorro) {
                if(cuenta.getNumCuenta().equals(numCuenta)) {
                    cuenta.incrementSaldo(monto);
                    System.out.println("Monto agregado");
                    break;
                }
            }           
        } else {
            System.out.println("Operación no realizada");
        }
    }
 
 public void verSaldo()
    {
        String numCuenta = "";
        int tipo = 0;
        try {          
            System.out.println("Tipo de cuenta: 1. Corriente, 2. Ahorro ");
            tipo = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese numero de cuenta ");
            numCuenta = sc.nextLine();
        } catch(Exception ex) {
            System.out.println("err: " + ex.getMessage());
        }
        if (tipo == 1) {
            for (CuentaCorriente cuenta:ctasCtes) {
                if(cuenta.getNumCuenta().equals(numCuenta)) {
                    cuenta.printCuenta();
                    break;
                }
            }           
        } else if (tipo == 2) {
             for (CuentaCorriente cuenta:ctasAhorro) {
                if(cuenta.getNumCuenta().equals(numCuenta)) {
                    cuenta.printCuenta();
                    break;
                }
            }           
        } else {
            System.out.println("Operación no realizada");
        }
    }
 
 public void listarCuentasPorNumero()
    {
        String numCuenta = "";
        try {
            sc.nextLine();
            System.out.println("Ingrese numero de cuenta ");
            numCuenta = sc.nextLine();
            System.out.println("Buscando cuentas corrientes... ");
            for (CuentaCorriente cuenta:ctasCtes) {
                    if(cuenta.getNumCuenta().equals(numCuenta)) {
                        cuenta.printCuenta();
                    }
                }
            System.out.println("Buscando cuentas de ahorro...");
            for (CuentaCorriente cuenta:ctasAhorro) {
                    if(cuenta.getNumCuenta().equals(numCuenta)) {
                        cuenta.printCuenta();
                    }
                } 
        } catch(Exception ex) {
            System.out.println("err: " + ex.getMessage());
        }
        
    }
 
}
