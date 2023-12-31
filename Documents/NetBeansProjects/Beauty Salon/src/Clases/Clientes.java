/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author vladi
 */
public class Clientes implements IgestionRUD{

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    private int id_cliente;
    private String nombre;
    private String Telefono;
    private String Correo;
    
    static int Id_count = 0;
    
    public static ArrayList<Clientes> clientes = new ArrayList<>();
    
    public Clientes(int Id_cliente, String nom, String tel, String mail){
        Id_count = Id_cliente;
        this.id_cliente = Id_count;
        this.nombre = nom;
        this.Telefono = tel;
        this.Correo = mail;
    }
    
    public Clientes(String nom, String tel, String mail){
        Id_count++;
        this.id_cliente = Id_count;
        this.nombre = nom;
        this.Telefono = tel;
        this.Correo = mail;
    }
    
    public Clientes(){
        
    }
    
    public void agregar(String[] set){
        
        boolean[] gold = new boolean[3];
        
        for(int i = 0; i < clientes.size(); i++){
            gold[0] = false;
            gold[1] = false;
            gold[2] = false;
            if(clientes.get(i).getNombre().equals(set[0])) gold[0] = true;
            
            if(clientes.get(i).getTelefono().equals(set[1])) gold[1] = true;
            
            if(clientes.get(i).getCorreo().equals(set[2])) gold[2] = true;
            
            if(gold[0] == true && gold[1] == true && gold[2] == true) break;
        }
        
        
        if(gold[0] == false || gold[1] == false || gold[2] == false){
            clientes.add(new Clientes(set[0], set[1], set[2]));
        
            SQL.Conexion.Queries.offer(String.format("INSERT INTO Cliente VALUES('%s', '%s', '%s')", set[0], set[1], set[2]));
        
            JOptionPane.showMessageDialog(null, String.format("Cliente %s, con numero de telefono %s y correo %s agregado con exito", set[0], set[1], set[2]));
        }else{
            JOptionPane.showMessageDialog(null, "Cliente ya existente");
        }
    }
    
    @Override
    public void cargar() {
        String[][] clients = SQL.Getters.getClientes();
        clientes.clear();
        for (String[] Cliente : clients) {
            clientes.add(new Clientes(Integer.parseInt(Cliente[0]), Cliente[1], Cliente[2], Cliente[3]));
            Id_count = Integer.parseInt(Cliente[0]);
        }
    }

    @Override
    public void modificar(Object[] set) {
        int id = Integer.parseInt(set[0].toString());
        String nom = set[1].toString();
        String tel = set[2].toString();
        String correo = set[3].toString();
        
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getId_cliente() == id){
                Clientes com = clientes.get(i);
                com.setNombre(nom);
                com.setTelefono(tel);
                com.setCorreo(correo);
                break;
            }
        }
        
        SQL.Conexion.Queries.offer(String.format("UPDATE cliente SET Nombre = '%s', telefono = '%s', Correo = '%s' WHERE Id_Cliente = %d", nom, tel, correo, id));
        JOptionPane.showMessageDialog(null, "Usuario " + id + " Modificado");
    }

    @Override
    public void eliminar(String[] set) {
        int id = Integer.parseInt(set[0]);
        
        String Query = "DELETE FROM Cliente WHERE Id_Cliente = " + id;
        
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getId_cliente() == id){
                clientes.remove(i);
            }
        }
        SQL.Conexion.Queries.offer(Query);
        JOptionPane.showMessageDialog(null, "Cliente eliminado con exito");
    }
}
