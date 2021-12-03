import com.github.lgooddatepicker.components.DatePickerSettings;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class AddRecordsUI extends javax.swing.JFrame {
    static final LocalDate today = LocalDate.now();

    public AddRecordsUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        backBTN = new javax.swing.JButton();
        saveBackBTN = new javax.swing.JButton();
        saveAddBTN = new javax.swing.JButton();

        DatePickerSettings settings = new DatePickerSettings();
        settings.setFormatForDatesCommonEra(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker(settings);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Records");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Name:");

        nameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setText("Birthday:");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        backBTN.setText("BACK");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        saveBackBTN.setLabel("SAVE & GO BACK");
        saveBackBTN.setMaximumSize(new java.awt.Dimension(72, 22));
        saveBackBTN.setMinimumSize(new java.awt.Dimension(72, 22));
        saveBackBTN.setPreferredSize(new java.awt.Dimension(72, 22));
        saveBackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBackBTNActionPerformed(evt);
            }
        });

        saveAddBTN.setText("SAVE & ADD NEW");
        saveAddBTN.setMaximumSize(new java.awt.Dimension(72, 22));
        saveAddBTN.setMinimumSize(new java.awt.Dimension(72, 22));
        saveAddBTN.setPreferredSize(new java.awt.Dimension(72, 22));
        saveAddBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAddBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(datePicker1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(89, 89, 89))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(saveBackBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(saveAddBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(saveBackBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(saveAddBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_backBTNActionPerformed

    private void saveAddBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAddBTNActionPerformed

        String names = nameField.getText();

        if(nameField.getText().isEmpty()){
            JOptionPane.showOptionDialog(null, "An IllegalArgumentException, Missing Name", "ERROR MESSAGE", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null,null,null);
        }else if(datePicker1.getDate().equals(today)){
            JOptionPane.showOptionDialog(null, "An IllegalArgumentException, You can't set your Birthdate as Date Today", "ERROR MESSAGE", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null,null,null);
        }else if(datePicker1.getDate().isAfter(today)){
            JOptionPane.showOptionDialog(null, "An IllegalArgumentException, Date Given is in the Future", "ERROR MESSAGE", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null,null,null);
        }else{
            JOptionPane.showMessageDialog(null, "Record Added Successfully!");

            addToList(names);

            datePicker1.setDate(today);
            nameField.setText("");
        }

    }//GEN-LAST:event_saveAddBTNActionPerformed

    private void saveBackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBackBTNActionPerformed

        String names = nameField.getText();

        if(nameField.getText().isEmpty()){
            JOptionPane.showOptionDialog(null, "An IllegalArgumentException Caught, Missing Name", "ERROR MESSAGE", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null,null,null);
        }else if(datePicker1.getDate().equals(today)){
            JOptionPane.showOptionDialog(null, "An IllegalArgumentException Caught, You can't set your Birthdate as Date Today", "ERROR MESSAGE", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null,null,null);
        }else if(datePicker1.getDate().isAfter(today)){
            JOptionPane.showOptionDialog(null, "An IllegalArgumentException Caught, Date Given is in the Future", "ERROR MESSAGE", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null,null,null);
        }else{
            JOptionPane.showMessageDialog(null, "Record Added Successfully!");

            addToList(names);

            this.setVisible(false);
        }

    }//GEN-LAST:event_saveBackBTNActionPerformed
    public void addToList(String names){
        Person localData = new Person(names, datePicker1.getDate());
        long Age_year = localData.calculateAge(datePicker1.getDate(), today);

        String date = localData.getBirthDate().format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        ListOfRecordsGUI.addRecords(new Object[] {localData.getName(), date, Age_year});
    }
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddRecordsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRecordsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRecordsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRecordsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRecordsUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private static com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private static javax.swing.JTextField nameField;
    private javax.swing.JButton saveAddBTN;
    private javax.swing.JButton saveBackBTN;
    // End of variables declaration//GEN-END:variables
}
