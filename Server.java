
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

public class Server extends Frame implements Runnable, ActionListener{
  TextField textField;
  TextArea textArea;
  Button send;

  ServerSocket ss;
  Socket s;
  DataInputStream in;
  DataOutputStream out;

  Thread chat;

  Server(){
    textField = new TextField();
    textArea = new TextArea();
    send = new Button("Send");

    send.addActionListener(this);

    try {
      ss = new ServerSocket(12000);
      s = ss.accept();

      in = new DataInputStream(s.getInputStream());
      out = new DataOutputStream(s.getOutputStream());
    } catch (Exception e) {
      System.out.println(e);
    }

    add(textField);
    add(textArea);
    add(send);

    chat = new Thread(this);
    chat.setDaemon(true);
    chat.start();

    setSize(500,500);
    setTitle("User 2");
    setLayout(new FlowLayout());
    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e){
    String msg = textField.getText();
    textArea.append("You : "+msg+"\n");
    textField.setText("");

    try {
        out.writeUTF(msg);
        out.flush();
    } catch (IOException ex) {
      System.out.println(e);
    }
  }

  @Override
  public void run(){
    while(true){
      try {
          String msg = in.readUTF();
          textArea.append("Friend : "+msg+"\n");
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }

  public static void main(String[] args){
    new Server();
  }
}
