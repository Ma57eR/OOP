package Inheritance.random_arraylist;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<Integer> arr = new RandomArrayList<>();

        for (int i = 1; i < 20; i++) {
            arr.add(i);
        }
        System.out.println(arr.getRandomElement());
    }
}
