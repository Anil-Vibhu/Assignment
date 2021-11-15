class Product{
    proId:number;
    proName:string;
    proPrice:number;
    GST:number=18;
    totPrice:number;
    constructor(public pid:number,public pname:string,public pprice:number){
          this.proId=pid;
          this.proName=pname;
          this.proPrice=pprice;
    }
  
    totalPrice():number{
      this.totPrice=this.proPrice+((this.proPrice*18)/100);
          return this.totPrice;
    }
  
    display(){
        console.log(this.proId+" "+this.proName+" "+this.totalPrice());
    }
        
  }
  
  var p1=new Product(123,'Smart Watch',5000);
  var p2=new Product(245,'Mobile',15000);
  p1.display();
  p2.display();