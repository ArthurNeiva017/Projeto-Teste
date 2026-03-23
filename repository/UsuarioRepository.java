package repository;
import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class UsuarioRepository {
	
	private List<Usuario> usuarios  = new ArrayList<Usuario>();
   

    public Usuario salvar(Usuario usuario) 
    
    {
    	usuario.setId(usuarios.size()+1);
    	usuarios.add(usuario);
    	return usuario;
        
   
    }

    public Usuario buscarPorId(int id) {
    	for (Usuario usuario: usuarios) {
    		if (usuario.getId() == id) {
    			return usuario;
    		}
    	}
    			
        return null;
    }

    public Usuario buscarPorCpf(String cpf) {
    	for( Usuario u : usuarios) {
    		if (u.getCpf().equals(cpf))  {
    			return u;
    		}
    	}
        return null;
    }

    public Usuario buscarPorEmail(String email) {
    	for (Usuario u : usuarios) {
    		if(u.getEmail().equals(email)) {
    			return u;
    		}
    	}
        return null;
    }

    public List<Usuario> buscarPorNome(String nome) {
    	List<Usuario> lista = new ArrayList <Usuario>();
    	for(Usuario u : usuarios) {
    		if (u.getNome().equals(nome)) { 
    			lista.add(u);
    			}
    	}
        return lista;
    }

    public List<Usuario> listarTodos() {
        return usuarios;
    }

    public void atualizar(Usuario usuario) {
    	Usuario existente =
    			buscarPorId(usuario.getId());
    	if(existente != null) {
    		existente.setNome(usuario.getNome());
    		existente.setEmail(usuario.getEmail());
    		existente.setCpf(usuario.getCpf());
    	}
    }

    public void deletar(int id) {
    	Usuario usuario = buscarPorId(id);
    	if(usuario !=null) {
    		usuario.remove(usuario);
    	}
    }
}
