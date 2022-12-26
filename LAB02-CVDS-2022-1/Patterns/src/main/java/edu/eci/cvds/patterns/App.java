package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		if (args.length == 0) System.out.println("No ingreso un carajo");
		String cadena = "Hello ";
		cadena += args[0];
		cadena += "!";
		System.out.println(cadena);
    }
}
