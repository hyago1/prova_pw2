package com.tads.pw.prova2.Controllers;


import com.tads.pw.prova2.Entitys.Camisa;
import com.tads.pw.prova2.Services.CamisaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CamisaController {

    @Autowired
    private CamisaServices  camisaServices;

//Rotas de incio / e /admin
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("camisaList", camisaServices.findByIsDeletedIsNull());
        return "index";
    }
    @GetMapping("/admin")
    public String admin(Model model){
        model.addAttribute("camisaList", camisaServices.getAll());
        return "admin";
    }


// funções do admin

    @GetMapping("/cadastro")
    public String cadastro(){
        return "cadastro";
    }
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Camisa camisa){
        camisaServices.save(camisa);
        return "redirect:/admin";
    }


    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id,  Model model){
        //chama o service pra editar
        model.addAttribute("camisaEdit", camisaServices.findById(id));
        return "edicao";
    }
    @GetMapping("/deletar/{id}")
    public String deletar(@PathVariable Long id){
        //chama o service pra deletar
        camisaServices.isDeleteById(id);
        return "redirect:/admin";
    }
    @GetMapping("/restaurar/{id}")
    public String restaurar(@PathVariable Long id){
        //chama o service pra restaurar
        camisaServices.restaurarById(id);
        return "redirect:/admin";
    }





}
