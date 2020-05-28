package sample.Metods;

public class Adapter implements Adaptee {
    Client pr;
    int maxSize = 10;

    public Adapter() {
        pr = new Client();
    }

    public String displ() {
        return pr.display1();
    }

    @Override
    public void inSert(long item) {
        pr.insert(item);
    }

    @Override
    public long poisk() {
        return pr.peekMin();
    }

    @Override
    public long Remuve() {
        return pr.remove();
    }

}