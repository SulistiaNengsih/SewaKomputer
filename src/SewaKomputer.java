import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;

public class SewaKomputer extends javax.swing.JFrame {
    // Properties, untuk menambahkan JInternalFrame FormSewaKomputer ke dalam SewaKomputer
    private JSpinner.DateEditor editor1;
    private JSpinner.DateEditor editor2;
    public static Connection koneksi;
    public static Statement st;
    public static ResultSet rs;
    
    public SewaKomputer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sewaKomputerApp = new javax.swing.JFrame();
        labelSewaKomputer = new javax.swing.JLabel();
        panelTabelSewa = new javax.swing.JTabbedPane();
        tabSewa = new javax.swing.JPanel();
        tanggalKembali = new javax.swing.JSpinner();
        labelNama = new javax.swing.JLabel();
        fieldNama = new javax.swing.JTextField();
        labelJenisKomputer = new javax.swing.JLabel();
        cbJenisLaptop = new javax.swing.JComboBox<>();
        labelTanggalSewa = new javax.swing.JLabel();
        labelTanggalKembali = new javax.swing.JLabel();
        btnSewaKomputer = new javax.swing.JButton();
        tanggalSewa = new javax.swing.JSpinner();
        tabTabel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelSewaKomputer = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuFormSewaKomputer = new javax.swing.JMenuItem();
        menuTabelSewaKomputer = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuTentangPembuat = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuExit = new javax.swing.JMenuItem();
        dialogTentangPembuat = new javax.swing.JDialog();
        labelKeterangan = new javax.swing.JLabel();
        labelFoto = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        labelLogin = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        fieldUsername = new javax.swing.JTextField();
        fieldPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        labelGambar = new javax.swing.JLabel();

