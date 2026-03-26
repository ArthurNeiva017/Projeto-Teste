<<<<<<< HEAD
<<<<<<< HEAD
import controller.LivroController;
import controller.LivroController;
import controller.UsuarioController;
import model.Livro;
import model.Usuario;
=======
=======
>>>>>>> 7e49e34cbb7ea3fd0ec5f722599a3bb227f36300
import java.util.List;
import java.util.Scanner;
import controller.LivroController;
import model.Livro;
<<<<<<< HEAD
>>>>>>> 1efc4866797fa5f90b8af5d7d8a765bff966ef15
=======
>>>>>>> 7e49e34cbb7ea3fd0ec5f722599a3bb227f36300

public class Main {
    public static void main(String[] args) {
        System.out.println("===== SISTEMA DE GERENCIAMENTO DE BIBLIOTECA =====\n");
        
<<<<<<< HEAD
<<<<<<< HEAD
     
                LivroController livroController = new LivroController();
                UsuarioController usuarioController = new UsuarioController();

                Livro livro1 = new Livro(1, "Dom Casmurro", "Machado de Assis", 1, 5);
                Livro livro2 = new Livro(2, "O Cortiço", "Aluísio Azevedo", 2, 3);

                Usuario usuario1 = new Usuario(1, "Arthur", "arthur@email.com", "12345678900", "61999999999");
                Usuario usuario2 = new Usuario(2, "João", "joao@email.com", "98765432100", "61888888888");

                livroController.cadastrar(livro1);
                livroController.cadastrar(livro2);

                usuarioController.cadastrar(usuario1);
                usuarioController.cadastrar(usuario2);

                System.out.println("Lista de livros:");
                System.out.println(livroController.listarTodos());

                System.out.println("Lista de usuários:");
                System.out.println(usuarioController.listarTodos());
            }
=======
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a opção:");
        String opcao = scanner.next();
        boolean continuar = true;
>>>>>>> 1efc4866797fa5f90b8af5d7d8a765bff966ef15
=======
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
>>>>>>> 7e49e34cbb7ea3fd0ec5f722599a3bb227f36300
        
        while(continuar) {
        	System.out.println("1. Cadastrar Livro");
        	System.out.println("2. Listar Livros");
<<<<<<< HEAD
        	System.out.println("3. Calcular Estoque");
=======
        	System.out.println("3. Nome do Livro");
>>>>>>> 7e49e34cbb7ea3fd0ec5f722599a3bb227f36300
        	System.out.println("4. Sair\n");
        	System.out.println("Escolha a Opção:");
        	String opcao1 = scanner.next();
        	
        	LivroController livroController = new LivroController();
        	
<<<<<<< HEAD
        	switch(opcao) {
=======
        	switch(opcao1) {
>>>>>>> 7e49e34cbb7ea3fd0ec5f722599a3bb227f36300
            case "1":
                System.out.println("Cadastro do Livro");
                Livro l1 = new Livro(1, "Arthur Neiva", "Aventura", 10, 1000);
                livroController.cadastrar(l1);
                break;
<<<<<<< HEAD
            case "2":
            	System.out.println("Estoque Livro");
=======
                
            case "2":
            	System.out.println("Listar Livros");
>>>>>>> 7e49e34cbb7ea3fd0ec5f722599a3bb227f36300
            	List<Livro>listaLivros =  livroController.listarTodos();
            	for(Livro p: listaLivros) {
            		System.out.println(p.getId() + " - " + p.getNome());
            	}
            	break;
<<<<<<< HEAD
        
        	}    
        }   
=======
            case "3":
            	System.out.println("Livro");
            	System.out.println("nome do livro:  " + livroController.buscarPorNome(opcao1));
            	break;
            case "4":
            	continuar = false;
            	break;
            default:
            	System.out.println("Opção Inválida");
        
        	}    
        } 
        
        scanner.close();
>>>>>>> 7e49e34cbb7ea3fd0ec5f722599a3bb227f36300
    }

