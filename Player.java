import java.util.Scanner;

public class Player extends Gamer{
    private Scanner scanner;
    public Player(String name){
        this.setName(name);
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int guess(int max, int min) {
        System.out.println("請輸入一個數字在"+ max + "~" +min + "之間");
        int ans = this.scanner.nextInt();
        if(ans>=max || ans<=min) {
            ans = guess(max, min);
        }
        return ans;
    }


    
}