        sewaKomputerApp.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        sewaKomputerApp.setSize(new java.awt.Dimension(800, 600));
        sewaKomputerApp.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                sewaKomputerAppComponentShown(evt);
            }
        });

        labelSewaKomputer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelSewaKomputer.setText("Sewa Komputer");

        tanggalKembali.setModel(new javax.swing.SpinnerDateModel());

        labelNama.setText("Nama");

        labelJenisKomputer.setText("Jenis Komputer");

        cbJenisLaptop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lenovo", "Asus", "Toshiba", "Macbook", "HP", "Dell" }));
        cbJenisLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJenisLaptopActionPerformed(evt);
            }
        });

        labelTanggalSewa.setText("Tanggal Sewa");

        labelTanggalKembali.setText("Tanggal Kembali");

        btnSewaKomputer.setText("Sewa Komputer");
        btnSewaKomputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSewaKomputerActionPerformed(evt);
            }
        });

        tanggalSewa.setModel(new javax.swing.SpinnerDateModel());

        javax.swing.GroupLayout tabSewaLayout = new javax.swing.GroupLayout(tabSewa);
        tabSewa.setLayout(tabSewaLayout);
        tabSewaLayout.setHorizontalGroup(
            tabSewaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSewaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabSewaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabSewaLayout.createSequentialGroup()
                        .addGroup(tabSewaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTanggalSewa)
                            .addComponent(labelJenisKomputer)
                            .addComponent(labelNama))
                        .addGap(26, 26, 26)
                        .addGroup(tabSewaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbJenisLaptop, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tanggalSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabSewaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSewaKomputer)
                        .addGroup(tabSewaLayout.createSequentialGroup()
                            .addComponent(labelTanggalKembali)
                            .addGap(22, 22, 22)
                            .addComponent(tanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(747, Short.MAX_VALUE))
        );
        tabSewaLayout.setVerticalGroup(
            tabSewaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSewaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(tabSewaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNama))
                .addGap(18, 18, 18)
                .addGroup(tabSewaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJenisKomputer)
                    .addComponent(cbJenisLaptop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabSewaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTanggalSewa)
                    .addComponent(tanggalSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabSewaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTanggalKembali)
                    .addComponent(tanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnSewaKomputer)
                .addContainerGap(350, Short.MAX_VALUE))
        );

        panelTabelSewa.addTab("Form Sewa", tabSewa);

        tabTabel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tabTabelComponentShown(evt);
            }
        });

        tabelSewaKomputer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama", "Jenis Laptop", "Harga Sewa Harian", "Tanggal Sewa", "Tanggal Kembali", "Total Harga"
            }
        ));
        jScrollPane1.setViewportView(tabelSewaKomputer);

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabTabelLayout = new javax.swing.GroupLayout(tabTabel);
        tabTabel.setLayout(tabTabelLayout);
        tabTabelLayout.setHorizontalGroup(
            tabTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTabelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabTabelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnReset)))
                .addContainerGap())
        );
        tabTabelLayout.setVerticalGroup(
            tabTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        panelTabelSewa.addTab("Tabel Sewa", tabTabel);

        jMenu1.setText("File");

        menuFormSewaKomputer.setText("Form Sewa Komputer");
        menuFormSewaKomputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFormSewaKomputerActionPerformed(evt);
            }
        });
        jMenu1.add(menuFormSewaKomputer);

        menuTabelSewaKomputer.setText("Tabel Sewa Komputer");
        menuTabelSewaKomputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTabelSewaKomputerActionPerformed(evt);
            }
        });
        jMenu1.add(menuTabelSewaKomputer);
        jMenu1.add(jSeparator1);

        menuTentangPembuat.setText("Tentang Pembuat");
        menuTentangPembuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTentangPembuatActionPerformed(evt);
            }
        });
        jMenu1.add(menuTentangPembuat);
        jMenu1.add(jSeparator2);

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        sewaKomputerApp.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout sewaKomputerAppLayout = new javax.swing.GroupLayout(sewaKomputerApp.getContentPane());
        sewaKomputerApp.getContentPane().setLayout(sewaKomputerAppLayout);
        sewaKomputerAppLayout.setHorizontalGroup(
            sewaKomputerAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sewaKomputerAppLayout.createSequentialGroup()
                .addGroup(sewaKomputerAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sewaKomputerAppLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelTabelSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 1014, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sewaKomputerAppLayout.createSequentialGroup()
                        .addGap(449, 449, 449)
                        .addComponent(labelSewaKomputer)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        sewaKomputerAppLayout.setVerticalGroup(
            sewaKomputerAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sewaKomputerAppLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelSewaKomputer)
                .addGap(18, 18, 18)
                .addComponent(panelTabelSewa)
                .addContainerGap())
        );

        panelTabelSewa.getAccessibleContext().setAccessibleName("Form Sewa");

        labelKeterangan.setText("Program ini dibuat oleh Sulistia.");

        labelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_11fotodiri.png"))); // NOI18N

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogTentangPembuatLayout = new javax.swing.GroupLayout(dialogTentangPembuat.getContentPane());
        dialogTentangPembuat.getContentPane().setLayout(dialogTentangPembuatLayout);
        dialogTentangPembuatLayout.setHorizontalGroup(
            dialogTentangPembuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogTentangPembuatLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(dialogTentangPembuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFoto)
                    .addComponent(labelKeterangan))
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogTentangPembuatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOK)
                .addGap(48, 48, 48))
        );
        dialogTentangPembuatLayout.setVerticalGroup(
            dialogTentangPembuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogTentangPembuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelKeterangan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(labelFoto)
                .addGap(29, 29, 29)
                .addComponent(btnOK)
                .addGap(25, 25, 25))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(402, 220));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        labelLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelLogin.setText("--------------------LOGIN--------------------");

        labelUsername.setText("Username");

        labelPassword.setText("Password");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        labelGambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_11fotodiri.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(labelGambar)
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPassword)
                            .addComponent(labelUsername))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fieldUsername)
                            .addComponent(fieldPassword))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLogin)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelUsername)
                            .addComponent(fieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPassword)
                            .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogin)
                            .addComponent(btnExit)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(labelGambar)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try {
            String database = "jdbc:mysql://localhost/UASBondan";
            String user = "root";
            String pass = "password";
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(database, user, pass);
            
            st = koneksi.createStatement();
            System.out.println("Koneksi berhasil.");
            }
        
        catch (SQLException ex) {
            
        } catch (ClassNotFoundException ex) { 
            System.out.println("Error class not found.");
        }
    }//GEN-LAST:event_formComponentShown

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Mengecek apakah field username dan field password sudah terisi.
        if (!(fieldUsername.getText().equals("")) && !(fieldPassword.getPassword().equals(""))){
            // Jika username dan password telah terisi,
            // Langkah berikutnya adalah mengecek apakah username dan password yang diinputkan sesuai dengan data yang ada di database
            
            // Membuat dua variable yang berfungsi untuk menyimpan username dan password yang diinputkan oleh pengguna
            String usernameInput = fieldUsername.getText();
            String passwordInput = fieldPassword.getText();
            
            // Membuat variable query untuk menyimpan query yang akan dieksekusi
            String query = "select * from user where username = " + "'" + usernameInput + "'";
            
            try {
                rs = st.executeQuery(query);
                boolean usernameBenar = false;
                
                while (rs.next()){
                    String realPassword = rs.getString("password");
                    String realUsername = rs.getString("username");
                    
                    if (usernameInput.equals(realUsername) && passwordInput.equals(realPassword)) {
                        this.dispose();
                        sewaKomputerApp.setVisible(true);
                        usernameBenar = true;
                    } else {
                        JOptionPane.showMessageDialog(this, "Password yang anda masukkan salah!");
                    }
                }
                
                if (!usernameBenar) {
                    JOptionPane.showMessageDialog(this, "Username yang anda masukkan salah!");
                    fieldUsername.setText("");
                    fieldPassword.setText("");
                }
            }
        
            catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null, " data error " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pastikan username dan password terisi!");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Method dispose berfungsi untuk menutup aplikasi
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        dialogTentangPembuat.dispose();
    }//GEN-LAST:event_btnOKActionPerformed

    private void menuFormSewaKomputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFormSewaKomputerActionPerformed
        panelTabelSewa.setSelectedIndex(0);
    }//GEN-LAST:event_menuFormSewaKomputerActionPerformed

    private void menuTabelSewaKomputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTabelSewaKomputerActionPerformed
        panelTabelSewa.setSelectedIndex(1);
    }//GEN-LAST:event_menuTabelSewaKomputerActionPerformed

    private void menuTentangPembuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTentangPembuatActionPerformed
        if (dialogTentangPembuat.isVisible()) {
            JOptionPane.showMessageDialog(this, "Dialog tentang pembuat sudah terbuka!");
        } else {
              dialogTentangPembuat.setVisible(true);
        }
    }//GEN-LAST:event_menuTentangPembuatActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

    private void sewaKomputerAppComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_sewaKomputerAppComponentShown
        
    }//GEN-LAST:event_sewaKomputerAppComponentShown

    private void cbJenisLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJenisLaptopActionPerformed

    }//GEN-LAST:event_cbJenisLaptopActionPerformed

    private void btnSewaKomputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSewaKomputerActionPerformed
        // Membuat variable untuk menyimpan nama dan jenis laptop yang diinputkan oleh pengguna
        editor1 = new JSpinner.DateEditor(tanggalSewa, "yyyy-MM-dd");
        editor2 = new JSpinner.DateEditor(tanggalKembali, "yyyy-MM-dd");
        tanggalSewa.setEditor(editor1);
        tanggalKembali.setEditor(editor2); 
        
        String nama = fieldNama.getText();
        String jenisLaptop = cbJenisLaptop.getSelectedItem().toString();

        int harga = 0;

        switch(jenisLaptop) {
            case "Lenovo":
            harga = 100000;
            break;
            case "Asus":
            harga = 95000;
            break;
            case "Toshiba":
            harga = 90000;
            break;
            case "Macbook":
            harga = 120000;
            break;
            case "HP":
            harga = 102000;
            break;
            case "Dell":
            harga = 105000;
            break;
        }

        // String untuk menyesuaikan format tanggal pada mySQL
        String tglSewa = editor1.getFormat().format(tanggalSewa.getValue());
        String tglKembali = editor2.getFormat().format(tanggalKembali.getValue());

        // String tersebut diubah ke localdate agar dapat digunakan oleh method ChronoUnit.Days.between.
        // ChronoUnit.Days.between digunakan untuk menghitung jumlah hari di antara dua tanggal.
        LocalDate tglSewaParsed = LocalDate.parse(tglSewa);
        LocalDate tglKembaliParsed = LocalDate.parse(tglKembali);

        long jumlahHari = ChronoUnit.DAYS.between(tglSewaParsed, tglKembaliParsed);

        int totalHarga = (int)((jumlahHari+1) * harga);

        String query = "insert into sewakomputer (nama, jenis_laptop, harga_sewa_harian, tanggal_sewa, tanggal_kembali, total_harga) values ('" + nama + "', '" + jenisLaptop +    "', '" + harga + "', '" + tglSewa +"', '" + tglKembali + "', '" + totalHarga + "')";

        try {
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
            fieldNama.setText("");
            cbJenisLaptop.setSelectedIndex(0);
        }
        catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, " data error " + ex.getMessage());
        }
    }//GEN-LAST:event_btnSewaKomputerActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        String query = "truncate sewakomputer;";

        try {
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Data berhasil direset!");
            DefaultTableModel tbl = (DefaultTableModel)tabelSewaKomputer.getModel();
            tbl.setNumRows(0);
        }

        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnResetActionPerformed

    private void tabTabelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tabTabelComponentShown
        try {            
            rs = st.executeQuery("select * from sewakomputer");
            DefaultTableModel tbl = (DefaultTableModel)tabelSewaKomputer.getModel();
            tbl.setNumRows(0);
            
            while(rs.next())
            {
                tbl.addRow(new Object[] {
                    rs.getString("No"),
                    rs.getString("Nama"),
                    rs.getString("Jenis_Laptop"),
                    rs.getString("Harga_Sewa_Harian"),
                    rs.getString("Tanggal_Sewa"),
                    rs.getString("Tanggal_Kembali"),
                    rs.getString("Total_Harga")
                });
            }
        }
        
        catch (SQLException ex) {
            
        } 
    }//GEN-LAST:event_tabTabelComponentShown

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SewaKomputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SewaKomputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SewaKomputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SewaKomputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SewaKomputer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSewaKomputer;
    private javax.swing.JComboBox<String> cbJenisLaptop;
    private javax.swing.JDialog dialogTentangPembuat;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JTextField fieldUsername;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelGambar;
    private javax.swing.JLabel labelJenisKomputer;
    private javax.swing.JLabel labelKeterangan;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelSewaKomputer;
    private javax.swing.JLabel labelTanggalKembali;
    private javax.swing.JLabel labelTanggalSewa;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuFormSewaKomputer;
    private javax.swing.JMenuItem menuTabelSewaKomputer;
    private javax.swing.JMenuItem menuTentangPembuat;
    private javax.swing.JTabbedPane panelTabelSewa;
    private javax.swing.JFrame sewaKomputerApp;
    private javax.swing.JPanel tabSewa;
    private javax.swing.JPanel tabTabel;
    private javax.swing.JTable tabelSewaKomputer;
    private javax.swing.JSpinner tanggalKembali;
    private javax.swing.JSpinner tanggalSewa;
    // End of variables declaration//GEN-END:variables
}
