package array;

import java.util.Scanner;

class flower{
    String name;
    int petals;
    float price;

    public flower(String name, int petals, float price) {
        this.name = name;
        this.petals = petals;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPetals() {
        return petals;
    }

    public float getPrice() {
        return price;
    }
}

public class print_flower {
    public static void main(String[] args) {
        flower f[]= new flower[5];
        Scanner s= new Scanner(System.in);
        for (int i = 0; i < f.length; i++) {
            f[i]=new flower(s.next(),s.nextInt(),s.nextFloat());
        }
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i].getName()+" "+f[i].getPetals()+" "+f[i].getPrice());
        }
    }
}
