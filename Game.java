public class Game {
    Gamer p1;
    Gamer p2;
    Guesster gameGu;
    int min;
    int max;
    int ans;
    public Game(Gamer p1, Gamer p2, int max, int min){
        this.p1 = p1;
        this.p2 = p2;
        this.gameGu = new Guesster();
        this.max = max;
        this.min = min;

    }

    // 產生答案
    public void gen_ans(){
        this.ans = this.gameGu.gen_random_int(this.max, this.min);
    }



    // 循環猜測
    public Gamer circleGuess(Gamer p1, Gamer p2, int max, int min){
        System.out.println("目前範圍為:" + max + "~" + min);
        int p1Ans = p1.guess(max, min);
        if(p1Ans == this.ans){
            System.out.println("玩家:" + p1.getName() + "猜中答案" + p1Ans);
            return p1;
        }

        if(p1Ans > ans ){
            max = p1Ans;
        }else{
            min = p1Ans;
        }
        System.out.println("玩家:" + p1.getName() + "猜錯, " + p1Ans);

        return this.circleGuess(p2, p1, max, min);
        
    }

    // 開始遊戲
    public void startGame(){
        //產生新答案
        this.gen_ans();
        Gamer winner = this.circleGuess(this.p1, this.p2, this.max, this.min);
        System.out.println("遊戲勝出者是" + winner.getName());
    }
}
