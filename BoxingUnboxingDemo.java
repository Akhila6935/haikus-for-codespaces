public class BoxingUnboxingDemo {
    public static void main(String[] args) {
        // Byte
        byte bytePrim = 10;
        Byte byteObj = bytePrim; // Boxing
        byte bytePrimUnboxed = byteObj; // Unboxing

        // Short
        short shortPrim = 20;
        Short shortObj = shortPrim; // Boxing
        short shortPrimUnboxed = shortObj; // Unboxing

        // Integer
        int intPrim = 30;
        Integer intObj = intPrim; // Boxing
        int intPrimUnboxed = intObj; // Unboxing

        // Long
        long longPrim = 40L;
        Long longObj = longPrim; // Boxing
        long longPrimUnboxed = longObj; // Unboxing

        // Float
        float floatPrim = 50.0f;
        Float floatObj = floatPrim; // Boxing
        float floatPrimUnboxed = floatObj; // Unboxing

        // Double
        double doublePrim = 60.0;
        Double doubleObj = doublePrim; // Boxing
        double doublePrimUnboxed = doubleObj; // Unboxing

        // Character
        char charPrim = 'A';
        Character charObj = charPrim; // Boxing
        char charPrimUnboxed = charObj; // Unboxing

        // Boolean
        boolean booleanPrim = true;
        Boolean booleanObj = booleanPrim; // Boxing
        boolean booleanPrimUnboxed = booleanObj; // Unboxing

        System.out.println("Byte: " + bytePrim + " -> " + byteObj + " -> " + bytePrimUnboxed);
        System.out.println("Short: " + shortPrim + " -> " + shortObj + " -> " + shortPrimUnboxed);
        System.out.println("Integer: " + intPrim + " -> " + intObj + " -> " + intPrimUnboxed);
        System.out.println("Long: " + longPrim + " -> " + longObj + " -> " + longPrimUnboxed);
        System.out.println("Float: " + floatPrim + " -> " + floatObj + " -> " + floatPrimUnboxed);
        System.out.println("Double: " + doublePrim + " -> " + doubleObj + " -> " + doublePrimUnboxed);
        System.out.println("Character: " + charPrim + " -> " + charObj + " -> " + charPrimUnboxed);
        System.out.println("Boolean: " + booleanPrim + " -> " + booleanObj + " -> " + booleanPrimUnboxed);
    }
}


