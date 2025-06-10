package com.tads.pw.prova2.Controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class CarrinhoController {


    int coutCarrinho = 0;

    @GetMapping("/adicionarCarrinho/{id}")
    public String adicionarCarrinho(@PathVariable Long id) {
        // Aqui você colocaria a lógica de adicionar o item com esse id no carrinho
        coutCarrinho++;
        return "redirect:/";
    }

    @GetMapping("/verCarrinho")
    public ResponseEntity<String> verCarrinho(){
        return ResponseEntity.ok("Carrinho contém "+coutCarrinho+ " Items.");
    }
}