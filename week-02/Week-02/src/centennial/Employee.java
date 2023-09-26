package centennial;

public class Employee
{
    private int _id;
    private String _name;
    private String _address;
    private String _email;
    private double _salary;
    //Geter Methods
    public int GetId()
    {
        return _id;
    }
    public String GetName()
    {
        return _name;
    }
    public String GetAddress()
    {
        return _address;
    }
    public String GetEmail()
    {
        return _email;
    }
    public double GetSalary()
    {
        return _salary;
    }

    //Setter Methods
    public void SetId(int id)
    {
        this._id = id;
    }
    public void SetName(String name)
    {
        this._name = name;
    }
    public void SetAddress(String address)
    {
        this._address = address;
    }
    public void SetEmail(String email)
    {
        this._email = email;
    }

    public void SetSalary(double salary)
    {
        this._salary = salary;
    }
}
