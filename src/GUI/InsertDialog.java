package GUI;

import entities.Traveler;

public class InsertDialog extends javax.swing.JDialog {

    	private TravelerController controller;
    	private Traveler traveler = new Traveler();
    
    	public InsertDialog(java.awt.Frame parent, boolean modal) {
        	super(parent, modal);
        	initComponents();
        	setController(new TravelerController());
    	}

	
	@SuppressWarnings("unchecked")

	private void initComponents() {

        	jLabel1 = new javax.swing.JLabel();
        	jLabel2 = new javax.swing.JLabel();
        	jLabel3 = new javax.swing.JLabel();
        	jLabel4 = new javax.swing.JLabel();
        	jLabel5 = new javax.swing.JLabel();
        	jLabel6 = new javax.swing.JLabel();
        	ftfName = new javax.swing.JFormattedTextField();
        	ftfCpf = new javax.swing.JFormattedTextField();
        	ftfNumber = new javax.swing.JFormattedTextField();
        	ftfBoarding = new javax.swing.JFormattedTextField();
        	ftfDestiny = new javax.swing.JFormattedTextField();
        	btnRegister = new javax.swing.JButton();
        	btnClean = new javax.swing.JButton();

        	jLabel1.setText("jLabel1");

        	setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        	setTitle("Inserir Passageiro");

        	jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        	jLabel2.setForeground(new java.awt.Color(60, 60, 60));
        	jLabel2.setText("Nome Completo");

        	jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        	jLabel3.setForeground(new java.awt.Color(60, 60, 60));
        	jLabel3.setText("CPF");

        	jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        	jLabel4.setForeground(new java.awt.Color(60, 60, 60));
        	jLabel4.setText("Telefone");

        	jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        	jLabel5.setForeground(new java.awt.Color(60, 60, 60));
        	jLabel5.setText("Embarque");

        	jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        	jLabel6.setForeground(new java.awt.Color(60, 60, 60));
        	jLabel6.setText("Destino");

        	btnRegister.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        	btnRegister.setForeground(new java.awt.Color(60, 60, 60));
        	btnRegister.setText("Cadastrar");
        	btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        	btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {

            		public void mouseClicked(java.awt.event.MouseEvent evt) {
                		btnRegisterMouseClicked(evt);
            		}
        	});

        	btnClean.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        	btnClean.setForeground(new java.awt.Color(60, 60, 60));
        	btnClean.setText("Limpar");
        	btnClean.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        	btnClean.addMouseListener(new java.awt.event.MouseAdapter() {
	
            		public void mouseClicked(java.awt.event.MouseEvent evt) {
                		btnCleanMouseClicked(evt);
            		}
        	});

        	javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        	getContentPane().setLayout(layout);
        	layout.setHorizontalGroup(
            	layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            	.addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegister))
                    	.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ftfDestiny, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ftfBoarding, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ftfNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(ftfName, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                	.addContainerGap(33, Short.MAX_VALUE))
        	);

        	layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ftfBoarding, ftfCpf, ftfDestiny, ftfName, ftfNumber});

        	layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClean, btnRegister});

        	layout.setVerticalGroup(
            	layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            	.addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftfNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftfBoarding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftfDestiny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(btnClean))
                .addContainerGap(37, Short.MAX_VALUE))
        	);

        	pack();
        	setLocationRelativeTo(null);
    	}

	private void btnCleanMouseClicked(java.awt.event.MouseEvent evt) {                                      
        	ftfName.setText("");
        	ftfCpf.setText("");
        	ftfNumber.setText("");
        	ftfBoarding.setText("");
        	ftfDestiny.setText("");
    	}

	private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {                                         
        
        	Traveler trav = new Traveler();
        
        	trav.setId(traveler.getId());
        
        	trav.setName(ftfName.getText());
        	trav.setCpf(ftfCpf.getText());
        	trav.setNumberPhone(ftfNumber.getText());
        	trav.setBoarding(ftfBoarding.getText());
        	trav.setDestiny(ftfDestiny.getText());
        
        	controller.insert(trav);
        
        	setTraveler(trav);
        
        	dispose();
        
    	} 

	public static void main(String args[]) {
       
        	java.awt.EventQueue.invokeLater(new Runnable() {
            		public void run() {
                		InsertDialog dialog = new InsertDialog(new javax.swing.JFrame(), true);
                		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    			@Override
                    			public void windowClosing(java.awt.event.WindowEvent e) {
                        		System.exit(0);
                    		}
                		});
                	dialog.setVisible(true);
            		}
        	});
    	}

	private void setController(TravelerController tc){
        	this.controller = tc;
    	}

	private void setTraveler(Traveler t){
        	this.traveler = t;
    	}

	public Traveler getTraveler(){
        	return traveler;
    	}

	private javax.swing.JButton btnClean;
    	private javax.swing.JButton btnRegister;
    	private javax.swing.JFormattedTextField ftfBoarding;
    	private javax.swing.JFormattedTextField ftfCpf;
    	private javax.swing.JFormattedTextField ftfDestiny;
    	private javax.swing.JFormattedTextField ftfName;
    	private javax.swing.JFormattedTextField ftfNumber;
    	private javax.swing.JLabel jLabel1;
    	private javax.swing.JLabel jLabel2;
    	private javax.swing.JLabel jLabel3;
    	private javax.swing.JLabel jLabel4;
    	private javax.swing.JLabel jLabel5;
    	private javax.swing.JLabel jLabel6;

}