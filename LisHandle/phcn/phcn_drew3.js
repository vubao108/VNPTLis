data = `7228  00149                                                       25/11/202109:00:27 AM                            1  1                          7.7  2.6  33.7 0.4  4.6  4.7  61.7 3.54 80   0.26073.4 22.6 308  14.0 556  6.7  0.00414.0 11STANDARD  5c`


var Obketquamay = [];
var dsketqua   = [];
var mydata = data.replace(/\u0002|\u0003/g,'');
var rows = mydata.split(/\s+/)

var stt = parseInt(rows[1].trim()).toFixed(0);
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
