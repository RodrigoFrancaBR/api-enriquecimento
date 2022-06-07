package br.com.franca.apienriquecimento.repository;

import br.com.franca.apienriquecimento.domain.model.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IPessoaRepository extends CrudRepository<Pessoa, Long> {

    public Optional<Pessoa> findByCpf(String cpf);

}
