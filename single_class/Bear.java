class Bear{
  private String name;
  private int age;
  private double weight;
  private Salmon[] belly;


  public Bear(String name, int age, double weight){
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.belly = new Salmon[5];
  }
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
  public void setName(String newName){
    this.name = newName;
  }
  public double getWeight(){
    return this.weight;
  }
  public boolean readyToHibernate(){
    if (this.weight > 80.00) return true;
    else return false;
  }  
// below is an example of a loop
  public int foodCount(){
    int count = 0;
    for( Salmon salmon : this.belly){
      if (salmon != null) {
        count++;
      }
    }
    return count;
  }
}