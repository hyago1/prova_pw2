package com.tads.pw.prova2.Entitys;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@Table(name = "camisa")
public class Camisa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imageURL;
    private String marca;
    private String tamanho;//gg, g, m, p, pp
    private String categoria;
    private Long isDeleted;
    private Float valor;


    public Camisa(Long id, String imageURL, String marca, String tamanho, String categoria, Long isDeleted, Float valor) {
        this.id = id;
        this.imageURL = imageURL;
        this.marca = marca;
        this.tamanho = tamanho;
        this.categoria = categoria;
        this.isDeleted = isDeleted;
        this.valor = valor;
    }

    public Camisa() {

    }
}
