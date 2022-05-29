public class Main {
    public static void main(String[] args) {
     Family Ok = new Family();
     Family name = new Family(Ok.grandfather, Ok.grandmother, Ok.daughter, Ok.mother, Ok.father);
     Family daughter = new Family(Ok.daughter);
     Family parents = new Family(Ok.grandfather, Ok.grandmother);
     Family nameparents = new Family(Ok.father, Ok.mother, Ok.daughter);
    }
}
