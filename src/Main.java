abstract class Marks{
    public abstract double
    getPercentage();
}
class A extends Marks{
    private int subject1;
    private int subject2;
    private int subject3;

    public A(int subject1, int subject2, int subject3){
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    @Override
    public double getPercentage(){
        double total1 = subject1 + subject2 + subject3;
        return ( total1 / 300) * 100;
    }
    static class B extends Marks{
        private int subject1;
        private int subject2;
        private int subject3;
        private int subject4;

        public B(int subject1, int subject2, int subject3, int subject4){
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
            this.subject4 = subject4;

        }
        @Override
        public double getPercentage(){
            double total1 = subject1 + subject2 + subject3 + subject4;
            return (total1 / 400) * 100;

        }

    }
    public static void main(String[] args) {
        A studentA = new A(80, 90, 95);
        System.out.println("Procent zdobytych punktów przez studenta A " + studentA.getPercentage()+"%");
        B studentB  = new B(78, 82, 88, 95);
        System.out.println("Liczba zdobytych procentów przez studenta B " + studentB.getPercentage()+"%");

    }
}
