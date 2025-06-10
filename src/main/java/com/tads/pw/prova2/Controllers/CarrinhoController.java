package com.tads.pw.prova2.Controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class CarrinhoController {

    @GetMapping("/adicionarCarrinho/{id}")
    public ResponseEntity<String> adicionarCarrinho(@PathVariable Long id) {
        // Aqui você colocaria a lógica de adicionar o item com esse id no carrinho
        return ResponseEntity.ok("Item " + id + " adicionado ao carrinho");
    }
}