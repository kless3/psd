package com.hary.testy.controllers;

import com.hary.testy.models.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Controller
public class OrderController {

    @GetMapping("/form")
    public String getOrderForm() {
        return "order";
    }
    @GetMapping("/an")
    public String getOrderForsm() {
        return "another";
    }


    @PostMapping("/order")
    public String getOrder(@RequestParam String name, @RequestParam String number, @RequestParam String text, @ModelAttribute("customer") Customer customer, Model model) {
        Customer c = new Customer(name, number, text);


        final String from = "ofbrick121@gmail.com";
        String to = "hiklesd@gmail.com";
        String host = "smtp.gmail.com";
        String smtpPort = "465";

        Properties properties = new Properties();

        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", smtpPort);
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");


        Session session = Session.getInstance(
                properties, new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from, "nnmtuzrzseynnkxi");
                    }
                }
        );
        session.setDebug(true);
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Оставлена заявка");
            message.setText(customer.toString());
            Transport.send(message);
        } catch(Exception e) {
            e.printStackTrace();

        }


        return "redirect:/";
    }


}
