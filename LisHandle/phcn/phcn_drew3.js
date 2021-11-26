data1 = `7228  00149                                                       25/11/202109:00:27 AM                            1  1                          7.7  2.6  33.7 0.4  4.6  4.7  61.7 3.54 80   0.26073.4 22.6 308  14.0 556  6.7  0.00414.0 11STANDARD  5c`

data2 = `7242  00162                                                       26/11/202108:55:50 AM                            1                             9.8-WBC  2.3-LY  23.4-LY% 0.6-MID  5.6-MID%  7.0-GRA  71.0-GRA% 5.45-RBC 149-HGB  0.455_83.4-(HCT_MCV) 27.3-MCH 327-MCHC  12.6-RDW 347-PLT  8.0-MPV  0.003_14.4-(PCT_PDW) 11STANDARD  5f`

data3 = `7242  00162                                                       26/11/202108:55:50 AM                            1                             9.8  2.3  23.4 0.6  5.6  7.0  71.0 5.45 149  0.45583.4 27.3 327  12.6 347  8.0  0.00314.4 11STANDARD  5f`

data4=`7250  00170                                                       26/11/202110:27:37 AM                           111 1                          5.2  1.1  20.4 0.2  4.2  3.9  75.4 3.41 102  0.30589.5 29.9 334  17.1 304  9.0  0.00313.2 11STANDARD  6e`
data = data4

var Obketquamay = [];
var dsketqua   = [];
var mydata = data.replace(/\u0002|\u0003/g,'');
var rows = mydata.split(/\s+/);

var stt = parseInt(rows[0].trim()).toFixed(0);

rows = rows.slice(-18);
var HCT_MCV = rows[9];
var HCT_ketqua = HCT_MCV.substring(0,5);
var MCV_ketqua = HCT_MCV.substring(5);

rows.push(HCT_ketqua);
rows.push(MCV_ketqua);

var PCT_PDW = rows[15];
var PCT_ketqua = PCT_PDW.substring(0,5);
var PDW_ketqua = PCT_PDW.substring(5);

rows.push(PCT_ketqua);
rows.push(PDW_ketqua);




var chiso = [
    ['WBC',0], ['LY',1],['LY%',2],['MID',3],['MID%',4],['GR',5],['GR%',6],['RBC',7],['HGB',8],['MCH',10],
    ['MCHC',11], ['RDW',12], ['PLT',13], ['MPV', 14],
    ['HCT',18],['MCV',19],['PCT',20],['PDW',21]
]

    
for(i=0;i<chiso.length;i++){
    Obketquamay = [];
    Obketquamay.stt = stt;
    Obketquamay.ma_xn_may = chiso[i][0];
    Obketquamay.ketqua = rows[chiso[i][1]];			
    dsketqua.push(Obketquamay);
    console.log(Obketquamay)
}



return dsketqua;
