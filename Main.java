import controller.LivroController;
import controller.LivroController;
import controller.UsuarioController;
import model.Livro;
import model.Usuario;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== SISTEMA DE GERENCIAMENTO DE BIBLIOTECA =====\n");
        
     
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
        
    }

