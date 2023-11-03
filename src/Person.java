import static java.lang.StringTemplate.STR;

public class Person {
    String  name;
    int age;
    String gender;

    public Person(String name,int age,String gender){
        this.name = name;
        this.age =age;
        this.gender = gender;
    }

    public String info (){
        return STR."""
                    INFO:
                Name :  \{name}
                Age  :  \{age}
                Gender : \{gender}
                """;
    }
    public String infoAge(){
        return STR."""
               GETINFO
               Name : \{name}
               AGE : \{age}
                """
                ;
    }
}
