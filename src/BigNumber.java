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

    public int[] subtract(int[] bigNumber1, int[] bigNumber2){
        int[] result = new int[bigNumber1.length];
        for(int i = bigNumber1.length - 1; i >= 0; --i){
            if(bigNumber1[i] - bigNumber2[i] < 0){
                if (i == 0){
                    result[0] = bigNumber1[0] - bigNumber2[0];
                }
                else {
                    result[i] = 10 + (bigNumber1[i] - bigNumber2[i]);
                    int j = i - 1;
                    while (bigNumber1[j] == 0) {
                        bigNumber1[j] = 9;
                        j -= 1;
                    }
                    bigNumber1[j] -= 1;
                }
            }
            else{
                result[i] = bigNumber1[i] - bigNumber2[i];
            }
        }
        int count = 0;
        while(result[count] == 0){
            count++;
        }
        if (count != 0){
            for (int i = 0; i < result.length - count; i++){
                result[i] = result[i + count];
            }
        }
    return result;
    }

}
