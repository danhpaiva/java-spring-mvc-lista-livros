package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import models.Livro;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LivroController {

    @GetMapping("/livros")
    public String listarLivros(Model model) {
        // Simulação de uma lista de livros
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Dom Quixote", "Miguel de Cervantes", 1605));
        livros.add(new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967));
        livros.add(new Livro("1984", "George Orwell", 1949));

        // Adicionando a lista de livros ao modelo
        model.addAttribute("livros", livros);

        // Retorna o nome da view
        return "livros";
    }
}

