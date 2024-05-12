class DistributeMoney {
    public int distMoney(int money, int children) {
        if(money < children){
            return -1;
        }
        int out = 0;

        int[] temp = new int[children];

        for(int i=0; i<children; i++){
            temp[i] = 1;
            money--;
        }

        int i = 0;
        while(money>0 && i<temp.length){
            if(money >= 7){
                temp[i++] += 7;
                money -= 7;
            }else{
                break;
            }
        }

        if(i < temp.length){
            temp[i] += money;
            if(temp[i] == 4){
                if (i != 0 ){
                    temp[i]--;
                    if (i == temp.length-1){
                        temp[0]++;
                    }else {
                        temp[++i]++;
                    }

                }
            }
        }else{
            temp[0] += money;
        }

        for(int j=0; j<temp.length; j++){
            if(temp[j] == 8){
                out++;
            }
        }
        return out;
    }
}
