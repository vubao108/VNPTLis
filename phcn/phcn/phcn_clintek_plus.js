data=`3227,07-20-2021,11:01AM,,,,,,,Multistix 10 SG,Not Entered,Not Entered,GLU,Negative,,BIL,Negative,,KET,Negative,,SG ,1.020,,BLO,Negative,,pH ,6.0,,PRO,Negative,,URO,0.2 E.U./dL,,NIT,Positive,,LEU,Small,,,,,,,,,,,,,\r`

var Obketquamay = [];
var dsketqua   = [];
var rows = data.split(',')

var stt = parseInt(rows[0].trim()).toFixed(0);

var chiso = [['GLU',13], ['BIL',16],['KET',19],['SG',22],['BLO',25],['pH',28],['PRO',31],['URO',34],['NIT',37],['LEU',40],]


for(i=0;i<chiso.length;i++){
    Obketquamay = [];
    Obketquamay.stt = stt;   
    Obketquamay.ma_xn_may = chiso[i][0];
    Obketquamay.ketqua = rows[chiso[i][1]];			
    dsketqua.push(Obketquamay);
    console.log(Obketquamay)
}

return dsketqua;
