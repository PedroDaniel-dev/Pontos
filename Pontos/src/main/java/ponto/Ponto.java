package ponto;

public class Ponto implements Comparable<Ponto>{
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Ponto outro) {
        if (this.getX() > outro.getX()) return 1;
        if (this.getX() < outro.getX()) return -1;
        if (this.getY() > outro.getY()) return 1;
        if (this.getY() < outro.getY()) return -1;

        return 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
