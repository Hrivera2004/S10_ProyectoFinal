/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectof_progra1;

import java.awt.Color;

/**
 *
 * @author rolriverav
 */
public class GamePlay extends javax.swing.JFrame {
    Connect4 game = new Connect4();
    
    public GamePlay() {
        initComponents();
        
        int x=game.getX();
        int y=game.getY();
       if (y==5){
            if (x==0) {
                if(game.turn%2!=0){
                    //XY.
                    XY.setBackground(Color.red);
                }else{
                    //XY
                    XY.setBackground(Color.yellow);
                    
                }
            }else if(x==1){
                if(game.turn%2!=0){
                    //XY1
                    XY.setBackground(Color.red);
                }else{
                    //XY1
                    XY.setBackground(Color.yellow);
                    
                }
                
            }else if(x==2){
                if(game.turn%2!=0){
                    //XY2
                    XY2.setBackground(Color.red);
                }else{
                    //XY2
                    XY2.setBackground(Color.yellow);
                    
                }
                
            }else if(x==3){
                if(game.turn%2!=0){
                    //XY3
                    XY3.setBackground(Color.red);
                }else{
                    //XY3
                    XY3.setBackground(Color.yellow);
                    
                }
                
            }else if(x==4){
                if(game.turn%2!=0){
                    //XY4
                    XY4.setBackground(Color.red);
                }else{
                    //XY4
                    XY4.setBackground(Color.yellow);
                    
                }
                
            }else if(x==5){
                if(game.turn%2!=0){
                    //XY5
                    XY5.setBackground(Color.red);
                }else{
                    //XY5
                    XY5.setBackground(Color.yellow);
                    
                }
                
            }else if(x==6){
                if(game.turn%2!=0){
                    //XY6
                    XY6.setBackground(Color.red);
                }else{
                    //XY6
                    XY6.setBackground(Color.yellow);
                    
                }
            }
        }else if (y==4){
            if (x==0) {
                if(game.turn%2!=0){
                    //XY7.
                }else{
                    //XY7.
                }
            }else if(x==1){
                if(game.turn%2!=0){
                    //XY8
                    XY8.setBackground(Color.red);
                }else{
                    //XY8
                    XY8.setBackground(Color.yellow);
                    
                }
                
            }else if(x==2){
                if(game.turn%2!=0){
                    //XY9
                    XY9.setBackground(Color.red);
                }else{
                    //XY9
                    XY9.setBackground(Color.yellow);
                    
                }
                
            }else if(x==3){
                if(game.turn%2!=0){
                    //XY10
                    XY10.setBackground(Color.red);
                }else{
                    //XY9
                    XY10.setBackground(Color.yellow);
                    
                }
                XY10.setText("O");
                
            }else if(x==4){
                if(game.turn%2!=0){
                    //XY11.
                    XY10.setBackground(Color.red);
                }else{
                    //XY11
                    XY11.setBackground(Color.yellow);
                    
                }
                
            }else if(x==5){
                if(game.turn%2!=0){
                    //XY12
                    XY12.setBackground(Color.red);
                }else{
                    //XY12
                    XY12.setBackground(Color.yellow);
                    
                }
                XY12.setText("O");
            }else if(x==6){
                if(game.turn%2!=0){
                    //XY13.
                     XY13.setBackground(Color.red);
                }else{
                    //XY13.
                     XY13.setBackground(Color.red);
                }

            }
        }else if (y==3){
            if (x==0) {
               if(game.turn%2!=0){
                    //XY14.
                     XY14.setBackground(Color.red);
                }else{
                    //XY13.
                     XY14.setBackground(Color.red);
                }
            }else if(x==1){
                if(game.turn%2!=0){
                    //XY15
                     XY15.setBackground(Color.red);
                }else{
                    //XY15
                     XY15.setBackground(Color.red);
                }
                
            }else if(x==2){
                if(game.turn%2!=0){
                    //XY16
                     XY16.setBackground(Color.red);
                }else{
                    //XY13.
                     XY16.setBackground(Color.red);
                }
                
            }else if(x==3){
                if(game.turn%2!=0){
                    //XY17
                     XY17.setBackground(Color.red);
                }else{
                    //XY17
                     XY17.setBackground(Color.red);
                }
                
            }else if(x==4){
                if(game.turn%2!=0){
                    //XY18
                     XY18.setBackground(Color.red);
                }else{
                    //XY18
                     XY18.setBackground(Color.red);
                }
                
            }else if(x==5){
                if(game.turn%2!=0){
                    //XY19
                     XY19.setBackground(Color.red);
                }else{
                    //XY19.
                     XY19.setBackground(Color.red);
                }

                
            }else if(x==6){
                if(game.turn%2!=0){
                    //XY20
                     XY20.setBackground(Color.red);
                }else{
                    //XY20.
                     XY20.setBackground(Color.red);
                }
   
                
            }
        }else if (y==2){
            if (x==0) {
                if(game.turn%2!=0){
                    //XY21.
                    XY21.setBackground(Color.red);
                }else{
                    //XY21.
                    XY21.setBackground(Color.yellow);
                }
 
            }else if(x==1){
                if(game.turn%2!=0){
                    //XY22
                    XY22.setBackground(Color.red);
                }else{
                    //XY22
                    XY22.setBackground(Color.yellow);
                }
  
                
            }else if(x==2){
                if(game.turn%2!=0){
                    //XY23.
                    XY23.setBackground(Color.red);
                }else{
                    //XY23
                    XY23.setBackground(Color.yellow);
                }
   
                
            }else if(x==3){
                if(game.turn%2!=0){
                    //XY24.
                    XY24.setBackground(Color.red);
                }else{
                    //XY24
                    XY24.setBackground(Color.yellow);
                }
  
                
            }else if(x==4){
                if(game.turn%2!=0){
                    //XY25
                    XY25.setBackground(Color.red);
                }else{
                    //XY25
                    XY25.setBackground(Color.yellow);
                }
       
                
            }else if(x==5){
                if(game.turn%2!=0){
                    //XY26
                    XY26.setBackground(Color.red);
                }else{
                    //XY26
                    XY26.setBackground(Color.yellow);
                }
   
                
            }else if(x==6){
                if(game.turn%2!=0){
                    //XY27
                    XY27.setBackground(Color.red);
                }else{
                    //XY27
                    XY27.setBackground(Color.yellow);
                }

                
            }
        }else if (y==1){
            if (x==0) {
                if(game.turn%2!=0){
                    //XY28.
                     XY28.setBackground(Color.red);
                }else{
                    //XY28.
                     XY28.setBackground(Color.red);
                }

            }else if(x==1){
                 if(game.turn%2!=0){
                    //XY29
                     XY29.setBackground(Color.red);
                }else{
                    //XY29
                     XY29.setBackground(Color.red);
                }

                
            }else if(x==2){
                 if(game.turn%2!=0){
                    //XY30
                     XY30.setBackground(Color.red);
                }else{
                    //XY30
                     XY30.setBackground(Color.red);
                }

                
            }else if(x==3){
                 if(game.turn%2!=0){
                    //XY31
                     XY31.setBackground(Color.red);
                }else{
                    //XY31
                     XY31.setBackground(Color.red);
                }

                
            }else if(x==4){
                 if(game.turn%2!=0){
                    //XY32
                     XY32.setBackground(Color.red);
                }else{
                    //XY32
                     XY32.setBackground(Color.red);
                }

                
            }else if(x==5){
                 if(game.turn%2!=0){
                    //XY33
                     XY33.setBackground(Color.red);
                }else{
                    //XY33
                     XY33.setBackground(Color.red);
                }

                
            }else if(x==6){
                 if(game.turn%2!=0){
                    //XY34
                     XY34.setBackground(Color.red);
                }else{
                    //XY34
                     XY34.setBackground(Color.red);
                }

                
            }
        }else if (y==1){
            if (x==0) {
                if(game.turn%2!=0){
                    //XY35.
                    XY35.setBackground(Color.red);
                }else{
                    //XY35.
                    XY35.setBackground(Color.yellow);
                }

            }else if(x==1){
                if(game.turn%2!=0){
                    //XY36
                    XY36.setBackground(Color.red);
                }else{
                    //XY36
                    XY36.setBackground(Color.yellow);
                }

                
            }else if(x==2){
                if(game.turn%2!=0){
                    //XY37
                    XY37.setBackground(Color.red);
                }else{
                    //XY37
                    XY37.setBackground(Color.yellow);
                }

                
            }else if(x==3){
                if(game.turn%2!=0){
                    //XY38
                    XY38.setBackground(Color.red);
                }else{
                    //XY38
                    XY38.setBackground(Color.yellow);
                }
                
            }else if(x==4){
                if(game.turn%2!=0){
                    //XY39
                    XY39.setBackground(Color.red);
                }else{
                    //XY39
                    XY39.setBackground(Color.yellow);
                }
                
            }else if(x==5){
                if(game.turn%2!=0){
                    //XY40
                    XY40.setBackground(Color.red);
                }else{
                    //XY40
                    XY40.setBackground(Color.yellow);
                }
                
            }else if(x==6){
                if(game.turn%2!=0){
                    //XY41
                    XY41.setBackground(Color.red);
                }else{
                    //XY41
                    XY41.setBackground(Color.yellow);
                }
                
            }
        }

    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        XY35 = new javax.swing.JTextField();
        XY36 = new javax.swing.JTextField();
        XY37 = new javax.swing.JTextField();
        XY38 = new javax.swing.JTextField();
        XY39 = new javax.swing.JTextField();
        XY40 = new javax.swing.JTextField();
        XY41 = new javax.swing.JTextField();
        XY28 = new javax.swing.JTextField();
        XY29 = new javax.swing.JTextField();
        XY30 = new javax.swing.JTextField();
        XY31 = new javax.swing.JTextField();
        XY32 = new javax.swing.JTextField();
        XY33 = new javax.swing.JTextField();
        XY34 = new javax.swing.JTextField();
        XY21 = new javax.swing.JTextField();
        XY22 = new javax.swing.JTextField();
        XY23 = new javax.swing.JTextField();
        XY24 = new javax.swing.JTextField();
        XY25 = new javax.swing.JTextField();
        XY26 = new javax.swing.JTextField();
        XY27 = new javax.swing.JTextField();
        XY14 = new javax.swing.JTextField();
        XY15 = new javax.swing.JTextField();
        XY16 = new javax.swing.JTextField();
        XY17 = new javax.swing.JTextField();
        XY18 = new javax.swing.JTextField();
        XY19 = new javax.swing.JTextField();
        XY20 = new javax.swing.JTextField();
        XY7 = new javax.swing.JTextField();
        XY8 = new javax.swing.JTextField();
        XY9 = new javax.swing.JTextField();
        XY10 = new javax.swing.JTextField();
        XY11 = new javax.swing.JTextField();
        XY12 = new javax.swing.JTextField();
        XY13 = new javax.swing.JTextField();
        XY = new javax.swing.JTextField();
        XY1 = new javax.swing.JTextField();
        XY2 = new javax.swing.JTextField();
        XY3 = new javax.swing.JTextField();
        XY4 = new javax.swing.JTextField();
        XY5 = new javax.swing.JTextField();
        XY6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(466, 494));
        setResizable(false);
        getContentPane().setLayout(null);

