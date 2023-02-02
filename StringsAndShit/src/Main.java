public class Main {
    public static void main(String[] args) {
    printInfo("Bokbokbokbokobkbokb");
    printInfo("");
    String name="Nilo Lalo Tano";
        System.out.printf("index of Tan: %d %n",name.indexOf("Tan"));

        System.out.printf("index of l: %d %n",name.indexOf('l'));
        System.out.printf("last index of l: %d %n",name.lastIndexOf('l'));

        System.out.printf("index of l: %d %n",name.indexOf('l',3));
        System.out.printf("last index of l: %d %n",name.lastIndexOf('l',8));

        String nameLower=name.toLowerCase();

        if(name.equals(nameLower)){
            System.out.println("values match exactly");
        }
        if(name.equalsIgnoreCase(nameLower)){
            System.out.println("values match ignoring case");
        }

        if(name.startsWith("Nil")){
            System.out.println("Starts with nil");
        }
        if(name.endsWith("Tano")){
            System.out.println("Ends with Tano");
        }
        if(name.contains("Tan")){
            System.out.println("Contains with Tan");
        }

    }

    public static void printInfo(String string){
        int length=string.length();
        System.out.printf("Length = %d %n",length);
        if(string.isEmpty()){
            System.out.println("String empty");
            return;
        }
        System.out.printf("First char  = %c %n",string.charAt(0));
        System.out.printf("Last char  = %c %n",string.charAt(length-1));


    }
}