package com.hibrain.myproject;

import com.hibrain.myproject.mailsender.MailSenderService;
import com.hibrain.myproject.mailsender.SimpleMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

  @Autowired
  private MailSenderService senderService;

  @Override
  public void run(String... args) throws Exception {
    // send a simple mail
    SimpleMail simpleMail = new SimpleMail(
        "zhumazhenis.dairabay@nu.edu.kz",
        "Welcome to Hibrain",
        "Alga Kazakhstan");

    senderService.sendSimpleMail(simpleMail);
  }

  public static void main(String args[]) {
    SpringApplication.run(App.class, args);
  }
}