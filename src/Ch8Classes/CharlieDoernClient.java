package Ch8Classes;
public class CharlieDoernClient {
    public static void main(String[] args){
        CharlieDoernBicycle bike = new CharlieDoernBicycle(80.00, true, "Good!", 7, 510, "Blue");
        CharlieDoernStudent me = new CharlieDoernStudent("Charlie Doern", 83001, 'M', "15 Hazel Lane", 12, 4.00);
        CharlieDoernlightbulb light = new CharlieDoernlightbulb(true, "yellow",60,'L', 100.00);
        CharlieDoernChristmasTree tree = new CharlieDoernChristmasTree(true,10);
        CharlieDoernSmartBoard board = new CharlieDoernSmartBoard(true,true,"blue",false, true, 60);
        CharlieDoernBankAccount charlie = new CharlieDoernBankAccount("Charlie",123546732,"1000 W Boston Post Road", 83001, 1000000000, 1234);
        System.out.println(charlie);
        System.out.println(bike);
        System.out.println(me);
        System.out.println(light);
        System.out.println(tree);
        System.out.println(board);
        bike.setColor("green");
        light.setOnoff(false);
        tree.setOrnaments(12);
        board.setPenColor("red");

    }
}
