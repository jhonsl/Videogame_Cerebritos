package Interfaz;

import Elementos.Reproductor;
import Preguntas.*;
import javax.swing.JOptionPane;

public class Partida extends javax.swing.JFrame 
{
    static int premio = 0;
    Reproductor reproductor = new Reproductor();
    modelo_preguntas modelo = new modelo_preguntas();
    int segundos;
    int ronda = 1;
    int aleatorio = (int) (Math.random()*5);
    
    public Partida() 
    {   
        this.setVisible(true);        
        initComponents();
        
        ronda(ronda,aleatorio);
        iniciarCronometro();
    }
    
    public void iniciarCronometro()
    {
        for(segundos = 15; segundos >= 0; segundos--)
        {
            if(segundos>=10)
                jLabel3.setText("00:"+segundos);
            else
                jLabel3.setText("00:0"+segundos);

            if(segundos == 0)
            {
                JOptionPane.showMessageDialog(null, "Tiempo agotado","Game Over",JOptionPane.ERROR_MESSAGE);
                
                try {
                    reproductor.AbrirFichero("C:\\Users\\jhon salazar\\Documents\\proyectos\\softka\\src\\recursos/incorrecto.mp3");
                    reproductor.Play();
                } catch (Exception ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
                
                this.setVisible(false);
                Final fin = new Final();
            }
            
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
        }

    }
    
    public void reiniciarCronometro()
    {
        segundos = 15;
        jLabel3.setText("00:"+segundos);
    }
    
    public void gano()
    {
       try {
            reproductor.AbrirFichero("C:\\Users\\jhon salazar\\Documents\\proyectos\\softka\\src\\recursos/ganaste.mp3");
            reproductor.Play();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        } 
    }
    
    public void acerto()
    {
        premio += modelo.retornarPremio();
        
        try {
            reproductor.AbrirFichero("C:\\Users\\jhon salazar\\Documents\\proyectos\\softka\\src\\recursos/correcto.mp3");
            reproductor.Play();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public void fallo()
    {
        segundos = 500;
        try {
            reproductor.AbrirFichero("C:\\Users\\jhon salazar\\Documents\\proyectos\\softka\\src\\recursos/incorrecto.mp3");
            reproductor.Play();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Respuesta Incorrecta","Game Over",JOptionPane.ERROR_MESSAGE);
        this.setVisible(false);
        Final fin = new Final();
    }
    
    public void game_over()
    {
        try {
            reproductor.AbrirFichero("C:\\Users\\jhon salazar\\Documents\\proyectos\\softka\\src\\recursos/game over.mp3");
            reproductor.Play();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static int retornarPuntaje()
    {
        return premio;
    }
    
    public void ronda(int ronda, int pregunta)
    {
        switch (ronda)
        {
            case 1: 
                Principiantes ronda1 = new Principiantes();
                modelo = ronda1;
                break;
            case 2:
                Intermedias ronda2 = new Intermedias();
                modelo = ronda2;
                break;
            case 3:
                Avanzadas ronda3 = new Avanzadas();
                modelo = ronda3;
                break;
            case 4:
                Veteranas ronda4 = new Veteranas();
                modelo = ronda4;
                break;
            case 5:
                Profesionales ronda5 = new Profesionales();
                modelo = ronda5;
                break;    
        }
        
        jLabel2.setText(modelo.retornarCategoria());
        jLabel5.setText(modelo.retornarPregunta(pregunta));
        
        jButton2.setText("a) "+modelo.retornarRespuestas(pregunta,0));
        jButton3.setText("b) "+modelo.retornarRespuestas(pregunta,1));
        jButton4.setText("c) "+modelo.retornarRespuestas(pregunta,2));
        jButton5.setText("d) "+modelo.retornarRespuestas(pregunta,3));
        
        jLabel9.setText(Integer.toString(premio));
        
        if(ronda > 5)
        {
            gano();
            JOptionPane.showMessageDialog(null, "¡¡¡¡Felicitaciones!!! Haz ganado \nTe llevas: 1.000.000$","Win",JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            
            Final fin = new Final();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Categoria:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Premio: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 6, -1, 20));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("00:30");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tiempo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("*********");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 122, 421, 64));

        jLabel7.setBackground(new java.awt.Color(54, 78, 117));
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 370, 80));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, 20));

        jButton2.setBackground(new java.awt.Color(54, 78, 117));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Opcion A");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 245, 186, 48));

        jButton3.setBackground(new java.awt.Color(54, 78, 117));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Opcion B");
        jButton3.setToolTipText("");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 305, 186, 54));

        jButton4.setBackground(new java.awt.Color(54, 78, 117));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Opcion C");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 245, 186, 48));

        jButton5.setBackground(new java.awt.Color(54, 78, 117));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Opcion D");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 308, 186, 48));

        jButton1.setBackground(new java.awt.Color(54, 78, 117));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Abandonar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 419, 70, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpg"))); // NOI18N
        jLabel6.setText("****$");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(modelo.Acerto_perdio(aleatorio, "a") == false)
            fallo();
        else
        {
            acerto();
            ronda += 1;
            aleatorio = (int) (Math.random()*5);
            ronda(ronda,aleatorio);
            reiniciarCronometro();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(modelo.Acerto_perdio(aleatorio, "b") == false)
            fallo();
        else
        {
            acerto();
            ronda += 1;
            aleatorio = (int) (Math.random()*5);
            ronda(ronda,aleatorio);
            reiniciarCronometro();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(modelo.Acerto_perdio(aleatorio, "c") == false)
            fallo();
        else
        {
            acerto();
            ronda += 1;
            aleatorio = (int) (Math.random()*5);
            ronda(ronda,aleatorio);
            reiniciarCronometro();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(modelo.Acerto_perdio(aleatorio, "d") == false)
            fallo();
        else
        {
            acerto();
            ronda += 1;
            aleatorio = (int) (Math.random()*5);
            ronda(ronda,aleatorio);
            reiniciarCronometro();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        premio = 0;
        game_over();
        
        this.setVisible(false);
        Final fin = new Final();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
