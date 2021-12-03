import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.*;
import java.time.*;
import java.util.List;

import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class ListOfRecordsGUI extends javax.swing.JFrame{
    
    //STATIC VARIABLES
    //DefaultTableModel model = new DefaultTableModel();
    boolean isAcended = false;

    /**
     * Creates new form ListOfRecordsGUI
     */
    public ListOfRecordsGUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        sortCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        ascending = new javax.swing.JRadioButton();
        descending = new javax.swing.JRadioButton();
        exportCSV = new javax.swing.JButton();
        removeRecord = new javax.swing.JButton();
        addRecord = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataDisplay = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("List Of Records");

        sortCombo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sortCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Birthday", "Age" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Sort By:");

        ascending.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ascending.setText("Ascending");
        ascending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ascendingActionPerformed(evt);
            }
        });

        descending.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descending.setText("Descending");
        descending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descendingActionPerformed(evt);
            }
        });

        exportCSV.setBackground(new java.awt.Color(204, 204, 204));
        exportCSV.setForeground(new java.awt.Color(0, 0, 0));
        exportCSV.setText("Export to CSV File");
        exportCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportCSVActionPerformed(evt);
            }
        });

        removeRecord.setBackground(new java.awt.Color(204, 204, 204));
        removeRecord.setForeground(new java.awt.Color(0, 0, 0));
        removeRecord.setText("Remove Record");
        removeRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRecordActionPerformed(evt);
            }
        });

        addRecord.setBackground(new java.awt.Color(204, 204, 204));
        addRecord.setForeground(new java.awt.Color(0, 0, 0));
        addRecord.setText("Add a Record");
        addRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecordActionPerformed(evt);
            }
        });

        dataDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Birthday", "Age"
            }
        ));
        dataDisplay.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(dataDisplay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(ascending)
                .addGap(18, 18, 18)
                .addComponent(descending)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(removeRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exportCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(ascending)
                    .addComponent(descending))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecordActionPerformed
        AddRecordsUI addRecords = new AddRecordsUI();

        addRecords.setVisible(true);
        addRecords.pack();
        addRecords.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_addRecordActionPerformed

    private void removeRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRecordActionPerformed
        //this.setVisible(false);
        RemoveRecordUI formRemove = new RemoveRecordUI();
        formRemove.setVisible(true);
        formRemove.pack();
        formRemove.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_removeRecordActionPerformed

    private void ascendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ascendingActionPerformed
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(dataDisplay.getModel());
        List<RowSorter.SortKey> sortList = new ArrayList<>(25);
        dataDisplay.setRowSorter(sorter);

        if (descending.isSelected()){
            System.out.println("Ascending Selected");
            isAcended = true;

            descending.setSelected(false);
            ascending.setSelected(true);

            if(isAcended){
                    if(sortCombo.getSelectedIndex() == 0){
                        System.out.println("Name is Selected");

                        sortList.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
                        sorter.setSortKeys(sortList);

                    }else if (sortCombo.getSelectedIndex() == 1){
                        System.out.println("Birthday is Selected");

                        sortList.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
                        sorter.setSortKeys(sortList);
                    }else if (sortCombo.getSelectedIndex() == 2){
                        System.out.println("Age is Selected");

                        sortList.add(new RowSorter.SortKey(2, SortOrder.ASCENDING));
                        sorter.setSortKeys(sortList);
                    }
            }
        }else
            ascending.setSelected(true);
    }//GEN-LAST:event_ascendingActionPerformed

    private void descendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descendingActionPerformed
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(dataDisplay.getModel());
        List<RowSorter.SortKey> sortList = new ArrayList<>(25);
        dataDisplay.setRowSorter(sorter);

        if(isAcended){
            if (ascending.isSelected()){
                System.out.println("Descending Selected");

                isAcended = false;
                ascending.setSelected(false);
                descending.setSelected(true);

                if(sortCombo.getSelectedIndex() == 0){
                    System.out.println("Name is Selected");

                    sortList.add(new RowSorter.SortKey(0, SortOrder.DESCENDING));
                    sorter.setSortKeys(sortList);

                }else if (sortCombo.getSelectedIndex() == 1){
                    System.out.println("Birthday is Selected");

                    sortList.add(new RowSorter.SortKey(1, SortOrder.DESCENDING));
                    sorter.setSortKeys(sortList);
                }else if (sortCombo.getSelectedIndex() == 2){
                    System.out.println("Age is Selected");

                    sortList.add(new RowSorter.SortKey(2, SortOrder.DESCENDING));
                    sorter.setSortKeys(sortList);
                }
            }else
                ascending.setSelected(true);
        }

    }//GEN-LAST:event_descendingActionPerformed

    private void exportCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportCSVActionPerformed
        // TODO add your handling code here:
        final LocalDateTime today = LocalDateTime.now();
        String basicIsoDate = today.format(DateTimeFormatter.BASIC_ISO_DATE);
        String defaultPathName = basicIsoDate.toString() + today.getHour() + today.getMinute() + today.getSecond();

        if(dataDisplay.getRowCount() == 0){
            JOptionPane.showOptionDialog(null, "Fatal Error, There are no Rows in List Of Records!", "ERROR MESSAGE", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null,null,null);
        }else {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Export as CSV");
            fileChooser.setDialogType(JFileChooser.SAVE_DIALOG);
            fileChooser.setSelectedFile(new File(defaultPathName + ".csv"));

            fileChooser.setFileFilter(new FileNameExtensionFilter("Comma-separated value file","csv"));

            int userSelection = fileChooser.showSaveDialog(this);

            if(userSelection == JFileChooser.APPROVE_OPTION){
                File fileToSave = fileChooser.getSelectedFile();
                String filename = fileChooser.getSelectedFile().toString();

                if (!filename .endsWith(".csv"))
                    filename += ".csv";

                try {
                    FileWriter fw = new FileWriter(fileToSave);
                    BufferedWriter bw = new BufferedWriter(fw);

                    for (int i = 0; i < dataDisplay.getRowCount(); i++) {
                        for (int j = 0; j <  dataDisplay.getColumnCount(); j++) {
                            bw.write(dataDisplay.getValueAt(i, j).toString()+",");
                        }
                        bw.newLine();
                    }
                    JOptionPane.showMessageDialog(this, "SUCCESSFULLY EXPORTED","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
                    bw.close();
                    fw.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "ERROR","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_exportCSVActionPerformed

    public static void addRecords(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel) dataDisplay.getModel();
        model.addRow(dataRow);
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
            java.util.logging.Logger.getLogger(ListOfRecordsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListOfRecordsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListOfRecordsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListOfRecordsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListOfRecordsGUI().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRecord;
    private javax.swing.JRadioButton ascending;
    public static javax.swing.JTable dataDisplay;
    private javax.swing.JRadioButton descending;
    private javax.swing.JButton exportCSV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeRecord;
    private javax.swing.JComboBox<String> sortCombo;
    // End of variables declaration//GEN-END:variables
}
