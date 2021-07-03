public class OddAI extends Gamer{
    private Guesster guesster;
    public OddAI(String name){
        this.setName(name);
        this.guesster = new Guesster(); 
    }

    @Override
    public int guess(int max, int min) {
        return this.guesster.gen_random_int_odd(max, min);
    }


    
}
