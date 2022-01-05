package appmemorama.jugar;

import appmemorama.menu.Menu;
import javax.swing.JOptionPane;

public class Niveles extends javax.swing.JFrame {
    String jugador;
    Menu menu;
    public Niveles(int i,String j,Menu menu) {
        this.jugador=j;
        this.menu = menu;
        loadNivel(i, j);
        initComponents();   
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Memorama DBZ");
        setResizable(false);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("+ NIVEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        menu.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public void loadNivel(int i,String j){     
         switch(i){
             case 1:
                Object resp = JOptionPane.showInputDialog(null, "ELEGIR LAS IMAGENES", " ELECCION    ", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"DBZ","Avengers", "Naruto", "Salir"}, "Seleccione");
                if (resp.equals("DBZ")) {   // Terminará e iniciará un juego nuevo
                     Facil fc=new Facil();
                     fc.setJugador(j);
                     panel=fc;
                     this.add(fc);
                }
                if (resp.equals("Avengers")) {   // Terminará e iniciará un juego nuevo
                    Facil1 fc=new Facil1();
                    fc.setJugador(j);
                    panel=fc;
                    this.add(fc);
                }
                if (resp.equals("Naruto")) {
                    Facil2 fc=new Facil2();
                    fc.setJugador(j);
                    panel=fc;
                    this.add(fc);
                }
                if (resp.equals("Salir")) {
                    System.exit(0);
                }
                break;
            case 2:
                Object OP = JOptionPane.showInputDialog(null, "ELEGIR LAS IMAGENES", "ELECCION ", JOptionPane.QUESTION_MESSAGE, null,
                 new Object[]{"DBZ","Avengers", "Naruto", "Salir"}, "Seleccione");
                if (OP.equals("DBZ")) {   // Terminará e iniciará un juego nuevo
                    Medio  md= new Medio();
                    md.setJugador(j);
                    panel=md;
                    this.add(md);
                }
                if (OP.equals("Avengers")) {   // Terminará e iniciará un juego nuevo
                    Medio1  md= new Medio1();
                    md.setJugador(j);
                    panel=md;
                    this.add(md);
                }
                if (OP.equals("Naruto")) {
                    Medio2  md= new Medio2();
                    md.setJugador(j);
                    panel=md;
                    this.add(md);
                }
                if (OP.equals("Salir")) {
                    System.exit(0);
                }
                break;
            case 3:
                Object OPC = JOptionPane.showInputDialog(null, "ELEGIR LAS IMAGENES", " ELECCION ", JOptionPane.QUESTION_MESSAGE, null,
                 new Object[]{"DBZ","Avengers", "Naruto", "Salir"}, "Seleccione");
                if (OPC.equals("DBZ")) {   // Terminará e iniciará un juego nuevo
                    Dificil df= new Dificil();
                    df.setJugador(j);
                    panel=df;
                    this.add(df);
                }
                if (OPC.equals("Avengers")) {   // Terminará e iniciará un juego nuevo
                    Dificil1 df= new Dificil1();
                    df.setJugador(j);
                    panel=df;
                    this.add(df);
                }
                if (OPC.equals("Naruto")) {
                    Dificil2 df= new Dificil2();
                    df.setJugador(j);
                    panel=df;
                    this.add(df);
                }
                if (OPC.equals("Salir")) {
                    System.exit(0);
                }
                break;
              
                 
         }
         this.pack();
         
     }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
