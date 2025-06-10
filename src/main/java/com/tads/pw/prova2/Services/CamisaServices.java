package com.tads.pw.prova2.Services;


import com.tads.pw.prova2.Entitys.Camisa;
import com.tads.pw.prova2.Repository.CamisaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CamisaServices {


    Camisa camisa;

    @Autowired
    CamisaRepository camisaRepository;

    public List<Camisa> getAll(){

        return camisaRepository.findAll();
    }
    public void save(Camisa camisa){
        camisaRepository.save(camisa);
    }
    public void deleteById(Long id){
        camisaRepository.deleteById(id);
    }

}
