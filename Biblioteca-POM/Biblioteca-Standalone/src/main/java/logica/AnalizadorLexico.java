package logica;

import java.util.ArrayList;

import util.GestionFichero;



public class AnalizadorLexico {
	   private static final String [] PALABRAS_RESERVADAS={
			   "Whole","Word","Decimals","Letter","Method",

			   };
			   
			   private  static final String [] SIMBOLOS={
			       "<",">",",","(",")","{","}","[","]",
			        "'","'",":",";",".",
			   };  
			   private static final String [] METODO_DE_IMPRIMIR={
			   "_Salida.<<' '>>"
			  
			   };
			   private static final String [] COMPARACIONES={
			   "=>","=<","=:=","=!=",
			   };

			   
			   private GestionFichero gestionFichero;
			   private ArrayList<String> arregloArchivo;
			   private Integer contarLineas;

			    public AnalizadorLexico(String nombre) {
			        gestionFichero = new GestionFichero();
			        try {
			              arregloArchivo = gestionFichero.cargarFichero(nombre);
			        } catch (Exception e) {

			        }
			        contarLineas = 0;
			    }
			    public ArrayList<TokensAnalixador> analizarCodigo(){
			        ArrayList<TokensAnalixador> tokens=new ArrayList();
			        for (String linea: arregloArchivo) {
			            contarLineas++;
			            Integer i=0;
			            while(i < linea.trim().length()){
			                TokensAnalixador token = obtenerTokens(arregloArchivo ,linea.trim() , i );
			                tokens.add(token);
			                i=token.getLinea();
			             while (i < linea.trim().length() && linea.trim().charAt(i) == ' ') {
			                 i++;
			             } 
			        }
			       
			     } 
			        return tokens;
			    }
			  public TokensAnalixador obtenerTokens(ArrayList<String> arregloArchivo,String linea,Integer i){
			     TokensAnalixador token;
			    //se encarga de que se separe un lado de otro a si como un ; 
			         token=obtenerOperadorSentencia(linea, i);
			     if(token!=null){
			         return token;
			  }
			              token=obtenerComparacion(linea, i);
			     if(token!=null){
			         return token;
			  }
			      token=obtenerLetra(linea, i);
			     if(token!=null){
			         return token;
			  }
			     
			     token=obtenerImprimir(linea, i);
			     if(token!=null){
			         return token;
			  }
			     
			     
			     token=obtenerPalabraReservada(linea, i);
			     if(token!=null){
			         return token;
			  }
			     token = obtenerDigito(linea,i) ;
			     if(token!=null){
			       return  token;
			  }
			      token = obtenerComentarios(arregloArchivo, i);
			        if (token != null) {
			            return token;
			        }
			        
			        token = obtenerOperadorMatematico(linea, i);
			        if (token != null) {
			            return token;
			        }
			        
			          token = obtenerSimbolo(linea, i);
			        if (token != null) {
			            return token;
			        }
			        
			        token = obtenerOperadorDeAsignacion(linea, i);
			        if (token != null) {
			            return token;
			        }
			        token = obtenerIdentificador(linea, i);
			        if (token != null) {
			            return token;
			        }
			        
			          token = obtenerCadena(linea, i);
			        if (token != null) {
			            return token;
			        }
			        
			        token = obtenerNoReconocido(linea, i);
			        return token;
			  } 
			  
