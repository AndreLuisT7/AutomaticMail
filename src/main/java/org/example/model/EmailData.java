package org.example.model;

import java.util.Scanner;
import org.example.service.AuthService;

import static org.example.service.AuthService.isValidEmail;

/*Tenho que deixar as variaveis de login mais seguras tenho que criar um método que verifica as variaveis */

public class EmailData{
    protected String login;
    protected String password;
    public String assunto = "";
    public String corpo = "";
    public String destinatario = "";

    public void Data() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Informe o login do seu e-mail");
            login = sc.nextLine();

            if (!isValidEmail(login)) {
                System.out.println("Email inválido. Tente novamente.");
                continue;
            }

            System.out.println("Informe a senha do seu e-mail");
            password = sc.nextLine();

            System.out.println("Informe para quem deseja enviar esse e-mail");
            destinatario = sc.nextLine();

            System.out.println("Informe o assunto do email");
            assunto = sc.nextLine();

            System.out.println("Informe o conteudo do email");
            corpo = sc.nextLine();

        } while (!isValidEmail(login));
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
