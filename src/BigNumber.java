public class BigNumber {
    public int[] add(int[] bigNumber1, int[] bigNumber2){
        int[] sum = new int[bigNumber1.length + 1];
        int extra = 0;

        for(int i = bigNumber1.length - 1; i >= 0; --i){
            if((bigNumber1[i] + bigNumber2[i] + extra) > 9){
              sum[i] = (bigNumber1[i] + bigNumber2[i] + extra) % 10;
              extra = ((bigNumber1[i] + bigNumber2[i] + extra) / 10) % 10;
            }
            else{
                sum[i] = (bigNumber1[i] + bigNumber2[i] + extra);
                extra = 0;
            }
        }
        if(extra != 0){
          for(int i = sum.length - 1; i > 0; --i){
             sum[i] = sum[i-1];
          }
          sum[0] = extra;
        }
        return sum;
    }
}
