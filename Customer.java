public abstract class Customer{
  private String firstName;
  private String lastName;
  private int age;
  private int customerNumber;
  private static int lastCustomerNumber = 9999;

  public Customer(String firstName, String lastName, int age){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    customerNumber = lastCustomerNumber;
    lastCustomerNumber++;
  }

  public String getFirstName(){
    return this.firstName;
  }
  public String getLastName(){
    return this.lastName;
  }
  public int getAge(){
    return this.age;
  }
  public int getCustomerNumber(){
    return this.customerNumber;
  }
  public String toString(){
    String s = " ";
    s = "First Name: " + firstName + "Last Name: " + lastName + "Age: " + age + "Customer Number: " + customerNumber;
    return s;
  }
  public boolean equals(Customer other){
    if(this.firstName == other.firstName && this.lastName == other.lastName && this.age == other.age &&
    this.customerNumber == other.customerNumber){
      return true;
    }else{
      return false;
    }
  }

  public abstract double getSavingsInterest();
  public abstract double getCheckInterest();
  public abstract double getCheckCharge();

}
