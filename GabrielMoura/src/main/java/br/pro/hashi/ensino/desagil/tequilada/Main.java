package br.pro.hashi.ensino.desagil.tequilada;

import java.io.BufferedReader;
import java.lang.StringBuilder;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		BufferedReader leitor = null;
		
		try{
	         File arquivo = new File("C:/Users/Gabriel Moura/workspace/GabrielMoura/src/main/java/br/pro/hashi/ensino/desagil/tequilada/incre2.txt");
	         leitor = new BufferedReader(new FileReader(arquivo));
	         
	         String linha;
		     linha = leitor.readLine();
		     
		     while ((linha = leitor.readLine()) != null) {
		        StringBuilder novalinha = new StringBuilder(linha);
		        
		        for (int i = 0; i < novalinha.length(); i++) {
		        	if (novalinha.charAt(i) == '#') {
		        		novalinha.setCharAt(i, 'X');
		        	}		
		        }
		        System.out.println(novalinha);
		     }
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	         leitor.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	  }

}