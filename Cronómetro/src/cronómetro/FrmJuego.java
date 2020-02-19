package cronómetro;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class FrmJuego extends javax.swing.JFrame{
    
    int contador=0;
    int minuto=0;
    int hora=0;
    int aciertos=0;
    int total=0;
    //clase timer
    //este codigo se ejecuta cada 1000 ms osea 1 segundo
    Timer temporizador = new Timer(100, new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            //aqui va el codigo que se va a ejecutar
            contador+=1;
            if (minuto==60)
            {
                hora++;
                lblHora.setText(String.valueOf(hora));
                minuto=0;
                lblMinutos.setText("0"+String.valueOf(minuto));
            }
            if (contador==10)
            {
                minuto+=1;
                if (minuto<10)
                {
                    lblMinutos.setText("0"+String.valueOf(minuto));
                }
                else
                {
                    lblMinutos.setText(String.valueOf(minuto));
                }
                contador=0;
            }
            
            lblDecimas.setText(String.valueOf(contador));
            
            
        }
    });
    public FrmJuego() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        lblAciertos = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblMinutos = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblDecimas = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnStop.setText("Stop");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        lblAciertos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAciertos.setText("0");

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setText("0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText(":");

        lblMinutos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMinutos.setText("00");

        lblHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHora.setText("0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("/");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText(":");

        lblDecimas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDecimas.setText("0");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212)
                        .addComponent(lblAciertos)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7)
                        .addGap(15, 15, 15)
                        .addComponent(lblTotal))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset))
                        .addGap(132, 132, 132)
                        .addComponent(lblHora)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(lblMinutos)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8)
                        .addGap(5, 5, 5)
                        .addComponent(lblDecimas, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStart)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAciertos)
                            .addComponent(jLabel7)
                            .addComponent(lblTotal))))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStop)
                        .addGap(7, 7, 7)
                        .addComponent(btnReset))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHora)
                            .addComponent(jLabel3)
                            .addComponent(lblMinutos)
                            .addComponent(jLabel8)
                            .addComponent(lblDecimas)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        temporizador.start();
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        temporizador.stop();
        if (contador==0)
        {
            aciertos++;
            lblAciertos.setText(String.valueOf(aciertos));
        }
        total++;
        lblTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        temporizador.stop();
        contador=0;
        minuto=0;
        hora=0;
        aciertos=0;
        total=0;
        lblTotal.setText(String.valueOf(total));
        lblAciertos.setText(String.valueOf(aciertos));
        lblDecimas.setText(String.valueOf(contador));
        lblMinutos.setText(String.valueOf(minuto));
        lblHora.setText(String.valueOf(hora));
    }//GEN-LAST:event_btnResetActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblAciertos;
    private javax.swing.JLabel lblDecimas;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblMinutos;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}
