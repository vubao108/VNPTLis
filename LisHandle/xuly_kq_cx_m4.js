
var chuoi_tmp = `2021-11-24 10:30:16 cx_celta_alpha_m4[M]: [STX]24-NOV-21
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

2021-11-24 10:30:16 Tính bằng excel 2
2021-11-24 10:30:16 Tính excel
2021-11-24 10:30:16 cx_celta_alpha_m4[M]: 0.10  
 6.3  
17.6  
[ETX]`;
function catchuoi(data){
    var Obketquamay = [];
    var dsketqua   = [];
    var mydata = data;
    //var mydata = data.replace(/^\s*[\r\n]/gm, '');
    if(mydata.indexOf("\r")!=-1)
    {
        var rows = mydata.split("\r");
    }else  {var rows = mydata.split("\n"); }

    var stt = parseInt(rows[1].trim()).toFixed(0);
    var chiso = [['WBC',2], ['RBC',10], ['HGB',11], ['HCT',12], ['MCV',13], ['MCH',14], ['MCHC',15], ['PLT',17], ['LY%',3], ['LY',6], ['MO%',4], ['MO',7], ['GR%',5], ['GR',8], ['RDW',16], ['PCT',21], ['MPV',22], ['PDW',23]];
        
    for(i=0;i<chiso.length;i++){
        Obketquamay = [];
        Obketquamay.stt = stt;
        Obketquamay.ma_xn_may = chiso[i][0];
        
        if(chiso[i][0] == 'PCT'){
            var tmp_ketqua = rows[chiso[i][1]]
            Obketquamay.ketqua = tmp_ketqua.split(' ')[3];
        }else{
            Obketquamay.ketqua = rows[chiso[i][1]];
        }			
        dsketqua.push(Obketquamay);
        console.log(Obketquamay)
    }

    return dsketqua;

}


var kq = catchuoi(chuoi_tmp)
console.log(kq)
