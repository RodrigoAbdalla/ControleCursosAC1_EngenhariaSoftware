package com.ac1.ControleCursos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

import com.ac1.ControleCursos.model.Cursos;
import com.ac1.ControleCursos.model.Usuario;



public class UsuarioTeste {
   
	
	private Usuario usuario;

	@Test
	public void deveAlterarCategoriaParaPremiumQuandoAtingirDozeCursos () {
		
        // Cenario
        usuario = new Usuario("Rodrigo Abdalla");
        
        /// Cria uma lista de 11 cursos
        List<Cursos> cursos = new ArrayList<Cursos>(Arrays.asList (new Cursos[]{new Cursos("Java Avançado"),
                                                                                new Cursos("Java Iniciante"),
                                                                                new Cursos("Python Iniciante"),
                                                                                new Cursos("Java Profissional"),
                                                                                new Cursos("Python Avançado"),
                                                                                new Cursos("RPA Iniciante"),
                                                                                new Cursos("Rpa do zero ao avançado"),
                                                                                new Cursos("Java Script Avançado"),
                                                                                new Cursos("Como cozinhar de forma profissional"),
                                                                                new Cursos("Como jogar CS GO"),
                                                                                new Cursos("O poder de uma rotina organizada")})); 
        
        // Execucao                                                                        

        // Adiciona de uma só vez
        usuario.addCursos(cursos);  
        

        //Resultado
        String categoriaFinal = usuario.getCategoria();

		
        // Confirma que a categoria estava em Basic
		Assert.assertEquals("Basic", categoriaFinal);
        
        // Adiciona mais um curso para que fique com 12 
        usuario.addCursos(new Cursos("Java Iniciante ao profissional"));

        // Confirma que ficou com 12 cursos
        Assert.assertEquals(12, usuario.getCursos().size(), 0.0001);

        
        categoriaFinal = usuario.getCategoria();
        // Confirma que a categoria está em Premium
		Assert.assertEquals("Premium", categoriaFinal);
	}
	
	@Test
	public void deveManterCategoriaEmPremiumQuandoAtingirTrezeCursos () {
		
        // Cenario
        usuario = new Usuario("Rodrigo Abdalla");

        // Cria uma lista de 12 cursos
        List<Cursos> cursos = new ArrayList<Cursos>(Arrays.asList (new Cursos[]{new Cursos("Java Avançado"),
                                                                                new Cursos("Java Iniciante"),
                                                                                new Cursos("Python Iniciante"),
                                                                                new Cursos("Java Profissional"),
                                                                                new Cursos("Python Avançado"),
                                                                                new Cursos("RPA Iniciante"),
                                                                                new Cursos("Rpa do zero ao avançado"),
                                                                                new Cursos("Java Script Avançado"),
                                                                                new Cursos("Como cozinhar de forma profissional"),
                                                                                new Cursos("Como jogar CS GO"),
                                                                                new Cursos("O poder de uma rotina organizada"),
                                                                                new Cursos("C++ Iniciante")})); 
        

        // Execucao                                                                        

        // Adiciona de uma só vez
        usuario.addCursos(cursos);  


        //Resultado
        String categoriaFinal = usuario.getCategoria();

		
        // Confirma que a categoria estava em Premium
		Assert.assertEquals("Premium", categoriaFinal);
        
        // Adiciona mais um curso para que fique com 13 
        usuario.addCursos(new Cursos("Java Iniciante ao profissional"));

        // Confirma que ficou com 13 cursos
        Assert.assertEquals(13, usuario.getCursos().size(), 0.0001);

        
        categoriaFinal = usuario.getCategoria();
        // Confirma que a categoria foi mantida em Premium
		Assert.assertEquals("Premium", categoriaFinal);
	}

