package GUI;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.table.DefaultTableModel;
import entities.Traveler;
import java.util.List;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

	private TravelerController controller;
    	private DefaultTableModel model;
    	private Traveler traveler = new Traveler();
    	private int selectedRow = -1;

	public Home() {

        	initComponents();
        	setIcon();
        	this.getContentPane().setBackground(Color.WHITE);
        
        	setTravelerController(new TravelerController());
        	btns(false);
        	viewTable();

    	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTraveler = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Viagens Passo da Morte");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icon.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel2.setText("VIAGENS PASSO DA MORTE");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(60, 60, 60));
        jLabel3.setText("R. Senhor Capiroto, n° 666, Indústria dos Ossos");

        jLabel4.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(60, 60, 60));
        jLabel4.setText("Onde seu destino é céu ou inferno!");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(60, 60, 60));
        jLabel5.setText("Passageiros");

	tbTraveler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Telefone", "Embarque", "Destino"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTraveler.setRequestFocusEnabled(false);
        tbTraveler.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tbTraveler.setSelectionForeground(new java.awt.Color(60, 60, 60));
        tbTraveler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTravelerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTraveler);
        if (tbTraveler.getColumnModel().getColumnCount() > 0) {
            tbTraveler.getColumnModel().getColumn(0).setMinWidth(40);
            tbTraveler.getColumnModel().getColumn(0).setPreferredWidth(40);
            tbTraveler.getColumnModel().getColumn(0).setMaxWidth(40);
            tbTraveler.getColumnModel().getColumn(2).setMinWidth(150);
            tbTraveler.getColumnModel().getColumn(2).setPreferredWidth(150);
            tbTraveler.getColumnModel().getColumn(2).setMaxWidth(150);
            tbTraveler.getColumnModel().getColumn(3).setMinWidth(150);
            tbTraveler.getColumnModel().getColumn(3).setPreferredWidth(150);
            tbTraveler.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        btnInsert.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(60, 60, 60));
        btnInsert.setText("Inserir");
        btnInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertMouseClicked(evt);
            }
        });
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(60, 60, 60));
        btnDelete.setText("Deletar");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(60, 60, 60));
        btnUpdate.setText("Atualizar");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnInsert, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInsert)
                        .addComponent(btnDelete)
                        .addComponent(btnUpdate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnInsert, btnUpdate});

        pack();
        setLocationRelativeTo(null);
    }

	private void tbTravelerMouseClicked(java.awt.event.MouseEvent evt) {                                        
        	selectedRow = tbTraveler.getSelectedRow();

        	if (selectedRow > -1) {
            		btns(true);
        	}
        
    	}

	private void btnInsertMouseClicked(java.awt.event.MouseEvent evt) {                                       
        
        	InsertDialog insertDialog = new InsertDialog(this, true);
        	insertDialog.setVisible(true);
        
        	traveler = insertDialog.getTraveler();
        
        	try{
        
            		if(!traveler.getName().isEmpty()){
            
                		addTraveler(traveler);
                
            		}
            
        	}
        	catch (NullPointerException e){
        
        	}
        
        	traveler = new Traveler();
        
    	}

	private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {                                       
        
        	try{
            
            		if(JOptionPane.showConfirmDialog(null, "Deseja Excluir o Registro?", "Confirmar a Exclusão", JOptionPane.YES_NO_OPTION) == 0){
            
                		String idStr = tbTraveler.getValueAt(selectedRow, 0).toString();

                		controller.delete(Integer.parseInt(idStr));
                		model.removeRow(selectedRow);
            
            		}
        
        	}
        	catch(Exception e){
        
        	}
        
    	}

	private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {                                       
        
        	int countColumn = tbTraveler.getColumnModel().getColumnCount();
        
        	StringBuilder sb = new StringBuilder();
        
        	for (int c = 0; c < countColumn; c++) {

            		if (c == (countColumn - 1)) {

                		sb.append(tbTraveler.getValueAt(selectedRow, c));

            			} else {

                		sb.append(tbTraveler.getValueAt(selectedRow, c));
                		sb.append(", ");

            		}

        	}
        
        	String[] fields = sb.toString().split(", ");
        
        	traveler.setId(Integer.parseInt(fields[0]));
        	traveler.setName(fields[1]);
        	traveler.setCpf(fields[2]);
        	traveler.setNumberPhone(fields[3]);
        	traveler.setBoarding(fields[4]);
        	traveler.setDestiny(fields[5]);
        
        	UpdateDialog updateDialog = new UpdateDialog(this, true);
        
        	updateDialog.setTraveler(traveler);
        
        	updateDialog.fieldsUpdate();
        
        	traveler = new Traveler();
        
        	updateDialog.setVisible(true);
        
        	this.traveler = updateDialog.getTraveler();
        
        	try {
            		if (!traveler.getName().isEmpty()) {
                	updateTraveler(traveler);
            	}
        	} catch (NullPointerException e) {

        	}

        	traveler = new Traveler();
        
    	}

	public static void main(String args[]) {
        
        	try {
            		for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                	if ("Nimbus".equals(info.getName())) {
                    	javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    	break;
                	}
            	}
        	} catch (ClassNotFoundException ex) {
            		java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        	} catch (InstantiationException ex) {
            		java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        	} catch (IllegalAccessException ex) {
            		java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            		java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        	}
        
        	java.awt.EventQueue.invokeLater(new Runnable() {
            		public void run() {
                	new Home().setVisible(true);
            		}
        	});
    	}

	private void setIcon(){
    
        	setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    
    	}

	private void btns(boolean b){
        	btnUpdate.setVisible(b);
        	btnDelete.setVisible(b);
    	}

	private void setTravelerController(TravelerController tc){
        	this.controller = tc;
    	}

	private void viewTable(){
    
        	model = (DefaultTableModel) tbTraveler.getModel();
    
        	List<Traveler> list = controller.getListTraveler();
        
        	for (Traveler e : list){
        
            		Object obj[] = {e.getId(), e.getName(), e.getCpf(), e.getNumberPhone(), e.getBoarding(), e.getDestiny()};
            
            		model.addRow(obj);
            
        	}
        
    	}

	private void addTraveler(Traveler e){
    
        	model = (DefaultTableModel) tbTraveler.getModel();
        
        	Object obj[] = {e.getId(), e.getName(), e.getCpf(), e.getNumberPhone(), e.getBoarding(), e.getDestiny()};
        
        	if (!e.getName().isEmpty())model.addRow(obj);
        
    	}

	private void updateTraveler(Traveler e){
    
        	model = (DefaultTableModel) tbTraveler.getModel();

        	Object obj[] = {e.getId(), e.getName(), e.getCpf(), e.getNumberPhone(), e.getBoarding(), e.getDestiny()};

        	if (!e.getName().isEmpty()) {

            		model.removeRow(selectedRow);
            		model.insertRow(selectedRow, obj);

        	}
    
    	}

	private javax.swing.JButton btnDelete;
    	private javax.swing.JButton btnInsert;
    	private javax.swing.JButton btnUpdate;
    	private javax.swing.JLabel jLabel1;
    	private javax.swing.JLabel jLabel2;
    	private javax.swing.JLabel jLabel3;
    	private javax.swing.JLabel jLabel4;
    	private javax.swing.JLabel jLabel5;
    	private javax.swing.JScrollPane jScrollPane1;
    	private javax.swing.JTable tbTraveler;

}