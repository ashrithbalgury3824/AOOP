package lab6b;

public class Main {
    public static void main(String[] args) {
        
        Integer[] intArray = {1, 2, 3, 4, 5};
        Float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        String[] stringArray = {"apple", "banana", "cherry", "date", "elderberry"};

        IntegerMinMax intMinMax = new IntegerMinMax();
        FloatMinMax floatMinMax = new FloatMinMax();
        CharacterMinMax charMinMax = new CharacterMinMax();
        StringMinMax stringMinMax = new StringMinMax();

        // Display results for Integer array
        System.out.println("Max Integer: " + intMinMax.findMax(intArray));
        System.out.println("Min Integer: " + intMinMax.findMin(intArray));

        // Display results for Float array
        System.out.println("Max Float: " + floatMinMax.findMax(floatArray));
        System.out.println("Min Float: " + floatMinMax.findMin(floatArray));

        // Display results for Character array
        System.out.println("Max Character: " + charMinMax.findMax(charArray));
        System.out.println("Min Character: " + charMinMax.findMin(charArray));

        // Display results for String array
        System.out.println("Max String: " + stringMinMax.findMax(stringArray));
        System.out.println("Min String: " + stringMinMax.findMin(stringArray));
    }
}
