
package proyectof_progra1;
    import java.util.*;
    import javax.swing.JOptionPane;
public class Connect4 {
    Random rd = new Random();
    
    boolean campeon=false;
    int turn;
    int x;
    int y;
    int[][] tab;
    
    public Connect4(){
        this.tab= new int[6][7];
        turn = 0;
    }
    
    public int[][] getTab() {
        return tab;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getTurn() {
        return turn;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setTab(int[][] tab) {
        this.tab = tab;
    }
    public void setTurn(int turn) {
        this.turn = turn;
    }

    public void c4(){
        options();
    }
    
    public void options(){
        //utilizar get y set para jalar codigo de option
        GUI_Proyecto visual = new GUI_Proyecto();
        visual.setVisible(true);
        visual.setBounds(500, 10, 511, 377);
        turn=0;
    }
    
    public void play(int option){

        if (option==1) {
            if (turn%2!=0) {
                System.out.println("Turno jugador 1");
                jugador1();
                print(tab,0,0);
            }else{
                System.out.println("Turno jugador 2");
                jugador2();
                print(tab,0,0);
            }
        }else if((option==0)){
            if (turn%2!=0) {
                System.out.println("Turno jugador 1");
                jugador1();
                print(tab,0,0);
                System.out.println("-----------------");
            }else{
                System.out.println("Turno AI");
                AI();
                print(tab,0,0);
                System.out.println("-----------------");
            }
        }
        if (turn>=8) {
                System.out.println("-------------");
                System.out.println(x+" :x");
                System.out.println(y+" :y");
                System.out.println("-------------");
                campeon=Ver(tab,x,y);
        }
    }    
    public void jugador1(){
        String[] opc = {"1","2","3","4","5","6","7"};
        int columna = JOptionPane.showOptionDialog(null, "Ingrese su movimiento Jugador 1: "
                , "Connect4", 0, 3, null, opc, opc[0]);
        
        boolean found=false;
        while(found==false){
            for (int i = 5; i >= 0 && found==false; i--) {
                if (tab[i][columna]==0) {
                    found=true;
                    setY(i);
                    setX(columna); 
                    //y=i;
                    //x=columna;
                    tab[y][x]=1;
                    
                }
            }
            if (found==false) {
                columna = JOptionPane.showOptionDialog(null, "Movimiento Invalido Ingrese denuevo: "
                , "Connect4", 0, 3, null, opc, opc[0]);
            }
        }
        
    }
    public void jugador2(){
        String[] opc = {"1","2","3","4","5","6","7"};
        int columna = JOptionPane.showOptionDialog(null, "Ingrese su movimiento Jugador 2: "
                , "Connect4", 0, 3, null, opc, opc[0]);
        boolean found=false;
        while(found==false){
            for (int i = 5; i >= 0 && found==false; i--) {
                if (tab[i][columna]==0) {
                    found=true;
                    setY(i);
                    setX(columna);
                    //y=i;
                    //x=columna;
                    tab[y][x]=2;
                }
            }
            if (found==false) {
                columna = JOptionPane.showOptionDialog(null, "Movimiento Invalido Ingrese denuevo: "
                , "Connect4", 0, 3, null, opc, opc[0]);
            }
        }
    }
    
    public void AI(){
        int columna = rd.nextInt(7);
        boolean found=false;
        while(found==false){
            for (int i = 5; i >= 0 && found==false; i--) {
                if (tab[i][columna]==0) {
                    found=true;
                    setY(i);
                    setX(columna);
                    //y=i;
                    //x=columna;
                    tab[y][x]=2;
                }
            }
            if (found==false) {
                columna = rd.nextInt(7);
            }
        }
    }
    public boolean Ver(int[][] mat, int x, int y) {
        ArrayList<Integer> pos = pos(tab,x,y);
        int diaP1=0,diaP2=0,diaN1 = 0,diaN2 = 0,rectH1=0,rectH2=0,rectV=0;
        int cont=0;
        for (int i = 0; i < pos.size(); i++) {
            int win = pos.get(i);
            boolean proximity=true;
            if (win==2||win==6) {
                cont++;
            }
            if (win==1) {
                for (int j = 0; j < 4 &&  proximity==true; j++) {
                    if (mat[y][x]==mat[y-j][x+j]) {
                        diaP1++;
                    }else{
                        proximity=false;
                    }
                    
                }
            }else if(win==2) {
                for (int j = 0; j < 4 && proximity==true ; j++) {
                    if (mat[y][x]==mat[y][x+j]) {
                        rectH1++; 

                    }else{
                        proximity=false;
                    }
                    
                }
            }else if(win==3) {
                for (int j =0; j < 4&& proximity==true; j++) {
                    if (mat[y][x]==mat[y+j][x+j]) {
                        diaN1++; 
                    }else{
                        proximity=false;
                    }
                    
                }
            }else if(win==4) {
                for (int j = 0; j < 4 && proximity==true; j++) {
                    if (mat[y][x]==mat[y+j][x]) {
                        rectV++; 
                    }else{
                        proximity=false;
                    }
                    
                }
            }else if(win==5) {
                for (int j = 0; j < 4 && proximity==true; j++) {
                    if (mat[y][x]==mat[y+j][x-j] ) {
                        diaP2++; 
                    }else{
                        proximity=false;
                    }
                    
                }
            }else if(win==6) {
                for (int j = 0; j < 4 && proximity==true; j++) {
                    if (mat[y][x]==mat[y][x-j]) {
                        rectH2++; 
                    }else{
                        proximity=false;
                    }
                    
                }
            }else if(win==7) {
                for (int j = 0; j < 4 && proximity==true; j++) {
                    if (mat[y][x]==mat[y-j][x-j]) {
                        diaN2++; 
                    }else{
                        proximity=false;
                    }
                }
            }
            
        }
        
        int diaP= diaP1+diaP2 ;
        int diaN = diaN1+diaN2;
        int rectH= rectH1+rectH2;

         
        if (diaN<4&&diaP<4&&rectH<4) {
            int[] rem = {4-diaN,4-diaP,4-rectH};
            int menor=4;
            int posM=0; 
            for (int i = 0; i < rem.length; i++) {
                if (rem[i]<menor) {
                    menor=rem[i];
                    posM=i;
                }
            }
            System.out.println(diaP);
            System.out.println(diaN);
            System.out.println(rectH);
            System.out.println("----------------");
            if (posM==0) {
                if (diaN1==0 && mat.length-x>=menor && mat.length-1-y>=menor) {
                    for (int i = 0; i < menor; i++) {
                        if (mat[y][x]==mat[y+i][x+i]) {
                            diaN++;
                        }
                    }    
                }else if (diaN2==0&& x>=menor && mat.length-1-y>menor){
                    for (int i = 0; i < menor; i++) {
                        if (mat[y][x]==mat[y-i][x-i]) {
                            diaN++;
                        }
                    }
                }
                
            }else if(posM==1) {
                if (diaP1==0 && mat.length-x>=menor && y>menor) {
                    for (int i = 0; i < menor; i++) {
                        if (mat[y][x]==mat[y-i][x+i]) {
                            diaP++;
                        }
                    }    
                }else if (diaP2==0&&x>=menor && mat.length-1-y>=menor){
                    for (int i = 0; i < menor; i++) {
                        if (mat[y][x]==mat[y+i][x-i]) {
                            diaP++;
                        }
                    }
                }
            }else if(posM==2 && y!=0) {
                if (rectH1==0&mat.length-x>=menor) {
                    for (int i = 0; i < menor; i++) {
                        if (mat[y][x]==mat[y][x+i]) {
                            rectH++;
                        }
                    }    
                }else if (rectH2==0&&x>=menor){
                    for (int i = 0; i < menor; i++) {
                        if (mat[y][x]==mat[y][x-i]) {
                            rectH++;
                        }
                    }
                }
            }
        }
        if (cont==2) {
            rectH-=1;
        }
        System.out.println(diaP);
        System.out.println(diaN);
        System.out.println(rectH);
        if (diaN>=4||diaP>=4||rectH>=4||rectV>=4) {
            return true;
        }else{
            return false;
        }
       
    }//hector
    public ArrayList<Integer> pos(int[][] mat, int x, int y) {
        ArrayList<Integer> pos = new ArrayList<Integer>();
        if (mat.length-x>=3 && y>=3) {//diagonal positiva
            pos.add(1);
        }
        if (mat.length-x<=3) {//recta horizontal positiva
            pos.add(2);
        } 
        if (mat.length-x>=3 && mat.length-1-y>=3) {//diagonal inversa negativa 
            pos.add(3);
        }
        if (mat.length-1-y>=3) {//recta vertical 
            pos.add(4);
        }
        if (x>=3 && mat.length-1-y>=3) {//diagonal Abajo negativa 
            pos.add(5);
        }
        if (x>=3) {//recta horizontal negativa 
            pos.add(6);
        }
        if (x>=3 && y>=3) {//diagonal Arriba negativa
            pos.add(7);
        }
        return pos;
    }//hector
    public void flip(){
        
        int chance = rd.nextInt(101);
        ArrayList<Integer> flip = new ArrayList<Integer>();
        
        if (chance<5) {
            boolean ver = true;
            for (int i = 0; i<6 ; i++) {
                if (tab[tab.length-1-i][x]==0) {
                }else{
                    flip.add(tab[tab.length-1-i][x]);
                }
                    
            }
            int cont=0;
            for (int i = tab.length-flip.size(); i <= tab.length-1; i++) {
                int num = flip.get(cont);
                tab[i][x]= num;
                cont++;
            }
            JOptionPane.showMessageDialog(null, "Hubo un flip en"+x);
            System.out.println("-------------------");
            print(tab,0,0);
            System.out.println("-------------------");
        }
    }

    /*public void print(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(" ["+x[i][j]+"] ");
            }
            System.out.println("");
        }
    }*/
    public static void print(int[][] mat, int fila, int col) {
        if (fila == mat.length) {
            return;
        }
        System.out.print(mat[fila][col] + " ");
        
        if (col == mat.length) {
            System.out.println();
            print(mat, fila + 1, 0);
            
        }else{
            print(mat, fila, col + 1);
        }
        
    }
    
    
}
