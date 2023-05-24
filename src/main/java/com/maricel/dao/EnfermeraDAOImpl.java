package com.maricel.dao;

import com.maricel.confg.Conexion;
import com.maricel.model.Enfermera;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class EnfermeraDAOImpl implements EnfermeraDAO {

    private Conexion objConexion;
    private Connection objConnection;

    public EnfermeraDAOImpl() {
        objConexion = new Conexion();
    }
    @Override
    
    public List <Enfermera> findAll() {
        //Consulta SQL que se tiene que realizar
        String consulta = "SELECT *FROM enfermeras";
        // Listado de datos que se retorna
        
       List <Enfermera> listado = new LinkedList<>();
        try {
            this.objConexion.conectar();
            this.objConnection = this.objConexion.getJdbcConnection();

            PreparedStatement prest = this.objConnection.prepareStatement(consulta);
            // Ejecuta la consulta
            ResultSet rs = prest.executeQuery(consulta);

            Enfermera objEnfermera;

            while (rs.next()) {
                objEnfermera = new Enfermera();
                objEnfermera.setId(rs.getInt("id"));
                objEnfermera.setNombre(rs.getString("nombre"));
                objEnfermera.setEspecialidad(rs.getString("especialidad"));
                objEnfermera.setTelefono(rs.getString("telefono"));
                objEnfermera.setEmail(rs.getString("email"));

                listado.add(objEnfermera);
            }

        } catch (Exception e) {
            System.out.println("Error en la consulta");
        }
        return listado;
    }

    @Override
    public Enfermera insert(Enfermera objEnfermera) {
        String consulta = "INSERT INTO enfermeras( nombre, especialidad , telefono, email) VALUES (?,?,?,?)";
        try{
            this.objConexion.conectar();
            this.objConnection = this.objConexion.getJdbcConnection();

        this.objConexion.conectar();
        this.objConnection = this.objConexion.getJdbcConnection();

        PreparedStatement prest = this.objConnection.prepareStatement(consulta);

        prest.setString(1, objEnfermera.getNombre());
        prest.setString(2, objEnfermera.getEspecialidad());
        prest.setString(3, objEnfermera.getTelefono());
        prest.setString(4, objEnfermera.getEmail());

            int count = prest.executeUpdate();
            
            ResultSet rs = null;
            rs = prest.executeQuery("SELECT LAST_INSERT_ID()");
            
            int autoKey = -1;
            if(rs.next()){
                autoKey = rs.getInt("id");
                objEnfermera.setId(autoKey);
                System.out.println("Ultimo ID introducto " + autoKey);
            }else{
                System.out.println("No exite dato de ID");
            }
        }catch(Exception e){
            System.out.println("Error al insertar " + e);
        }
        return objEnfermera;
    }

    @Override
    public Enfermera findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Enfermera updateById(Integer id, Enfermera objEnfermera) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean deleteById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
