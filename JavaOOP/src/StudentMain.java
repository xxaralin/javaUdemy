public class StudentMain {
    public static void main(String[] args) {
         for(int i=1;i<=5;i++){
             LPAStudent s=new LPAStudent("S92300"+i,
                     switch(i){
                         case 1->"mary";
                         case 2->"carol";
                         case 3->"suzan";
                         case 4->"karen";
                         case 5->"marie";
                         default->"anonymous";
                     },
                     "06/10/1998",
                     "Java MasterClass");
             //System.out.println(s);
         }
         Student pojpStudent = new Student("S923006","Ann","05/11/1985","Java");
         LPAStudent recordStudent=new LPAStudent("S923007","Amy","05/11/1985","Java");
         System.out.println(pojpStudent);
         System.out.println(recordStudent);

        System.out.println(pojpStudent.getName()+" is taking "+pojpStudent.getClassList());
        System.out.println(recordStudent.name()+" is taking "+recordStudent.classList());

        pojpStudent.setClassList(pojpStudent.getClassList()+" exam");
       // recordStudent.setClassList(recordStudent.getClassList()+" exam");//böyle bir şey yok set edemezsin record immutable

    }
}
