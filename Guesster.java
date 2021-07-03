import java.util.Random;

public class Guesster {
    private Random guesster;
    public Guesster(){
        this.guesster = new Random(); 
    }

    //產生隨機數
    public int gen_random_int(int max, int min){
        int range = max - min;
        int val = this.guesster.nextInt(range) + min;
        return val;        
    }    
    //產生隨機偶數
    public int gen_random_int_even(int max, int min){
        // if(max % 2 == 1) max -= 1;
        if(min % 2 == 1) min += 1; 
        int range = max - min;
        int val = ((int)(this.guesster.nextInt(range) + min ) / 2) * 2;
        return val;        
    }    
    //產生隨機奇數
    public int gen_random_int_odd(int max, int min){
        if(max % 2 == 0) max -= 1;
        int range = max - min;
        int val = ((int)(this.guesster.nextInt(range) + min ) / 2) * 2 + 1;
        // System.out.println("產生隨機基數" + max + "~" + min + "~" + val);
        return val;        
    }    
}
