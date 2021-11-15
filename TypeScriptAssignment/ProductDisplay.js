var Product = /** @class */ (function () {
    function Product(pid, pname, pprice) {
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
        this.GST = 18;
        this.proId = pid;
        this.proName = pname;
        this.proPrice = pprice;
    }
    Product.prototype.totalPrice = function () {
        this.totPrice = this.proPrice + ((this.proPrice * 18) / 100);
        return this.totPrice;
    };
    Product.prototype.display = function () {
        console.log(this.proId + " " + this.proName + " " + this.totalPrice());
    };
    return Product;
}());
var p1 = new Product(123, 'Smart Watch', 5000);
var p2 = new Product(245, 'Mobile', 15000);
p1.display();
p2.display();
