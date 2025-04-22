package org.example.email;

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

public class Email {
    public void emailSMTP() {
        Properties p = new Properties();
        EmailData emailData = new EmailData();

        emailData.Data();

        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.socketFactory.port", "465");
        p.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Session session = Session.getDefaultInstance(p,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication()
                    {
                        return new PasswordAuthentication(emailData.getLogin(),
                                emailData.getPassword());
                    }
                });
        session.setDebug(true);
        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(emailData.getLogin()));
            //Remetente

            Address[] toUser = InternetAddress
                    .parse(emailData.destinatario);

            message.setRecipients(Message.RecipientType.TO, toUser);
            message.setSubject(emailData.assunto);//Assunto
            message.setText(emailData.corpo);
            /**Método para enviar a mensagem criada*/
            Transport.send(message);

            System.out.println("Feito!!!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
    }
}
