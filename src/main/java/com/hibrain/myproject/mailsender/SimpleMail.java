package com.hibrain.myproject.mailsender;

public class SimpleMail {

  private String to;
  private String subject;
  private String content;

  public SimpleMail(String to, String subject, String content) {
    this.to = to;
    this.subject = subject;
    this.content = content;
  }

  // Getters and Setters
  public String getTo() {
    return to;
  }

  public String getSubject() {
    return subject;
  }

  public String getContent() {
    return content;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public void setContent(String content) {
    this.content = content;
  }
}