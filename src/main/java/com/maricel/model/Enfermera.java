/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maricel.model;

/**
 *
 * @author Usuario
 */

public class Enfermera {
    //Atributos del modelo
     private Integer id;
      private String nombre;
       private String especialidad;
        private String telefono;
        private String email;
        
        //costructor vacio
        public Enfermera(){
            
        }
         //getters y setters
        public Integer getId(){
            return id;
        }
        public void setId(Integer id){
            this.id= id;
            
        }
         public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre){
            this.nombre= nombre;
        }
            
             public String getEspecilaidad(){
            return especialidad;
        }
        public void setEspecialidad(String especialidad){
            this.especialidad= especialidad;
        }
             public String getTelfono(){
            return telefono;
        }
        public void setTelefono(String telefono){
            this.telefono= telefono;
            
        }
         public String geEmail(){
            return email;
        }
        public void setEmail(String email){
            this.email= email;
            
        }

    public String getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getEspecialidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getTelefono() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
            
        
    
}

