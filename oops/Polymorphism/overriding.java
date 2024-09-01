class bank{
    public void roi(){
        System.out.println("Generally the rate of interest is 5% ");
    }
}

class sbi extends bank{
    @Override
    public void roi(){
        System.out.println("For SBI the rate of interest is 6% ");
    }
}

class pnb extends bank{
    @Override
    public void roi(){
        System.out.println("For PNB the rate of interest is 7% ");
    }
}

public class overriding{
    public static void main(String[] args){
        bank obj = new bank();
        sbi obj1 = new sbi();
        pnb obj2 = new pnb();
        obj.roi();
        obj1.roi();
        obj2.roi();
    }
}