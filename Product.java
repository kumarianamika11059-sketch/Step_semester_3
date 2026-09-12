class Product {
    String productId;
    String productName;
Product(String productId,String productName){
    this.productId=productId;
    this.productName=productName;
}
public static void main(){
    Product p=new Product("p-1042","Wireless Mouse");
    System.out.print(p.productId+" - "+p.productName);
}
}