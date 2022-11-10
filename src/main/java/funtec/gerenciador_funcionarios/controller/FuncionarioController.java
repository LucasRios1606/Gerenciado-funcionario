package funtec.gerenciador_funcionarios.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import funtec.gerenciador_funcionarios.model.Funcionario;
import funtec.gerenciador_funcionarios.model.repositorio.FuncionarioRepository;

@Controller
public class FuncionarioController {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    // Acessa o formulario
    @GetMapping("/form")
    public String funcionariosForm(Funcionario funcionario) {

        return "addFuncionariosForm";
    }

    // Adiciona novo funcionario
    @PostMapping("/add")
    public String novo(@Valid Funcionario funcionario, BindingResult result) {

        if (result.hasFieldErrors()) {
            return "redirect:/form";
        }

        funcionarioRepository.save(funcionario);

        return "redirect:/home";
    }}
