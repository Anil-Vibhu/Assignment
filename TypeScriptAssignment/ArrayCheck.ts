var arr:string[]=["Anil","Sunil","Yukthi","Preethi","Rakshitha"];
var names="Sunil";
var flag=false;
for(var i=0;i<arr.length;i++){
	if(names ===arr[i]){
		flag=true;
		console.log('the name is present at:'+i);
	}
}
if(flag===false){console.log('the name is not present in the array');}