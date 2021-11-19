
var chuoi_tmp = `MEK-6400 
18   
01024
MANUAL      
CBC         
01
BLOOD           
MMM 
0041214   
V01-06  ,        ,V04-02  ,               
2019
11
24
     
22
40
46
         0028  
10.5H 
      
      
      
      
      
      
      
      
      
      
4.69  
 118L 
36.0  
76.8L 
25.2L 
 328  
15.6H 
 152  
0.09L 
 6.2L 
18.9H 
35.8  
 7.2  
57.0  
 3.8  
 0.8  
 5.9  
      
                                                                                                                                                                
                                                                                       
                                                                                                                                                                                                                                                                                                                                                                                                               
`;
function catchuoi(data){
    var Obketquamay = [];
    var dsketqua   = [];
    var mydata = data;
    //var mydata = data.replace(/^\s*[\r\n]/gm, '');
    if(mydata.indexOf("\r")!=-1)
    {
        var rows = mydata.split("\r");
    }else  {var rows = mydata.split("\n"); }

    var stt = parseInt(rows[17].trim()).toFixed(0);
    var chiso = [['WBC',18], ['RBC',29], ['HGB',30], ['HCT',31], ['MCV',32], ['MCH',33], ['MCHC',34], ['PLT',36], ['LY%',40], ['LY',43], ['MO%',41], ['MO',44], ['GR%',42], ['GR',45], ['RDW',35], ['PCT',37], ['MPV',38], ['PDW',39]];
        
    for(i=0;i<chiso.length;i++){
        Obketquamay = [];
        Obketquamay.stt = stt;
        Obketquamay.ma_xn_may = chiso[i][0];
        Obketquamay.ketqua = rows[chiso[i][1]];			
        dsketqua.push(Obketquamay);
        console.log(Obketquamay)
    }

    return dsketqua;

}


var kq = catchuoi(chuoi_tmp)
console.log(kq)