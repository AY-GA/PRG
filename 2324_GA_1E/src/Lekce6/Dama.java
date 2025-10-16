/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lekce6;

/**
 *
 * @author ali.yunussov.s
 */
public class Dama {
    private int[][] sachovnice = new int[8][8];
    
/* 0 1 2 3 4 5 6 7
0    x   x   x   x
1  x   x   x   x
2
3
4
5
6    o   o   o   o
7  o   o   o   o
*/

    public Dama() {
        for(int i = 0; i < 8; i += 2){
            sachovnice[7][0 + i] = 1;
            sachovnice[6][1 + i] = 1;
            sachovnice[1][0 + i] = -1;
            sachovnice[0][1 + i] = -1;
        }
    }
}
