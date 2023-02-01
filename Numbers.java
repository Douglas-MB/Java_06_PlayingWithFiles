import mypack.MyTools;

public class Numbers {

    private int auxSize;
    private int size;
    private int[] array;

    public Numbers(int auxSize) throws Exception {
        this.auxSize = auxSize;
        this.array = new int[auxSize];
        doArray();
    }


    public int[] getArray() {
        return array;
    }

    protected int[] doArray() throws Exception {

        for (int i = 0; i < auxSize; i++) {
            array[i] = getNumber();
        }
        return array;
    }

    protected int getNumber() throws Exception {
        return MyTools.rng(0,999999);
    }

}
