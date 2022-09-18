package models;

import java.io.Serializable;
import java.time.LocalDate;

public class PersonalTrainer extends Usuario implements Serializable{

    private static final long serialVersionUID = -6782112794592561114L;

    private String cref;

    public PersonalTrainer(String id, String cref, String nome, Login login, LocalDate dtNascimento) {
        super(id, nome, login, dtNascimento);
        this.cref = cref;
    }

    public String getCref() {
        return cref;
    }

}