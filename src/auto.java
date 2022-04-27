import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class auto implements ActionListener {
    JFrame frame = new JFrame("gui");
    JButton role = new JButton("role");
    JLabel input = new JLabel("input question here^");
    JTextField question = new JTextField();
    JLabel answer = new JLabel();
    Container center = new Container();
    Container top = new Container();
    Container bottom = new Container();

    public static void main(String[] args) {
        new auto();
    }

    public auto(){
    frame.setSize(300,300);
    role.addActionListener(this);
    frame.setLayout(new GridLayout(4,1));
    frame.add(question);
    frame.add(input);
    frame.add(answer);
    frame.add(role);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    }

    private void role(){
        String reply=new String();
        int min=1;
        int max=20;
        int rand=(int) (Math.random()*(max-min));
        if (rand==1) {
            reply = "It is Certain.";
        }   if (rand==2) {
            reply = "It is decidedly so.";
        }   if (rand==3) {
            reply = "Without a doubt.";
        }   if (rand==4) {
            reply = "Yes definitely.";
        }   if (rand==5) {
            reply = "You may rely on it.";
        }   if (rand==6) {
            reply = "As I see it, yes.";
        }   if (rand==7) {
            reply = "Most likely.";
        }   if (rand==8) {
            reply = "Outlook good.";
        }   if (rand==9) {
            reply = "Yes!";
        }   if (rand==10) {
            reply = "Signs point to yes.";
        }   if (rand==11) {
            reply = "Reply hazy, try again.";
        }   if (rand==12) {
            reply = "Ask again later.";
        }   if (rand==13) {
            reply = "Better not tell you now.";
        }   if (rand==14) {
            reply = "Cannot predict now.";
        }   if (rand==15) {
            reply = "concentrate and ask again.";
        }   if (rand==16) {
            reply = "Don't count on it.";
        }   if (rand==17) {
            reply = "My reply is no.";
        }   if (rand==18) {
            reply = "My sources say no.";
        }   if (rand==19) {
            reply = "Outlook not so good.";
        }   if (rand==20) {
            reply = "Very doubtful.";
        }

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource().equals(role)) {
            String reply=new String();
            int min=1;
            int max=20;
            int rand=(int) (Math.random()*(max-min));
            if (rand==1) {
                reply = "It is Certain.";
            }   if (rand==2) {
                reply = "It is decidedly so.";
            }   if (rand==3) {
                reply = "Without a doubt.";
            }   if (rand==4) {
                reply = "Yes definitely.";
            }   if (rand==5) {
                reply = "You may rely on it.";
            }   if (rand==6) {
                reply = "As I see it, yes.";
            }   if (rand==7) {
                reply = "Most likely.";
            }   if (rand==8) {
                reply = "Outlook good.";
            }   if (rand==9) {
                reply = "Yes!";
            }   if (rand==10) {
                reply = "Signs point to yes.";
            }   if (rand==11) {
                reply = "Reply hazy, try again.";
            }   if (rand==12) {
                reply = "Ask again later.";
            }   if (rand==13) {
                reply = "Better not tell you now.";
            }   if (rand==14) {
                reply = "Cannot predict now.";
            }   if (rand==15) {
                reply = "concentrate and ask again.";
            }   if (rand==16) {
                reply = "Don't count on it.";
            }   if (rand==17) {
                reply = "My reply is no.";
            }   if (rand==18) {
                reply = "My sources say no.";
            }   if (rand==19) {
                reply = "Outlook not so good.";
            }   if (rand==20) {
                reply = "Very doubtful.";
            }
            answer.setText("Answer: "+reply);
            question.setText("");
        }
    }
}

