package br.com.testeGit;

public class Teste {
	public static void main(String[] args) {
		System.out.println("Teste");
		System.out.println("x");
		compareStringIgnoreCase("a","A");
	}
	
	private static boolean compareStringIgnoreCase(String a, String b){
		if (a.equalsIgnoreCase(b)){
			return true;
		}
		return false;
	}
}