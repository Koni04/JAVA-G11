public class Party
{
    private int numGuests;

    public int getNumGuests()
    {
        return this.numGuests;
    }
    public void setNumGuests(int numGuests)
    {
        this.numGuests = numGuests;
    }

    public void displayMessage()
    {
        System.out.println("");
        System.out.println(numGuests+" guests have been invited.");
        System.out.println("Enjoy the party!");
    }
}