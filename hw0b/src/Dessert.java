public class Dessert {
    int flavor, price;
    static int numDesserts;
    public Dessert(int x, int y){
         flavor = x;
         price = y;
        numDesserts++;
    }

    public void printDessert() {
        System.out.print(flavor+ " "+ price+ " "+ numDesserts);
    }

    public static void main(String[] args) {
        System.out.print("I love dessert!");
    }
}
