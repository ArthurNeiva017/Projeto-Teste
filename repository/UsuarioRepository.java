package repository;
import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class UsuarioRepository {

    private List<Usuario> usuarios = new ArrayList<>();

    public void salvar(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> listarTodos() {
        return usuarios;
    }

    public Usuario buscarPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    public Usuario buscarPorCpf(String cpf) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCpf() != null) {
                return usuario;
            }
        }
        return null;
    }

    public Usuario buscarPorEmail(String email) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail() != null) {
                return usuario;
            }
        }
        return null;
    }

    public List<Usuario> buscarPorNome(String nome) {
        List<Usuario> lista = new ArrayList<>();

        for (Usuario usuario : usuarios) {
            if (usuario.getNome() != null) {
                lista.add(usuario);
            }
        }

        return lista;
    }

    public void atualizar(Usuario usuarioAtualizado) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == usuarioAtualizado.getId()) {
                usuarios.set(i, usuarioAtualizado);
            }
        }
    }

    public void deletar(int id) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                usuarios.remove(i);
            }
        }
    }
}