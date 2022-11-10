package funtec.gerenciador_funcionarios.model.repositorio;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import funtec.gerenciador_funcionarios.model.Funcionario;
import funtec.gerenciador_funcionarios.model.FuncionarioSetor;



public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

    List<Funcionario> findBySetor(FuncionarioSetor funcionarioSetor);
}
