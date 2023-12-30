public class Person
{
    private int age;
    public void setAge(int pAge)
    {
        this.age = pAge;
    }

    private String name;
    public void setName(String pName)
    {
        this.name = pName;
    }
    
    private int birthYear;
    public void setYear(int c)
    {
        this.birthYear = c;
    }

    private String birthMonth;
    public void setMonth(String pBMonth)
    {
        this.birthMonth = pBMonth;
    }

    private int birthDay;
    public void setDay(int pBDay)
    {
        this.birthDay = pBDay;
    }
    
    public void getInfo()
    {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Birth Month: " + birthMonth);
        System.out.println("Birth Day: " + birthDay);
    }
}