package gui;

import java.util.Arrays;
import java.util.Collections;
        
import logic.TopsController;

public class PanelHome extends javax.swing.JPanel {

    /**
     * Creates new form PanelHome
     */
    public PanelHome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        bogotaMap = new javax.swing.JLabel();
        titleMap = new javax.swing.JLabel();
        listNeighborhoods2 = new javax.swing.JLabel();
        listNeighborhoods1 = new javax.swing.JLabel();
        titleTop = new javax.swing.JLabel();
        top1 = new javax.swing.JLabel();
        top2 = new javax.swing.JLabel();
        top3 = new javax.swing.JLabel();
        top4 = new javax.swing.JLabel();
        top5 = new javax.swing.JLabel();
        btnNeighborhoods = new javax.swing.JButton();
        btnObjects = new javax.swing.JButton();
        btnModusOperandi = new javax.swing.JButton();
        imgInfo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(780, 600));
        setMinimumSize(new java.awt.Dimension(780, 600));
        setPreferredSize(new java.awt.Dimension(780, 600));

        lblTitle.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Inicio");

        bogotaMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bogota_map.png"))); // NOI18N

        titleMap.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        titleMap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleMap.setText("Mapa de Bogotá D.C.");

        listNeighborhoods2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        listNeighborhoods2.setText("<html>\n<p> \n11. Suba <br>\n12. Barrios Unidos <br>\n13. Teusaquillo <br>\n14. Los Martires <br>\n15. Antonio Nariño <br>\n16. Puente Aranda <br>\n17. Candelaria <br>\n18. Rafael Uribe Uribe <br>\n19. Ciudad Bolivar <br>\n</p> \n</html>");
        listNeighborhoods2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        listNeighborhoods1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        listNeighborhoods1.setText("<html> <p>  1. Usaquén <br> 2. Chapinero <br> 3. Santa Fe <br> 4. San Cristobal <br> 5. Usme <br> 6. Tunjuelito <br> 7. Bosa <br> 8. Kennedy <br> 9. Fontibón <br> 10. Engativá <br> </p>  </html>");
        listNeighborhoods1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        titleTop.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        titleTop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleTop.setText("Top");

        top1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        top1.setText("1. Primer puesto.");

        top2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        top2.setText("2. Segundo puesto.");

        top3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        top3.setText("3. Tercer puesto.");

        top4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        top4.setText("4. Cuarto puesto.");

        top5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        top5.setText("5. Quinto puesto.");

        btnNeighborhoods.setText("Localidades");
        btnNeighborhoods.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNeighborhoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNeighborhoodsActionPerformed(evt);
            }
        });

        btnObjects.setText("Objetos");
        btnObjects.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnObjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObjectsActionPerformed(evt);
            }
        });

        btnModusOperandi.setText("Modus");
        btnModusOperandi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModusOperandi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModusOperandiActionPerformed(evt);
            }
        });

        imgInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image_info.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleMap, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(bogotaMap, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imgInfo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(listNeighborhoods1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listNeighborhoods2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(top3)
                            .addComponent(top2)
                            .addComponent(top4)
                            .addComponent(top5)
                            .addComponent(top1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNeighborhoods)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnObjects, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModusOperandi, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(titleTop, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(titleMap)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(listNeighborhoods1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(listNeighborhoods2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bogotaMap))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleTop)
                        .addGap(8, 8, 8)
                        .addComponent(top1)
                        .addGap(18, 18, 18)
                        .addComponent(top2)
                        .addGap(18, 18, 18)
                        .addComponent(top3)
                        .addGap(18, 18, 18)
                        .addComponent(top4)
                        .addGap(18, 18, 18)
                        .addComponent(top5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNeighborhoods)
                            .addComponent(btnObjects)
                            .addComponent(btnModusOperandi)))
                    .addComponent(imgInfo))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public static String[] invertArray(String[] array) {
        String aux;
        for (int i = 0; i < array.length / 2; i++) {
            aux = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = aux;
        }

        return array;
    }
    
    private void fillTop(String[] data) {
        System.out.println(data[0]);
        System.out.println(data[1]);
        top1.setText("1. " + data[0]);
        top2.setText("2. " + data[1]);
        top3.setText("3. " + data[2]);
        top4.setText("4. " + data[3]);
        top5.setText("5. " + data[4]);
    }
    
    private void btnModusOperandiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModusOperandiActionPerformed
        String[] data = TopsController.topModusOperandi();

        Collections.reverse(Arrays.asList(data));
        for (String e: data) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnModusOperandiActionPerformed

    private void btnNeighborhoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNeighborhoodsActionPerformed
        String[] data = TopsController.topNeighborhoods();

        Collections.reverse(Arrays.asList(data));
        String[] array = new String[5];
        for (int i=0; i<=data.length-1; i++) {
            array[i] = data[i];
        }
        System.out.println(Arrays.toString(data));
        fillTop(array);
    }//GEN-LAST:event_btnNeighborhoodsActionPerformed

    private void btnObjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObjectsActionPerformed
        String[] data = TopsController.topObjects();

        for (String e: data) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnObjectsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bogotaMap;
    private javax.swing.JButton btnModusOperandi;
    private javax.swing.JButton btnNeighborhoods;
    private javax.swing.JButton btnObjects;
    private javax.swing.JLabel imgInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel listNeighborhoods1;
    private javax.swing.JLabel listNeighborhoods2;
    private javax.swing.JLabel titleMap;
    private javax.swing.JLabel titleTop;
    private javax.swing.JLabel top1;
    private javax.swing.JLabel top2;
    private javax.swing.JLabel top3;
    private javax.swing.JLabel top4;
    private javax.swing.JLabel top5;
    // End of variables declaration//GEN-END:variables
}
