"use strict";
exports.__esModule = true;
exports.Car = void 0;
var Car = /** @class */ (function () {
    function Car(s, rp, c) {
        this.speed = s;
        this.regularPrice = rp;
        this.color = c;
    }
    Car.prototype.getSalePrice = function () {
        return 0;
    };
    Car.prototype.display = function () {
        console.log("initial speed:" + this.speed);
        console.log("color:" + this.color);
        console.log("initial price:" + this.regularPrice);
    };
    return Car;
}());
exports.Car = Car;
