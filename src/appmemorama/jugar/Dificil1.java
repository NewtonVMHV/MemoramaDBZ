package appmemorama.jugar;

import appmemorama.Matriz.MatrizDimension;
import java.awt.*;
import static java.lang.Thread.sleep;
import javax.swing.*;
public class Dificil1 extends javax.swing.JPanel implements Runnable {
    private String jugador;
    private MatrizDimension mJ= new MatrizDimension();
    private boolean caraUp = false;
    private ImageIcon img1;
    private ImageIcon img2;
    private JButton[] ImgBtn = new JButton[2];
    private boolean primerCarta = false;
    private int puntaje = 0;
    private int intentado = 0;
    private int seg = 0;
    private int min = 0;
    private int hora = 0;
    private boolean continuar = true;
    private Incrementar1 i;
    
    public Dificil1() {
        initComponents();
        cargarMatrizImg();
        txf_cont1.setText(String.valueOf(hora));
        txf_cont2.setText(String.valueOf(min));
        txf_cont3.setText(String.valueOf(seg));
        i=null;
        i = new Incrementar1(this);
        i.start();
    }
    public void cargarMatrizImg(){
         int [][] matrizJuego=mJ.matrizNivel(4,4);
         bt1.setDisabledIcon(new ImageIcon(getClass().getResource("../../appmemorama/recursos2/"+matrizJuego[0][0]+".jpg")));
         bt2.setDisabledIcon(new ImageIcon(getClass().getResource("../../appmemorama/recursos2/"+matrizJuego[0][1]+".jpg")));
         bt3.setDisabledIcon(new ImageIcon(getClass().getResource("../../appmemorama/recursos2/"+matrizJuego[0][2]+".jpg")));
         bt4.setDisabledIcon(new ImageIcon(getClass().getResource("../../appmemorama/recursos2/"+matrizJuego[0][3]+".jpg")));
         bt5.setDisabledIcon(new ImageIcon(getClass().getResource("../../appmemorama/recursos2/"+matrizJuego[1][0]+".jpg")));
         bt6.setDisabledIcon(new ImageIcon(getClass().getResource("../../appmemorama/recursos2/"+matrizJuego[1][1]+".jpg")));
         bt7.setDisabledIcon(new ImageIcon(getClass().getResource("../../appmemorama/recursos2/"+matrizJuego[1][2]+".jpg")));
         bt8.setDisabledIcon(new ImageIcon(getClass().getResource("../../appmemorama/recursos2/"+matrizJuego[1][3]+".jpg")));
         bt9.setDisabledIcon(new ImageIcon(getClass().getResource("../../appmemorama/recursos2/"+matrizJuego[2][0]+".jpg")));
         bt10.setDisabledIcon(new ImageIcon(getClass().getResource("../../appmemorama/recursos2/"+matrizJuego[2][1]+".jpg")));
         bt11.setDisabledIcon(new ImageIcon(getClass().getResource("../../appmemorama/recursos2/"+matrizJuego[2][2]+".jpg")));
         bt12.setDisabledIcon(new ImageIcon(getClass().getResource("../../appmemorama/recursos2/"+matrizJuego[2][3]+".jpg")));
         bt13.setDisabledIcon(new ImageIcon(getClass().getResource("../../appmemorama/recursos2/"+matrizJuego[3][0]+".jpg")));
         bt14.setDisabledIcon(new ImageIcon(getClass().getResource("../../appmemorama/recursos2/"+matrizJuego[3][1]+".jpg")));
         bt15.setDisabledIcon(new ImageIcon(getClass().getResource("../../appmemorama/recursos2/"+matrizJuego[3][2]+".jpg")));
         bt16.setDisabledIcon(new ImageIcon(getClass().getResource("../../appmemorama/recursos2/"+matrizJuego[3][3]+".jpg")));        
    }
     private void btnHabilitado(JButton btn) {
        if(!caraUp) {
            btn.setEnabled(false);
            img1 = (ImageIcon) btn.getDisabledIcon();
            ImgBtn[0] = btn;
            caraUp = true;
            primerCarta = false;
        }
        else {
            btn.setEnabled(false);
            img2 = (ImageIcon) btn.getDisabledIcon();
            ImgBtn[1] = btn;
            primerCarta = true;    
        }
    }
    public void comparar(){
         if(caraUp && primerCarta) {
            intentado++;
            intento.setText(intentado+"");
            if(img1.getDescription().compareTo(img2.getDescription()) != 0) {
                ImgBtn[0].setEnabled(true);
                ImgBtn[1].setEnabled(true);
            }else{
                puntaje++;
                acierto.setText(puntaje+"");
                Ganar();
            }
            caraUp = false;
        }
         
     }
    public  void Ganar() {
        if(!bt1.isEnabled() && !bt2.isEnabled() && !bt3.isEnabled() && !bt4.isEnabled() 
           && !bt5.isEnabled() && !bt6.isEnabled() && !bt7.isEnabled() && !bt8.isEnabled() && 
           !bt9.isEnabled() && !bt10.isEnabled() && !bt11.isEnabled() && !bt12.isEnabled()&& 
           !bt13.isEnabled() && !bt14.isEnabled() && !bt15.isEnabled() && !bt16.isEnabled()) {
            parar();
            JOptionPane.showMessageDialog(this, "Felicidades!!!  "+jugador+" superaste el nivel dificil!!", "Ganador", JOptionPane.INFORMATION_MESSAGE);
        }
    }
     public void reiniciar(){
        bt1.setEnabled(true);
        bt2.setEnabled(true);
        bt3.setEnabled(true);
        bt4.setEnabled(true);
        bt5.setEnabled(true);
        bt6.setEnabled(true);
        bt7.setEnabled(true);
        bt8.setEnabled(true);
        bt9.setEnabled(true);
        bt10.setEnabled(true);
        bt11.setEnabled(true);
        bt12.setEnabled(true);
        bt13.setEnabled(true);
        bt14.setEnabled(true);
        bt15.setEnabled(true);
        bt16.setEnabled(true);
        primerCarta = false;
        caraUp = false;
        puntaje = 0;
        intentado=0;
        intento.setText("0");
        acierto.setText("0");
        cargarMatrizImg();
        resetSeg();
        resetMin();
        resetHora();
        seguir();
        i.seguir();
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomJug = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        acierto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        intento = new javax.swing.JLabel();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        bt10 = new javax.swing.JButton();
        bt11 = new javax.swing.JButton();
        bt12 = new javax.swing.JButton();
        reiniciar = new javax.swing.JButton();
        bt13 = new javax.swing.JButton();
        bt14 = new javax.swing.JButton();
        bt15 = new javax.swing.JButton();
        bt16 = new javax.swing.JButton();
        txf_cont1 = new javax.swing.JTextField();
        txf_cont2 = new javax.swing.JTextField();
        txf_cont3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setBackground(new java.awt.Color(238, 240, 247));
        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(247, 247, 247));
        jLabel1.setText("JUGADOR:");

