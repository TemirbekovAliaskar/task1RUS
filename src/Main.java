public class Main {
    public static void main(String[] args) {

        Person person = new Person("Jigit ",21,"M");
        Person person1 = new Person("Nurlan ",20,"M");
        Person person2 = new Person("Nurai ",21,"W");
        Person person3 = new Person("Jigar ",30,"M");
        Person person4 = new Person("Saikal ",15,"W");

        Person [] people = {person,person1,person2,person3,person4};
        for (Person pers : people){

            System.out.println(pers.info());
        }
        int max = 0;
        int min = 0;
        int index=0;
        int indexMin=0;

        for (int i = 0; i < people.length ; i++) {
            if (people[i].age > max){
                max=people[i].age ;
                index = i;
        }
        }
        for (int i = 0; i < people.length ; i++) {
            if (people[i].age<min){
                min = people[i].age;
                index = i;
            }

        }


        System.out.println( people[index].infoAge());
        System.out.println( people[indexMin].infoAge());

    }
}