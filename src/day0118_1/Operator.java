package day0118_1;

public class Operator {
    private UtilIo mutilio;
    public Operator(){
       mutilio = new UtilIo();
       mutilio.SetFileName("person_info.txt");
    }

    public void Add(Person person)throws Exception{
        System.out.println("Operator Add.");
        mutilio.Write(person);
    }
    public void Del(Person person)throws Exception{
        System.out.println("Operator Del.");
        mutilio.Write(person);
    }
    public void Modi(Person person) throws  Exception{
        System.out.println("Operator Modi.");
        mutilio.Write(person);
    }
    public Person Find() throws Exception{
        System.out.println("Operator Find.");
        //System.out.println(mutilio.Reader());
        return (Person)mutilio.Reader();

    }
}
