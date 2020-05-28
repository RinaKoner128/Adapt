package sample.Metods;


public class Client {
    private int maxSize;
    private long[] queArray;
    private int nItems;

    public Client() {
        maxSize = 10;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item) {
        int j;
        if (nItems == 0)
            queArray[nItems++] = item;
        else {
            for (j = nItems - 1; j >= 0; j--) {
                if (item > queArray[j])
                    queArray[j + 1] = queArray[j];
                else
                    break;
            }
            queArray[j + 1] = item;
            nItems++;
        }
    }

    public long peekMin() {
        return queArray[nItems - 1];
    }


    public long remove() {
        return queArray[--nItems];

    }


    public String display1() {
        String str = "";

        for (int j = 0; j < nItems; j++)
            str += queArray[j] + " ";

        return str;
    }

}