        XY35.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY35.setActionCommand("<Not Set>");
        XY35.setBorder(null);
        XY35.setFocusable(false);
        getContentPane().add(XY35);
        XY35.setBounds(30, 80, 30, 30);

        XY36.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY36.setActionCommand("<Not Set>");
        XY36.setBorder(null);
        XY36.setFocusable(false);
        getContentPane().add(XY36);
        XY36.setBounds(90, 80, 30, 30);

        XY37.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY37.setActionCommand("<Not Set>");
        XY37.setBorder(null);
        XY37.setFocusable(false);
        getContentPane().add(XY37);
        XY37.setBounds(160, 80, 30, 30);

        XY38.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY38.setActionCommand("<Not Set>");
        XY38.setBorder(null);
        XY38.setFocusable(false);
        getContentPane().add(XY38);
        XY38.setBounds(220, 80, 30, 30);

        XY39.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY39.setActionCommand("<Not Set>");
        XY39.setBorder(null);
        XY39.setFocusable(false);
        getContentPane().add(XY39);
        XY39.setBounds(280, 80, 30, 30);

        XY40.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY40.setActionCommand("<Not Set>");
        XY40.setBorder(null);
        XY40.setFocusable(false);
        getContentPane().add(XY40);
        XY40.setBounds(350, 80, 30, 30);

