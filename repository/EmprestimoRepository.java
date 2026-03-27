package repository;
import java.util.ArrayList;
import java.util.List;
import model.Emprestimo;

public class EmprestimoRepository {

    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void salvar(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public List<Emprestimo> listarTodos() {
        return emprestimos;
    }

    public Emprestimo buscarPorId(int id) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getId() == id) {
                return emprestimo;
            }
        }
        return null;
    }

    public List<Emprestimo> buscarPorUsuario(int usuarioId) {
        List<Emprestimo> listaEmprestimoBuscarUsuario = new ArrayList<>();

        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getUsuarioId() == usuarioId) {
                listaEmprestimoBuscarUsuario.add(emprestimo);
            }
        }

        return listaEmprestimoBuscarUsuario;
    }

    public List<Emprestimo> buscarEmprestimosAtivos(int usuarioId) {
        List<Emprestimo> listaEmprestimosBuscarAtivos = new ArrayList<>();

        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getUsuarioId() == usuarioId && emprestimo.isAtivo()) {
                listaEmprestimosBuscarAtivos.add(emprestimo);
            }
        }

        return listaEmprestimosBuscarAtivos;
    }

    public List<Emprestimo> listarEmprestimosAtivos() {
        List<Emprestimo> listaEmprestimoAtivo = new ArrayList<>();

        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.isAtivo()) {
                listaEmprestimoAtivo.add(emprestimo);
            }
        }

        return listaEmprestimoAtivo;
    }

    public void atualizar(Emprestimo emprestimoAtualizado) {
        for (int i = 0; i < emprestimos.size(); i++) {
            if (emprestimos.get(i).getId() == emprestimoAtualizado.getId()) {
                emprestimos.set(i, emprestimoAtualizado);
            }
        }
    }

    public void deletar(int id) {
        for (int i = 0; i < emprestimos.size(); i++) {
            if (emprestimos.get(i).getId() == id) {
                emprestimos.remove(i);
            }
        }
    }
}
