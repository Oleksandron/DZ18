        /*У каждого человека есть имя, папа и мама.
        Подсказка: папа и мама это тоже люди.
        Создать класс, который бы описывал данную ситуацию.
        Создать объекты для 2 поколений людей (ребенок и его родители) и вывести информацию о них на экран.*/


public class Family {
    String father;
    String mother;
    String daughter;
    String grandfather;
    String grandmother;
    public Family(){

        System.out.println("My family have five person.");
   }

    public Family(String daughter) {
        this.daughter = daughter;
        System.out.println("My daughter 25 years.");
    }
    public Family(String grandfather, String grandmother) {
        this.grandfather = grandfather;
        this.grandmother = grandmother;
        System.out.println("My grandmother 82 years and grandfather 77 years.");
    }
    public  Family(String grandfather, String grandmother, String daughter,String mother,String father){
        this.grandmother = grandmother;
        System.out.println("Grandmother name Lucy");
        this.grandfather = grandfather;
        System.out.println("Grandfather name Vasil");
        this.mother = mother;
        System.out.println("Mother name Olena");
        this.father = father;
        System.out.println("Father name Oleksandr");
        this.daughter = daughter;
        System.out.println("Daughter name Mary");
    }
    public Family(String father, String mother, String daughter){
        this.father = father;
        this.mother = mother;
        this.daughter = daughter;
        System.out.println("My parents Lucy and Vasil");

    }
}