        XY41.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY41.setActionCommand("<Not Set>");
        XY41.setBorder(null);
        XY41.setFocusable(false);
        getContentPane().add(XY41);
        XY41.setBounds(410, 80, 30, 30);

        XY28.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY28.setActionCommand("<Not Set>");
        XY28.setBorder(null);
        XY28.setFocusable(false);
        getContentPane().add(XY28);
        XY28.setBounds(30, 130, 30, 30);

        XY29.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY29.setActionCommand("<Not Set>");
        XY29.setBorder(null);
        XY29.setFocusable(false);
        getContentPane().add(XY29);
        XY29.setBounds(90, 130, 30, 30);

        XY30.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY30.setActionCommand("<Not Set>");
        XY30.setBorder(null);
        XY30.setFocusable(false);
        getContentPane().add(XY30);
        XY30.setBounds(160, 130, 30, 30);

        XY31.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY31.setActionCommand("<Not Set>");
        XY31.setBorder(null);
        XY31.setFocusable(false);
        getContentPane().add(XY31);
        XY31.setBounds(220, 130, 30, 30);

        XY32.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY32.setActionCommand("<Not Set>");
        XY32.setBorder(null);
        XY32.setFocusable(false);
        getContentPane().add(XY32);
        XY32.setBounds(280, 130, 30, 30);

