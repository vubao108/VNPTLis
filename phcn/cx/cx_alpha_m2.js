data=`24-NOV-21
8714
 6.7  
19.2  
 2.8  
78.0  
 1.3  
 0.2  
 5.2  
      
4.27  
 127  
40.3  
94.4  
29.7  
 315L 
10.5  
 158  
0.10  
 6.3  
17.6  
`

var Obketquamay = [];
    var dsketqua   = [];
    var mydata = data;
    //var mydata = data.replace(/^\s*[\r\n]/gm, '');
    if(mydata.indexOf("\r")!=-1)
    {
        var rows = mydata.split("\r");
    }else  {var rows = mydata.split("\n"); }

    var stt = parseInt(rows[1].trim()).toFixed(0);
    var chiso = [['WBC',2], ['RBC',10], ['HGB',11], ['HCT',12], ['MCV',13], ['MCH',14], ['MCHC',15], ['PLT',17], ['LY%',3], ['LY',6], ['MO%',4], ['MO',7], ['GR%',5], ['GR',8], ['RDW',16], ['PCT',18], ['MPV',19], ['PDW',20]];
        
    for(i=0;i<chiso.length;i++){
        Obketquamay = [];
        Obketquamay.stt = stt;
        Obketquamay.ma_xn_may = chiso[i][0];
        Obketquamay.ketqua = rows[chiso[i][1]];
      	
        dsketqua.push(Obketquamay);
       
    }

    return dsketqua;