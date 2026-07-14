package com.jairoorellana.model;

public class Usuario {

//Atributos    
    private String nombreUsuario;
    private String password;
    private String nombreCompleto;
    private Rol role;

//Constructores
    public Usuario() {
    }

    public Usuario(String nombreUsuario, String password, String nombreCompleto, Rol role) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
        this.role = role;
    }

//Gatters y Setters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Rol getRole() {
        return role;
    }

    public void setRole(Rol role) {
        this.role = role;
    }

}