        XY33.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY33.setActionCommand("<Not Set>");
        XY33.setBorder(null);
        XY33.setFocusable(false);
        getContentPane().add(XY33);
        XY33.setBounds(350, 130, 30, 30);

        XY34.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY34.setActionCommand("<Not Set>");
        XY34.setBorder(null);
        XY34.setFocusable(false);
        getContentPane().add(XY34);
        XY34.setBounds(410, 130, 30, 30);

        XY21.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY21.setActionCommand("<Not Set>");
        XY21.setBorder(null);
        XY21.setFocusable(false);
        getContentPane().add(XY21);
        XY21.setBounds(30, 190, 30, 30);

        XY22.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY22.setActionCommand("<Not Set>");
        XY22.setBorder(null);
        XY22.setFocusable(false);
        getContentPane().add(XY22);
        XY22.setBounds(90, 190, 30, 30);

        XY23.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY23.setActionCommand("<Not Set>");
        XY23.setBorder(null);
        XY23.setFocusable(false);
        getContentPane().add(XY23);
        XY23.setBounds(160, 190, 30, 30);

        XY24.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY24.setActionCommand("<Not Set>");
        XY24.setBorder(null);
        XY24.setFocusable(false);
        getContentPane().add(XY24);
        XY24.setBounds(220, 190, 30, 30);

        XY25.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY25.setActionCommand("<Not Set>");
        XY25.setBorder(null);
        XY25.setFocusable(false);
        getContentPane().add(XY25);
        XY25.setBounds(280, 190, 30, 30);

        XY26.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY26.setActionCommand("<Not Set>");
        XY26.setBorder(null);
        XY26.setFocusable(false);
        getContentPane().add(XY26);
        XY26.setBounds(350, 190, 30, 30);

        XY27.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY27.setActionCommand("<Not Set>");
        XY27.setBorder(null);
        XY27.setFocusable(false);
        getContentPane().add(XY27);
        XY27.setBounds(410, 190, 30, 30);

        XY14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY14.setActionCommand("<Not Set>");
        XY14.setBorder(null);
        XY14.setFocusable(false);
        getContentPane().add(XY14);
        XY14.setBounds(30, 240, 30, 30);

        XY15.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY15.setActionCommand("<Not Set>");
        XY15.setBorder(null);
        XY15.setFocusable(false);
        getContentPane().add(XY15);
        XY15.setBounds(90, 240, 30, 30);

        XY16.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY16.setActionCommand("<Not Set>");
        XY16.setBorder(null);
        XY16.setFocusable(false);
        getContentPane().add(XY16);
        XY16.setBounds(160, 240, 30, 30);

        XY17.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY17.setActionCommand("<Not Set>");
        XY17.setBorder(null);
        XY17.setFocusable(false);
        getContentPane().add(XY17);
        XY17.setBounds(220, 240, 30, 30);

        XY18.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY18.setActionCommand("<Not Set>");
        XY18.setBorder(null);
        XY18.setFocusable(false);
        getContentPane().add(XY18);
        XY18.setBounds(280, 240, 30, 30);

        XY19.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY19.setActionCommand("<Not Set>");
        XY19.setBorder(null);
        XY19.setFocusable(false);
        getContentPane().add(XY19);
        XY19.setBounds(350, 240, 30, 30);

        XY20.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY20.setActionCommand("<Not Set>");
        XY20.setBorder(null);
        XY20.setFocusable(false);
        getContentPane().add(XY20);
        XY20.setBounds(410, 240, 30, 30);

        XY7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY7.setActionCommand("<Not Set>");
        XY7.setBorder(null);
        XY7.setFocusable(false);
        getContentPane().add(XY7);
        XY7.setBounds(30, 300, 30, 30);

        XY8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY8.setActionCommand("<Not Set>");
        XY8.setBorder(null);
        XY8.setFocusable(false);
        getContentPane().add(XY8);
        XY8.setBounds(90, 300, 30, 30);

