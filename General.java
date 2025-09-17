package Front;
import Back.Start;
import Back.Select;
import Back.Statistics;
import javax.swing.JOptionPane;

public class General extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(General.class.getName());
    public General() {
        initComponents();
        String[] Name = {"Parque Tachira","Parque DeltaAMacuro","Parque Bolivar","Parque Zeta",
        "Ávila", "Canaima", "Morrocoy", "Archipiélago Los Roques", "Henri Pittier", "Médanos de Coro", "Mochima", "Guatopo", "Yacambú", 
        "Chorro El Indio", "Sierra Nevada", "Ciénagas de Juan Manuel", "Yurubí", "El Guácharo", "Parque Nacional Henri Pittier", "Laguna de La Restinga", "Tacarigua", 
        "Perijá", "San Esteban", "Dinira", "Sierra La Culata", "Terepaima", "Páramos El Tambor", "Guanay", "Aguaro-Guariquito", "Ciénaga de Aguaro", "Laguna de Los Patos", 
        "El Valle", "Turuep", "Guaramacal", "Cuyagua", "Jaua-Sarisa", "Laguna Blanca", "Yapacana", "Duida Marahuaca", "Península de Paria", "Cerros de la Guaiquera", "Mantecal", 
        "Cascada El Tobogán", "La Renegada", "Sierra de San Luis", "Caicara", "Dinira", "Villalba", "Turimiquire", "Copo", "El Águila", "Los Manantiales", "Las Delicias", 
        "Las Aguas Termales", "Los Sabanales", "Caricuao", "Sabana Grande", "San Luis", "El Volcán", "El Hatillo", "Laguna de Lobos", "El Palmar", "Guama", "Los Chorros", 
        "Las Bocas", "Mantecal", "El Pinar", "El Maizal", "Yumerí"};
        String[] AlphaCoder = {"Tach334", "Delta556", "Boli779", "Zeta880","AVILA1958", "CANAIMA1962", "MORROCOY1974", 
            "ROQUES1972", "PITTIE1937", "MEDANO1974", "MOCHIM1973", "GUACHA1975", "YACAMB1962", "GUATOP1958", "SNEVAD1952", "MARACA1973", "YURUBI1960", 
            "CHORRO1973", "HENRIP1937", "LAGUNA1974", "TACARI1974", "PERIJA1978", "SANEST1987", "DINDRA1988", "SIERRASL1988", "TEREPA1976", "PARAMOS1989", 
            "GUANAY1989", "AGUARO1974", "CINAGAS1991", "PISLAGO1994", "ELVALL1994", "TURUEP1996", "GUARA1998", "CUMARI1998", "JAUASA1978", "LANBLI1978", "YAPACA1978", 
            "DUIMAR1978", "PENINS1978", "CIENTR1978", "MANTLE1978", "CASCAD1981", "LARENG1985", "SIERRAA1986", "CAICARA1987", "DINIRA1988", "VILLABA1974", "TURIMQ1992", 
            "COPO1988", "ELAGUI1990", "LOSMAN1992", "LASDE1992", "LASAGU1996", "LOSSAI1996", "CARICU1996", "SABANA1997", "SANLUI1998", "ELVOLC1999", "ELHAT2000", "LAGOL2000", 
            "ELPALO2000", "GUAMOL2001", "LAGUNA1974", "LOSCHU1989", "LASBCA1990", "MANTEN1995", "ELPIN1995", "MAIZAL1995", "YUMER1996"};
        int[] PM = {250, 150, 90, 40,35, 189, 21, 
            142, 77, 203, 9, 165, 48, 221, 102, 13, 198, 
            60, 245, 84, 117, 2, 230, 71, 155, 38, 209, 93, 178, 
            5, 126, 25, 215, 68, 149, 11, 192, 54, 239, 81, 169, 44, 200, 7, 134, 
            29, 225, 98, 183, 16, 110, 3, 241, 75, 158, 41, 218, 86, 172, 51, 138, 20, 
            206, 63, 145, 32, 235, 105, 195, 57};
        Start Example = new Start();
        Example.setPPM(PM);
        Example.setCode(AlphaCoder);
        Example.Clasificacion();
        String[] classifications = Example.getClasificacion();
        String[] codes = Example.getCode();
        int[] ppms = Example.getPPM();
        
        ListaDeParques.setEditable(false);
        Toxicos.setEditable(false);
        StringBuilder Show = new StringBuilder();
        StringBuilder Toxic = new StringBuilder();
        
        for(int i=0; i<Name.length;i++){
            Show.append("Parque: ").append(Name[i]).append(" || Contaminación: ").append(PM[i]).append(" PPM  ").append(codes[i]).append(" ").append(classifications[i]).append("\n");
        }
        ListaDeParques.setText(Show.toString());
        
        for(int i=0; i<Name.length;i++){
            if(PM[i] >= 151){
                Toxic.append("Parque: ").append(Name[i]).append(" || Contaminación: ").append(PM[i]).append(" PPM  ").append(codes[i]).append(" ").append(classifications[i]).append("\n");
            }
        }
        Toxicos.setText(Toxic.toString());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        VerPromedio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaDeParques = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Toxicos = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        MinAndMax = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Shows = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Minimo = new javax.swing.JTextField();
        Maximo = new javax.swing.JTextField();
        RangeButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        AreaRange = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AlphaNumber = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Ingresa = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        ShowsB = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Multi");

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        VerPromedio.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        VerPromedio.setText("Promedio Total de PPM");
        VerPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerPromedioActionPerformed(evt);
            }
        });

        ListaDeParques.setColumns(20);
        ListaDeParques.setRows(5);
        jScrollPane1.setViewportView(ListaDeParques);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Parques Registrados");

        Toxicos.setColumns(20);
        Toxicos.setRows(5);
        jScrollPane2.setViewportView(Toxicos);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Parques Altamente Toxicos");

        MinAndMax.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        MinAndMax.setText("Minimo y Maximo de PPM");
        MinAndMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinAndMaxActionPerformed(evt);
            }
        });

        jLabel7.setText("Porcentaje de Parques En cada Clasificacion");

        Shows.setText("Mostrar");
        Shows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VerPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(MinAndMax, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(158, 158, 158))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(241, 241, 241))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(Shows, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(VerPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(MinAndMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Shows)
                        .addGap(64, 64, 64))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Visualizacion", jPanel1);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Busqueda por Rango");

        Minimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimoActionPerformed(evt);
            }
        });

        Maximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaximoActionPerformed(evt);
            }
        });

        RangeButton.setText("Buscar");
        RangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RangeButtonActionPerformed(evt);
            }
        });

        AreaRange.setColumns(20);
        AreaRange.setRows(5);
        jScrollPane3.setViewportView(AreaRange);

        jLabel4.setText("Minimo");

        jLabel5.setText("Maximo");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("Busqueda por Codigo AlphaNumerico");

        AlphaNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlphaNumberActionPerformed(evt);
            }
        });
        AlphaNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AlphaNumberKeyPressed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(RangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Minimo, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Maximo, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(jLabel5))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(jLabel4)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(216, 216, 216))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(AlphaNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(257, 257, 257))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Minimo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AlphaNumber))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Maximo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(RangeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Busqueda", jPanel2);

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel8.setText("Ingresar PPM Anteriores Para Comparacion");

        Ingresa.setText("Iniciar");
        Ingresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresaActionPerformed(evt);
            }
        });

        ShowsB.setColumns(20);
        ShowsB.setRows(5);
        jScrollPane4.setViewportView(ShowsB);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(Ingresa)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Ingresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Comparacion", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerPromedioActionPerformed
        // TODO add your handling code here:
        int[] PM = {250, 150, 90, 40,35, 189, 21, 
            142, 77, 203, 9, 165, 48, 221, 102, 13, 198, 
            60, 245, 84, 117, 2, 230, 71, 155, 38, 209, 93, 178, 
            5, 126, 25, 215, 68, 149, 11, 192, 54, 239, 81, 169, 44, 200, 7, 134, 
            29, 225, 98, 183, 16, 110, 3, 241, 75, 158, 41, 218, 86, 172, 51, 138, 20, 
            206, 63, 145, 32, 235, 105, 195, 57};
        double TotalPromedio = Select.Promedio(PM);
        JOptionPane.showMessageDialog(null,"El promedio total es de: "+TotalPromedio+"PPM");
    }//GEN-LAST:event_VerPromedioActionPerformed

    private void MinAndMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinAndMaxActionPerformed
        // TODO add your handling code here:
        int[] PM = {250, 150, 90, 40,35, 189, 21, 
            142, 77, 203, 9, 165, 48, 221, 102, 13, 198, 
            60, 245, 84, 117, 2, 230, 71, 155, 38, 209, 93, 178, 
            5, 126, 25, 215, 68, 149, 11, 192, 54, 239, 81, 169, 44, 200, 7, 134, 
            29, 225, 98, 183, 16, 110, 3, 241, 75, 158, 41, 218, 86, 172, 51, 138, 20, 
            206, 63, 145, 32, 235, 105, 195, 57};
        Start Example = new Start();
        String[] AlphaCoder = {"Tach334", "Delta556", "Boli779", "Zeta880","AVILA1958", "CANAIMA1962", "MORROCOY1974", 
            "ROQUES1972", "PITTIE1937", "MEDANO1974", "MOCHIM1973", "GUACHA1975", "YACAMB1962", "GUATOP1958", "SNEVAD1952", "MARACA1973", "YURUBI1960", 
            "CHORRO1973", "HENRIP1937", "LAGUNA1974", "TACARI1974", "PERIJA1978", "SANEST1987", "DINDRA1988", "SIERRASL1988", "TEREPA1976", "PARAMOS1989", 
            "GUANAY1989", "AGUARO1974", "CINAGAS1991", "PISLAGO1994", "ELVALL1994", "TURUEP1996", "GUARA1998", "CUMARI1998", "JAUASA1978", "LANBLI1978", "YAPACA1978", 
            "DUIMAR1978", "PENINS1978", "CIENTR1978", "MANTLE1978", "CASCAD1981", "LARENG1985", "SIERRAA1986", "CAICARA1987", "DINIRA1988", "VILLABA1974", "TURIMQ1992", 
            "COPO1988", "ELAGUI1990", "LOSMAN1992", "LASDE1992", "LASAGU1996", "LOSSAI1996", "CARICU1996", "SABANA1997", "SANLUI1998", "ELVOLC1999", "ELHAT2000", "LAGOL2000", 
            "ELPALO2000", "GUAMOL2001", "LAGUNA1974", "LOSCHU1989", "LASBCA1990", "MANTEN1995", "ELPIN1995", "MAIZAL1995", "YUMER1996"};
        Example.MaxtMin(AlphaCoder, PM);
        String BB = Example.MaxtMin(AlphaCoder, PM);
        JOptionPane.showMessageDialog(null, BB);
    }//GEN-LAST:event_MinAndMaxActionPerformed

    private void MinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MinimoActionPerformed

    private void MaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaximoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaximoActionPerformed

    private void RangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RangeButtonActionPerformed
        // TODO add your handling code here:
        int B, C;
        B = Integer.parseInt(Minimo.getText());
        C = Integer.parseInt(Maximo.getText());
        String[] Name = {"Parque Tachira","Parque DeltaAMacuro","Parque Bolivar","Parque Zeta",
        "Ávila", "Canaima", "Morrocoy", "Archipiélago Los Roques", "Henri Pittier", "Médanos de Coro", "Mochima", "Guatopo", "Yacambú", 
        "Chorro El Indio", "Sierra Nevada", "Ciénagas de Juan Manuel", "Yurubí", "El Guácharo", "Parque Nacional Henri Pittier", "Laguna de La Restinga", "Tacarigua", 
        "Perijá", "San Esteban", "Dinira", "Sierra La Culata", "Terepaima", "Páramos El Tambor", "Guanay", "Aguaro-Guariquito", "Ciénaga de Aguaro", "Laguna de Los Patos", 
        "El Valle", "Turuep", "Guaramacal", "Cuyagua", "Jaua-Sarisa", "Laguna Blanca", "Yapacana", "Duida Marahuaca", "Península de Paria", "Cerros de la Guaiquera", "Mantecal", 
        "Cascada El Tobogán", "La Renegada", "Sierra de San Luis", "Caicara", "Dinira", "Villalba", "Turimiquire", "Copo", "El Águila", "Los Manantiales", "Las Delicias", 
        "Las Aguas Termales", "Los Sabanales", "Caricuao", "Sabana Grande", "San Luis", "El Volcán", "El Hatillo", "Laguna de Lobos", "El Palmar", "Guama", "Los Chorros", 
        "Las Bocas", "Mantecal", "El Pinar", "El Maizal", "Yumerí"};
        String[] AlphaCoder = {"Tach334", "Delta556", "Boli779", "Zeta880","AVILA1958", "CANAIMA1962", "MORROCOY1974", 
            "ROQUES1972", "PITTIE1937", "MEDANO1974", "MOCHIM1973", "GUACHA1975", "YACAMB1962", "GUATOP1958", "SNEVAD1952", "MARACA1973", "YURUBI1960", 
            "CHORRO1973", "HENRIP1937", "LAGUNA1974", "TACARI1974", "PERIJA1978", "SANEST1987", "DINDRA1988", "SIERRASL1988", "TEREPA1976", "PARAMOS1989", 
            "GUANAY1989", "AGUARO1974", "CINAGAS1991", "PISLAGO1994", "ELVALL1994", "TURUEP1996", "GUARA1998", "CUMARI1998", "JAUASA1978", "LANBLI1978", "YAPACA1978", 
            "DUIMAR1978", "PENINS1978", "CIENTR1978", "MANTLE1978", "CASCAD1981", "LARENG1985", "SIERRAA1986", "CAICARA1987", "DINIRA1988", "VILLABA1974", "TURIMQ1992", 
            "COPO1988", "ELAGUI1990", "LOSMAN1992", "LASDE1992", "LASAGU1996", "LOSSAI1996", "CARICU1996", "SABANA1997", "SANLUI1998", "ELVOLC1999", "ELHAT2000", "LAGOL2000", 
            "ELPALO2000", "GUAMOL2001", "LAGUNA1974", "LOSCHU1989", "LASBCA1990", "MANTEN1995", "ELPIN1995", "MAIZAL1995", "YUMER1996"};
        int[] PM = {250, 150, 90, 40,35, 189, 21, 
            142, 77, 203, 9, 165, 48, 221, 102, 13, 198, 
            60, 245, 84, 117, 2, 230, 71, 155, 38, 209, 93, 178, 
            5, 126, 25, 215, 68, 149, 11, 192, 54, 239, 81, 169, 44, 200, 7, 134, 
            29, 225, 98, 183, 16, 110, 3, 241, 75, 158, 41, 218, 86, 172, 51, 138, 20, 
            206, 63, 145, 32, 235, 105, 195, 57};
        Start Example = new Start();
        Example.setPPM(PM);
        Example.setCode(AlphaCoder);
        Example.Clasificacion();
        String[] classifications = Example.getClasificacion();
        String Result = Select.PrintSearch(Name, AlphaCoder, PM, classifications, B, C);
        
        AreaRange.setText(Result);
    }//GEN-LAST:event_RangeButtonActionPerformed

    private void AlphaNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlphaNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlphaNumberActionPerformed

    private void AlphaNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlphaNumberKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlphaNumberKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String[] Name = {"Parque Tachira","Parque DeltaAMacuro","Parque Bolivar","Parque Zeta",
        "Ávila", "Canaima", "Morrocoy", "Archipiélago Los Roques", "Henri Pittier", "Médanos de Coro", "Mochima", "Guatopo", "Yacambú", 
        "Chorro El Indio", "Sierra Nevada", "Ciénagas de Juan Manuel", "Yurubí", "El Guácharo", "Parque Nacional Henri Pittier", "Laguna de La Restinga", "Tacarigua", 
        "Perijá", "San Esteban", "Dinira", "Sierra La Culata", "Terepaima", "Páramos El Tambor", "Guanay", "Aguaro-Guariquito", "Ciénaga de Aguaro", "Laguna de Los Patos", 
        "El Valle", "Turuep", "Guaramacal", "Cuyagua", "Jaua-Sarisa", "Laguna Blanca", "Yapacana", "Duida Marahuaca", "Península de Paria", "Cerros de la Guaiquera", "Mantecal", 
        "Cascada El Tobogán", "La Renegada", "Sierra de San Luis", "Caicara", "Dinira", "Villalba", "Turimiquire", "Copo", "El Águila", "Los Manantiales", "Las Delicias", 
        "Las Aguas Termales", "Los Sabanales", "Caricuao", "Sabana Grande", "San Luis", "El Volcán", "El Hatillo", "Laguna de Lobos", "El Palmar", "Guama", "Los Chorros", 
        "Las Bocas", "Mantecal", "El Pinar", "El Maizal", "Yumerí"};
        String[] AlphaCoder = {"Tach334", "Delta556", "Boli779", "Zeta880","AVILA1958", "CANAIMA1962", "MORROCOY1974", 
            "ROQUES1972", "PITTIE1937", "MEDANO1974", "MOCHIM1973", "GUACHA1975", "YACAMB1962", "GUATOP1958", "SNEVAD1952", "MARACA1973", "YURUBI1960", 
            "CHORRO1973", "HENRIP1937", "LAGUNA1974", "TACARI1974", "PERIJA1978", "SANEST1987", "DINDRA1988", "SIERRASL1988", "TEREPA1976", "PARAMOS1989", 
            "GUANAY1989", "AGUARO1974", "CINAGAS1991", "PISLAGO1994", "ELVALL1994", "TURUEP1996", "GUARA1998", "CUMARI1998", "JAUASA1978", "LANBLI1978", "YAPACA1978", 
            "DUIMAR1978", "PENINS1978", "CIENTR1978", "MANTLE1978", "CASCAD1981", "LARENG1985", "SIERRAA1986", "CAICARA1987", "DINIRA1988", "VILLABA1974", "TURIMQ1992", 
            "COPO1988", "ELAGUI1990", "LOSMAN1992", "LASDE1992", "LASAGU1996", "LOSSAI1996", "CARICU1996", "SABANA1997", "SANLUI1998", "ELVOLC1999", "ELHAT2000", "LAGOL2000", 
            "ELPALO2000", "GUAMOL2001", "LAGUNA1974", "LOSCHU1989", "LASBCA1990", "MANTEN1995", "ELPIN1995", "MAIZAL1995", "YUMER1996"};
        int[] PM = {250, 150, 90, 40,35, 189, 21, 
            142, 77, 203, 9, 165, 48, 221, 102, 13, 198, 
            60, 245, 84, 117, 2, 230, 71, 155, 38, 209, 93, 178, 
            5, 126, 25, 215, 68, 149, 11, 192, 54, 239, 81, 169, 44, 200, 7, 134, 
            29, 225, 98, 183, 16, 110, 3, 241, 75, 158, 41, 218, 86, 172, 51, 138, 20, 
            206, 63, 145, 32, 235, 105, 195, 57};
        Start Example = new Start();
        Example.setPPM(PM);
        Example.setCode(AlphaCoder);
        Example.Clasificacion();
        String[] classifications = Example.getClasificacion();
        String Impresion = AlphaNumber.getText();
        
        String Println = Select.Search(Name, AlphaCoder, classifications, Impresion);
        JOptionPane.showMessageDialog(null, Println);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ShowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowsActionPerformed
        // TODO add your handling code here:
        String[] AlphaCoder = {"Tach334", "Delta556", "Boli779", "Zeta880","AVILA1958", "CANAIMA1962", "MORROCOY1974", 
            "ROQUES1972", "PITTIE1937", "MEDANO1974", "MOCHIM1973", "GUACHA1975", "YACAMB1962", "GUATOP1958", "SNEVAD1952", "MARACA1973", "YURUBI1960", 
            "CHORRO1973", "HENRIP1937", "LAGUNA1974", "TACARI1974", "PERIJA1978", "SANEST1987", "DINDRA1988", "SIERRASL1988", "TEREPA1976", "PARAMOS1989", 
            "GUANAY1989", "AGUARO1974", "CINAGAS1991", "PISLAGO1994", "ELVALL1994", "TURUEP1996", "GUARA1998", "CUMARI1998", "JAUASA1978", "LANBLI1978", "YAPACA1978", 
            "DUIMAR1978", "PENINS1978", "CIENTR1978", "MANTLE1978", "CASCAD1981", "LARENG1985", "SIERRAA1986", "CAICARA1987", "DINIRA1988", "VILLABA1974", "TURIMQ1992", 
            "COPO1988", "ELAGUI1990", "LOSMAN1992", "LASDE1992", "LASAGU1996", "LOSSAI1996", "CARICU1996", "SABANA1997", "SANLUI1998", "ELVOLC1999", "ELHAT2000", "LAGOL2000", 
            "ELPALO2000", "GUAMOL2001", "LAGUNA1974", "LOSCHU1989", "LASBCA1990", "MANTEN1995", "ELPIN1995", "MAIZAL1995", "YUMER1996"};
        int[] PM = {250, 150, 90, 40,35, 189, 21, 
            142, 77, 203, 9, 165, 48, 221, 102, 13, 198, 
            60, 245, 84, 117, 2, 230, 71, 155, 38, 209, 93, 178, 
            5, 126, 25, 215, 68, 149, 11, 192, 54, 239, 81, 169, 44, 200, 7, 134, 
            29, 225, 98, 183, 16, 110, 3, 241, 75, 158, 41, 218, 86, 172, 51, 138, 20, 
            206, 63, 145, 32, 235, 105, 195, 57};
        Start Example = new Start();
        Example.setPPM(PM);
        Example.setCode(AlphaCoder);
        Example.Clasificacion();
        String[] classifications = Example.getClasificacion();
        String Value = Select.PercentageClasificacion(classifications);
        JOptionPane.showMessageDialog(null, Value);
    }//GEN-LAST:event_ShowsActionPerformed

    private void IngresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresaActionPerformed
        // TODO add your handling code here:
        String[] Name = {"Parque Tachira","Parque DeltaAMacuro","Parque Bolivar","Parque Zeta",
        "Ávila", "Canaima"};
        String[] AlphaCoder = {"Tach334", "Delta556", "Boli779", "Zeta880","AVILA1958", "CANAIMA1962"};
        int[] PM = {300, 150, 90, 40,35, 189};
        String Executer = Statistics.Diferencial(PM, Name, AlphaCoder);
        ShowsB.setText(Executer);
    }//GEN-LAST:event_IngresaActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new General().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlphaNumber;
    private javax.swing.JTextArea AreaRange;
    private javax.swing.JButton Ingresa;
    private javax.swing.JTextArea ListaDeParques;
    private javax.swing.JTextField Maximo;
    private javax.swing.JButton MinAndMax;
    private javax.swing.JTextField Minimo;
    private javax.swing.JButton RangeButton;
    private javax.swing.JButton Shows;
    private javax.swing.JTextArea ShowsB;
    private javax.swing.JTextArea Toxicos;
    private javax.swing.JButton VerPromedio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}