package br.com.franca.apienriquecimento.controller.contract;

import br.com.franca.apienriquecimento.domain.model.Pessoa;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface IPessoaController {
    @GetMapping(path = "/cpf/{cpf}", produces = MediaType.APPLICATION_JSON_VALUE)
    Pessoa findByCpf(@PathVariable String cpf);
}
