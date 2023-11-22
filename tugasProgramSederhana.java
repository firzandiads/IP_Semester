//Firzandi Ahsan Dwi Styana - 21537144016

//ini untuk memunculkan java GUI nya
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.Font;



//ini untuk memunculkan apa yang ditampilkan di GUI
class cekIP extends JFrame implements ActionListener {
    JTextField inputText = new JTextField(20);
    JTextField[] fields = new JTextField[20];
    JLabel[] label = new JLabel[12];
    JButton btnSubmit = new JButton("CEK HASIL"); //menampilkan tombol bertulisan...
    ImageIcon icon = new ImageIcon("FLogo.png"); //menampilkan logo GUI


    //nilai pada matkul di GUI. apabila kolom kosong akan diisi 0
    double nilaiEng = 0;
    double nilaiJarKom = 0;
    double nilaiMatDis = 0;
    double nilaiPemro2 = 0;
    double nilaiPerakitan = 0;
    double nilaiPJarKom = 0;
    double nilaiPPemro2 = 0; 
    double nilaiPWeb = 0; 
    double nilaiPData = 0; 
    double nilaiSisOp = 0; 
    double nilaiData = 0;  
    

    cekIP() {
        //untuk menampilkan kolom yang diikuti dengan tulisan
        String[] labelAdd = { "Nama MHS", "Bahasa Inggris", "Jaringan Komputer", 
        "Matematika Diskrit", "Pemrograman 2", "Perakitan dan Instalasi Komputer", "Praktik Jaringan Komputer", 
        "Praktik Pemrograman 2", "Praktik Pemrograman WEB", "Praktik Struktur Data", "Sistem Operasi", 
        "Struktur Data" };

        //1.ini rumus untuk pengisian kolom angka pada kolom kedua dan seterusnya
        for (int i = 0; i < labelAdd.length; i++) {
            label[i] = new JLabel(labelAdd[i]);
            fields[i] = new JTextField(20);
            add(label[i]);
            add(fields[i]);
        }


        label[3] = new JLabel("Nilai IP Semester Anda adalah...");//ini akan muncul pada output terminal setelah di run
        label[4] = new JLabel();
        label[4].setFont(new Font("Times New Roman", Font.BOLD, 16));

        btnSubmit.addActionListener(this);

        add(btnSubmit);
        add(label[3]);
        add(label[4]);

        setLayout(new FlowLayout());
        setSize(270, 700);
        setVisible(true);
        setResizable(false);

        setIconImage(icon.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



    public void hasilSetelahCek() {
        //berhubungan dengan rumus 1
        nilaiEng = Double.parseDouble(fields[1].getText());
        nilaiJarKom = Double.parseDouble(fields[2].getText());
        nilaiMatDis = Double.parseDouble(fields[3].getText());
        nilaiPemro2 = Double.parseDouble(fields[4].getText());
        nilaiPerakitan = Double.parseDouble(fields[5].getText());
        nilaiPJarKom = Double.parseDouble(fields[6].getText());
        nilaiPPemro2 = Double.parseDouble(fields[7].getText());
        nilaiPWeb = Double.parseDouble(fields[8].getText());
        nilaiPData = Double.parseDouble(fields[9].getText());
        nilaiSisOp = Double.parseDouble(fields[10].getText());
        nilaiData = Double.parseDouble(fields[11].getText());


        double rataIps = ((nilaiEng+nilaiJarKom+nilaiMatDis+nilaiPemro2+
                            nilaiPerakitan+nilaiPJarKom+nilaiPPemro2+
                            nilaiPWeb+nilaiPData+nilaiSisOp+nilaiData) / 11) / 25;

                           
        if (rataIps == 4) {
            hasilTeksnya("SANGAT BAIK, dengan nilai IPS " +rataIps, Color.GREEN);
            
        } else if (rataIps >= 3 && rataIps < 3.99) {
            hasilTeksnya("BAIK, dengan nilai IPS " +rataIps, Color.GREEN);
            
        } else if (rataIps >= 2 && rataIps < 2.99) {
            hasilTeksnya("CUKUP, dengan nilai IPS " +rataIps, Color.ORANGE);

        } else if (rataIps >= 1 && rataIps < 1.99) {
            hasilTeksnya("KURANG, dengan nilai IPS " +rataIps, Color.ORANGE);

        } else if (rataIps >= 0 && rataIps < 0.99) {
            hasilTeksnya("GAGAL, dengan nilai IPS " +rataIps, Color.RED);
        }
    }


    //menampilkan tulisan setelah submit
    public void hasilTeksnya(String txt, Color c) {
        label[4].setText(txt);
        label[4].setForeground(c);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) { //apabila tombol ditekan akan muncul pada output terminal
            System.out.println("IP Semester telah muncul pada sistem GUI");
            hasilSetelahCek();
        }
    }
}



public class tugasProgramSederhana {
    public static void main(String[] args) {
        System.out.println("---PROGRAM SEDERHANA MENGHITUNG IP SEMESTER MHS---");
        new ImageIcon("FLogo.png");
        new cekIP();
    }


    public void hasilSetelahCek() {
    }
}