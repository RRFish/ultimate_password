public abstract class Gamer {
    private String name;
    public abstract int guess(int max, int min);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    

}
