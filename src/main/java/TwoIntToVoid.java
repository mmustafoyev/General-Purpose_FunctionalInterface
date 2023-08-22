public interface TwoIntToVoid{
    void DoCalc(int i, int j);
}

class TwoIntLambdaDemo{
    public static void main(String[] args){
        TwoIntToVoid calc = (i,j) -> {
            i++;
            int result = i * j;
            System.out.println("The result :" + result);

        };
        calc.DoCalc(9,22);
    }
}
