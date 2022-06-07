package br.com.franca.apienriquecimento.config;

import br.com.franca.apienriquecimento.domain.model.Pessoa;
import br.com.franca.apienriquecimento.repository.IPessoaRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDate;

@Configuration
@Profile("test")
public class TestConfig {

    @Bean
    public boolean instantiateDataBase(IPessoaRepository repository) {
        for (int i = 0; i < 10; i++) {
            Pessoa pessoa = Pessoa.builder()
                .nome("meu-nome-" + i)
                .cpf("1234567891" + i)
                .nascimento(LocalDate.of(198 + i, 1 + i, 10 + i))
                .email("meu-email-"+i+".com")
                .build();
            repository.save(pessoa);
        }

        return true;
    }
}
