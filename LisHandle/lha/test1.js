data = `
NO.100005  2080-09-22
             10:52:51

 LEU +2    125Cell/uL
 KET -       0 mmol/L
 NIT +               
 URO       Normal    
 BIL -       0 umol/L
 PRO -       0    g/L
 GLU +4    >55 mmol/L
 SG        1.015     
 pH        5.5       
 BLD -       0Cell/uL
 CR       <0.9 mmol/L
 Ca        7.5 mmol/L
 MA          0   mg/L
`

var rows;
var result = [];
var stt ;
var startIndex = 3;
var barcode = '0000';
if(data.indexOf('\n') != -1){
    rows = data.split('\n');
}else{
    rows = data.split('\r');
}


for (var i = 0; i< rows.length;i++){
  if (rows[i].startsWith('NO.')){
        stt = rows[i].split(' ')[0].split('.')[1].trim().replace(/^0+/,'');
        stt = barcode.substr(0,barcode.length - stt.length) + stt;
        
  }
 if(rows[i].startsWith(' LEU')){
      startIndex = i;
  }
}



for(var i = startIndex;i < startIndex + 11 ;i++){
    var mau_test = new Object();
    var currentRow = rows[i];
   
    mau_test.stt = stt;
    mau_test.ma_xn_may =currentRow.substr(0,4).trim();
    mau_test.ketqua = currentRow.substr(11,20).trim();
    result.push(mau_test)
        
}

return result;