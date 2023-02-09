package com.dam2.inyecciondependencias2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Videojuego {
    private String titulo;
    private String compania;
    private Director director;
    private String genero;
}