        XY9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY9.setActionCommand("<Not Set>");
        XY9.setBorder(null);
        XY9.setFocusable(false);
        getContentPane().add(XY9);
        XY9.setBounds(160, 300, 30, 30);

        XY10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY10.setActionCommand("<Not Set>");
        XY10.setBorder(null);
        XY10.setFocusable(false);
        getContentPane().add(XY10);
        XY10.setBounds(220, 300, 30, 30);

        XY11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY11.setActionCommand("<Not Set>");
        XY11.setBorder(null);
        XY11.setFocusable(false);
        getContentPane().add(XY11);
        XY11.setBounds(280, 300, 30, 30);

        XY12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY12.setActionCommand("<Not Set>");
        XY12.setBorder(null);
        XY12.setFocusable(false);
        getContentPane().add(XY12);
        XY12.setBounds(350, 300, 30, 30);

        XY13.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY13.setActionCommand("<Not Set>");
        XY13.setBorder(null);
        XY13.setFocusable(false);
        getContentPane().add(XY13);
        XY13.setBounds(410, 300, 30, 30);

        XY.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY.setActionCommand("<Not Set>");
        XY.setBorder(null);
        XY.setFocusable(false);
        getContentPane().add(XY);
        XY.setBounds(30, 350, 30, 30);

        XY1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY1.setActionCommand("<Not Set>");
        XY1.setBorder(null);
        XY1.setFocusable(false);
        getContentPane().add(XY1);
        XY1.setBounds(90, 350, 30, 30);

        XY2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY2.setActionCommand("<Not Set>");
        XY2.setBorder(null);
        XY2.setFocusable(false);
        getContentPane().add(XY2);
        XY2.setBounds(160, 350, 30, 30);

        XY3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY3.setActionCommand("<Not Set>");
        XY3.setBorder(null);
        XY3.setFocusable(false);
        getContentPane().add(XY3);
        XY3.setBounds(220, 350, 30, 30);

        XY4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY4.setActionCommand("<Not Set>");
        XY4.setBorder(null);
        XY4.setFocusable(false);
        getContentPane().add(XY4);
        XY4.setBounds(280, 350, 30, 30);

        XY5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY5.setActionCommand("<Not Set>");
        XY5.setBorder(null);
        XY5.setFocusable(false);
        getContentPane().add(XY5);
        XY5.setBounds(350, 350, 30, 30);

        XY6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        XY6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XY6.setActionCommand("<Not Set>");
        XY6.setBorder(null);
        XY6.setFocusable(false);
        getContentPane().add(XY6);
        XY6.setBounds(410, 350, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectof_progra1/Images/free-printable-connect-4-in-a-row-game.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 40, 490, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePlay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField XY;
    private javax.swing.JTextField XY1;
    private javax.swing.JTextField XY10;
    private javax.swing.JTextField XY11;
    private javax.swing.JTextField XY12;
    private javax.swing.JTextField XY13;
    private javax.swing.JTextField XY14;
    private javax.swing.JTextField XY15;
    private javax.swing.JTextField XY16;
    private javax.swing.JTextField XY17;
    private javax.swing.JTextField XY18;
    private javax.swing.JTextField XY19;
    private javax.swing.JTextField XY2;
    private javax.swing.JTextField XY20;
    private javax.swing.JTextField XY21;
    private javax.swing.JTextField XY22;
    private javax.swing.JTextField XY23;
    private javax.swing.JTextField XY24;
    private javax.swing.JTextField XY25;
    private javax.swing.JTextField XY26;
    private javax.swing.JTextField XY27;
    private javax.swing.JTextField XY28;
    private javax.swing.JTextField XY29;
    private javax.swing.JTextField XY3;
    private javax.swing.JTextField XY30;
    private javax.swing.JTextField XY31;
    private javax.swing.JTextField XY32;
    private javax.swing.JTextField XY33;
    private javax.swing.JTextField XY34;
    private javax.swing.JTextField XY35;
    private javax.swing.JTextField XY36;
    private javax.swing.JTextField XY37;
    private javax.swing.JTextField XY38;
    private javax.swing.JTextField XY39;
    private javax.swing.JTextField XY4;
    private javax.swing.JTextField XY40;
    private javax.swing.JTextField XY41;
    private javax.swing.JTextField XY5;
    private javax.swing.JTextField XY6;
    private javax.swing.JTextField XY7;
    private javax.swing.JTextField XY8;
    private javax.swing.JTextField XY9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
