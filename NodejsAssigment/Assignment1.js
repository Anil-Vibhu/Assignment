const fs=require('fs');
const path = require('path');



fs.mkdir(path.join(__dirname,'/Training_Details'),{},function(err){
    if(err)throw err;
    console.log('')
    
})

fs.writeFile(path.join(__dirname, 'Training_Details', 'candidate.txt')
, 'Ram is skilled in'
,(err)=>{
    if(err) throw err;
    console.log('file written to  ..');
});

fs.appendFile(path.join(__dirname, 'Training_Details', 'candidate.txt'),
' Cloud Computing',
err=>{
    if(err) throw err;
    console.log('File appended to . . .')
}
)

fs.readFile(path.join(__dirname, 'Training_Details','candidate.txt'), 'utf8',(err,data)=>{
    if(err)throw err;
    console.log(data);
});
