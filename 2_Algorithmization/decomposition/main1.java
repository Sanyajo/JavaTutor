
public class main1 {
    public static void main(String[] args) {
        NOD nd1 = new NOD(3,6);

        System.out.println("NOD: " +nd1.nod);

        System.out.println("NOK: " +nd1.nok);

        nd1.n = 3;

        System.out.println("NOD: " +nd1.nod);

        System.out.println("NOK: " +nd1.nok);

    }
}

class NOD{
    protected int m, n;
    protected int nod, nok;

    protected NOD(int m, int n){
        this.m = m;
        this.n = n;
        this.nod = find_nod(m,n,Math.min(m,n));
        this.nok =( (m*n)/nod );
    }

    private static int find_nod(int m, int n , int div){
        if(m % div == 0 && n %div ==0)
            return div;
        else
            return find_nod(m,n,div);
    }

}