public class Main {
    public static void main(String[] args) {
        drawBar(5,'*');
        System.out.print("\n");
        drawBox(5,'*');
        System.out.print("\n");
        drawRoof();
        drawBase();
        drawWalkway();
    }

    private static void drawBar(int length, char symbol){
        for (int i = 0; i < length; i++) {
            System.out.print(symbol);
        }
    }

    private static void drawBox(int length, char symbol){
        drawBar(length, symbol);
        StringBuilder space = new StringBuilder();
        for (int i = 0; i < (length - 2); i++) {
            space.append(" ");
        }
        System.out.print("\n");
        for (int i = 0; i < (length-2); i++) {
            System.out.println(symbol + "" + space + symbol);
       }
        drawBar(length, symbol);
    }

    private static void drawRoof(){
        System.out.println("  /\\");
        System.out.println(" /  \\");
        System.out.println("/____\\");
    }

    private static void drawBase(){
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println("|____|");
    }
    private static void drawWalkway(){
        System.out.println("  **");
        System.out.println("  ***************");
    }
}