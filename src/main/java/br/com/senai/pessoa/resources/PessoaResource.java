package br.com.senai.pessoa.resources;

import br.com.senai.pessoa.model.Pessoa;
import br.com.senai.pessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/psin")
@CrossOrigin(origins = "*")
public class PessoaResource {

    @Autowired
    PessoaRepository pessoaRepository;

    @GetMapping("/pessoas")
    public List<Pessoa> listPessoas(){
        return pessoaRepository.findAll();
    }

    @GetMapping("/pessoa/{id}")
    public Pessoa listPessoaById(@PathVariable(value = "id") int id){
        return pessoaRepository.findById(id);
    }

    @PostMapping("/pessoa")
    public Pessoa adicionaPessoa(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    @PutMapping("/pessoa")
    public Pessoa atualizaDadosDaPessoa(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    @DeleteMapping("/pessoa")
    public void deletaPessoa(@RequestBody Pessoa pessoa){
        pessoaRepository.delete(pessoa);
    }
}
