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
<<<<<<< HEAD
            if (usuario.getCpf() != null && usuario.getCpf().equals(cpf)) {
=======
            if (usuario.getCpf() != null) {
>>>>>>> 7e49e34cbb7ea3fd0ec5f722599a3bb227f36300
                return usuario;
            }
        }
        return null;
    }

    public Usuario buscarPorEmail(String email) {
        for (Usuario usuario : usuarios) {
<<<<<<< HEAD
            if (usuario.getEmail() != null && usuario.getEmail().equals(email)) {
=======
            if (usuario.getEmail() != null) {
>>>>>>> 7e49e34cbb7ea3fd0ec5f722599a3bb227f36300
                return usuario;
            }
        }
        return null;
    }

    public List<Usuario> buscarPorNome(String nome) {
        List<Usuario> lista = new ArrayList<>();

        for (Usuario usuario : usuarios) {
<<<<<<< HEAD
            if (usuario.getNome() != null &&
                usuario.getNome().toLowerCase().contains(nome.toLowerCase())) {
=======
            if (usuario.getNome() != null) {
>>>>>>> 7e49e34cbb7ea3fd0ec5f722599a3bb227f36300
                lista.add(usuario);
            }
        }

        return lista;
    }

    public void atualizar(Usuario usuarioAtualizado) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == usuarioAtualizado.getId()) {
                usuarios.set(i, usuarioAtualizado);
                break;
            }
        }
    }

    public void deletar(int id) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                usuarios.remove(i);
                break;
            }
        }
    }
}