			    public TokensAnalixador obtenerPalabraReservada(String linea, Integer i) {
			        for (String s : PALABRAS_RESERVADAS) {
			            Integer k = 0;
			            if (s.charAt(k) == linea.charAt(i)) {
			                k++;
			                Integer j = i + 1;
			                while (k < s.length() && j < linea.length() && s.charAt(k) == linea.charAt(j)) {
			                    j++;
			                    k++;
			                }
			                String lexema =  linea.substring(i, j);
			                if (s.equals(lexema))
			                    return new TokensAnalixador(TokensAnalixador.PALABRAS_RESERVADAS, lexema , j, contarLineas);
			            }
			        }
			        return null;
			    }
			    public TokensAnalixador obtenerComparacion(String linea, Integer i) {
			        for (String s : COMPARACIONES) {
			            Integer k = 0;
			            if (s.charAt(k) == linea.charAt(i)) {
			                k++;
			                Integer j = i + 1;
			                while (k < s.length() && j < linea.length() && s.charAt(k) == linea.charAt(j)) {
			                    j++;
			                    k++;
			                }
			                String lexema =  linea.substring(i, j);
			                if (s.equals(lexema))
			                    return new TokensAnalixador(TokensAnalixador.COMPARACIONES, lexema , j, contarLineas);
			            }
			        }
			        return null;
			    }
			    
			    
			      public TokensAnalixador obtenerDigito(String linea, Integer i) {
			        if (esDigito(linea.charAt(i))//Que empiece con un dígito
			                
			                || ((linea.charAt(i) == '-' || linea.charAt(i) == '+')//ó que empiece con un signo
			                && (i + 1 < linea.length())//y que el siguiente caracter de ese signo exista
			                && (esDigito(linea.charAt(i + 1))//y que ese siguiente caracter de ese signo sea un dígito
			                || (linea.charAt(i + 1) == '.') && ((i + 2 < linea.length()) && esDigito(linea.charAt(i + 2)))))){ //o que ese siguiente caracter de ese signo sea un punto seguido de un dígito
			            Integer j = i + 1;
			            while (j < linea.length() && esDigito(linea.charAt(j))) {//Que le sigan varios dígitos
			                j++;
			            }
			            if (j < linea.length() && linea.charAt(j) == '.') {//Que siga un punto
			                if (++j < linea.length() && esDigito(linea.charAt(j++)))//Seguido de un dígito
			                    while (j < linea.length() && esDigito(linea.charAt(j)))//Que le sigan varios dígitos
			                        j++;
			                else
			                    j--;
			            }
			            String lexema =  linea.substring(i, j);
			            return new TokensAnalixador(TokensAnalixador.VALORES_NUMERICOS, lexema, j, contarLineas);
			        }
			        
			        if (linea.charAt(i) == '.' && (i + 1 < linea.length()) && esDigito(linea.charAt(i + 1))) { //Que empiece por punto seguido de un dígito
			            Integer j = i + 1;
			            while (j < linea.length() && esDigito(linea.charAt(j))) {//Que le sigan varios dígitos
			                j++;
			            }
			            String lexema =  linea.substring(i, j);
			            return new TokensAnalixador(TokensAnalixador.SIMBOLOS, lexema, j, contarLineas);
			        }
			        return null;
			    }
			      
			      private TokensAnalixador obtenerComentarios(ArrayList<String> arregloArchivo, Integer i) {
			        return null;
			    }
			     
			      public TokensAnalixador obtenerOperadorMatematico(String linea, Integer i) {
			        if (i < linea.length() && (linea.charAt(i) == '+'
			                || linea.charAt(i) == '-' || linea.charAt(i) == '*'
			                || linea.charAt(i) == '/')){
			            Integer j = i + 1;
			            String lexema =  linea.substring(i, j);
			            return new TokensAnalixador(TokensAnalixador.OPERADORES_MATEMATICOS, lexema, j, contarLineas);
			        }
			        return null;
			    }
			     
