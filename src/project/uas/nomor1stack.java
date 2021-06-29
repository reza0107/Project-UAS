package project.uas;
public class nomor1stack {
     public static void main(String[] args) {
        nomor1 newStack = new nomor1(10);
        newStack.push(10);
        newStack.printData();
        newStack.push(2);
        newStack.printData();
        newStack.push(3);
        newStack.printData();
        long bacapush = newStack.peek();
        System.out.println("nilai teratas = "+bacapush);
        System.out.println("Nama saya adalah Reza Maulana Rizky");
        newStack.pop();
        long bacapop = newStack.peek();
        System.out.println("nilai yang dihapus = "+bacapop);
        newStack.push(4);
        newStack.printData();
        
    }
}
