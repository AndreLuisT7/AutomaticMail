package org.example;
import org.example.model.EmailData;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.example.email.Email;

 /* Atenção Dev antes de testar meu projeto voce deve assistir a esse video
 https://youtu.be/GxRCrfYE4rg?si=08cXdCdbH15zGh8Q */

public class Main {
    public static void main(String[] args) {
        Email email = new Email();

        email.emailSMTP();

    }
}