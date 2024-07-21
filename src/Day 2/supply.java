import java.util.Scanner;

class supply {
    // Data members
    int Code;
    String FoodName;
    String Sticker;
    String FoodType;

    // Member function to assign FoodType based on Sticker
    public void GetType() {
        switch (Sticker) {
            case "Green":
                FoodType = "Vegetarian";
                break;
            case "Yellow":
                FoodType = "Contains Egg";
                break;
            case "Red":
                FoodType = "Non Vegetarian";
                break;
            default:
                FoodType = "Unknown";
                break;
        }
    }

    // Function to input values
    public void FoodIn() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Code: ");
        Code = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter Food Name: ");
        FoodName = scanner.nextLine();

        System.out.print("Enter Sticker (Green/Yellow/Red): ");
        Sticker = scanner.nextLine();

        // Call GetType to assign FoodType
        GetType();
    }

    // Function to output values
    public void FoodOut() {
        System.out.println("Code: " + Code);
        System.out.println("Food Name: " + FoodName);
        System.out.println("Sticker: " + Sticker);
        System.out.println("Food Type: " + FoodType);
    }

    // Main method to test the class
    public static void main(String[] args) {
        supply s = new supply();

        s.FoodIn();
        s.FoodOut();
    }
}
