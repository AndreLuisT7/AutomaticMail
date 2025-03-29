package org.example;

import java.util.Scanner;

public class Input {
    String login;
    String password;
    String assunto = "";
    String corpo = "";
    String destinatario = "";

    public void inputar() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Informe o login do seu e-mail");
        login = sc.nextLine();
        System.out.println("Informe a senha do seu e-mail");
        password = sc.nextLine();
        System.out.println("Informe para quem deseja enviar esse e-mail");
        destinatario = sc.nextLine();
        System.out.println("Informe o assunto do email");
        assunto = sc.nextLine();
        System.out.println("Informe o conteudo do email");
        corpo = sc.nextLine();


    }
}
