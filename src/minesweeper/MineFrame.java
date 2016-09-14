package minesweeper;
import javax.swing.JToggleButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MineFrame extends javax.swing.JFrame {

    final int wid=10, hei=10, noMines=10;
    
    JToggleButton[][]blocks=new JToggleButton[hei][wid];
    int[][]block = new int[hei][wid];
    
    ActionListener listen = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            int i=0, j=0;
            boolean found = false;
            for(i=0; i<hei; i++){
                
                for(j=0; j<wid; j++){
                    if(e.getSource() == blocks[i][j]){
                        found = true;
                        break;
                    }                   
                }
                if(found) break;
            }
            blocks[i][j].setSelected(true);
        }
    };
    public MineFrame() {
        initComponents();
        
        for(int i=0; i<hei; i++){
            for(int j=0; j<wid; j++){
                blocks[i][j]= new JToggleButton();
                blocks[i][j].setSize(jPanel1.getWidth()/wid ,jPanel1.getHeight()/hei);
                jPanel1.add(blocks[i][j]);
                blocks[i][j].setLocation(j*jPanel1.getWidth()/wid , i*jPanel1.getHeight()/hei);
                blocks[i][j].addActionListener(listen);
                
            }
            
                
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Minesweeper");

        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentResized(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void rsize(){
        for(int i=0; i<hei; i++){
            for(int j=0; j<wid; j++){
                blocks[i][j].setSize(jPanel1.getWidth()/wid, jPanel1.getHeight()/hei);
                jPanel1.add(blocks[i][j]);
                blocks[i][j].setLocation(j*jPanel1.getWidth()/wid , i*jPanel1.getHeight()/hei);
                
            }
            
                
        }
    }
    private void jPanel1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentResized
        rsize();
    }//GEN-LAST:event_jPanel1ComponentResized



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
