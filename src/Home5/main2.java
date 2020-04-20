package Home5;

public class main2 {
    boolean[] b = new boolean[3];
    int count = 0;
    public static void main(String[] args) {
        main2 ba = new main2();
        ba.set(ba.b, 0);
        ba.set(ba.b, 2);
        ba.test();
    }
    void set(boolean[] x, int i){
        x[i] = true;
        ++count;
    }
    void test(){
        if (b[0] && b[1] | b[2]){
            count++;
            if (b[1] && b[(++count -2)])
                count +=7;
            System.out.println("count= " +count);
        }
    }
}