        nomJug.setBackground(new java.awt.Color(247, 188, 5));
        nomJug.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        nomJug.setForeground(new java.awt.Color(245, 188, 16));
        nomJug.setText("jLabel2");

        jLabel2.setBackground(new java.awt.Color(254, 254, 254));
        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(234, 243, 254));
        jLabel2.setText("ACIERTO:");

        acierto.setBackground(new java.awt.Color(247, 188, 5));
        acierto.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        acierto.setForeground(new java.awt.Color(245, 188, 16));
        acierto.setText("0");

        jLabel3.setBackground(new java.awt.Color(250, 251, 254));
        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 247, 255));
        jLabel3.setText("INTENTO: ");

        intento.setBackground(new java.awt.Color(247, 188, 5));
        intento.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        intento.setForeground(new java.awt.Color(245, 188, 16));
        intento.setText("0");

        bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appmemorama/recursos2/0.jpg"))); // NOI18N
        bt1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        bt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt1MouseExited(evt);
            }
        });
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appmemorama/recursos2/0.jpg"))); // NOI18N
        bt2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        bt2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt2MouseExited(evt);
            }
        });
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appmemorama/recursos2/0.jpg"))); // NOI18N
        bt3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        bt3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt3MouseExited(evt);
            }
        });
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        bt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appmemorama/recursos2/0.jpg"))); // NOI18N
        bt4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        bt4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt4MouseExited(evt);
            }
        });
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appmemorama/recursos2/0.jpg"))); // NOI18N
        bt5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        bt5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt5MouseExited(evt);
            }
        });
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        bt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appmemorama/recursos2/0.jpg"))); // NOI18N
        bt6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        bt6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt6MouseExited(evt);
            }
        });
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        bt7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appmemorama/recursos2/0.jpg"))); // NOI18N
        bt7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        bt7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt7MouseExited(evt);
            }
        });
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });

        bt8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appmemorama/recursos2/0.jpg"))); // NOI18N
        bt8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        bt8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt8MouseExited(evt);
            }
        });
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });

        bt9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appmemorama/recursos2/0.jpg"))); // NOI18N
        bt9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        bt9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt9MouseExited(evt);
            }
        });
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });

        bt10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appmemorama/recursos2/0.jpg"))); // NOI18N
        bt10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        bt10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt10MouseExited(evt);
            }
        });
        bt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt10ActionPerformed(evt);
            }
        });

        bt11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appmemorama/recursos2/0.jpg"))); // NOI18N
        bt11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        bt11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt11MouseExited(evt);
            }
        });
        bt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt11ActionPerformed(evt);
            }
        });

        bt12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appmemorama/recursos2/0.jpg"))); // NOI18N
        bt12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        bt12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt12MouseExited(evt);
            }
        });
        bt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt12ActionPerformed(evt);
            }
        });

        reiniciar.setText("Reiniciar");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });

        bt13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appmemorama/recursos2/0.jpg"))); // NOI18N
        bt13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        bt13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt13MouseExited(evt);
            }
        });
        bt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt13ActionPerformed(evt);
            }
        });

        bt14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appmemorama/recursos2/0.jpg"))); // NOI18N
        bt14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        bt14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt14MouseExited(evt);
            }
        });
        bt14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt14ActionPerformed(evt);
            }
        });

        bt15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appmemorama/recursos2/0.jpg"))); // NOI18N
        bt15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        bt15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt15MouseExited(evt);
            }
        });
        bt15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt15ActionPerformed(evt);
            }
        });

        bt16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appmemorama/recursos2/0.jpg"))); // NOI18N
        bt16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt16MouseExited(evt);
            }
        });
        bt16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt16ActionPerformed(evt);
            }
        });

        txf_cont1.setEditable(false);
        txf_cont1.setBackground(new java.awt.Color(204, 255, 255));
        txf_cont1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txf_cont1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txf_cont1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_cont1ActionPerformed(evt);
            }
        });

        txf_cont2.setEditable(false);
        txf_cont2.setBackground(new java.awt.Color(204, 255, 255));
        txf_cont2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txf_cont2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txf_cont2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_cont2ActionPerformed(evt);
            }
        });

        txf_cont3.setEditable(false);
        txf_cont3.setBackground(new java.awt.Color(204, 255, 255));
        txf_cont3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txf_cont3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txf_cont3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_cont3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(":");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bt10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bt11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bt7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bt12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(51, 51, 51)
                                                .addComponent(txf_cont1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(txf_cont2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomJug, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acierto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(intento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txf_cont3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nomJug)
                            .addComponent(jLabel2)
                            .addComponent(acierto)
                            .addComponent(jLabel3)
                            .addComponent(intento)
                            .addComponent(reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txf_cont1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_cont2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_cont3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        // TODO add your handling code here:
        btnHabilitado(bt3);
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        // TODO add your handling code here:
        btnHabilitado(bt5);
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt12ActionPerformed
        // TODO add your handling code here:
        btnHabilitado(bt12);
    }//GEN-LAST:event_bt12ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
        
        btnHabilitado(bt1);
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        // TODO add your handling code here:
        btnHabilitado(bt2);
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        // TODO add your handling code here:
        btnHabilitado(bt4);
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        // TODO add your handling code here:
        btnHabilitado(bt6);
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        // TODO add your handling code here:
        btnHabilitado(bt7);
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        // TODO add your handling code here:
        btnHabilitado(bt8);
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        // TODO add your handling code here:
        btnHabilitado(bt9);
    }//GEN-LAST:event_bt9ActionPerformed

    private void bt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt10ActionPerformed
        // TODO add your handling code here:
        btnHabilitado(bt10);
    }//GEN-LAST:event_bt10ActionPerformed

    private void bt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt11ActionPerformed
        // TODO add your handling code here:
       btnHabilitado(bt11);
    }//GEN-LAST:event_bt11ActionPerformed

    private void bt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt1MouseExited
        // TODO add your handling code here:
       comparar();
    }//GEN-LAST:event_bt1MouseExited

    private void bt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt2MouseExited
        // TODO add your handling code here:
      comparar();
    }//GEN-LAST:event_bt2MouseExited

    private void bt3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt3MouseExited
        // TODO add your handling code here:
       comparar(); 
    }//GEN-LAST:event_bt3MouseExited

    private void bt4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt4MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_bt4MouseExited

    private void bt5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt5MouseExited
        // TODO add your handling code here:
       comparar();
    }//GEN-LAST:event_bt5MouseExited

    private void bt6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt6MouseExited
       //TODO add your handling code here:
       comparar();
    }//GEN-LAST:event_bt6MouseExited

    private void bt7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt7MouseExited
       // TODO add your handling code here:
       comparar();
    }//GEN-LAST:event_bt7MouseExited

    private void bt8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt8MouseExited
       // TODO add your handling code here:
       comparar();
    }//GEN-LAST:event_bt8MouseExited

    private void bt9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt9MouseExited
      // TODO add your handling code here:
      comparar();
    }//GEN-LAST:event_bt9MouseExited

    private void bt10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt10MouseExited
     // TODO add your handling code here:
     comparar();
    }//GEN-LAST:event_bt10MouseExited

    private void bt11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt11MouseExited
     // TODO add your handling code here:
     comparar();
    }//GEN-LAST:event_bt11MouseExited

    private void bt12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt12MouseExited
     // TODO add your handling code here:
     comparar();
    }//GEN-LAST:event_bt12MouseExited

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        // TODO add your handling code here:
        reiniciar();
    }//GEN-LAST:event_reiniciarActionPerformed

    private void bt14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt14ActionPerformed
        // TODO add your handling code here:
        btnHabilitado(bt14);
    }//GEN-LAST:event_bt14ActionPerformed

    private void bt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt13ActionPerformed
        // TODO add your handling code here:
        btnHabilitado(bt13);
    }//GEN-LAST:event_bt13ActionPerformed

    private void bt15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt15ActionPerformed
        // TODO add your handling code here:
        btnHabilitado(bt15);
    }//GEN-LAST:event_bt15ActionPerformed

    private void bt16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt16ActionPerformed
        // TODO add your handling code here:
        btnHabilitado(bt16);
    }//GEN-LAST:event_bt16ActionPerformed

    private void bt13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt13MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_bt13MouseExited

    private void bt14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt14MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bt14MouseExited

    private void bt15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt15MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_bt15MouseExited

    private void bt16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt16MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_bt16MouseExited

    private void txf_cont1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_cont1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_cont1ActionPerformed

    private void txf_cont2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_cont2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_cont2ActionPerformed

    private void txf_cont3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_cont3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_cont3ActionPerformed
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image im = new ImageIcon(getClass().getResource("../../appmemorama/recursos2/fondo.jpg")).getImage();
        g.drawImage(im, 0, 0, getWidth(), getHeight(), null);
        setOpaque(false);
        setVisible(true);
        nomJug.setText(jugador);
    }
    public void setJugador(String jugador) {
        this.jugador = jugador;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acierto;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt10;
    private javax.swing.JButton bt11;
    private javax.swing.JButton bt12;
    private javax.swing.JButton bt13;
    private javax.swing.JButton bt14;
    private javax.swing.JButton bt15;
    private javax.swing.JButton bt16;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JLabel intento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel nomJug;
    private javax.swing.JButton reiniciar;
    private javax.swing.JTextField txf_cont1;
    private javax.swing.JTextField txf_cont2;
    private javax.swing.JTextField txf_cont3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        
    }
    public synchronized int aumentSeg(){
        seg++;
        txf_cont3.setText(String.valueOf(seg));
        return seg;
    }
    public synchronized int aumentMin(){
        min++;
        txf_cont2.setText(String.valueOf(min));
        return min;
    }
    public synchronized int aumentHora(){
        hora++;
        txf_cont1.setText(String.valueOf(hora));
        return hora;
    }
    public void resetSeg(){
        txf_cont3.setText(String.valueOf("0"));
        seg=0;
    }
    public void resetMin(){
        txf_cont2.setText(String.valueOf("0")); 
        min=0;
    }
    public void resetHora(){
        txf_cont1.setText(String.valueOf("0"));       
        hora=0;
    }
    public synchronized int getMin(){
        return min;
    }
       
    public synchronized int getHora(){
        return hora;
    }   
    public synchronized void seguir(){
        continuar =true;
    }


    public synchronized void parar(){
        continuar =false;
    }
    public synchronized boolean isContinuar() {
        return continuar;
    }      

    public synchronized int getSeg() {
       return seg;
    }
    private static class Incrementar1 extends Thread{
    private Dificil1 v;
    private int seg;
    private int min;
    private int hora;
  
    public Incrementar1(Dificil1 v){
        this.v=v;
        seg = v.getSeg();
        min = v.getMin();
        hora = v.getHora(); 
           
    }
    @Override
    public void run() {
        for (; ;){
            if (seg!=59){
                seg=v.aumentSeg();
            }else{
                 seg=0;
                 v.resetSeg();
                if(min!=59){            
                    min=v.aumentMin();
                }else{
                    hora=v.aumentHora();
                    min=0;
                    v.resetMin();
                }           
            }
             try {
                sleep(999);
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
            if(!v.isContinuar()){
                try {
                    synchronized(this){
                       this.wait(); 
                    } 
                } catch (InterruptedException ex) {
                    System.err.println(ex.getMessage());
                }
            }    
        }       
    }    
    public void seguir(){
        synchronized(this){
            notifyAll();
        }
    }
    }

    

}