			      private TokensAnalixador obtenerSimbolo(String linea, Integer i) {
			        for (String s : SIMBOLOS) {
			            Integer k = 0;
			            if (s.charAt(k) == linea.charAt(i)) {
			                k++;
			                Integer j = i + 1;
			                while (k < s.length() && j < linea.length() && s.charAt(k) == linea.charAt(j)) {
			                    j++;
			                    k++;
			                }
			                String lexema =  linea.substring(i, j);
			                if (s.equals(lexema))
			                    return new TokensAnalixador(TokensAnalixador.SIMBOLOS, lexema, j, contarLineas);
			            }
			        }
			        return null;
			    }
			      private TokensAnalixador obtenerImprimir(String linea, Integer i) {
			        for (String s : METODO_DE_IMPRIMIR) {
			            Integer k = 0;
			            if (s.charAt(k) == linea.charAt(i)) {
			                k++;
			                Integer j = i + 1;
			                while (k < s.length() && j < linea.length() && s.charAt(k) == linea.charAt(j)) {
			                    j++;
			                    k++;
			                }
			                String lexema =  linea.substring(i, j);
			                if (s.equals(lexema))
			                    return new TokensAnalixador(TokensAnalixador.METODO_IMPRIMIR, lexema, j, contarLineas);
			            }
			        }
			        return null;
			    }
			      

			    public TokensAnalixador obtenerOperadorDeAsignacion(String linea, Integer i) {
			        if (linea.charAt(i) == '#') {
			            Integer j = i + 1;
			            String lexema =  linea.substring(i, j);
			            return new TokensAnalixador(TokensAnalixador.OPERADOR_ASIGNACION, lexema, j, contarLineas);
			        }
			        return null;
			    }

			      public TokensAnalixador obtenerOperadorSentencia(String linea, Integer i) {
			        if (linea.charAt(i) == ',') {
			            Integer j = i + 1;
			            String lexema =  linea.substring(i, j);
			            return new TokensAnalixador(TokensAnalixador.SEPARADOR, lexema, j, contarLineas);
			        }
			        return null;
			    }
			     private TokensAnalixador obtenerLetra(String linea, Integer i) {
			        if (linea.charAt(i) == '_') {
			            Integer j = i + 1;
			            while (j <i+2 && linea.charAt(j)!= '_') {
			                j++;
			            }
			            if (j < linea.length() && linea.charAt(j++) == '_') {
			                String lexema =  linea.substring(i, j);
			                return new TokensAnalixador(TokensAnalixador.LETRA, lexema, j, contarLineas);
			            }
			        }
			        return null;
			    }
			    
			    private TokensAnalixador obtenerCadena(String linea, Integer i) {
			        if (linea.charAt(i) == '"') {
			            Integer j = i + 1;
			            while (j < linea.length() && linea.charAt(j) != '"') {
			                j++;
			            }
			            if (j < linea.length() && linea.charAt(j++) == '"') {
			                String lexema =  linea.substring(i, j);
			                return new TokensAnalixador(TokensAnalixador.CADENA_PALABRAS, lexema, j, contarLineas);
			            }
			        }
			        return null;
			    }

			    private TokensAnalixador obtenerIdentificador(String linea, Integer i) {
			        if (esLetra(linea.charAt(i)) || linea.charAt(i) == '_' || linea.charAt(i) == '$') {
			            Integer j = i + 1;
			            while (j < linea.length() && (esLetra(linea.charAt(j))
			                    || esDigito(linea.charAt(j)) || linea.charAt(j) == '_'
			                    || linea.charAt(j) == '$')) {
			                j++;
			            }
			            String lexema =  linea.substring(i, j);
			            return new TokensAnalixador(TokensAnalixador.NOMBRES_DE_VARIABLES, lexema, j, contarLineas);
			        }
			        return null;
			    }
			    
			    public TokensAnalixador obtenerNoReconocido(String linea, Integer i) {
			        String lexema =  linea.substring(i, i + 1);
			        int j = i + 1;
			        return new TokensAnalixador(TokensAnalixador.SIMBOLOS_NO_RECONOCIDOS, lexema, j, contarLineas);
			    } 
			      
			     public boolean esDigito(char caracter) {
			        return caracter >= '0' && caracter <= '9';
			    }

			    public boolean esLetra(char caracter) {
			        return (caracter >= 'A' && caracter <= 'Z') || (caracter >= 'a' && caracter <= 'z');
			    }
			}
