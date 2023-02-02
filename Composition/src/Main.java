public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208","Dell","240");
        Monitor monitor =new Monitor("27inch Beast","Acer",27,"2540x1440");
        MotherBoard motherBoard=new MotherBoard("BT-200","Asus",4,6,"v2.44");

        PersonalComputer NilsPC=new PersonalComputer("2208","Dell",monitor,motherBoard,theCase);
        System.out.println(NilsPC);
//        NilsPC.getMonitor().drawPixelAt(10,20,"blue");
//        NilsPC.getMotherBoard().loadProgram("Stremio");
//        NilsPC.getComputerCase().pressPowerButton();
        NilsPC.powerUp();

    }
}