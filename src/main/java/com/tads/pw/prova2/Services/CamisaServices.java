package com.tads.pw.prova2.Services;


import com.tads.pw.prova2.Entitys.Camisa;
import com.tads.pw.prova2.Repository.CamisaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CamisaServices {


    Camisa camisa;

    @Autowired
    CamisaRepository camisaRepository;


    public Optional<Camisa> findById(Long id){
        return camisaRepository.findById(id);
    }
    
    public List<Camisa> findByIsDeletedIsNull(){
        return camisaRepository.findByIsDeletedIsNull();
    }

    public List<Camisa> getAll(){

        return camisaRepository.findAll();
    }
    public void save(Camisa camisa){
        camisaRepository.save(camisa);
    }
    public void isDeleteById(Long id){
        Camisa camisa = camisaRepository.findById(id).get(); // busca a linha pelo ID
        camisa.setIsDeleted(System.currentTimeMillis());
        camisaRepository.save(camisa);
    }

    public void restaurarById(Long id){
        Camisa camisa = camisaRepository.findById(id).get(); // busca a linha pelo ID
        camisa.setIsDeleted(null);
        camisaRepository.save(camisa);
    }

}
