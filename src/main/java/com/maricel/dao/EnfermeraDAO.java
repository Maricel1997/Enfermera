/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.maricel.dao;

import com.maricel.model.Enfermera;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface EnfermeraDAO {
    //Metodo que devuelve el listado de objetos
    public List<Enfermera> findAll();
    // Metodo que inserta un onjeto en la BBDD
    public Enfermera insert(Enfermera objEnfermera);
    //Metodo que devuelde un objeto en base a su ID
    public Enfermera findById(Integer id);
    //Metodo que modifica un objeto en la BBDD en base a su ID
    public Enfermera updateById(Integer id, Enfermera objEnfermera);
    //Metodo que elimina un objeto en la BDD en base a su ID
    public Boolean deleteById(Integer id);
    
}


