import java.util.Arrays;
public class ArrayClear {
        public static void main(String[] args) {
            String[] pallets = { "B14", "A11", "B12", "A13" };
            System.out.println();
            // Print the first element in the lowercase before clearing
            System.out.println("Before: " + pallets[0].toLowerCase());
            // Print all elements before clearing
            System.out.println("Array before clearing:");
            for (String pallet : pallets) {
                System.out.println("-- " + pallet);
            }
            // Clear (set to null) the first 2 elements: index 0 and 1
            Arrays.fill(pallets, 0, 2, null);

            // Check and print the first element after clearing
            if (pallets[0] != null) {
                System.out.println("After: " + pallets[0].toLowerCase());
            } else {
                System.out.println("After: null");
            }

            // Print array length and all current elements after clearing
            System.out.println("Clearing 2 ... count: " + pallets.length);
            System.out.println("Array after clearing:");
            for (String pallet : pallets) {
                System.out.println("-- " + pallet);
            }
        }
    }

