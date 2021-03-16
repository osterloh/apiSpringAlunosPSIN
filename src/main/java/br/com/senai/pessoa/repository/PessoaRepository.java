package br.com.senai.pessoa.repository;

import br.com.senai.pessoa.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    Pessoa findById(int id);
}
