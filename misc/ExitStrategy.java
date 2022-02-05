public class ExitStrategy {
    public static void main(String[] args){
        double p0 = 1;
        double n0 = 1;
        double r = 0.5;
        double t = 0.1;
        double c = 1 - t;
        double tt = 0;
        System.out.println();
        System.out.println("------------start, return = " + r +
         ", takeout = " + t + ", -----------------");
        System.out.println();
        for(int i = 1; i <= 10; i++){
            double p1 = (1 + i*r);
            double n1 = (t + c*p1*n0)/p1;
            double amt0 = n0*p1;
            double amt1 = n1*p1;
            tt += amt0 - amt1;
            System.out.println("initial " + amt0 + ", final " +
             amt1 + ", takeout " + (amt0 - amt1) + ", total takeout " + tt + 
             ", price " + p1 + " times, total amt " + (amt1 + tt));
            System.out.println();
            p0 = p1;
            n0 = n1;
        }
        System.out.println("------------end-----------------");
        System.out.println();
    }
}
