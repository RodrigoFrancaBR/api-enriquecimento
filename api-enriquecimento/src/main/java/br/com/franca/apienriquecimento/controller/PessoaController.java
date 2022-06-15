package br.com.franca.apienriquecimento.controller;

import br.com.franca.apienriquecimento.controller.contract.IPessoaController;
import br.com.franca.apienriquecimento.domain.model.Pessoa;
import br.com.franca.apienriquecimento.repository.IPessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "v1/enriquecimento/pessoas")
public class PessoaController implements IPessoaController {

    private final IPessoaRepository repository;

    @Override
    public Pessoa findByCpf(String cpf) {
        return repository.findByCpf(cpf).get();
    }
}
