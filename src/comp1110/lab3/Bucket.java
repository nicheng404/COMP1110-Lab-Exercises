package comp1110.lab3;

public class Bucket {
    private final double CAPACITY;
    private double contents;

    //constructor
    public Bucket (double capacity){
        CAPACITY=capacity;
    }

    //method
    public double getCapacity(){
        double resultCapacity= CAPACITY;
        return resultCapacity;
    }

    public double getContents(){
        double resultContents=contents;
        return resultContents;
    }

    public double empty(){
        double beforeEmptyContents=contents;
        contents=0;
        return beforeEmptyContents;

    }

    public void add(double amount){
        contents=(amount+contents <= CAPACITY) ? amount+contents : CAPACITY;

        /*if (amount<=CAPACITY){
            contents=amount;
        }else{
            contents=CAPACITY;
        }*/

    }

    public static void main(String[] args) {
        Bucket big = new Bucket(10.0);
        Bucket small = new Bucket(1.0);

        big.add(20.0);
        small.add(20.0);

        //print contents
        System.out.println(big.getContents());
        System.out.println(small.getContents());

        //empty Bucket big
        big.empty();
        System.out.println(big.getContents());

        //empty small and add small into big
        double smallContents=small.empty();
        big.add(smallContents);

        //print contents
        big.getContents();
        small.getContents();
        System.out.println(big.getContents());
        System.out.println(small.getContents());

    }

}
