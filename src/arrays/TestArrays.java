package arrays;

public class TestArrays {

    public static void main(String[] args) {
        //PRIMITIVES ARRAYS

        int myArray[] = new int[3];

        myArray[0] = 10;
        System.out.println("myArray = " + myArray[0]);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("My array in index " + i + " :" + myArray[i]);
        }

        //Arrays withou index limit
        String fruits[] = {"Orange", "Banana", "Apple", "Lemon"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit " + i + " : " + fruits[i]);
        }
    }
}
