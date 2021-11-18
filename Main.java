import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(),in.nextInt());
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5,6)).print();
        a.print();
        b.print();
        in.close();
    }
}

class Fraction{
    int numerator;
    int denominator;
    double number;

    public Fraction(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
        this.toDouble();
    }

    public Fraction plus(Fraction r){
        Fraction k=new Fraction(0,0);
        k.numerator=(this.numerator*r.denominator+
                r.numerator*this.denominator);

        k.denominator=this.denominator*r.denominator;
        return k;
    }

    public Fraction multiply(Fraction r){
        Fraction k=new Fraction(0,0);
        k.numerator=r.numerator*this.numerator;
        k.denominator=r.denominator*this.denominator;
        return k;
    }

    public double toDouble() {
        this.number = (double) this.numerator / this.denominator;
        return this.number;
    }

    public void print(){
        for(int i=this.numerator;i>=1;i--){
            if(this.numerator%i==0&&this.denominator%i==0){
                this.numerator=this.numerator/i;
                this.denominator=this.denominator/i;
            }
        }
        if(this.numerator%this.denominator==0){
            this.toDouble();
            System.out.println(this.number);
        }
        else{
            System.out.println(this.numerator+"/"+this.denominator);
        }

    }

}

