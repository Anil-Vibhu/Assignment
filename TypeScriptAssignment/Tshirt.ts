class Tshirt{
    color:string;
    material:string;
    design:string;
    size:string;
    constructor(c:string,m:string,d:string,s:string){
      this.color=c;
          this.material=m;
          this.design=d;
          this.size=s;
    }
  
    display(){
        console.log(this.color+" "+this.material+" "+this.design+" "+this.size);
    }
        
  }
  
  var t1=new Tshirt('red','silk','solid','xl');
  var t2=new Tshirt('white','cotton','printed','xxl');
  var t3=new Tshirt('blue','leather','stripes','m');
  t1.display();
  t2.display();
  t3.display();