    @Test
	public void deveManterCategoriaEmBasicQuandoAtingirOnzeCursos () {
		
         // Cenario
         usuario = new Usuario("Rodrigo Abdalla");

         /// Cria uma lista de 10 cursos 
         List<Cursos> cursos = new ArrayList<Cursos>(Arrays.asList (new Cursos[]{new Cursos("Java Avançado"),
                                                                                new Cursos("Java Iniciante"),
                                                                                new Cursos("Python Iniciante"),
                                                                                new Cursos("Java Profissional"),
                                                                                new Cursos("Python Avançado"),
                                                                                new Cursos("RPA Iniciante"),
                                                                                new Cursos("Rpa do zero ao avançado"),
                                                                                new Cursos("Java Script Avançado"),
                                                                                new Cursos("Como cozinhar de forma profissional"),
                                                                                new Cursos("Como jogar CS GO")})); 
        
        // Execucao

        // Adiciona de uma só vez
        usuario.addCursos(cursos);  
 
         //Resultado
         String categoriaFinal = usuario.getCategoria();
 
         
         // Confirma que a categoria estava em Basic
         Assert.assertEquals("Basic", categoriaFinal);
         
         // Adiciona mais um curso para que fique com 11 
         usuario.addCursos(new Cursos("Java Iniciante ao profissional"));
 
         // Confirma que ficou com 11 cursos
         Assert.assertEquals(11, usuario.getCursos().size(), 0.0001);
 
         
         categoriaFinal = usuario.getCategoria();
         // Confirma que a categoria foi mantida em Basic
         Assert.assertEquals("Basic", categoriaFinal);
	}

    @Test
	public void deveManterCategoriaEmPremiumQuandoAtingirDezesseisCursos () {
		
         // Cenario
         usuario = new Usuario("Rodrigo Abdalla");

         // Cria uma lista de 15 cursos 
         List<Cursos> cursos = new ArrayList<Cursos>(Arrays.asList (new Cursos[]{new Cursos("Java Avançado"),
                                                                                new Cursos("Java Iniciante"),
                                                                                new Cursos("Python Iniciante"),
                                                                                new Cursos("Java Profissional"),
                                                                                new Cursos("Python Avançado"),
                                                                                new Cursos("RPA Iniciante"),
                                                                                new Cursos("Rpa do zero ao avançado"),
                                                                                new Cursos("Java Script Avançado"),
                                                                                new Cursos("Como cozinhar de forma profissional"),
                                                                                new Cursos("Como jogar CS GO"),
                                                                                new Cursos("O poder de uma rotina organizada"),
                                                                                new Cursos("C++ Iniciante"),
                                                                                new Cursos("Rpa: o que é?"),
                                                                                new Cursos("C# Iniciante"),
                                                                                new Cursos("Curso completo front-end")})); 
        
        // Execucao

        // Adiciona de uma só vez
        usuario.addCursos(cursos);  

         //Resultado
         String categoriaFinal = usuario.getCategoria();
 
         
         // Confirma que a categoria estava em Premium
         Assert.assertEquals("Premium", categoriaFinal);
         
         // Adiciona mais um curso para que fique com 16 
         usuario.addCursos(new Cursos("Java Iniciante ao profissional"));
 
         // Confirma que ficou com 16 cursos
         Assert.assertEquals(16, usuario.getCursos().size(), 0.0001);
 
         
         categoriaFinal = usuario.getCategoria();
         // Confirma que a categoria foi mantida em Premium
         Assert.assertEquals("Premium", categoriaFinal);
	}

    @Test
	public void deveManterCategoriaEmBasicQuandoAtingirOitoCursos () {
		
         // Cenario
         usuario = new Usuario("Rodrigo Abdalla");

         // Cria uma lista de 7 cursos
        List<Cursos> cursos = new ArrayList<Cursos>(Arrays.asList (new Cursos[]{new Cursos("Java Avançado"),
                                                                                new Cursos("Java Iniciante"),
                                                                                new Cursos("Python Iniciante"),
                                                                                new Cursos("Java Profissional"),
                                                                                new Cursos("Python Avançado"),
                                                                                new Cursos("RPA Iniciante"),
                                                                                new Cursos("Rpa do zero ao avançado")})); 

        // Execucao

        // Adiciona de uma só vez
        usuario.addCursos(cursos);                                                              

         //Resultado
         String categoriaFinal = usuario.getCategoria();
 
         
         // Confirma que a categoria estava em Basic
         Assert.assertEquals("Basic", categoriaFinal);
         
         // Adiciona mais um curso para que fique com 8 
         usuario.addCursos(new Cursos("Java Iniciante ao profissional"));
 
         // Confirma que ficou com 8 cursos
         Assert.assertEquals(8, usuario.getCursos().size(), 0.0001);
 
         
         categoriaFinal = usuario.getCategoria();
         // Confirma que a categoria foi mantida em Basic
         Assert.assertEquals("Basic", categoriaFinal);
	}

}
