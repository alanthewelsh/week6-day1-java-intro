class Planet{

  private String name;
  private String size;

  public Planet(String name, String size){
    this.name = name;
    this.size = size;
  }

  public String getName(){
    return this.name;
  }
 
  public String getSize(){
    return this.size;
  }

  public void explode(){
    System.out.println("Boom! " +this.name + " has exploded.");
  }

}