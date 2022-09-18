package models;

import java.time.LocalDate;

public class Administrador extends Usuario{

    public Administrador(String id, String nome, Login login, LocalDate dtNascimento) {
        super(id, nome, login, dtNascimento);

    }

}