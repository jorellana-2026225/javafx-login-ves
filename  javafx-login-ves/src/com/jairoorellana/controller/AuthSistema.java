package com.jairoorellana.controller;

import com.jairoorellana.model.Rol;
import com.jairoorellana.model.Usuario;
import java.util.ArrayList;

public class AuthSistema {

//Atributos    
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

//Constructores    
    public AuthSistema() {
        Usuario usuarioAdmin = new Usuario("admin", "admin", "admin", Rol.USER);

        Usuario usuarioUser = new Usuario("user", "user", "user", Rol.USER);

        Usuario usuarioYo = new Usuario("jairo", "888", "Jairo Manuel Orellana Goody", Rol.USER);

        listaUsuarios.add(usuarioAdmin);
        listaUsuarios.add(usuarioUser);
        listaUsuarios.add(usuarioYo);

    }

    public Usuario login(String nombreUsuario, String clave) {
        for (Usuario usuarioBuscado : listaUsuarios) {
            if (usuarioBuscado.getNombreUsuario().equals(nombreUsuario)
                    && usuarioBuscado.getPassword().equals(clave)) {
            }
        }

        return null;

    }

//Getters y Setters    
    public static ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        AuthSistema.listaUsuarios = listaUsuarios;
    }
    

}

 