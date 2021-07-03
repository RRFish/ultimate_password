public class EvenAI extends Gamer{
    private Guesster guesster;
    public EvenAI(String name){
        this.setName(name);
        this.guesster = new Guesster(); 
    }

    @Override
    public int guess(int max, int min) {
        return this.guesster.gen_random_int_even(max, min);
    }


    
}
