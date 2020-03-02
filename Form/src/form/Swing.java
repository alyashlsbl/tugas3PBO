
package form;

import javax.swing.*;


public class Swing extends JFrame {
    
    JLabel label1, label2, label3, label4, label5, label6;
    JTextField text1, text2;
    JTextArea text3;
    JRadioButton opsi1,opsi2;
    JComboBox agama;
    JButton tombol;
    
    public void cobaSwing() {
        
        setTitle("DATA DIRI MAHASISWA");
        label1= new JLabel("DATA DIRI MAHASISWA");
        label2= new JLabel("Nama");
        label3= new JLabel("NIM");
        label4= new JLabel("Jenis Kelamin");
        label5= new JLabel("Agama");
        label6= new JLabel("Alamat");
        
        text1= new JTextField(" ");
        text2= new JTextField(" ");
        text3= new JTextArea(" ");
        
        opsi1 = new JRadioButton("Laki-laki");
        opsi2 = new JRadioButton("Perempuan");
        
        tombol = new JButton("OK");
        
        String[] namaagama = {"Islam","Kristen","Katolik","Hindu","Budha"};
        agama = new JComboBox(namaagama);

        setLayout(null);
        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);
        add(text1);
        add(text2);
        add(text3);
        add(opsi1);
        add(opsi2);
        add(agama);
        add(tombol);
       
        
        label1.setBounds(200,10,150,20);
        label2.setBounds(30,50,50,20);
        label3.setBounds(30,80,50,20);
        label4.setBounds(30,110,100,20);
        label5.setBounds(30,140,50,20);
        label6.setBounds(30,170,50,20);
        text1.setBounds(200,50,100,20);
        text2.setBounds(200,80,100,20);
        text3.setBounds(200,170,250,100);
        opsi1.setBounds(200,110,100,20);
        opsi2.setBounds(320,110,100,20);
        agama.setBounds(200,140,100,20);
        tombol.setBounds(350,300,80,20);
    
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
